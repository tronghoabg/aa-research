package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class wdc implements wdg {
    private static boolean b;
    public final xyc a;
    private final xyc c;
    private final int d;

    public wdc(xyc xycVar) {
        txv txvVar = new txv(14);
        this.c = xycVar;
        this.d = Math.max(5, 10);
        this.a = txvVar;
    }

    @Override // defpackage.wdg
    public final void a() {
        synchronized (wdc.class) {
            if (!b) {
                upk upkVar = new upk(this, 19);
                long j = this.d;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                zgt zgtVar = (zgt) this.c.gu();
                woy.aD(zgtVar.schedule(new jqx(upkVar, zgtVar, j, timeUnit, 2), j, timeUnit));
                b = true;
            }
        }
    }
}
