package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ors extends defpackage.eqr {
    public static final defpackage.yhx a = defpackage.yhx.p(orp.a, orp.d);
    public j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional i = j$.util.Optional.empty();
    private final ora j;
    private defpackage.eqp k;

    public ors(ora oraVar) {
        this.j = oraVar;
    }

    public static defpackage.ors a() {
        return (defpackage.ors) defpackage.mkp.a.i(defpackage.ors.class);
    }

    public final j$.util.Optional b() {
        synchronized (this) {
            if (!this.h.isEmpty() && !this.i.isEmpty()) {
                ora oraVar = this.j;
                defpackage.ygw ygwVarA = oraVar.a((android.bluetooth.BluetoothProfile) this.h.get());
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(ygwVarA).map(new defpackage.ngh(12));
                int i = defpackage.ygw.d;
                j$.util.stream.Collector collector = defpackage.yds.a;
                defpackage.ygw ygwVar = (defpackage.ygw) j$.util.Collection.-EL.stream(oraVar.a((android.bluetooth.BluetoothProfile) this.i.get())).filter(new defpackage.orr((defpackage.ygw) map.collect(collector), 0)).collect(collector);
                defpackage.ygr ygrVar = new defpackage.ygr(4);
                ygrVar.k(ygwVarA);
                ygrVar.k(ygwVar);
                return j$.util.Optional.of(ygrVar.g());
            }
            return j$.util.Optional.empty();
        }
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        super.c();
        defpackage.eqp eqpVarD = defpackage.tcu.d(defpackage.orw.a(), defpackage.orl.a(), new ort(this, 1));
        this.k = eqpVarD;
        r(eqpVarD, new defpackage.nuk(this, 10));
        r(defpackage.orq.a(), new defpackage.nuk(this, 11));
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() {
        synchronized (this) {
            s(this.k);
            s(defpackage.orq.a());
            this.h = j$.util.Optional.empty();
            this.i = j$.util.Optional.empty();
            p();
        }
        super.d();
    }

    public final void u(j$.util.Optional optional) {
        mlc mlcVar = new mlc(this, 7);
        if (true != optional.isPresent()) {
            return;
        }
        java.lang.Object obj = optional.get();
        ((defpackage.eqp) mlcVar.a).q((defpackage.ygw) obj);
    }
}
