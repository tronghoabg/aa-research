package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;

/* loaded from: classes.dex */
public final class ksa {
    public final eqj d;
    public final eqj e;
    private final eqj g;
    public static final kru a = new kru();
    public static final afgl b = new kkp(mki.b, 2);
    private static final yph f = yph.c("GH.CoolwalkColors");
    public static final aezr c = woy.dG(new dba(17));

    public /* synthetic */ ksa(byte[] bArr) {
        eqj eqmVar;
        oij oijVarA = oij.a.a();
        leh.a.a();
        int i = 2;
        if (Build.VERSION.SDK_INT >= 30) {
            eqj eqjVar = nfn.a.a().g;
            krq krqVar = new krq(i);
            afco afcoVar = tby.a;
            eqjVar.getClass();
            eqmVar = eqy.b(eqjVar, new njq(krqVar, 15));
        } else {
            afco afcoVar2 = tby.a;
            eqmVar = new eqm(null);
        }
        this.g = eqmVar;
        int i2 = 14;
        this.d = acpc.a.gu().B() ? eqy.b(ksf.a.a().c, new njq(f(), i2)) : eqy.b(eqmVar, new njq(f(), i2));
        eqj eqjVarB = eqy.b(eqy.a(new eql(this, oijVarA)), new krq(3));
        Object objE = eqjVarB.e();
        eqm eqmVar2 = (objE == null || (objE instanceof krz)) ? new eqm(eqjVarB.e()) : new eqm();
        eqjVarB.i(new kko(new ado(eqmVar2, 6), 2));
        this.e = eqmVar2;
    }

    public static final ksa d() {
        return a.a();
    }

    private static final Integer f() {
        String strJ = afyh.J(acpc.a.gu().m(), "0x", "#");
        if (afyh.v(strJ)) {
            return null;
        }
        f.l().y("Found flagged color: %s", strJ);
        try {
            return Integer.valueOf(Color.parseColor(strJ));
        } catch (IllegalArgumentException e) {
            ((ype) ((ype) f.g()).p(e)).u("Unable to parse color extra");
            return null;
        }
    }

    public final Context a(Context context) {
        context.getClass();
        return b(context, false);
    }

    public final Context b(Context context, boolean z) {
        return (z || spu.aN(context)) ? c().a.a(context) : context;
    }

    public final krz c() {
        Object objE = this.e.e();
        objE.getClass();
        return (krz) objE;
    }

    public final Context e(Context context, int i) {
        context.getClass();
        return new pi(b(context, true), i);
    }

    public ksa() {
        this(null);
    }
}
