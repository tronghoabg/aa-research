package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class age implements bym {
    public aei a;
    final /* synthetic */ agg b;
    private final bwq c;
    private final aft d;
    private final bwq e;
    private final bwq f;
    private final bwq g;
    private boolean h;
    private final bwq i;
    private boolean j;
    private final aew k;
    private final byb l;
    private final byf m;
    private final bii n;

    /* JADX WARN: Type inference failed for: r12v10, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [afec, java.lang.Object] */
    public age(agg aggVar, Object obj, aei aeiVar, bii biiVar) {
        this.b = aggVar;
        this.n = biiVar;
        bxp bxpVar = bxp.c;
        this.c = new ParcelableSnapshotMutableState(obj, bxpVar);
        Object objInvoke = null;
        aft aftVar = new aft(1.0f, 1500.0f, null);
        this.d = aftVar;
        this.e = new ParcelableSnapshotMutableState(aftVar, bxpVar);
        this.f = new ParcelableSnapshotMutableState(new afy(d(), biiVar, obj, n(), aeiVar), bxpVar);
        this.g = new ParcelableSnapshotMutableState(true, bxpVar);
        this.l = new ParcelableSnapshotMutableFloatState(-1.0f);
        this.i = new ParcelableSnapshotMutableState(obj, bxpVar);
        this.a = aeiVar;
        this.m = new ParcelableSnapshotMutableLongState(e().a());
        Float f = (Float) ahc.a.get(biiVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            aei aeiVar2 = (aei) biiVar.b.invoke(obj);
            int iB = aeiVar2.b();
            for (int i = 0; i < iB; i++) {
                aeiVar2.e(i, fFloatValue);
            }
            objInvoke = this.n.a.invoke(aeiVar2);
        }
        this.k = new aft(1.0f, 1500.0f, objInvoke);
    }

    private final Object n() {
        return this.c.a();
    }

    private final void o(afy afyVar) {
        this.f.b(afyVar);
    }

    private final void p(aew aewVar) {
        this.e.b(aewVar);
    }

    private final void q(Object obj) {
        this.c.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r(Object obj, boolean z) {
        if (affa.f(null, n())) {
            o(new afy(this.k, this.n, obj, obj, this.a.c()));
            this.h = true;
            f(e().a());
            return;
        }
        aec aecVarD = (!z || this.j || (d() instanceof aft)) ? d() : this.k;
        agg aggVar = this.b;
        long jMax = 0;
        o(new afy(aggVar.b() > 0 ? new afu(aecVarD, aggVar.b()) : aecVarD, this.n, obj, n(), this.a));
        f(e().a());
        this.h = false;
        aggVar.s(true);
        if (aggVar.w()) {
            SnapshotStateList snapshotStateList = aggVar.e;
            int iA = snapshotStateList.a();
            for (int i = 0; i < iA; i++) {
                age ageVar = (age) snapshotStateList.get(i);
                jMax = Math.max(jMax, ageVar.c());
                long j = aggVar.g;
                ageVar.m();
            }
            aggVar.s(false);
        }
    }

    @Override // defpackage.bym
    public final Object a() {
        return this.i.a();
    }

    public final float b() {
        return this.l.e();
    }

    public final long c() {
        return this.m.e();
    }

    public final aew d() {
        return (aew) this.e.a();
    }

    public final afy e() {
        return (afy) this.f.a();
    }

    public final void f(long j) {
        this.m.h(j);
    }

    public final void g(boolean z) {
        this.g.b(Boolean.valueOf(z));
    }

    public final void h(float f) {
        this.l.h(f);
    }

    public final void i(Object obj) {
        this.i.b(obj);
    }

    public final void j(Object obj, Object obj2, aew aewVar) {
        q(obj2);
        p(aewVar);
        if (affa.f(e().b, obj) && affa.f(e().a, obj2)) {
            return;
        }
        r(obj, false);
    }

    public final void k(Object obj, aew aewVar, Object obj2, aei aeiVar) {
        if (this.h && affa.f(obj, null)) {
            return;
        }
        if (affa.f(n(), obj) && b() == -1.0f && (obj2 == null || affa.f(obj2, e().b))) {
            return;
        }
        q(obj);
        p(aewVar);
        Object objA = obj2 == null ? b() == -3.0f ? obj : a() : obj2;
        if (obj2 != null) {
            i(objA);
            if (aeiVar != null) {
                this.a = aeiVar;
            }
        }
        r(objA, !l() && obj2 == null);
        g(b() == -3.0f);
        if (b() >= BitmapDescriptorFactory.HUE_RED) {
            i(e().c((long) (e().a() * b())));
        } else if (b() == -3.0f) {
            i(obj);
        }
        this.h = false;
        h(-1.0f);
    }

    public final boolean l() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    public final void m() {
        if (b() == -1.0f) {
            this.j = true;
            if (affa.f(e().a, e().b)) {
                i(e().a);
            } else {
                i(e().c(0L));
                this.a = e().b(0L);
            }
        }
    }

    public final String toString() {
        return "current value: " + a() + ", target: " + n() + ", spec: " + d();
    }
}
