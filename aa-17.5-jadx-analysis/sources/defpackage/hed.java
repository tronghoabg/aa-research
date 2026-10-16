package defpackage;

/* loaded from: classes2.dex */
public final class hed {
    public static final hed a = new hed(new hec(64.0f, bcr.a, false), new hec(64.0f, bcr.b(gjk.d.k), false), new hec(56.0f, bcr.b(gjk.d.k), false), new hec(36.0f, null, false), new hec(12.0f, null, false), new hec(36.0f, null, true));
    public static final hed b = new hed(new hec(80.0f, bcr.a, false), new hec(80.0f, bcr.b(gjk.d.k), false), new hec(72.0f, bcr.b(gjk.d.k), false), new hec(52.0f, null, false), new hec(28.0f, null, false), new hec(52.0f, null, true));
    public final hec c;
    public final hec d;
    public final hec e;
    public final hec f;
    public final hec g;
    public final hec h;

    public hed(hec hecVar, hec hecVar2, hec hecVar3, hec hecVar4, hec hecVar5, hec hecVar6) {
        this.c = hecVar;
        this.d = hecVar2;
        this.e = hecVar3;
        this.f = hecVar4;
        this.g = hecVar5;
        this.h = hecVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hed)) {
            return false;
        }
        hed hedVar = (hed) obj;
        return affa.f(this.c, hedVar.c) && affa.f(this.d, hedVar.d) && affa.f(this.e, hedVar.e) && affa.f(this.f, hedVar.f) && affa.f(this.g, hedVar.g) && affa.f(this.h, hedVar.h);
    }

    public final int hashCode() {
        return (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "RowLeadingImageStyles(circleImage=" + this.c + ", largeImage=" + this.d + ", mediumImage=" + this.e + ", smallImage=" + this.f + ", extraSmallImage=" + this.g + ", regularIcon=" + this.h + ")";
    }
}
