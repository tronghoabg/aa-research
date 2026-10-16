package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aagl {
    public static final Interpolator a = new AccelerateDecelerateInterpolator();
    public final aagi b;
    public final boolean c;
    public final aagh d;
    public final StreetViewPanoramaCamera e;
    private final String f;
    private final Interpolator g;
    private aagi h;
    private boolean i;
    private Double j;
    private Double k;

    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aagl(defpackage.aagi r24, java.lang.String r25, defpackage.aagu r26, com.google.android.libraries.maps.model.StreetViewPanoramaCamera r27, boolean r28, android.view.animation.Interpolator r29) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aagl.<init>(aagi, java.lang.String, aagu, com.google.android.libraries.maps.model.StreetViewPanoramaCamera, boolean, android.view.animation.Interpolator):void");
    }

    private final synchronized double h() {
        if (this.d != null && !f()) {
            if (this.j == null) {
                return 0.0d;
            }
            if (this.k.doubleValue() >= this.j.doubleValue() + 1.0d) {
                return 1.0d;
            }
            return aahr.d(this.g.getInterpolation((float) aahr.k(this.k.doubleValue() - this.j.doubleValue())), BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        return 1.0d;
    }

    public final synchronized double a(double d) {
        if (this.j == null) {
            this.j = Double.valueOf(d);
        }
        this.k = Double.valueOf(d);
        return h();
    }

    public final synchronized aagi b() {
        return f() ? this.b : this.h;
    }

    public final synchronized void c() {
        this.i = true;
    }

    public final synchronized boolean d() {
        if (this.f != null) {
            if (!this.i) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        return h() >= 1.0d;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aagl)) {
            return false;
        }
        aagl aaglVar = (aagl) obj;
        synchronized (this) {
            synchronized (aaglVar) {
                if (!a.C(this.b, aaglVar.b) || !a.C(this.f, aaglVar.f) || !a.C(this.d, aaglVar.d) || !a.C(this.e, aaglVar.e) || !a.C(Boolean.valueOf(this.c), Boolean.valueOf(aaglVar.c)) || !a.C(Boolean.valueOf(this.i), Boolean.valueOf(aaglVar.i)) || !a.C(this.j, aaglVar.j) || !a.C(this.h, aaglVar.h)) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final boolean f() {
        aagi aagiVar = this.b;
        return aagiVar.i() ? this.f == null : a.C(aagiVar.b, this.f);
    }

    @ResultIgnorabilityUnspecified
    public final boolean g(aagi aagiVar) {
        zkt.n(aagiVar, "destPanoTarget");
        String str = this.f;
        if (str == null || aagiVar.i()) {
            return str == null && aagiVar.i();
        }
        if (!a.C(str, aagiVar.b)) {
            return false;
        }
        synchronized (this) {
            this.h = aagiVar;
        }
        aagh aaghVar = this.d;
        if (aaghVar != null) {
            aags aagsVarF = aagiVar.f();
            zkt.n(aagsVarF, "destWorldOrientation");
            float[] fArrB = aagh.b(aaghVar, aagsVarF, true);
            synchronized (aaghVar) {
                aaghVar.c = fArrB;
            }
        }
        return true;
    }

    public final synchronized int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.f, this.d, this.e, Boolean.valueOf(this.c), Boolean.valueOf(this.i), this.j});
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.b("srcPanoTarget", this.b.b);
        zsaVarA.b("destPanoId", this.f);
        zsaVarA.g("isUserGesture", this.c);
        zsaVarA.b("connectedPanoramaGeometry", this.d);
        zsaVarA.b("turnToLookAtCamera", this.e);
        aagi aagiVar = this.h;
        zsaVarA.b("destPanoTarget", aagiVar == null ? null : aagiVar.b);
        zsaVarA.g("isDestinationPanoReadyToRender", this.i);
        zsaVarA.b("startTimeSec", this.j);
        zsaVarA.b("currTimeSec", this.k);
        zsaVarA.c("getClampedTransitionRatio()", h());
        return zsaVarA.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aagl(aagi aagiVar, String str, StreetViewPanoramaCamera streetViewPanoramaCamera, boolean z) {
        this(aagiVar, str, null, streetViewPanoramaCamera, z, null);
        zkt.n(aagiVar, "srcPanoTarget");
        zkt.n(str, "destPanoId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aagl(aagi aagiVar) {
        this(aagiVar, null, null, null, false, null);
        zkt.n(aagiVar, "srcPanoTarget");
        synchronized (this) {
            this.h = aagi.a;
        }
    }
}
