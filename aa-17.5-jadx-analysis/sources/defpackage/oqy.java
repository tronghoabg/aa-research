package defpackage;

import android.bluetooth.BluetoothProfile;
import j$.util.Optional;

/* loaded from: classes.dex */
public final class oqy extends eql {
    public static final ygr a = ygr.p(oqv.a, oqv.d);
    public Optional h = Optional.empty();
    public Optional i = Optional.empty();
    private final oqg j;
    private eqj k;

    public oqy(oqg oqgVar) {
        this.j = oqgVar;
    }

    public final yfs a() {
        yfs yfsVarA;
        synchronized (this) {
            int i = yfq.d;
            yfq yfqVarA = yls.a;
            yfq yfqVarA2 = this.h.isPresent() ? this.j.a((BluetoothProfile) this.h.get()) : yfqVarA;
            if (this.i.isPresent()) {
                yfqVarA = this.j.a((BluetoothProfile) this.i.get());
            }
            yfr yfrVar = new yfr();
            yfrVar.c(1, yfqVarA2);
            yfrVar.c(2, yfqVarA);
            yfsVarA = yfrVar.a();
        }
        return yfsVarA;
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        eqj eqjVarD = tby.d(ora.a(), oqr.a(), new tbk(this, 1));
        this.k = eqjVarD;
        r(eqjVarD, new ntw(this, 12));
        r(oqw.a(), new ntw(this, 13));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        synchronized (this) {
            s(this.k);
            s(oqw.a());
            this.h = Optional.empty();
            this.i = Optional.empty();
            m(ydv.a);
        }
        super.d();
    }
}
