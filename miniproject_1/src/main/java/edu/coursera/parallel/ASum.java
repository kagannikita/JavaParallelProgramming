package edu.coursera.parallel;

import java.util.concurrent.RecursiveAction;

public class ASum extends RecursiveAction {
    int[] A; // input array
    int LO, HI; // subrange
    int SUM; // return value
    @Override
    protected void compute() {
        SUM = 0;
        for (int i = LO; i <= HI; i++) SUM += A[i];
    } // compute()
}
