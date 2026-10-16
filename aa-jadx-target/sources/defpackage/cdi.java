package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdi {
    public static final long a;

    static {
        long id;
        try {
            id = android.os.Looper.getMainLooper().getThread().getId();
        } catch (java.lang.Exception unused) {
            id = -1;
        }
        a = id;
    }
}
