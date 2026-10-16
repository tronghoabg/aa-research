package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class azf {
    public final defpackage.aiuw a;
    public final defpackage.afer b;
    public defpackage.afd c;
    public defpackage.afd d;
    public defpackage.afd e;
    public boolean f;
    public final defpackage.bwx g;
    public long h;
    public long i;
    public long j;
    public defpackage.cmq k;
    public final defpackage.aeb l;
    public final defpackage.aeb m;
    private final defpackage.bwx n;
    private final defpackage.bwx o;
    private final defpackage.bwx p;
    private final defpackage.bwx q;
    private final defpackage.cjq r;

    public azf(defpackage.aiuw aiuwVar, defpackage.cjq cjqVar, defpackage.afer aferVar) {
        this.a = aiuwVar;
        this.r = cjqVar;
        this.b = aferVar;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.n = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.o = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.p = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.h = 9223372034707292159L;
        this.i = 0L;
        this.j = 9223372034707292159L;
        this.k = cjqVar != null ? cjqVar.a() : null;
        this.l = new defpackage.aeb(new defpackage.dlw(0L), defpackage.agt.g, null, "Animatable");
        this.m = new defpackage.aeb(java.lang.Float.valueOf(1.0f), defpackage.agt.a, null, "Animatable");
        this.q = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dlw(0L), bxvVar);
    }

    public final long a() {
        return ((defpackage.dlw) this.q.a()).a;
    }

    public final void b() {
        defpackage.cmq cmqVar = this.k;
        defpackage.afd afdVar = this.c;
        if (h() || afdVar == null || cmqVar == null) {
            if (i()) {
                if (cmqVar != null) {
                    cmqVar.h(1.0f);
                }
                defpackage.ahoc.d(this.a, null, 0, new defpackage.adh(this, (defpackage.afdk) null, 13), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zI = i();
        boolean z = !zI;
        if (!zI) {
            cmqVar.h(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
        defpackage.ahoc.d(this.a, null, 0, new defpackage.azd(z, this, afdVar, cmqVar, null), 3);
    }

    public final void c() {
        defpackage.cjq cjqVar;
        if (j()) {
            f(false);
            defpackage.ahoc.d(this.a, null, 0, new defpackage.adh(this, (defpackage.afdk) null, 15, (char[]) null), 3);
        }
        if (h()) {
            d(false);
            defpackage.ahoc.d(this.a, null, 0, new defpackage.adh(this, (defpackage.afdk) null, 16, (short[]) null), 3);
        }
        if (i()) {
            e(false);
            defpackage.ahoc.d(this.a, null, 0, new defpackage.adh(this, (defpackage.afdk) null, 17, (int[]) null), 3);
        }
        this.f = false;
        g(0L);
        this.h = 9223372034707292159L;
        defpackage.cmq cmqVar = this.k;
        if (cmqVar != null && (cjqVar = this.r) != null) {
            cjqVar.d(cmqVar);
        }
        this.k = null;
        this.c = null;
        this.e = null;
        this.d = null;
    }

    public final void d(boolean z) {
        this.o.b(java.lang.Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        this.p.b(java.lang.Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.n.b(java.lang.Boolean.valueOf(z));
    }

    public final void g(long j) {
        this.q.b(new defpackage.dlw(j));
    }

    public final boolean h() {
        return ((java.lang.Boolean) this.o.a()).booleanValue();
    }

    public final boolean i() {
        return ((java.lang.Boolean) this.p.a()).booleanValue();
    }

    public final boolean j() {
        return ((java.lang.Boolean) this.n.a()).booleanValue();
    }
}
