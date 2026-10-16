package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class lkp {
    public static final yob a = yob.c("com/google/android/apps/auto/components/media/app/browse/RootModel");
    public final Context b;
    public final ept c;
    public final mon d;
    public final int e;
    public final int f;
    public final afdr g;
    public final afdr h;
    public final afeg i;
    public final eqj j;
    public final eqj k;
    public final IconCompat l;
    public final eqm m;
    public final eqj n;
    public final aabf o;
    private final eqa p;
    private final int q;
    private final tjy r;
    private final eqj s;
    private final eqj t;
    private final eqj u;

    public lkp(Context context, ept eptVar, eqa eqaVar, mon monVar, int i, int i2, int i3, int i4, afdr afdrVar, afdr afdrVar2, afeg afegVar, tjy tjyVar) {
        this.b = context;
        this.c = eptVar;
        this.p = eqaVar;
        this.d = monVar;
        this.e = i2;
        this.q = i3;
        this.f = i4;
        this.g = afdrVar;
        this.h = afdrVar2;
        this.i = afegVar;
        this.r = tjyVar;
        eqj eqjVarB = eqy.b(loy.j().b(monVar.a), new lfn(7));
        this.j = eqjVarB;
        eqj eqjVarF = loy.j().f(monVar.a);
        eqjVarF.getClass();
        eqj eqjVarB2 = eqy.b(eqjVarF, new lfn(8));
        this.s = eqjVarB2;
        this.t = eqy.c(eqjVarB2, new lfn(9));
        this.u = eqy.c(eqjVarB2, new lfn(10));
        this.k = tby.C(eqjVarB, new lfn(11));
        IconCompat iconCompatK = IconCompat.k(lfs.e(context).c(context, monVar.a, i));
        this.l = iconCompatK;
        eqm eqmVar = new eqm(afbe.a);
        this.m = eqmVar;
        this.o = new aabf(eqmVar, (thk) null, iconCompatK);
        eqj eqjVarA = eqy.a(new eql(this));
        this.n = eqjVarA;
        eqjVarA.fE(eqaVar, new ewg(new lfn(12), 16));
    }

    public final void a(String str) {
        lod lodVar = (lod) this.s.e();
        if (lodVar != null) {
            lkc lkcVarD = lodVar.i.d(yzz.MEDIA_FACET);
            Bundle bundle = new Bundle();
            lpa lpaVar = (lpa) lkcVarD;
            ((ype) lpa.a.l().ai(4137)).S("sendCustomAction: component=%s context=%s action=%s extras=%s", lpaVar.j(), lpaVar.k(), str, bundle);
            lmb.S(new jda((Object) lpaVar.c, (Object) str, (Object) bundle, 14, (short[]) null), "sendCustomAction");
            lpaVar.l(yzy.fd, str);
        }
    }

    public final lkg b(llu lluVar, IconCompat iconCompat, String str, afdr afdrVar) {
        Bundle bundle;
        String strI = lluVar != null ? lluVar.i() : null;
        mon monVar = this.d;
        int i = this.e;
        int i2 = this.q;
        int i3 = this.f;
        lnr lnrVar = (lnr) this.j.e();
        if (lnrVar == null || (bundle = lnrVar.a()) == null) {
            bundle = new Bundle();
        }
        return new lkg(this.b, ((qz) this.p).a, strI, monVar, i, i2, i3, iconCompat, str, new htm(bundle), new htm(lluVar != null ? lluVar.h().n() : new Bundle()), this.g, this.h, this.i, 0, afdrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.thk c(defpackage.llu r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkp.c(llu):thk");
    }
}
