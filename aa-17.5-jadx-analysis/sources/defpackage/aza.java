package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aza {
    public final aitx a;
    public final afdr b;
    public aew c;
    public aew d;
    public aew e;
    public boolean f;
    public final bwq g;
    public long h;
    public long i;
    public long j;
    public cmi k;
    public final adu l;
    public final adu m;
    private final bwq n;
    private final bwq o;
    private final bwq p;
    private final bwq q;
    private final cji r;

    public aza(aitx aitxVar, cji cjiVar, afdr afdrVar) {
        this.a = aitxVar;
        this.r = cjiVar;
        this.b = afdrVar;
        bxp bxpVar = bxp.c;
        this.n = new ParcelableSnapshotMutableState(false, bxpVar);
        this.o = new ParcelableSnapshotMutableState(false, bxpVar);
        this.p = new ParcelableSnapshotMutableState(false, bxpVar);
        this.g = new ParcelableSnapshotMutableState(false, bxpVar);
        this.h = 9223372034707292159L;
        this.i = 0L;
        this.j = 9223372034707292159L;
        this.k = cjiVar != null ? cjiVar.a() : null;
        this.l = new adu(new dlo(0L), agm.g, null, "Animatable");
        this.m = new adu(Float.valueOf(1.0f), agm.a, null, "Animatable");
        this.q = new ParcelableSnapshotMutableState(new dlo(0L), bxpVar);
    }

    public final long a() {
        return ((dlo) this.q.a()).a;
    }

    public final void b() {
        cmi cmiVar = this.k;
        aew aewVar = this.c;
        if (h() || aewVar == null || cmiVar == null) {
            if (i()) {
                if (cmiVar != null) {
                    cmiVar.h(1.0f);
                }
                ahnc.d(this.a, null, 0, new ada(this, (afck) null, 13), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zI = i();
        boolean z = !zI;
        if (!zI) {
            cmiVar.h(BitmapDescriptorFactory.HUE_RED);
        }
        ahnc.d(this.a, null, 0, new ayy(z, this, aewVar, cmiVar, null), 3);
    }

    public final void c() {
        cji cjiVar;
        if (j()) {
            f(false);
            ahnc.d(this.a, null, 0, new ada(this, (afck) null, 15, (char[]) null), 3);
        }
        if (h()) {
            d(false);
            ahnc.d(this.a, null, 0, new ada(this, (afck) null, 16, (short[]) null), 3);
        }
        if (i()) {
            e(false);
            ahnc.d(this.a, null, 0, new ada(this, (afck) null, 17, (int[]) null), 3);
        }
        this.f = false;
        g(0L);
        this.h = 9223372034707292159L;
        cmi cmiVar = this.k;
        if (cmiVar != null && (cjiVar = this.r) != null) {
            cjiVar.d(cmiVar);
        }
        this.k = null;
        this.c = null;
        this.e = null;
        this.d = null;
    }

    public final void d(boolean z) {
        this.o.b(Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        this.p.b(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.n.b(Boolean.valueOf(z));
    }

    public final void g(long j) {
        this.q.b(new dlo(j));
    }

    public final boolean h() {
        return ((Boolean) this.o.a()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.p.a()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) this.n.a()).booleanValue();
    }
}
