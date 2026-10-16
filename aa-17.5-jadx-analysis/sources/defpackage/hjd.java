package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class hjd {
    public final bcm a;
    public final bcm b;
    public final bcm c;
    public final bcm d;
    public final bcm e;
    public final bcm f;
    public final bcm g;

    public /* synthetic */ hjd(byte[] bArr) {
        bcm bcmVarB = bcr.b(BitmapDescriptorFactory.HUE_RED);
        bcm bcmVarB2 = bcr.b(gjk.b.k);
        bcm bcmVarB3 = bcr.b(gjk.d.k);
        bcm bcmVarB4 = bcr.b(gjk.e.k);
        bcm bcmVarB5 = bcr.b(gjk.f.k);
        bcm bcmVarB6 = bcr.b(gjk.g.k);
        bcm bcmVar = bcr.a;
        bcmVar.getClass();
        this.a = bcmVarB;
        this.b = bcmVarB2;
        this.c = bcmVarB3;
        this.d = bcmVarB4;
        this.e = bcmVarB5;
        this.f = bcmVarB6;
        this.g = bcmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjd)) {
            return false;
        }
        hjd hjdVar = (hjd) obj;
        return affa.f(this.a, hjdVar.a) && affa.f(this.b, hjdVar.b) && affa.f(this.c, hjdVar.c) && affa.f(this.d, hjdVar.d) && affa.f(this.e, hjdVar.e) && affa.f(this.f, hjdVar.f) && affa.f(this.g, hjdVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Corner(none=" + this.a + ", extraSmall=" + this.b + ", small=" + this.c + ", medium=" + this.d + ", large=" + this.e + ", extraLarge=" + this.f + ", full=" + this.g + ")";
    }

    public hjd() {
        this(null);
    }
}
