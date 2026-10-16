package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tpt {
    private static final tps f = tps.b;
    public final too a;
    public final tpf b;
    public tps c;
    public float d;
    public final too e;

    public tpt() {
        too tooVar = new too();
        tps tpsVar = f;
        too tooVar2 = new too();
        tpf tpfVar = new tpf(1.0f, 1.0f);
        this.b = tpfVar;
        this.a = new too(tooVar);
        tpfVar.n(1.0f, 1.0f);
        this.c = tpsVar;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = new too(tooVar2);
    }

    public final void a(tpt tptVar) {
        this.a.A(tptVar.a);
        this.b.o(tptVar.b);
        this.c = tptVar.c;
        this.d = tptVar.d;
        this.e.A(tptVar.e);
    }

    public final void b(too tooVar) {
        this.a.A(tooVar);
    }

    public final void c(float f2, too tooVar) {
        this.d = f2;
        this.e.A(tooVar);
    }

    public final void d(float f2, tps tpsVar) {
        this.b.n(f2, f2);
        this.c = tpsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tpt) {
            tpt tptVar = (tpt) obj;
            if (this.a.equals(tptVar.a) && this.b.equals(tptVar.b) && this.c.equals(tptVar.c) && Float.compare(this.d, tptVar.d) == 0 && this.e.equals(tptVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Float.valueOf(this.d), this.e);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("position", this.a);
        xxgVarAo.b("scale", this.b);
        xxgVarAo.b("scaleType", this.c);
        xxgVarAo.e("rotationDegrees", this.d);
        xxgVarAo.b("rotationOrigin", this.e);
        return xxgVarAo.toString();
    }
}
