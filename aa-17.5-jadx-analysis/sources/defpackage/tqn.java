package defpackage;

/* loaded from: classes3.dex */
public final class tqn {
    public final abcs a;
    public final abdl b;
    public final boolean c;
    public final int d;
    public final xxh e;
    public final xxh f;
    public final xxh g;
    public final boolean h;
    public final int i;
    public final tql j;

    public tqn(abcs abcsVar, tql tqlVar, abdl abdlVar, boolean z, int i, int i2, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, boolean z2) {
        this.a = abcsVar;
        this.j = tqlVar;
        this.b = abdlVar;
        this.c = z;
        this.d = i;
        this.i = i2;
        this.e = xxhVar;
        this.f = xxhVar2;
        this.g = xxhVar3;
        this.h = z2;
    }

    public static tqm a() {
        tqm tqmVar = new tqm();
        tqmVar.b(false);
        return tqmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqn) {
            tqn tqnVar = (tqn) obj;
            if (this.a.equals(tqnVar.a) && this.j.equals(tqnVar.j) && this.b.equals(tqnVar.b) && this.c == tqnVar.c && this.d == tqnVar.d) {
                int i = this.i;
                int i2 = tqnVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.e.equals(tqnVar.e) && this.f.equals(tqnVar.f) && this.g.equals(tqnVar.g) && this.h == tqnVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.b.hashCode();
        int i = this.i;
        a.aJ(i);
        return (((((((((((((iHashCode * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d) * 1000003) ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        String str;
        int i = this.i;
        abdl abdlVar = this.b;
        tql tqlVar = this.j;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(tqlVar);
        String strValueOf3 = String.valueOf(abdlVar);
        switch (i) {
            case 1:
                str = "PLACED_FULLY";
                break;
            case 2:
                str = "SECONDARY_HIDDEN";
                break;
            case 3:
                str = "TERTIARY_HIDDEN";
                break;
            case 4:
                str = "SECONDARY_AND_TERTIARY_HIDDEN";
                break;
            case 5:
                str = "REPRESSED";
                break;
            case 6:
                str = "TRUMPED";
                break;
            default:
                str = "null";
                break;
        }
        int i2 = this.d;
        boolean z = this.c;
        xxh xxhVar = this.e;
        xxh xxhVar2 = this.f;
        xxh xxhVar3 = this.g;
        boolean z2 = this.h;
        return "{" + strValueOf + ", " + strValueOf2 + ", " + strValueOf3 + ", " + z + ", " + i2 + ", " + str + ", " + String.valueOf(xxhVar) + ", " + String.valueOf(xxhVar2) + ", " + String.valueOf(xxhVar3) + ", " + z2 + "}";
    }

    public tqn() {
        throw null;
    }
}
