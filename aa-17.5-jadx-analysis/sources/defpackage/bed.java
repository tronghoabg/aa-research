package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bed {
    private final bwq A;
    private final bwq B;
    public bem a;
    public final bwq b;
    public final bwq c;
    public cst d;
    public final bwq e;
    public deu f;
    public final bwq g;
    public final bwq h;
    public final bwq i;
    public boolean j;
    public final bwq k;
    public afec l;
    public final afec m;
    public final afec n;
    public final afec o;
    public long p;
    public final bxf q;
    public final cjk r;
    public fbf s;
    public final ivs t = new ivs(null);
    public final epk u;
    public final sm v;
    private final bwq w;
    private final bwq x;
    private final bwq y;
    private final bwq z;

    public bed(bem bemVar, bxf bxfVar, sm smVar) {
        this.a = bemVar;
        this.q = bxfVar;
        this.v = smVar;
        bxp bxpVar = bxp.c;
        this.b = new ParcelableSnapshotMutableState(false, bxpVar);
        this.c = new ParcelableSnapshotMutableState(new dlj(BitmapDescriptorFactory.HUE_RED), bxpVar);
        this.e = new ParcelableSnapshotMutableState(null, bxpVar);
        this.w = new ParcelableSnapshotMutableState(bdu.a, bxpVar);
        this.x = new ParcelableSnapshotMutableState(false, bxpVar);
        this.g = new ParcelableSnapshotMutableState(false, bxpVar);
        this.h = new ParcelableSnapshotMutableState(false, bxpVar);
        this.i = new ParcelableSnapshotMutableState(false, bxpVar);
        this.j = true;
        this.y = new ParcelableSnapshotMutableState(true, bxpVar);
        this.u = new epk(smVar);
        this.k = new ParcelableSnapshotMutableState(false, bxpVar);
        this.z = new ParcelableSnapshotMutableState(false, bxpVar);
        this.l = new awf(17);
        this.m = new bbn(this, 13);
        this.n = new bbn(this, 14);
        this.o = new bbn(this, 15);
        this.r = new cjk();
        float[] fArr = clj.a;
        this.p = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        long j = dfv.a;
        this.A = new ParcelableSnapshotMutableState(new dfv(j), bxpVar);
        this.B = new ParcelableSnapshotMutableState(new dfv(j), bxpVar);
    }

    public final long a() {
        return ((dfv) this.B.a()).b;
    }

    public final long b() {
        return ((dfv) this.A.a()).b;
    }

    public final bdu c() {
        return (bdu) this.w.a();
    }

    public final bff d() {
        return (bff) this.e.a();
    }

    public final cst e() {
        cst cstVar = this.d;
        if (cstVar == null || !cstVar.t()) {
            return null;
        }
        return cstVar;
    }

    public final void f(boolean z) {
        this.k.b(Boolean.valueOf(z));
    }

    public final void g(long j) {
        this.B.b(new dfv(j));
    }

    public final void h(bdu bduVar) {
        this.w.b(bduVar);
    }

    public final void i(boolean z) {
        this.y.b(Boolean.valueOf(z));
    }

    public final void j(boolean z) {
        this.z.b(Boolean.valueOf(z));
    }

    public final void k(long j) {
        this.A.b(new dfv(j));
    }

    public final void l(boolean z) {
        this.i.b(Boolean.valueOf(z));
    }

    public final void m(boolean z) {
        this.x.b(Boolean.valueOf(z));
    }

    public final void n(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void o(boolean z) {
        this.g.b(Boolean.valueOf(z));
    }

    public final boolean p() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.z.a()).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) this.x.a()).booleanValue();
    }

    public final boolean s() {
        return (dfv.i(b()) && dfv.i(a())) ? false : true;
    }

    public final boolean t() {
        return ((Boolean) this.y.a()).booleanValue();
    }
}
