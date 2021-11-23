package com.company.worker;

import com.company.interfaces.*;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorListener;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorListener)  {
        this.callback = callback;
        this.errorListener = errorListener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 32) {
                errorListener.onError("Task " + (i + 1) + " ended with an error");
            } else {
                callback.onDone("Task " + (i + 1) + " is done");
            }
        }
    }
}
