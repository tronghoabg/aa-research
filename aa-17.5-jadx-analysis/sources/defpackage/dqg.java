package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class dqg implements dqd, dpw {
    public final dpz a;
    public int b;
    public int c = -1;
    public int d = -1;
    public float e = BitmapDescriptorFactory.HUE_RED;
    public Object f;
    private dqr g;

    public dqg(dpz dpzVar) {
        this.a = dpzVar;
    }

    @Override // defpackage.dpw
    public final dqd a() {
        return null;
    }

    @Override // defpackage.dqd, defpackage.dpw
    public final dqn b() {
        dqr dqrVar = this.g;
        if (dqrVar != null) {
            return dqrVar;
        }
        dqr dqrVar2 = new dqr();
        this.g = dqrVar2;
        return dqrVar2;
    }

    public final void c(float f) {
        this.c = -1;
        this.d = -1;
        this.e = f;
    }

    @Override // defpackage.dpw
    public final Object d() {
        return this.f;
    }

    @Override // defpackage.dqd, defpackage.dpw
    public final void e() {
        this.g.ag(this.b);
        int i = this.c;
        if (i != -1) {
            this.g.c(i);
            return;
        }
        int i2 = this.d;
        dqr dqrVar = this.g;
        if (i2 != -1) {
            dqrVar.ae(i2);
        } else {
            dqrVar.af(this.e);
        }
    }

    @Override // defpackage.dpw
    public final void f(dqn dqnVar) {
        this.g = dqnVar instanceof dqr ? (dqr) dqnVar : null;
    }
}
