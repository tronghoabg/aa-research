package defpackage;

import androidx.datastore.core.NativeSharedCounter;

/* loaded from: classes2.dex */
public final class ehb {
    public static final NativeSharedCounter a;

    static {
        System.loadLibrary("datastore_shared_counter");
        a = new NativeSharedCounter();
    }
}
