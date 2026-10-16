package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class svc {
    public static volatile defpackage.svc a;
    public static final java.lang.Object b = new java.lang.Object();
    public final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(-1);
    private final defpackage.sqb d;

    public svc(android.content.Context context) {
        this.d = new defpackage.sqb(context, new defpackage.spp("module:cronet_dynamite"));
    }

    final synchronized void a(int i, int i2, long j, long j2, int i3) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && android.os.SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
            return;
        }
        this.d.a(new com.google.android.gms.common.internal.TelemetryData(0, java.util.Arrays.asList(new com.google.android.gms.common.internal.MethodInvocation(i, i2, -1, j, j2, null, null, 368, i3)))).j(new defpackage.thv(this, 1));
    }
}
