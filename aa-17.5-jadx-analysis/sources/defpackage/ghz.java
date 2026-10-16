package defpackage;

/* loaded from: classes2.dex */
public final class ghz {
    public static final ghz a;
    public static final ghz b;
    public static final ghz c;
    public static final ghz d;
    public static final ghz e;
    public final int f;
    public final ghy g;
    public final boolean h;
    private final int i;

    static {
        ghz ghzVar = new ghz(0, 0, ghy.a, false);
        a = ghzVar;
        b = new ghz(4, 2, ghy.b, false);
        c = a(ghzVar, 0, ghy.c, false, 11);
        ghy ghyVar = ghy.d;
        d = a(ghzVar, 0, ghyVar, true, 3);
        e = a(ghzVar, 5, ghyVar, true, 2);
    }

    public ghz(int i, int i2, ghy ghyVar, boolean z) {
        this.f = i;
        this.i = i2;
        this.g = ghyVar;
        this.h = z;
    }

    public static /* synthetic */ ghz a(ghz ghzVar, int i, ghy ghyVar, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = ghzVar.f;
        }
        int i3 = (i2 & 2) != 0 ? ghzVar.i : 0;
        if ((i2 & 4) != 0) {
            ghyVar = ghzVar.g;
        }
        if ((i2 & 8) != 0) {
            z = ghzVar.h;
        }
        return new ghz(i, i3, ghyVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghz)) {
            return false;
        }
        ghz ghzVar = (ghz) obj;
        return this.f == ghzVar.f && this.i == ghzVar.i && affa.f(this.g, ghzVar.g) && this.h == ghzVar.h;
    }

    public final int hashCode() {
        return (((((this.f * 31) + this.i) * 31) + this.g.hashCode()) * 31) + a.f(this.h);
    }

    public final String toString() {
        return "RowListConstraints(listContentType=" + this.f + ", maxActions=" + this.i + ", rowConstraints=" + this.g + ", allowSelectableLists=" + this.h + ")";
    }
}
