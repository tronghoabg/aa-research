package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public class AsyncTaskResult<T> {
    public final java.lang.Exception exception;
    public final T result;

    public AsyncTaskResult(java.lang.Exception exc) {
        this.exception = exc;
        this.result = null;
    }

    public AsyncTaskResult(T t) {
        this.result = t;
        this.exception = null;
    }
}
