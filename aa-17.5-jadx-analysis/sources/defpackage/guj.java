package defpackage;

/* loaded from: classes2.dex */
public final class guj implements hju {
    public final gab a;
    public final gfa b;
    public final gfa c;

    public guj(gab gabVar, gfa gfaVar, gfa gfaVar2) {
        this.a = gabVar;
        this.b = gfaVar;
        this.c = gfaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guj)) {
            return false;
        }
        guj gujVar = (guj) obj;
        return affa.f(this.a, gujVar.a) && affa.f(this.b, gujVar.b) && affa.f(this.c, gujVar.c);
    }

    public final int hashCode() {
        gab gabVar = this.a;
        return ((((gabVar == null ? 0 : gabVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ExpandedMessageUiModel(image=" + this.a + ", message=" + this.b + ", title=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public guj() {
        gfs gfsVar = gey.b;
        this(null, gfsVar, gfsVar);
    }
}
