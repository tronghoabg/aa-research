package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class jts {
    public static final jts a;
    public static final jts b;
    public static final jts c;
    public final float d;
    public final ksy e;
    public final float f;

    static {
        ksy ksyVar = ksy.a;
        a = new jts(24.0f, ksy.a(ksy.d, BitmapDescriptorFactory.HUE_RED, ksy.b.i, null, BitmapDescriptorFactory.HUE_RED, 509), ksy.d.h);
        b = new jts(16.0f, ksy.a(ksy.c, BitmapDescriptorFactory.HUE_RED, ksy.b.i, null, BitmapDescriptorFactory.HUE_RED, 509), ksy.c.h);
        c = new jts(16.0f, ksy.a(ksy.b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, BitmapDescriptorFactory.HUE_RED, 511), 88.0f);
    }

    private jts(float f, ksy ksyVar, float f2) {
        this.d = f;
        this.e = ksyVar;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jts)) {
            return false;
        }
        jts jtsVar = (jts) obj;
        return dlj.c(this.d, jtsVar.d) && affa.f(this.e, jtsVar.e) && dlj.c(this.f, jtsVar.f);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.d) * 31) + this.e.hashCode()) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        float f = this.f;
        return "FloatingActionButtonSpec(radius=" + dlj.b(this.d) + ", buttonSize=" + this.e + ", width=" + dlj.b(f) + ")";
    }
}
