package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqa {
    public static final java.util.concurrent.locks.Lock a = new java.util.concurrent.locks.ReentrantLock();
    public static defpackage.qqa b;
    private final java.util.concurrent.locks.Lock c = new java.util.concurrent.locks.ReentrantLock();
    private final android.content.SharedPreferences d;

    public qqa(android.content.Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final java.lang.String a(java.lang.String str) {
        this.c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.c.unlock();
        }
    }
}
