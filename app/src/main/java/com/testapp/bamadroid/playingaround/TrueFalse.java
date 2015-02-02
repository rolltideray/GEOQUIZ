package com.testapp.bamadroid.playingaround;

/**
 * Created by ray on 11/27/2014.
 */
public class TrueFalse {
    private int mQuestion;

    private  boolean mTrueQeustion;

    public TrueFalse(int question, boolean trueQuestion)
    {
        mQuestion = question;
        mTrueQeustion = trueQuestion;
    }

    public int getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean ismTrueQeustion() {
        return mTrueQeustion;
    }

    public void setmTrueQeustion(boolean mTrueQeustion) {
        this.mTrueQeustion = mTrueQeustion;
    }
}
