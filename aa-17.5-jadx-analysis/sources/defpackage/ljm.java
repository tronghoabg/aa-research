package defpackage;

/* loaded from: classes.dex */
final class ljm extends liz {
    private static final yph a = yph.c("GH.WheelSpeedProvider");
    private boolean d;
    private final roj e;
    private final ljb f;

    public ljm(roj rojVar) throws qrz {
        ljb ljbVar = new ljb(this, 3, null);
        this.f = ljbVar;
        if (!b(rojVar)) {
            throw new IllegalStateException("Can't create unsupported WheelSpeedProvider.");
        }
        this.e = rojVar;
        try {
            rojVar.f(ljbVar, 2, 3);
        } catch (qrz unused) {
            ((ype) a.l().ai((char) 3979)).u("Car speed sensor not available when car is not connected.");
        }
    }

    static boolean b(roj rojVar) throws qrz {
        return rojVar != null && lgv.c().r() && rojVar.d(2);
    }

    @Override // defpackage.liz
    public final float a() {
        return (float) acok.c();
    }

    @Override // defpackage.liz
    protected final tdz e(Object obj, Object obj2, long j) {
        if (k(j) <= 0 && !this.d) {
            this.d = true;
            ((ype) a.l().ai((char) 3980)).u("Stale wheel speed! This probably shouldn't happen.");
            ebf.j().x(10, yyv.WHEEL_SPEED_PROVIDER_STALE_SPEED);
        }
        lbh.a();
        return new tdz(obj);
    }

    @Override // defpackage.liz
    public final void i() {
        ljb ljbVar;
        super.i();
        roj rojVar = this.e;
        if (rojVar == null || (ljbVar = this.f) == null) {
            return;
        }
        rojVar.b(ljbVar);
    }
}
