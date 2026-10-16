package defpackage;

import android.content.ComponentName;
import android.util.ArrayMap;
import com.google.android.gms.car.display.CarDisplayId;
import j$.util.Map;
import java.util.Map;

/* loaded from: classes.dex */
public final class nrq implements lhg {
    public final eqa a;
    public ComponentName c;
    public ComponentName d;
    private nro g;
    private final nsg e = new nrp(this, 0);
    private final Map f = new ArrayMap();
    public final eqj b = tby.v(mpd.b().h, new nqz(3));

    public nrq(eqa eqaVar) {
        this.a = eqaVar;
    }

    public static nrq b() {
        return (nrq) mki.a.b(nrq.class, new may(15));
    }

    public final nro a() {
        nro nroVar = this.g;
        nroVar.getClass();
        return nroVar;
    }

    @Override // defpackage.lhg
    public final void c() {
        this.f.clear();
        this.c = null;
        this.d = null;
        nsr.c().b().w(this.e);
        e(nsr.c().b());
    }

    @Override // defpackage.lhg
    public final void d() {
        nsr.c().b().A(this.e);
        this.g = null;
    }

    public final void e(nso nsoVar) {
        nro nroVar;
        nro nroVar2;
        if (CarDisplayId.b(nsoVar.o) && (nroVar2 = this.g) != (nroVar = (nro) Map.EL.computeIfAbsent(this.f, nsoVar.m(), new jxf(this, nsoVar, 11)))) {
            if (nroVar2 != null) {
                nroVar2.g();
            }
            nroVar.d();
            this.g = nroVar;
        }
    }
}
