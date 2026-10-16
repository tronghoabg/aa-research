package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsv {
    public static final defpackage.zsv a = new defpackage.zsv();
    private static final java.lang.String b = "zsv";

    private zsv() {
    }

    public final android.os.StrictMode.ThreadPolicy a() {
        java.lang.String str = b;
        if (defpackage.zsr.e(str, 5)) {
            android.util.Log.w(str, "Suppressed StrictMode policy violation: StrictModeDiskReadViolation");
        }
        return android.os.StrictMode.allowThreadDiskReads();
    }

    public final android.os.StrictMode.ThreadPolicy b() {
        android.os.StrictMode.ThreadPolicy threadPolicyA = a();
        c();
        return threadPolicyA;
    }

    public final android.os.StrictMode.ThreadPolicy c() {
        java.lang.String str = b;
        if (defpackage.zsr.e(str, 5)) {
            android.util.Log.w(str, "Suppressed StrictMode policy violation: StrictModeDiskWriteViolation");
        }
        return android.os.StrictMode.allowThreadDiskWrites();
    }

    public final void d(android.os.StrictMode.ThreadPolicy threadPolicy) {
        if (threadPolicy != null) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
