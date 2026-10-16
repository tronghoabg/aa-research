package com.google.android.libraries.handwriting.gui;

/* loaded from: classes3.dex */
public class AsyncTaskResult<T> {
    public final Exception exception;
    public final T result;

    public AsyncTaskResult(Exception exc) {
        this.exception = exc;
        this.result = null;
    }

    public AsyncTaskResult(T t) {
        this.result = t;
        this.exception = null;
    }
}
