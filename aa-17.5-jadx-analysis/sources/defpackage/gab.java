package defpackage;

/* loaded from: classes2.dex */
public final class gab implements hju {
    public final gfk a;
    public final fzp b;
    public final gbg c;

    public gab(gfk gfkVar, fzp fzpVar, gbg gbgVar) {
        this.a = gfkVar;
        this.b = fzpVar;
        this.c = gbgVar;
        if (woy.da(new Object[]{gfkVar, fzpVar, gbgVar}).size() == 1) {
            return;
        }
        throw new IllegalArgumentException("CarIconDelegateUiModel requires that only a single field be non-null. Painter: [" + gfkVar + "], CarImage: [" + fzpVar + "], LazyIcon: [" + gbgVar + "].");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gab)) {
            return false;
        }
        gab gabVar = (gab) obj;
        return affa.f(this.a, gabVar.a) && affa.f(this.b, gabVar.b) && affa.f(this.c, gabVar.c);
    }

    public final int hashCode() {
        gfk gfkVar = this.a;
        int iHashCode = gfkVar == null ? 0 : gfkVar.hashCode();
        fzp fzpVar = this.b;
        int iHashCode2 = fzpVar == null ? 0 : fzpVar.hashCode();
        int i = iHashCode * 31;
        gbg gbgVar = this.c;
        return ((i + iHashCode2) * 31) + (gbgVar != null ? gbgVar.hashCode() : 0);
    }

    public final String toString() {
        return "CarIconDelegateUiModel(painterProvider=" + this.a + ", carImageModel=" + this.b + ", lazyIconModel=" + this.c + ")";
    }

    public gab() {
        this(null, null, null);
    }
}
