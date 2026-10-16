package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import java.util.List;

/* loaded from: classes2.dex */
public final class nea extends erm {
    public static final yph a = yph.c("GH.MiniTelecomCallVM");
    public static final List b;
    public final Context c;
    public final eqj d;
    public final boolean e;
    public final eqj f;
    public final eqj g;
    public final eqj i;
    public final eqj j;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final eqj n;
    public final eqj o;
    public final eqj p;
    public final eqj q;
    public final eqj r;
    private final eqj s;

    static {
        yfq yfqVar = odq.a;
        yfqVar.getClass();
        b = yfqVar;
    }

    public nea() {
        odw odwVar = new odw();
        odt odtVar = new odt();
        Context context = mki.a.c;
        context.getClass();
        this.c = context;
        eqj eqjVarT = tby.t(tby.v(odtVar, new ndo(5)));
        this.d = eqjVarT;
        leh.a.a();
        this.e = ldz.a.a().b();
        this.f = tby.B(tby.B(kiu.a(), new mzx(eqjVarT, tby.b, 9, null)), new mzx(wub.ak(1000), this, 10, null));
        int i = 7;
        this.g = tby.v(odwVar, new ndo(i));
        eqj eqjVarV = tby.v(eqjVarT, new ndo(8));
        eql eqlVar = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar.r(eqjVarV, new med(new mzx(eqlVar, affqVar, 8), 18));
        this.s = eqlVar;
        this.i = tby.v(eqjVarT, new nar(this, 11));
        this.j = tby.v(eqjVarT, new nar(this, 12));
        this.k = tby.v(eqjVarT, new nar(this, 13));
        int i2 = 6;
        this.l = tby.v(eqjVarT, new nar(this, i2));
        this.m = tby.v(eqjVarT, new ndo(3));
        this.n = tby.B(eqjVarT, new nar(this, i));
        this.o = tby.v(eqjVarT, new ndo(4));
        this.p = tby.v(eqjVarT, new ndo(i2));
        this.q = tby.B(eqlVar, new nar(this, 9));
        this.r = tby.B(eqlVar, new nar(this, 10));
    }

    public static final void a(PhoneCall phoneCall, boolean z) {
        mwc.c(yzy.J, null);
        ebf.A().u(phoneCall.a, z);
    }
}
