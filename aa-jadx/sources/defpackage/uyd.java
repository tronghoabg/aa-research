package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uyd {
    public static final defpackage.uyd a = new defpackage.uyd(android.os.Looper.getMainLooper().getThread());
    public final java.lang.Thread b;
    public final java.lang.String c = "Not on the main thread";

    private uyd(java.lang.Thread thread) {
        this.b = thread;
    }
}
