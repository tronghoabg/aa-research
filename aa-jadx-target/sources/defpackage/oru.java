package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oru extends defpackage.eqr {
    public static final defpackage.yhx a = defpackage.yhx.p(orp.a, orp.d);
    public j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional i = j$.util.Optional.empty();
    private final ora j;
    private defpackage.eqp k;

    public oru(ora oraVar) {
        this.j = oraVar;
    }

    public final defpackage.ygy a() {
        defpackage.ygy ygyVarA;
        synchronized (this) {
            int i = defpackage.ygw.d;
            defpackage.ygw ygwVarA = defpackage.ymx.a;
            defpackage.ygw ygwVarA2 = this.h.isPresent() ? this.j.a((android.bluetooth.BluetoothProfile) this.h.get()) : ygwVarA;
            if (this.i.isPresent()) {
                ygwVarA = this.j.a((android.bluetooth.BluetoothProfile) this.i.get());
            }
            defpackage.ygx ygxVar = new defpackage.ygx();
            ygxVar.c(1, ygwVarA2);
            ygxVar.c(2, ygwVarA);
            ygyVarA = ygxVar.a();
        }
        return ygyVarA;
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        super.c();
        defpackage.eqp eqpVarD = defpackage.tcu.d(defpackage.orw.a(), defpackage.orl.a(), new ort(this, 0));
        this.k = eqpVarD;
        r(eqpVarD, new defpackage.nuk(this, 12));
        r(defpackage.orq.a(), new defpackage.nuk(this, 13));
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() {
        synchronized (this) {
            s(this.k);
            s(defpackage.orq.a());
            this.h = j$.util.Optional.empty();
            this.i = j$.util.Optional.empty();
            m(yfb.a);
        }
        super.d();
    }
}
