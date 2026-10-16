package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public abstract class bsm extends cwe {
    public long a;
    public long b;
    public cmg c;
    public cmg d;
    public float e;
    public float f;
    public float g;
    public adu h;
    private aivh k;
    private aivh l;
    public final byb j = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
    public final bsy i = new bsy();

    public bsm(long j, long j2, cmg cmgVar, cmg cmgVar2, float f, float f2, float f3) {
        this.a = j;
        this.b = j2;
        this.c = cmgVar;
        this.d = cmgVar2;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }

    protected abstract void b();

    protected abstract void d();

    @Override // defpackage.cfx
    public final void er() {
        g();
    }

    public final void f(float f) {
        adu aduVarA = this.h;
        if (aduVarA == null) {
            aduVarA = adv.a(f);
            this.h = aduVarA;
        }
        if (!this.A || ((Number) aduVarA.c()).floatValue() == f) {
            return;
        }
        aivh aivhVar = this.l;
        if (aivhVar == null || aivhVar.x()) {
            this.l = ahnc.d(N(), null, 0, new brs(aduVarA, f, (afck) null, 2), 3);
        }
    }

    protected final void g() {
        aivh aivhVar = this.k;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        this.k = null;
        if (this.A) {
            if (dlj.a(this.g, BitmapDescriptorFactory.HUE_RED) <= 0 || dlj.a(this.f, BitmapDescriptorFactory.HUE_RED) <= 0) {
                this.j.h(BitmapDescriptorFactory.HUE_RED);
            } else {
                this.k = ahnc.d(N(), null, 0, new dys(this, afpt.e(Math.round((this.f / this.g) * 1000.0f), 50), (afck) null, 1), 3);
            }
        }
    }

    @Override // defpackage.cfx
    public final void q() {
        this.h = null;
    }
}
