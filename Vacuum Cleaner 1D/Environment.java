public class Environment implements EnvironmentInterface{
    int totalScore;
    Room r[];
    Environment(){
        r = new Room[2];
        r[0] = new Room(false,true);
        r[1] = new Room(true,false);
    }
    @Override
    public boolean moveLeft() {
        if(r[0].agentPosition){
            System.out.println("Agent is already in left room.");
            return false;
        }
        else if(!r[0].agentPosition){
            r[0].agentPosition = false;
            r[1].agentPosition = true;
            System.out.println("Agent is now moved to Left room.");
            totalScore -=10;
            return true;
        }
        return false;
    }

    @Override
    public boolean moveRight() {
        if(r[1].agentPosition){
            System.out.println("Agent is already in Right room.");
            return false;
        }
        else if(!r[1].agentPosition){
            r[0].agentPosition = false;
            r[1].agentPosition = true;
            System.out.println("Agent is now moved to Right room.");
            totalScore -=10;
            return true;
        }

        return false;
    }

    @Override
    public void suck() {
        int status =0;
        if(r[0].agentPosition){
            status = 0;
        }
        else if(r[1].agentPosition){
            status = 1;
        }
        if(r[status].Dirty){
            String roomNo = "";
            if(status == 0){
                roomNo = "A";
            }
            else if(status == 1){
                roomNo = "B";
            }
            System.out.println("Room "+ roomNo + " is Cleaned");
            r[status].Dirty = false;
            totalScore += 100;
        }
        else{
            System.out.println("Its already Cleaned");
        }

    }

    @Override
    public boolean isDirty(int roomNo) {
        if(r[roomNo].Dirty){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getScore() {
        return totalScore;
    }
}
