package com.company;

public class bridgecross
{

    public static void main(String[] args) {
        int[] person = {1, 2,5,10 };
        System.out.println("with path:");
        solveprint(person,person.length);
        System.out.println("\n only time:");
        System.out.println(solveNonprint(person, person.length));
    }
    public static int solveprint(int[]person,int upTo)
    {
    return solveprint(person,person.length, 0);
    }
    public static int solveprint(int[]person,int upTo,int time) {
    if (upTo < 3)
    {
        if (upTo == 1)
        {
            System.out.println("person0 goes.(" + person[0] + "sec");
            time += person[0];
        }
        else if (upTo == 2)
        {
            System.out.println("person0 and person1 goes(" + person[1] + "sec)");
            time += person[1];
        }
        System.out.println("solved!(" + time + "sec)");
        return time;
    }
    else if (upTo == 3)
    {
        System.out.println("person0 and person1 goes.(" + person[2] + "sec)");
        System.out.println("person0 return back.(" + person[0] + "sec)");
        System.out.println("person0 and person2 goes.(" + person[2] + "sec");
        time += person[1] + person[0] + person[2];
        System.out.println("solved!(" + time + "sec)");
        return time;
    } else {
        System.out.println("person0 and person1 goes.(" + person[1] + "sec)");
        System.out.println("person0 returns.(" + person[0] + "sec)");
        System.out.println("person" +(upTo - 2) + "and person" +(upTo - 1)+"goes.(" + person[upTo - 1] + "sec)");
        System.out.println("person1 returns.(" + person[1] + "sec)");
        time += person[1] + person[0] + person[upTo - 1] + person[1];
        return solveprint(person,upTo - 2,time);
    }
}
        public static int
    solveNonprint(int[]person, int upTo)
        {
            if(upTo<3)
            {
                return person[upTo-1];
            }
            else if(upTo==3) {
                return person[1] + person[0] + person[2];
            }
            else
            {
                return person[1]+person[0]+person[upTo-1]+person[1]+ solveNonprint(person,upTo-2);
            }


        }

        }
