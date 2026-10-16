package com.google.android.libraries.gmm.fileobserver;

import android.util.SparseArray;
import defpackage.vau;
import defpackage.wub;
import defpackage.ynz;
import defpackage.yob;
import java.io.Closeable;

/* loaded from: classes3.dex */
final class Epoller implements Closeable {
    private static final yob a = yob.c("com/google/android/libraries/gmm/fileobserver/Epoller");
    private final SparseArray b = new SparseArray();
    private int c = nativeEpollCreate1();

    static {
        wub.J(nativeInitClass(), "Impossible -- JNI will throw a detailed java.lang.Error", new Object[0]);
    }

    private static native void nativeEpollAdd(int i, int i2);

    private static native int nativeEpollCreate1();

    private static native void nativeEpollRemove(int i, int i2);

    private native int nativeEpollWaitAndDispatch(int i, int i2);

    private static native boolean nativeInitClass();

    private void onEpollEvent(int i, int i2) {
        vau vauVar;
        synchronized (this) {
            vauVar = (vau) this.b.get(i);
        }
        if (vauVar != null) {
            try {
                vauVar.a();
            } catch (RuntimeException e) {
                ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai(9734)).s();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.c;
        if (i >= 0) {
            Inotifier.nativeClose(i);
            this.c = -1;
        }
    }
}
