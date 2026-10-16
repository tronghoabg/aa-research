package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.LatLng;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaay {
    LatLng a;
    Float b;
    Float c;
    Boolean d;
    Float e;
    Boolean f;
    zyh g;
    private final int h;
    private final int i;
    private tqo j;
    private boolean k;
    private boolean l;
    private final tqq m;
    private tpu n;
    private final twq o;
    private final ncp p;

    public aaay(int i, int i2, tqq tqqVar, twq twqVar, ncp ncpVar) {
        this.h = i;
        this.i = i2;
        this.m = tqqVar;
        zkt.n(twqVar, "phoenixGoogleMap");
        this.o = twqVar;
        zkt.n(ncpVar, "clientRenderOpFactory");
        this.p = ncpVar;
        this.l = true;
        this.k = true;
        this.n = null;
        this.g = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    private final tqo j() {
        if (this.k) {
            tqo tqoVar = this.j;
            if (tqoVar != null) {
                this.o.b.e(tqoVar);
            }
            this.j = this.o.b.h((Bitmap) this.g.d, aaaw.e(this.e.floatValue()));
            this.k = false;
        }
        return this.j;
    }

    private final void k() {
        if (this.n == null) {
            this.l = true;
            return;
        }
        boolean zBooleanValue = this.f.booleanValue();
        tpu tpuVar = this.n;
        if (zBooleanValue) {
            tpuVar.g(this.m);
        } else {
            tpuVar.e();
        }
    }

    private final void l() {
        tpu tpuVar = this.n;
        if (tpuVar == null) {
            this.l = true;
            return;
        }
        tpt tptVarC = tpuVar.c();
        float fFloatValue = this.b.floatValue();
        toi toiVarA = aaaw.a(this.a);
        tptVarC.d = fFloatValue;
        tptVarC.e.A(too.k(toiVarA));
        LatLng latLng = this.a;
        tptVarC.b(too.l(latLng.latitude, latLng.longitude));
        float fFloatValue2 = this.c.floatValue() / this.g.c().floatValue();
        Bitmap bitmap = (Bitmap) this.g.d;
        tptVarC.b.n(bitmap.getWidth() * fFloatValue2, bitmap.getHeight() * fFloatValue2);
        tptVarC.c = tps.a;
        this.n.d(tptVarC);
        this.n.a(true != this.d.booleanValue() ? BitmapDescriptorFactory.HUE_RED : 1.0f);
    }

    @ResultIgnorabilityUnspecified
    public final tpu a() {
        tpu tpuVar;
        if (this.l) {
            this.n = null;
            zyh zyhVar = this.g;
            if (zyhVar != null && this.a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null) {
                if (zyhVar.b() != 3) {
                    this.l = false;
                } else {
                    ncp ncpVar = this.p;
                    LatLng latLng = this.a;
                    this.n = ncpVar.s(latLng.latitude, latLng.longitude, 4, j(), false, 4, this.h, this.i);
                    l();
                    k();
                    this.l = false;
                }
            }
        } else if (this.k && (tpuVar = this.n) != null) {
            tpuVar.b(j());
        }
        return this.n;
    }

    public final void b() {
        this.a = null;
        this.b = null;
        c();
    }

    public final void c() {
        this.n = null;
        this.l = false;
        tqo tqoVar = this.j;
        if (tqoVar != null) {
            this.o.b.e(tqoVar);
            this.j = null;
            this.k = true;
        }
    }

    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
        if (this.l) {
            return;
        }
        k();
    }

    public final void e(LatLng latLng, float f) {
        this.a = latLng;
        zkt.l(f, "rotation cannot be NaN");
        this.b = Float.valueOf(f);
        l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaay)) {
            return false;
        }
        aaay aaayVar = (aaay) obj;
        return a.C(this.g, aaayVar.g) && a.C(this.a, aaayVar.a) && a.C(this.b, aaayVar.b) && a.C(this.c, aaayVar.c) && a.C(this.e, aaayVar.e) && a.C(this.d, aaayVar.d) && a.C(Integer.valueOf(this.h), Integer.valueOf(aaayVar.h)) && a.C(Integer.valueOf(this.i), Integer.valueOf(aaayVar.i));
    }

    public final void f(boolean z) {
        this.d = Boolean.valueOf(z);
        l();
    }

    public final void g(float f) {
        this.c = Float.valueOf(f);
        l();
    }

    public final void h(float f) {
        this.e = Float.valueOf(f);
        this.k = true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }

    public final void i(zyh zyhVar) {
        zkt.n(zyhVar, "capImpl");
        this.g = zyhVar;
        this.l = true;
        this.k = true;
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("capImpl", this.g);
        zsaVarA.b("anchor", this.a);
        zsaVarA.b("rotationDegrees", this.b);
        zsaVarA.b("strokeWidthPx", this.c);
        zsaVarA.b("isVisible", this.d);
        zsaVarA.b("zIndex", this.e);
        zsaVarA.e("zGrade", this.h);
        zsaVarA.e("zWithinGrade", this.i);
        return zsaVarA.toString();
    }
}
