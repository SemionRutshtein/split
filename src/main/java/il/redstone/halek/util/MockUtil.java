package il.redstone.halek.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import il.redstone.halek.models.*;

import java.util.List;

import static il.redstone.halek.util.MockConstants.*;

public class MockUtil {

    public static void main(String[] args) throws JsonProcessingException {
        List<Room> roomListOutput = createRoomListOutput();
        ObjectMapper objectMapper = new ObjectMapper();

        String s = objectMapper.writeValueAsString(roomListOutput);
        System.out.println(s);

    }
    public static List<Room> createRoomListOutput(){
        return List.of(
          createRoom(),
          createRoom(),
          createRoom()
        );
    }
    private static List<User> createUserList() {
        return List.of(
                createUser(),
                createUser(),
                createUser()
        );
    }
    private static List<Expense> createListExpenses() {
        return List.of(
                createExpense(),
                createExpense(),
                createExpense()
        );
    }
    private static List<Tag> createListTags() {
        return List.of(
                createTag(),
                createTag(),
                createTag()
        );
    }
    private static List<Deal> createDealsList() {
        return List.of(
                creatDeal(),
                creatDeal(),
                creatDeal(),
                creatDeal()
        );
    }
    private static List<Participant> createListParticipants() {
        return List.of(
                createParticipant(),
                createParticipant(),
                createParticipant()
        );
    }
    private static List<Long> createListOfRoomsId() {
        return List.of(
                ROOM_ID,
                ROOM_ID_2,
                ROOM_ID_3,
                ROOM_ID_4,
                ROOM_ID_5
        );
    }
    private static Room createRoom() {
        Room room = new Room();
        room.setRoomId(ROOM_ID);
        room.setUsers(createUserList());

        return room;
    }
    private static User createUser() {
        User user = new User();
        user.setUserId(USER_ID);
        user.setName(NAME);
        user.setDescription(DESCRIPTION);
        user.setEmail(EMAIL);
        user.setBalance(BALANCE);
        user.setExpenses(createListExpenses());
        user.setRoomsId(createListOfRoomsId());

        return user;
    }

    private static Expense createExpense() {
        Expense expense = new Expense();
        expense.setId(ID);
        expense.setDescription(DESCRIPTION);
        expense.setAmount(AMOUNT);
//        expense.setDate(DATE);
        expense.setDeals(createDealsList());
        expense.setTags(createListTags());

        return expense;
    }


    private static Tag createTag() {
        Tag tag = new Tag();
        tag.setId(ID);
        tag.setName(NAME);

        return tag;
    }
    private static Deal creatDeal() {
        Deal deal = new Deal();
        deal.setIssueAmount(ISSUE_AMOUNT);
        deal.setParticipants(createListParticipants());

        return deal;
    }
    private static Participant createParticipant() {
        Participant participant = new Participant();
        participant.setUserId(USER_ID);
        participant.setDealRoomIndex(DEAL_ROOM_INDEX);
        participant.setAmount(AMOUNT);

        return participant;
    }
}
