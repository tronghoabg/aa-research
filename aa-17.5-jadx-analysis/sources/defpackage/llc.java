package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class llc {
    public static final yob b = yob.c("com/google/android/apps/auto/components/media/app/items/ItemsModel");
    private final int a;
    public final Context c;
    public final mon d;
    public final IconCompat e;
    public final List f;
    public final eqj g;
    public final eqj h;
    public long i;
    public boolean j;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final htm n;
    private final String o;
    private final tjy p;
    private final tjy q;
    private final List r;
    private final eqj s;
    private final eqj t;
    private final eqj u;
    private final htm v;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ llc(Context context, ept eptVar, mon monVar, int i, int i2, int i3, afdr afdrVar, afdr afdrVar2, String str, int i4, IconCompat iconCompat, String str2, htm htmVar, htm htmVar2, int i5) {
        htm htmVar3;
        htm htmVar4 = (i5 & 4096) != 0 ? new htm((byte[]) null, (byte[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0)) : htmVar;
        if ((i5 & 8192) != 0) {
            htm htmVar5 = new htm((byte[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0));
            ((Bundle) htmVar5.a).putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
            ((Bundle) htmVar5.a).putBoolean("com.google.android.apps.auto.FORCE_PARENT_HINT_STYLING", true);
            ((Bundle) htmVar5.a).putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 1);
            ((Bundle) htmVar5.a).putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
            htmVar3 = htmVar5;
        } else {
            htmVar3 = htmVar2;
        }
        int i6 = i5 & 1024;
        String str3 = (i5 & 2048) != 0 ? null : str2;
        IconCompat iconCompat2 = i6 != 0 ? null : iconCompat;
        List listBi = woy.bi(lky.a, lky.b);
        Integer numValueOf = Integer.valueOf(i3);
        tjz tjzVar = new tjz(context, eptVar, str, i, numValueOf, htmVar3, htmVar4, tke.a);
        tjz tjzVar2 = new tjz(context, eptVar, str, i2, numValueOf, htmVar3, htmVar4, 128);
        htmVar4.getClass();
        htmVar3.getClass();
        this.c = context;
        this.d = monVar;
        this.a = i4;
        this.e = iconCompat2;
        this.o = str3;
        this.n = htmVar4;
        this.v = htmVar3;
        this.f = listBi;
        this.p = tjzVar;
        this.q = tjzVar2;
        this.r = afbe.a;
        eqj eqjVarF = loy.j().f(monVar.a);
        eqjVarF.getClass();
        this.g = eqjVarF;
        eqj eqjVarT = tby.t(loy.j().b(monVar.a));
        this.h = eqjVarT;
        eqj eqjVarT2 = tby.t(tby.C(tby.w(eqjVarF, new lfn(16)), new lfn(17)));
        this.s = eqjVarT2;
        eqj eqjVarT3 = tby.t(tby.w(eqjVarT, new lfn(18)));
        this.t = eqjVarT3;
        int i7 = 19;
        eqj eqjVarW = tby.w(eqjVarF, new lfn(i7));
        this.u = eqjVarW;
        this.i = -1L;
        eptVar.c(new erc(this, 9, null == true ? 1 : 0));
        this.k = tby.c(tby.w(eqjVarW, new lfn(20)), -1);
        eqj eqjVarW2 = tby.w(tby.C(eqjVarW, new lfn(14)), new lfn(15));
        eql eqlVar = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar.r(eqjVarW2, new ewg(new dah(eqlVar, affqVar, 17, null), 17));
        this.l = eqlVar;
        this.m = tby.d(eqjVarT2, eqjVarT3, new brf(this, afdrVar, afdrVar2, i7));
    }

    public abstract eqj a();

    public List b() {
        return this.r;
    }

    public List c() {
        return this.f;
    }

    public abstract void d(llu lluVar);

    public final lkc e() {
        Object objE = this.g.e();
        lod lodVar = objE instanceof lod ? (lod) objE : null;
        if (lodVar != null) {
            return lodVar.i.d(yzz.MEDIA_FACET);
        }
        return null;
    }

    public String f() {
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List g(java.util.List r28) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llc.g(java.util.List):java.util.List");
    }

    public final void h() {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.iR);
        rrbVarH.p(this.d.a);
        rrbVarH.t(this.a);
        ohsVarJ.F(rrbVarH.l());
    }

    public final void i(List list, yzy yzyVar) {
        boolean z = this.j;
        this.j = false;
        if (list.isEmpty()) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.jd);
            rrbVarH.p(this.d.a);
            ohsVarJ.F(rrbVarH.l());
            return;
        }
        if (!z) {
            yzyVar = yzy.jj;
        }
        rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzyVar);
        rrbVarH2.p(this.d.a);
        rrbVarH2.z(list.size());
        rrbVarH2.t(this.a);
        if (z && this.i != -1) {
            oit.a();
            rrbVarH2.u(SystemClock.elapsedRealtime() - this.i);
        }
        tfk.a.d(tfj.GEARHEAD_MEDIA_ACTIVITY_PRIMARY_REGION_INITIAL_SCREEN_BROWSE, 1);
        ebf.j().F(rrbVarH2.l());
    }

    public final void j() {
        ((ynz) b.h().ai(3991)).u("Failed to load browse node");
        tfk.a.d(tfj.GEARHEAD_MEDIA_ACTIVITY_PRIMARY_REGION_INITIAL_SCREEN_BROWSE, 2);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.je);
        rrbVarH.p(this.d.a);
        ohsVarJ.F(rrbVarH.l());
    }

    public final void k() {
        oit.a();
        this.i = SystemClock.elapsedRealtime();
        this.j = true;
    }

    public boolean l() {
        return true;
    }

    public final void m(llu lluVar) {
        lkc lkcVarE = e();
        if (lkcVarE == null) {
            ((ynz) b.g().ai(3993)).y("Failed to play media item with id %s", lluVar.i());
            return;
        }
        lkcVarE.d(lluVar.i(), lluVar.h().n());
        lll.a.a().a(this.d.a);
        h();
    }
}
