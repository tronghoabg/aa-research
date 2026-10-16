package defpackage;

/* loaded from: classes3.dex */
final class uqh {
    private final abcs a;
    private final abdl b;
    private final boolean c;
    private final boolean d;
    private final toc e;
    private final tql f;

    public uqh(abcs abcsVar, tql tqlVar, abdl abdlVar, boolean z, boolean z2, toc tocVar) {
        this.a = abcsVar;
        tqlVar.getClass();
        this.f = tqlVar;
        abdlVar.getClass();
        this.b = abdlVar;
        this.c = z;
        this.d = z2;
        this.e = tocVar;
    }

    public final boolean equals(Object obj) {
        toc tocVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqh) {
            uqh uqhVar = (uqh) obj;
            if (this.a.equals(uqhVar.a) && this.f.equals(uqhVar.f) && this.b.equals(uqhVar.b) && this.c == uqhVar.c && this.d == uqhVar.d && ((tocVar = this.e) != null ? tocVar.equals(uqhVar.e) : uqhVar.e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode();
        toc tocVar = this.e;
        return (((((iHashCode * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ (tocVar == null ? 0 : tocVar.hashCode());
    }

    public final String toString() {
        toc tocVar = this.e;
        abdl abdlVar = this.b;
        tql tqlVar = this.f;
        return "{" + this.a.toString() + ", " + tqlVar.toString() + ", " + abdlVar.toString() + ", " + this.c + ", " + this.d + ", " + String.valueOf(tocVar) + "}";
    }

    public uqh() {
        throw null;
    }
}
