package com.company.interfaces;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
