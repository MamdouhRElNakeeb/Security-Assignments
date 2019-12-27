import java.util.*;

public class GeneralInverse {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] sizeArr = scanner.nextLine().split(" ");
        String[] inputsArr = scanner.nextLine().split(" ");
        scanner.close();

        int[] sizes = new int[sizeArr.length];
        int[] inputs = new int[inputsArr.length];

        for (int i = 0; i < sizeArr.length; i++)
            sizes[i] = Integer.parseInt(sizeArr[i]);

        for (int i = 0; i < inputsArr.length; i++)
            inputs[i] = Integer.parseInt(inputsArr[i]);

        if (sizes[0] > sizes[1]){
            System.out.println("IMPOSSIBLE");
            return;
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int i : inputs)
            set.add(i);

        if (set.size() < sizes[0]){
            System.out.println("IMPOSSIBLE");
            return;
        }

        ArrayList<Integer> out =new ArrayList<Integer>(Collections.nCopies(sizes[0], -1));

        int index = 1;

        for (int i = 0; i < inputs.length; i++){
            if (out.get(inputs[i] - 1) == -1){
                out.set(inputs[i] - 1, index);
            }

            index = index + 1;
        }

        for (int i = 0; i < out.size(); i++){
            System.out.print(out.get(i));

            if (i != out.size()-1)
                System.out.print(" ");
        }
    }

}

