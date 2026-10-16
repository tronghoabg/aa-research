package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ehi {
    public static final androidx.datastore.core.NativeSharedCounter a;

    static {
        java.lang.System.loadLibrary("datastore_shared_counter");
        a = new androidx.datastore.core.NativeSharedCounter();
    }
}
