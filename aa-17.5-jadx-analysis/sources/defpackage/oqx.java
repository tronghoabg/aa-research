package defpackage;

import android.bluetooth.BluetoothProfile;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public final class oqx extends eql {
    public static final ygr a = ygr.p(oqv.a, oqv.d);
    public Optional h = Optional.empty();
    public Optional i = Optional.empty();
    private final oqg j;
    private eqj k;

    public oqx(oqg oqgVar) {
        this.j = oqgVar;
    }

    public static oqx a() {
        return (oqx) mki.a.i(oqx.class);
    }

    public final Optional b() {
        synchronized (this) {
            if (!this.h.isEmpty() && !this.i.isEmpty()) {
                oqg oqgVar = this.j;
                yfq yfqVarA = oqgVar.a((BluetoothProfile) this.h.get());
                Stream map = Collection.EL.stream(yfqVarA).map(new nsb(11));
                int i = yfq.d;
                Collector collector = ycm.a;
                yfq yfqVar = (yfq) Collection.EL.stream(oqgVar.a((BluetoothProfile) this.i.get())).filter(new pcx((yfq) map.collect(collector), 1)).collect(collector);
                yfl yflVar = new yfl(4);
                yflVar.k(yfqVarA);
                yflVar.k(yfqVar);
                return Optional.of(yflVar.g());
            }
            return Optional.empty();
        }
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        eqj eqjVarD = tby.d(ora.a(), oqr.a(), new njg(this, 20));
        this.k = eqjVarD;
        r(eqjVarD, new ntw(this, 10));
        r(oqw.a(), new ntw(this, 11));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        synchronized (this) {
            s(this.k);
            s(oqw.a());
            this.h = Optional.empty();
            this.i = Optional.empty();
            p();
        }
        super.d();
    }

    public final void u(Optional optional) {
        mla mlaVar = new mla(this, 6);
        if (true != optional.isPresent()) {
            return;
        }
        Object obj = optional.get();
        ((eqj) mlaVar.a).q((yfq) obj);
    }
}
