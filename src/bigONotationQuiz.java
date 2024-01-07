import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class bigONotationQuiz extends JFrame{
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Big O Notation Quiz");
        myFrame.setSize(600, 500);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        questionPool qp = new questionPool();
        qp.createQuestionPool();

        int questionSize = qp.getQuestionSize();

        JButton button1 = new JButton("O(1)");
        JButton button2 = new JButton("O(log n)");
        JButton button3 = new JButton("O(n)");
        JButton button4 = new JButton("O(n log n)");
        JButton button5 = new JButton("N/A");

        JButton button6 = new JButton("Restart");

        buttonAnswer ba = new buttonAnswer();
        JLabel currentQ = new JLabel("Start");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                System.out.println("button1");
                if(ba.getB1()==true){
                    currentQ.setText("Correct!");
                    System.out.println("correct");
                    qp.removeQuestion(qp.getQuestion());
                }else{
                    currentQ.setText("False!");
                    System.out.println("false");
                }
                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ba.setNextQuestion(true);
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button3.setEnabled(true);
                        button4.setEnabled(true);
                        button5.setEnabled(true);
                    }
                });
                timer.setRepeats(false);//run one time
                timer.start();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                System.out.println("button2");
                if(ba.getB2()==true){
                    currentQ.setText("Correct!");
                    System.out.println("correct");
                    qp.removeQuestion(qp.getQuestion());
                }else{
                    currentQ.setText("False!");
                    System.out.println("false");
                }
                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ba.setNextQuestion(true);
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button3.setEnabled(true);
                        button4.setEnabled(true);
                        button5.setEnabled(true);
                    }
                });
                timer.setRepeats(false);//run one time
                timer.start();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                System.out.println("button3");
                if(ba.getB3()==true){
                    currentQ.setText("Correct!");
                    System.out.println("correct");
                    qp.removeQuestion(qp.getQuestion());
                }else{
                    currentQ.setText("False!");
                    System.out.println("false");
                }
                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ba.setNextQuestion(true);
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button3.setEnabled(true);
                        button4.setEnabled(true);
                        button5.setEnabled(true);
                    }
                });
                timer.setRepeats(false);//run one time
                timer.start();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                System.out.println("button4");
                if(ba.getB4()==true){
                    currentQ.setText("Correct!");
                    System.out.println("correct");
                    qp.removeQuestion(qp.getQuestion());
                }else{
                    currentQ.setText("False!");
                    System.out.println("false");
                }
                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ba.setNextQuestion(true);
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button3.setEnabled(true);
                        button4.setEnabled(true);
                        button5.setEnabled(true);
                    }
                });
                timer.setRepeats(false);//run one time
                timer.start();
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                System.out.println("button5");
                if(ba.getB5()==true){
                    currentQ.setText("Correct!");
                    System.out.println("correct");
                    qp.removeQuestion(qp.getQuestion());
                }else{
                    currentQ.setText("False!");
                    System.out.println("false");
                }
                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ba.setNextQuestion(true);
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button3.setEnabled(true);
                        button4.setEnabled(true);
                        button5.setEnabled(true);
                    }
                });
                timer.setRepeats(false);//run one time
                timer.start();
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button6");
                qp.restart();//remove all questions
            }
        });

        JPanel myPanel = new JPanel();
        myPanel.add(button1);
        myPanel.add(button2);
        myPanel.add(button3);
        myPanel.add(button4);
        myPanel.add(button5);

        myPanel.add(button6);

        myFrame.add(currentQ);

        myFrame.add(myPanel, BorderLayout.AFTER_LAST_LINE);//BorderLayout.NORTH //SOUTH
        myFrame.setVisible(true);

        while(questionSize>0){
            System.out.println("begin loop");
            questionSize = qp.getQuestionSize();

            currentQ.setText(qp.getRandomQuestion(ba));
            myFrame.setVisible(true);

            //pause
            ba.setNextQuestion(false);
            while(ba.getNextQuestion()==false){
                try {
                    //Thread.sleep(100);//Sleep to avoid busy waiting?
                    TimeUnit.SECONDS.sleep(1);
                    //System.out.println("main bit ran");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("getQuestionSize: " + qp.getQuestionSize());
        }
    }
}


class questionPool{
    private ArrayList<String> questionPool = new ArrayList<>();
    private int currentQ;
    private String setQuestion;

    public int getQuestionSize(){
        return questionPool.size();
    }

    public void removeQuestion(String b){
        questionPool.remove(b);
    }

    public String getQuestion(){
        return setQuestion;
    }

    public void restart(){
        questionPool.clear();
        createQuestionPool();
    }

    public String getRandomQuestion(buttonAnswer baTemp){
        Random rand = new Random();
        setQuestion = "";
        if(questionPool.size()>0){
            currentQ = rand.nextInt(questionPool.size());
            setQuestion = questionPool.get(currentQ);
        }else{
            setQuestion = "YOU WIN";
            System.out.println("Win");
        }

        switch (setQuestion){
            case "Time Complexity: Worst: Access: Array: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: Array: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Array: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Array: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Array: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //STACK
            case "Time Complexity: Worst: Access: Stack: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: Stack: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Stack: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Stack: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Stack: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //QUEUE
            case "Time Complexity: Worst: Access: Queue: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: Queue: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Queue: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Queue: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Queue: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //SINGLY-LINKED LIST
            case "Time Complexity: Worst: Access: Singly-Linked List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: Singly-Linked List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Singly-Linked List: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Singly-Linked List: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Singly-Linked List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //DOUBLY-LINKED LIST
            case "Time Complexity: Worst: Access: Doubly-Linked List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: Doubly-Linked List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Doubly-Linked List: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Doubly-Linked List: ?":
                //O(1) //button1
                baTemp.setB1(true);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Doubly-Linked List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //SKIP LIST
            case "Time Complexity: Worst: Access: Skip List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: Skip List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Skip List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Skip List: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Skip List: ?":
                //O(n log n) //button4
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(true);
                baTemp.setB5(false);
                break;

            //HASH TABLE
            case "Time Complexity: Worst: Access: Hash Table: ?":
                //N/A //button5
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(true);
                break;
            case "Time Complexity: Worst: Search: Hash Table: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Hash Table: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Hash Table: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Hash Table: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //BINARY SEARCH TREE
            case "Time Complexity: Worst: Access: Binary Search Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: Binary Search Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Binary Search Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Binary Search Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Binary Search Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //CARTESIAN TREE
            case "Time Complexity: Worst: Access: Cartesian Tree: ?":
                //N/A //button5
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(true);
                break;
            case "Time Complexity: Worst: Search: Cartesian Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Cartesian Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Cartesian Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Cartesian Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //B-TREE
            case "Time Complexity: Worst: Access: B-Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: B-Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: B-Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: B-Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: B-Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //RED-BLACK TREE
            case "Time Complexity: Worst: Access: Red-Black Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: Red-Black Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Red-Black Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Red-Black Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Red-Black Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //SPLAY TREE
            case "Time Complexity: Worst: Access: Splay Tree: ?":
                //N/A //button5
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(true);
                break;
            case "Time Complexity: Worst: Search: Splay Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: Splay Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: Splay Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: Splay Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //AVL TREE
            case "Time Complexity: Worst: Access: AVL Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: AVL Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: AVL Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: AVL Tree: ?":
                //O(log n) //button2
                baTemp.setB1(false);
                baTemp.setB2(true);
                baTemp.setB3(false);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: AVL Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            //KD TREE
            case "Time Complexity: Worst: Access: KD Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Search: KD Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Insertion: KD Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Time Complexity: Worst: Deletion: KD Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;
            case "Space Complexity: Worst: KD Tree: ?":
                //O(n) //button3
                baTemp.setB1(false);
                baTemp.setB2(false);
                baTemp.setB3(true);
                baTemp.setB4(false);
                baTemp.setB5(false);
                break;

            default:
                setQuestion = "YOU WIN!!!";
                baTemp.setB1(true);
                baTemp.setB2(true);
                baTemp.setB3(true);
                baTemp.setB4(true);
                baTemp.setB5(true);
                break;
        }
        return setQuestion;
    }

    public void createQuestionPool(){
        //ARRAY
        questionPool.add("Time Complexity: Worst: Access: Array: ?");
        //O(1) //button1
        questionPool.add("Time Complexity: Worst: Search: Array: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Array: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Deletion: Array: ?");
        //O(n) //button3
        questionPool.add("Space Complexity: Worst: Array: ?");
        //O(n) //button3

        //
        //STACK
        questionPool.add("Time Complexity: Worst: Access: Stack: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Search: Stack: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Stack: ?");
        //O(1) //button1
        questionPool.add("Time Complexity: Worst: Deletion: Stack: ?");
        //O(1) //button1
        questionPool.add("Space Complexity: Worst: Stack: ?");
        //O(n) //button3

        //QUEUE
        questionPool.add("Time Complexity: Worst: Access: Queue: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Search: Queue: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Queue: ?");
        //O(1) //button1
        questionPool.add("Time Complexity: Worst: Deletion: Queue: ?");
        //O(1) //button1
        questionPool.add("Space Complexity: Worst: Queue: ?");
        //O(n) //button3

        //SINGLY-LINKED LIST
        questionPool.add("Time Complexity: Worst: Access: Singly-Linked List: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Search: Singly-Linked List: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Singly-Linked List: ?");
        //O(1) //button1
        questionPool.add("Time Complexity: Worst: Deletion: Singly-Linked List: ?");
        //O(1) //button1
        questionPool.add("Space Complexity: Worst: Singly-Linked List: ?");
        //O(n) //button3

        //DOUBLY-LINKED LIST
        questionPool.add("Time Complexity: Worst: Access: Doubly-Linked List: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Search: Doubly-Linked List: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Doubly-Linked List: ?");
        //O(1) //button1
        questionPool.add("Time Complexity: Worst: Deletion: Doubly-Linked List: ?");
        //O(1) //button1
        questionPool.add("Space Complexity: Worst: Doubly-Linked List: ?");
        //O(n) //button3

        //SKIP LIST
        questionPool.add("Time Complexity: Worst: Access: Skip List: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Search: Skip List: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Skip List: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Deletion: Skip List: ?");
        //O(n) //button3
        questionPool.add("Space Complexity: Worst: Skip List: ?");
        //O(n log n) //button4

        //HASH TABLE
        questionPool.add("Time Complexity: Worst: Access: Hash Table: ?");
        //N/A //button5
        questionPool.add("Time Complexity: Worst: Search: Hash Table: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Hash Table: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Deletion: Hash Table: ?");
        //O(n) //button3
        questionPool.add("Space Complexity: Worst: Hash Table: ?");
        //O(n) //button3

        //BINARY SEARCH TREE
        questionPool.add("Time Complexity: Worst: Access: Binary Search Tree: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Search: Binary Search Tree: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Binary Search Tree: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Deletion: Binary Search Tree: ?");
        //O(n) //button3
        questionPool.add("Space Complexity: Worst: Binary Search Tree: ?");
        //O(n) //button3

        //CARTESIAN TREE
        questionPool.add("Time Complexity: Worst: Access: Cartesian Tree: ?");
        //N/A //button5
        questionPool.add("Time Complexity: Worst: Search: Cartesian Tree: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: Cartesian Tree: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Deletion: Cartesian Tree: ?");
        //O(n) //button3
        questionPool.add("Space Complexity: Worst: Cartesian Tree: ?");
        //O(n) //button3

        //B-TREE
        questionPool.add("Time Complexity: Worst: Access: B-Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Search: B-Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Insertion: B-Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Deletion: B-Tree: ?");
        //O(log n) //button2
        questionPool.add("Space Complexity: Worst: B-Tree: ?");
        //O(n) //button3

        //RED-BLACK TREE
        questionPool.add("Time Complexity: Worst: Access: Red-Black Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Search: Red-Black Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Insertion: Red-Black Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Deletion: Red-Black Tree: ?");
        //O(log n) //button2
        questionPool.add("Space Complexity: Worst: Red-Black Tree: ?");
        //O(n) //button3

        //SPLAY TREE
        questionPool.add("Time Complexity: Worst: Access: Splay Tree: ?");
        //N/A //button5
        questionPool.add("Time Complexity: Worst: Search: Splay Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Insertion: Splay Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Deletion: Splay Tree: ?");
        //O(log n) //button2
        questionPool.add("Space Complexity: Worst: Splay Tree: ?");
        //O(n) //button3

        //AVL TREE
        questionPool.add("Time Complexity: Worst: Access: AVL Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Search: AVL Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Insertion: AVL Tree: ?");
        //O(log n) //button2
        questionPool.add("Time Complexity: Worst: Deletion: AVL Tree: ?");
        //O(log n) //button2
        questionPool.add("Space Complexity: Worst: AVL Tree: ?");
        //O(n) //button3

        //KD TREE
        questionPool.add("Time Complexity: Worst: Access: KD Tree: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Search: KD Tree: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Insertion: KD Tree: ?");
        //O(n) //button3
        questionPool.add("Time Complexity: Worst: Deletion: KD Tree: ?");
        //O(n) //button3
        questionPool.add("Space Complexity: Worst: KD Tree: ?");
        //O(n) //button3
    }
}


class buttonAnswer{
    private boolean b1 = false;
    private boolean b2 = false;
    private boolean b3 = false;
    private boolean b4 = false;
    private boolean b5 = false;
    private boolean nextQuestion = false;

    boolean getB1(){
        return b1;
    }
    boolean getB2(){
        return b2;
    }
    boolean getB3(){
        return b3;
    }
    boolean getB4(){
        return b4;
    }
    boolean getB5(){
        return b5;
    }
    boolean getNextQuestion(){
        return nextQuestion;
    }

    void setB1(boolean temp){
        b1 = temp;
    }
    void setB2(boolean temp){
        b2 = temp;
    }
    void setB3(boolean temp){
        b3 = temp;
    }
    void setB4(boolean temp){
        b4 = temp;
    }
    void setB5(boolean temp){
        b5 = temp;
    }
    void setNextQuestion(boolean temp){
        nextQuestion = temp;
    }
}
