package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ogb extends nyh {
    public static final oga a = new oga();
    public static final afgl b = new nfm(mki.b, 7);
    public static final yob c = yob.c("com/google/android/apps/auto/components/telecom/provider/PhoneAppProvider");
    private static final mqc d;
    private boolean e;
    private final aezr f;
    private final aezr g;

    static {
        ComponentName componentName = mkn.b;
        componentName.getClass();
        d = new mqc(componentName, mpz.c, false, 28);
    }

    public ogb() {
        super("Phone");
        this.f = new aezy(new nnj(10));
        this.g = new aezy(new ngz(this, 14));
    }

    public static final ogb d() {
        return a.a();
    }

    public static final boolean i() {
        return a.b();
    }

    public static final boolean k() {
        return a.c();
    }

    public static final void o(yzy yzyVar, String str) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.DIALER_FALLBACK, yzyVar);
        rrbVarH.p(new ComponentName(str, ""));
        ebf.j().F(rrbVarH.l());
    }

    public static final boolean p(Context context, String str) {
        if (!new tgw(context, acqd.i()).a(str)) {
            ((ynz) c.f().ai(5871)).y("Phone dialer %s isn't allowed to replace Gearhead dialer by our filter flag.", str);
            o(yzy.ME, str);
            return false;
        }
        if (odn.a().M(context, str)) {
            return true;
        }
        ((ynz) c.f().ai(5876)).y("Phone dialer %s is not pre installed", str);
        o(yzy.MF, str);
        return false;
    }

    public final mqc a() {
        return (mqc) this.g.a();
    }

    @Override // defpackage.nyh
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        qrnVar.getClass();
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        yflVar.i(d);
        List listE = e(qrnVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            String packageName = ((mqc) obj).a().getPackageName();
            packageName.getClass();
            if (!g(packageName)) {
                arrayList.add(obj);
            }
        }
        yflVar.k(arrayList);
        yfq yfqVarG = yflVar.g();
        yfqVarG.getClass();
        ygp ygpVar = new ygp();
        ygpVar.k(yfqVarG);
        yfq yfqVarB = lup.e().b(qrnVar, nyj.b());
        yfqVarB.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : yfqVarB) {
            if (((mqc) obj2).b == mpz.c) {
                arrayList2.add(obj2);
            }
        }
        ygpVar.k(arrayList2);
        yfq yfqVarD = ygpVar.g().d();
        yfqVarD.getClass();
        if (!this.e) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_FACET, yzy.rc);
            ArrayList arrayList3 = new ArrayList(woy.bp(yfqVarD, 10));
            Iterator<E> it = yfqVarD.iterator();
            while (it.hasNext()) {
                arrayList3.add(((mqc) it.next()).a());
            }
            rrbVarH.q(arrayList3);
            ohsVarJ.F(rrbVarH.l());
            this.e = true;
        }
        return yfqVarD;
    }

    public final List e(qrn qrnVar) {
        yfq yfqVarB = juv.a().b(qrnVar, nyj.b());
        yfqVarB.getClass();
        return yfqVarB;
    }

    public final boolean f() {
        return a() != null;
    }

    public final boolean g(String str) {
        str.getClass();
        return ((tgw) this.f.a()).b(str);
    }

    public final boolean j(Context context) {
        return affa.f(odn.a().o(context), "com.google.android.dialer") && p(context, "com.google.android.dialer");
    }
}
