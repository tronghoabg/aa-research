package defpackage;

/* loaded from: classes2.dex */
public final class fzv {
    public static final int a;
    public static final long b;
    public final gab c;
    public final boolean d;
    public final hjw e;
    public final gab f;
    public final hjw g;

    static {
        hjw hjwVar = hjw.a;
        a = 8;
        b = -16569507086598144L;
    }

    public fzv(gab gabVar, boolean z, hjw hjwVar, gab gabVar2, hjw hjwVar2) {
        this.c = gabVar;
        this.d = z;
        this.e = hjwVar;
        this.f = gabVar2;
        this.g = hjwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzv)) {
            return false;
        }
        fzv fzvVar = (fzv) obj;
        return affa.f(this.c, fzvVar.c) && this.d == fzvVar.d && affa.f(this.e, fzvVar.e) && affa.f(this.f, fzvVar.f) && affa.f(this.g, fzvVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        hjw hjwVar = this.e;
        int iF = (((iHashCode + a.f(this.d)) * 31) + (hjwVar == null ? 0 : hjwVar.hashCode())) * 31;
        gab gabVar = this.f;
        int iHashCode2 = (iF + (gabVar == null ? 0 : gabVar.hashCode())) * 31;
        hjw hjwVar2 = this.g;
        return iHashCode2 + (hjwVar2 != null ? hjwVar2.hashCode() : 0);
    }

    public final String toString() {
        return "BadgedImageUiModel(image=" + this.c + ", hasDot=" + this.d + ", dotColor=" + this.e + ", badge=" + this.f + ", badgeBackgroundColor=" + this.g + ")";
    }
}
