package defpackage;

/* loaded from: classes2.dex */
public final class hjf {
    public static final hjf a = new hjf(his.a, hiy.a, hiz.a, hiw.a, hjc.a);
    public static final hjf b = new hjf(his.b, hiy.b, hiz.b, hiw.b, hjc.b);
    public final his c;
    public final hiy d;
    public final hiz e;
    public final hiw f;
    public final hjc g;
    public final float h = 420.0f;

    private hjf(his hisVar, hiy hiyVar, hiz hizVar, hiw hiwVar, hjc hjcVar) {
        this.c = hisVar;
        this.d = hiyVar;
        this.e = hizVar;
        this.f = hiwVar;
        this.g = hjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjf)) {
            return false;
        }
        hjf hjfVar = (hjf) obj;
        if (!affa.f(this.c, hjfVar.c) || !affa.f(this.d, hjfVar.d) || !affa.f(this.e, hjfVar.e) || !affa.f(this.f, hjfVar.f) || !affa.f(this.g, hjfVar.g)) {
            return false;
        }
        float f = hjfVar.h;
        return dlj.c(420.0f, 420.0f);
    }

    public final int hashCode() {
        return (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Float.floatToIntBits(420.0f);
    }

    public final String toString() {
        return "TemplateSize(accessory=" + this.c + ", minIconSize=" + this.d + ", minImageSize=" + this.e + ", focusRing=" + this.f + ", semantic=" + this.g + ", maxButtonWidth=" + dlj.b(420.0f) + ")";
    }
}
