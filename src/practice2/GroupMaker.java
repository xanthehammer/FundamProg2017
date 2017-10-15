package practice2;

public class GroupMaker {

    public static void main() {

        ASCIIArtGenerator artgen = new ASCIIArtGenerator();
        artgen.main("Group Maker");

        System.out.println("Enter the number of people: ");
        int numPeople = TextIO.getlnInt();

        System.out.println("Enter the size of each group: ");
        int sizeOfGroup = TextIO.getlnInt();

        //Devide the number of people by the size of the group to determine how big each group is
        int numGroups =  numPeople / sizeOfGroup;

        //Find numPeople mod numGroups to get the remainder
        int leftovers = numPeople % numGroups;

        //Print results
        System.out.println("Since you have " + numPeople +" people and want to make groups of " + sizeOfGroup + ", you will have " +
                (int)numGroups + " groups with " + (int)leftovers + " left over.");

    }

}