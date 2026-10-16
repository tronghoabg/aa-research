package com.google.android.libraries.gmm.fileobserver;

import defpackage.wub;
import java.io.Closeable;

/* loaded from: classes3.dex */
public final class Inotifier implements Closeable {
    private int a = nativeInotifyInit();

    public interface Callback {
        void onInotifyEvent(int i, int i2, String str);
    }

    static {
        wub.J(nativeInitClass(), "Impossible -- JNI will throw a detailed java.lang.Error", new Object[0]);
    }

    static native void nativeClose(int i);

    private static native void nativeDispatchInotifyEvents(byte[] bArr, int i, Callback callback);

    private static native boolean nativeInitClass();

    private static native int nativeInotifyAddWatch(int i, String str, int i2);

    private static native int nativeInotifyInit();

    private static native int nativeReadInotifyEvents(int i, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.a;
        if (i >= 0) {
            nativeClose(i);
            this.a = -1;
        }
    }
}
