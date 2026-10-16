package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class agn {
    public final defpackage.agr a;
    public final java.lang.String b;
    public final defpackage.bwx c;
    public final defpackage.bwx d;
    public final androidx.compose.runtime.snapshots.SnapshotStateList e;
    public final androidx.compose.runtime.snapshots.SnapshotStateList f;
    public long g;
    private final defpackage.agn h;
    private final defpackage.bwx i;
    private final defpackage.bwx j;
    private final defpackage.bwx k;
    private final defpackage.byl l;
    private final defpackage.byl m;

    public agn(defpackage.agr agrVar, defpackage.agn agnVar, java.lang.String str) {
        this.a = agrVar;
        this.h = agnVar;
        this.b = str;
        java.lang.Object objE = e();
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(objE, bxvVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.agk(e(), e()), bxvVar);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(0L);
        this.m = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.e = new androidx.compose.runtime.snapshots.SnapshotStateList();
        this.f = new androidx.compose.runtime.snapshots.SnapshotStateList();
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        defpackage.nz nzVar = new defpackage.nz(this, 12);
        defpackage.lam lamVar = defpackage.byp.a;
        new defpackage.bvr(nzVar, null);
    }

    public final long a() {
        java.util.List listE = this.e.e();
        int size = listE.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = java.lang.Math.max(jMax, ((defpackage.agl) listE.get(i)).c());
        }
        java.util.List listE2 = this.f.e();
        int size2 = listE2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = java.lang.Math.max(jMax, ((defpackage.agn) listE2.get(i2)).a());
        }
        return jMax;
    }

    public final long b() {
        defpackage.agn agnVar = this.h;
        return agnVar != null ? agnVar.b() : this.l.e();
    }

    public final long c() {
        return this.m.e();
    }

    public final defpackage.agj d() {
        return (defpackage.agj) this.j.a();
    }

    public final java.lang.Object e() {
        return this.a.a();
    }

    public final java.lang.Object f() {
        return this.c.a();
    }

    public final java.lang.Object g() {
        return this.i.a();
    }

    public final void h(java.lang.Object obj, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1493585151);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(obj) : bveVarC.E(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(this) ? 16 : 32;
        }
        int i4 = 0;
        if (!bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            bveVarC.s();
        } else if (w()) {
            bveVarC.v(467722849);
            ((defpackage.bwc) bveVarC).Y(false);
        } else {
            bveVarC.v(466062241);
            t(obj);
            int i5 = i2 & 112;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (i5 == 32 || objS == defpackage.bvd.a) {
                defpackage.nz nzVar = new defpackage.nz(this, 11);
                defpackage.lam lamVar = defpackage.byp.a;
                defpackage.bvr bvrVar = new defpackage.bvr(nzVar, null);
                bwcVar.ad(bvrVar);
                objS = bvrVar;
            }
            if (((java.lang.Boolean) ((defpackage.bys) objS).a()).booleanValue()) {
                bveVarC.v(466470356);
                java.lang.Object objS2 = bwcVar.S();
                java.lang.Object obj2 = defpackage.bvd.a;
                if (objS2 == obj2) {
                    defpackage.bxz bxzVar = new defpackage.bxz(bwcVar.s, defpackage.afdp.a);
                    bwcVar.ad(bxzVar);
                    objS2 = bxzVar;
                }
                aiuw aiuwVar = (aiuw) objS2;
                boolean zE = bveVarC.E(aiuwVar) | (i5 == 32);
                java.lang.Object objS3 = bwcVar.S();
                if (zE || objS3 == obj2) {
                    objS3 = new defpackage.abp(aiuwVar, this, 15);
                    bwcVar.ad(objS3);
                }
                defpackage.bvx.b(aiuwVar, this, (defpackage.affc) objS3, bveVarC);
                bwcVar.Y(false);
            } else {
                bveVarC.v(467712929);
                bwcVar.Y(false);
            }
            bwcVar.Y(false);
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(this, obj, i, i4);
        }
    }

    public final void i() {
        k();
    }

    public final void j(long j, boolean z) {
        if (c() == Long.MIN_VALUE) {
            l(j);
        } else {
            defpackage.agr agrVar = this.a;
            if (!agrVar.g()) {
                agrVar.f(true);
            }
        }
        s(false);
        java.util.List listE = this.e.e();
        int size = listE.size();
        boolean zF = true;
        for (int i = 0; i < size; i++) {
            defpackage.agl aglVar = (defpackage.agl) listE.get(i);
            if (!aglVar.l()) {
                long jA = z ? aglVar.e().a() : j;
                aglVar.i(aglVar.e().c(jA));
                aglVar.a = aglVar.e().b(jA);
                if (defpackage.ca.H(aglVar.e(), jA)) {
                    aglVar.g(true);
                }
            }
            zF &= aglVar.l();
        }
        java.util.List listE2 = this.f.e();
        int size2 = listE2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            defpackage.agn agnVar = (defpackage.agn) listE2.get(i2);
            if (!defpackage.afga.f(agnVar.g(), agnVar.e())) {
                agnVar.j(j, z);
            }
            zF &= defpackage.afga.f(agnVar.g(), agnVar.e());
        }
        if (zF) {
            k();
        }
    }

    public final void k() {
        q(Long.MIN_VALUE);
        defpackage.agr agrVar = this.a;
        if (agrVar instanceof defpackage.aft) {
            agrVar.c(g());
        }
        n(0L);
        agrVar.f(false);
        java.util.List listE = this.f.e();
        int size = listE.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.agn) listE.get(i)).k();
        }
    }

    public final void l(long j) {
        q(j);
        this.a.f(true);
    }

    public final void m(defpackage.agl aglVar) {
        this.e.remove(aglVar);
    }

    public final void n(long j) {
        if (this.h == null) {
            this.l.h(j);
        }
    }

    public final void o(boolean z) {
        this.k.b(java.lang.Boolean.valueOf(z));
    }

    public final void p(defpackage.agj agjVar) {
        this.j.b(agjVar);
    }

    public final void q(long j) {
        this.m.h(j);
    }

    public final void r(java.lang.Object obj) {
        this.i.b(obj);
    }

    public final void s(boolean z) {
        this.d.b(java.lang.Boolean.valueOf(z));
    }

    public final void t(java.lang.Object obj) {
        java.lang.Object objG = g();
        if (defpackage.afga.f(objG, obj)) {
            return;
        }
        p(new defpackage.agk(objG, obj));
        this.a.c(objG);
        r(obj);
        if (!v()) {
            s(true);
        }
        java.util.List listAZ = defpackage.afga.aZ(this.e);
        int size = listAZ.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.agl) listAZ.get(i)).h(-2.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.e;
        int iA = snapshotStateList.a();
        java.lang.String str = "Transition animation values: ";
        for (int i = 0; i < iA; i++) {
            str = str + ((defpackage.agl) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }

    public final boolean u() {
        java.util.List listE = this.e.e();
        int size = listE.size();
        for (int i = 0; i < size; i++) {
        }
        java.util.List listE2 = this.f.e();
        int size2 = listE2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((defpackage.agn) listE2.get(i2)).u()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return c() != Long.MIN_VALUE;
    }

    public final boolean w() {
        return ((java.lang.Boolean) this.k.a()).booleanValue();
    }

    public final void x(defpackage.agl aglVar) {
        this.e.add(aglVar);
    }

    public final void y(java.lang.Object obj, java.lang.Object obj2) {
        q(Long.MIN_VALUE);
        defpackage.agr agrVar = this.a;
        agrVar.f(false);
        if (!w() || !defpackage.afga.f(e(), obj) || !defpackage.afga.f(g(), obj2)) {
            if (!defpackage.afga.f(e(), obj) && (agrVar instanceof defpackage.aft)) {
                agrVar.c(obj);
            }
            r(obj2);
            o(true);
            p(new defpackage.agk(obj, obj2));
        }
        java.util.List listE = this.f.e();
        int size = listE.size();
        for (int i = 0; i < size; i++) {
            defpackage.agn agnVar = (defpackage.agn) listE.get(i);
            agnVar.getClass();
            if (agnVar.w()) {
                agnVar.y(agnVar.e(), agnVar.g());
            }
        }
        java.util.List listE2 = this.e.e();
        int size2 = listE2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.agl) listE2.get(i2)).m();
        }
        this.g = 0L;
    }
}
