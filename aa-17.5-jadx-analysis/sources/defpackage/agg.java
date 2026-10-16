package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* loaded from: classes.dex */
public class agg {
    public final agk a;
    public final String b;
    public final bwq c;
    public final bwq d;
    public final SnapshotStateList e;
    public final SnapshotStateList f;
    public long g;
    private final agg h;
    private final bwq i;
    private final bwq j;
    private final bwq k;
    private final byf l;
    private final byf m;

    public agg(agk agkVar, agg aggVar, String str) {
        this.a = agkVar;
        this.h = aggVar;
        this.b = str;
        Object objE = e();
        bxp bxpVar = bxp.c;
        this.i = new ParcelableSnapshotMutableState(objE, bxpVar);
        this.c = new ParcelableSnapshotMutableState(null, bxpVar);
        this.j = new ParcelableSnapshotMutableState(new agd(e(), e()), bxpVar);
        this.l = new ParcelableSnapshotMutableLongState(0L);
        this.m = new ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
        this.d = new ParcelableSnapshotMutableState(false, bxpVar);
        this.e = new SnapshotStateList();
        this.f = new SnapshotStateList();
        this.k = new ParcelableSnapshotMutableState(false, bxpVar);
        nx nxVar = new nx((Object) this, 13);
        lah lahVar = byj.a;
        new bvk(nxVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        SnapshotStateList snapshotStateList = this.e;
        int iA = snapshotStateList.a();
        long jMax = 0;
        for (int i = 0; i < iA; i++) {
            jMax = Math.max(jMax, ((age) snapshotStateList.get(i)).c());
        }
        SnapshotStateList snapshotStateList2 = this.f;
        int iA2 = snapshotStateList2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            jMax = Math.max(jMax, ((agg) snapshotStateList2.get(i2)).a());
        }
        return jMax;
    }

    public final long b() {
        agg aggVar = this.h;
        return aggVar != null ? aggVar.b() : this.l.e();
    }

    public final long c() {
        return this.m.e();
    }

    public final agc d() {
        return (agc) this.j.a();
    }

    public final Object e() {
        return this.a.a();
    }

    public final Object f() {
        return this.c.a();
    }

    public final Object g() {
        return this.i.a();
    }

    public final void h(Object obj, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1493585151);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(obj) : buxVarC.E(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(this) ? 16 : 32;
        }
        int i4 = 0;
        if (!buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.s();
        } else if (w()) {
            buxVarC.v(467722849);
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.v(466062241);
            t(obj);
            int i5 = i2 & 112;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i5 == 32 || objS == buw.a) {
                nx nxVar = new nx((Object) this, 12);
                lah lahVar = byj.a;
                bvk bvkVar = new bvk(nxVar, null);
                bvvVar.ad(bvkVar);
                objS = bvkVar;
            }
            if (((Boolean) ((bym) objS).a()).booleanValue()) {
                buxVarC.v(466470356);
                Object objS2 = bvvVar.S();
                Object obj2 = buw.a;
                if (objS2 == obj2) {
                    bxt bxtVar = new bxt(bvvVar.s, afcp.a);
                    bvvVar.ad(bxtVar);
                    objS2 = bxtVar;
                }
                aitx aitxVar = (aitx) objS2;
                boolean zE = buxVarC.E(aitxVar) | (i5 == 32);
                Object objS3 = bvvVar.S();
                if (zE || objS3 == obj2) {
                    objS3 = new abi(aitxVar, this, 15);
                    bvvVar.ad(objS3);
                }
                bvq.b(aitxVar, this, (afec) objS3, buxVarC);
                bvvVar.Y(false);
            } else {
                buxVarC.v(467712929);
                bvvVar.Y(false);
            }
            bvvVar.Y(false);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(this, obj, i, i4);
        }
    }

    public final void i() {
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(long j, boolean z) {
        if (c() == Long.MIN_VALUE) {
            l(j);
        } else {
            agk agkVar = this.a;
            if (!agkVar.g()) {
                agkVar.f(true);
            }
        }
        s(false);
        SnapshotStateList snapshotStateList = this.e;
        int iA = snapshotStateList.a();
        boolean zF = true;
        for (int i = 0; i < iA; i++) {
            age ageVar = (age) snapshotStateList.get(i);
            if (!ageVar.l()) {
                long jA = z ? ageVar.e().a() : j;
                ageVar.i(ageVar.e().c(jA));
                ageVar.a = ageVar.e().b(jA);
                if (ca.H(ageVar.e(), jA)) {
                    ageVar.g(true);
                }
            }
            zF &= ageVar.l();
        }
        SnapshotStateList snapshotStateList2 = this.f;
        int iA2 = snapshotStateList2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            agg aggVar = (agg) snapshotStateList2.get(i2);
            if (!affa.f(aggVar.g(), aggVar.e())) {
                aggVar.j(j, z);
            }
            zF &= affa.f(aggVar.g(), aggVar.e());
        }
        if (zF) {
            k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        q(Long.MIN_VALUE);
        agk agkVar = this.a;
        if (agkVar instanceof afm) {
            agkVar.c(g());
        }
        n(0L);
        agkVar.f(false);
        SnapshotStateList snapshotStateList = this.f;
        int iA = snapshotStateList.a();
        for (int i = 0; i < iA; i++) {
            ((agg) snapshotStateList.get(i)).k();
        }
    }

    public final void l(long j) {
        q(j);
        this.a.f(true);
    }

    public final void m(age ageVar) {
        this.e.remove(ageVar);
    }

    public final void n(long j) {
        if (this.h == null) {
            this.l.h(j);
        }
    }

    public final void o(boolean z) {
        this.k.b(Boolean.valueOf(z));
    }

    public final void p(agc agcVar) {
        this.j.b(agcVar);
    }

    public final void q(long j) {
        this.m.h(j);
    }

    public final void r(Object obj) {
        this.i.b(obj);
    }

    public final void s(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }

    public final void t(Object obj) {
        Object objG = g();
        if (affa.f(objG, obj)) {
            return;
        }
        p(new agd(objG, obj));
        this.a.c(objG);
        r(obj);
        if (!v()) {
            s(true);
        }
        List listCf = woy.cf(this.e);
        int size = listCf.size();
        for (int i = 0; i < size; i++) {
            ((age) listCf.get(i)).h(-2.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        SnapshotStateList snapshotStateList = this.e;
        int iA = snapshotStateList.a();
        String str = "Transition animation values: ";
        for (int i = 0; i < iA; i++) {
            str = str + ((age) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        SnapshotStateList snapshotStateList = this.e;
        int iA = snapshotStateList.a();
        for (int i = 0; i < iA; i++) {
        }
        SnapshotStateList snapshotStateList2 = this.f;
        int iA2 = snapshotStateList2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            if (((agg) snapshotStateList2.get(i2)).u()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return c() != Long.MIN_VALUE;
    }

    public final boolean w() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public final void x(age ageVar) {
        this.e.add(ageVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(Object obj, Object obj2) {
        q(Long.MIN_VALUE);
        agk agkVar = this.a;
        agkVar.f(false);
        if (!w() || !affa.f(e(), obj) || !affa.f(g(), obj2)) {
            if (!affa.f(e(), obj) && (agkVar instanceof afm)) {
                agkVar.c(obj);
            }
            r(obj2);
            o(true);
            p(new agd(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.f;
        int iA = snapshotStateList.a();
        for (int i = 0; i < iA; i++) {
            agg aggVar = (agg) snapshotStateList.get(i);
            aggVar.getClass();
            if (aggVar.w()) {
                aggVar.y(aggVar.e(), aggVar.g());
            }
        }
        SnapshotStateList snapshotStateList2 = this.e;
        int iA2 = snapshotStateList2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ((age) snapshotStateList2.get(i2)).m();
        }
        this.g = 0L;
    }
}
