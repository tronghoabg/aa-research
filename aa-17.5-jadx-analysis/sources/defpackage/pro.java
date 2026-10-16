package defpackage;

/* loaded from: classes2.dex */
public final class pro extends Thread implements psa {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/concurrent/GmmThread");
    private final psb b;

    public pro(Runnable runnable, psb psbVar, String str) {
        super(new prm(psbVar, str, runnable, 0), str);
        this.b = psbVar;
        try {
            lws.L(str, "androidmapsapi-");
        } catch (IllegalArgumentException e) {
            ((ynz) ((ynz) a.a(uys.a).p(e)).ai((char) 6853)).s();
        }
        if (psbVar == psb.CURRENT) {
            b("Cannot start a GmmThread as Threads.CURRENT");
        }
        if (psbVar.b() < 0) {
            b(a.bq(str, "Hey, don't create a thread (", ") with an android thread priority having a lower number than the UI thread's priority of 0"));
        }
    }

    public static void b(String str) {
        ((ynz) ((ynz) a.a(uys.a).p(new IllegalArgumentException(str))).ai((char) 6854)).s();
    }

    @Override // defpackage.psa
    public final psb a() {
        return this.b;
    }
}
