package defpackage;

/* loaded from: classes2.dex */
public final class hcm extends hjt implements gfx {
    public final fzj a;
    public final hju b;
    public final hju c;
    public final gab d;
    public final float e;
    private final boolean f;

    public hcm(fzj fzjVar, hju hjuVar, hju hjuVar2, gab gabVar, float f, boolean z) {
        super(false, z);
        this.a = fzjVar;
        this.b = hjuVar;
        this.c = hjuVar2;
        this.d = gabVar;
        this.e = f;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcm)) {
            return false;
        }
        hcm hcmVar = (hcm) obj;
        return affa.f(this.a, hcmVar.a) && affa.f(this.b, hcmVar.b) && affa.f(this.c, hcmVar.c) && affa.f(this.d, hcmVar.d) && Float.compare(this.e, hcmVar.e) == 0 && this.f == hcmVar.f;
    }

    public final int hashCode() {
        fzj fzjVar = this.a;
        int iHashCode = ((fzjVar == null ? 0 : fzjVar.hashCode()) * 31) + this.b.hashCode();
        hju hjuVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (hjuVar == null ? 0 : hjuVar.hashCode())) * 31;
        gab gabVar = this.d;
        return ((((iHashCode2 + (gabVar != null ? gabVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.e)) * 31) + a.f(this.f);
    }

    public final String toString() {
        return "SectionedItemTemplateUiModel(header=" + this.a + ", content=" + this.b + ", side=" + this.c + ", backgroundImage=" + this.d + ", backgroundImageAlpha=" + this.e + ", isOverlaySupported=" + this.f + ")";
    }
}
