package defpackage;

/* loaded from: classes2.dex */
public final class hkt extends hjt implements wb, gfx {
    public final hju a;
    public final hju b;
    public final hju c;
    public final float d;
    public final float e;
    public final gab f;
    public final float g;
    public final boolean h;

    public hkt(hju hjuVar, hju hjuVar2, hju hjuVar3, float f, float f2, gab gabVar, float f3, boolean z) {
        super(false, z);
        this.a = hjuVar;
        this.b = hjuVar2;
        this.c = hjuVar3;
        this.d = f;
        this.e = f2;
        this.f = gabVar;
        this.g = f3;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkt)) {
            return false;
        }
        hkt hktVar = (hkt) obj;
        return affa.f(this.a, hktVar.a) && affa.f(this.b, hktVar.b) && affa.f(this.c, hktVar.c) && dlj.c(this.d, hktVar.d) && dlj.c(this.e, hktVar.e) && affa.f(this.f, hktVar.f) && Float.compare(this.g, hktVar.g) == 0 && this.h == hktVar.h;
    }

    public final int hashCode() {
        hju hjuVar = this.a;
        int iHashCode = ((hjuVar == null ? 0 : hjuVar.hashCode()) * 31) + this.b.hashCode();
        hju hjuVar2 = this.c;
        int iHashCode2 = ((((((iHashCode * 31) + (hjuVar2 == null ? 0 : hjuVar2.hashCode())) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31;
        gab gabVar = this.f;
        return ((((iHashCode2 + (gabVar != null ? gabVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.g)) * 31) + a.f(this.h);
    }

    public final String toString() {
        float f = this.e;
        return "SingleContentLayoutUiModel(header=" + this.a + ", content=" + this.b + ", side=" + this.c + ", contentStartPadding=" + dlj.b(this.d) + ", contentEndPadding=" + dlj.b(f) + ", backgroundImage=" + this.f + ", backgroundImageAlpha=" + this.g + ", isOverlaySupported=" + this.h + ")";
    }
}
