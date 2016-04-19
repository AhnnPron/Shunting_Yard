package com.example.awesomefat.linkedlist;

/**
 * Created by Owner on 4/18/2016.
 */
public class ShuntingYard
{
    TOHCore.outputStack = new TowerFragment();
    TOHCore.operatorStack = new TowerFragment();

    String integer = ("1234567890");
    String power = ("^");
    String multiply = ("*");
    String divide = ("/");
    String add = ("+");
    String subtract = ("-");
    String openP = ("(");
    String closedP = (")");
}


public Sort(String input)
{
    if (input.equals(integer)); //if the input is an integer, push it onto the output stack
    {
        TOHCore.outputStack.push(input);
    }
    //if the input is an operator, push it onto the operator stack
    else (input == ((power || multiply || divide || add || subtract || openP || closedP));
    {
        TOHCore.operatorStack.push(input);
        //If the operator pushed has the same precendence as the operator previously stacked,
        //pop what is on the stack to the output stack adding the operator to the output stack
        //and push the next operator to the operator stack
        if (TOHCore.operatorStack.push(peek) == (multiply + divide) || (divide + multiply));
        {
            TOHCore.operatorStack.pop();
            TOHCore.outputStack.push(pop);
            TOHCore.operatorStack.push(input);
        }
        //If the operator is a parenthesis and is met by another parenthesis,
        //pop the operator stack to the output stack moving the first parenthesis,
        //then pop the output stack and pop the operator stack removing both parenthesis
        else (TOHCore.operatorStack.push(peek) == (openP + closedP) || (closedP + openP));
        {
            TOHCore.operatorStack.pop();
            TOHCore.outputStack.push(pop);
            TOHCore.operatorStack.pop();
            TOHCore.outputStack.pop();
        }

    }

    return (input);
}


