package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ofy {
    public final com.google.android.apps.auto.components.telecom.call.CarCall a;
    public final defpackage.ygw b;
    public boolean c;
    private final long d;

    public ofy(com.google.android.apps.auto.components.telecom.call.CarCall carCall, defpackage.ygw ygwVar, long j) {
        this.a = carCall;
        this.b = ygwVar;
        this.d = j;
    }

    public final long a() {
        defpackage.ojm.a();
        return android.os.SystemClock.elapsedRealtime() - this.d;
    }
}
