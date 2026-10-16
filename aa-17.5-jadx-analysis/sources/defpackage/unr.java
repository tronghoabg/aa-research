package defpackage;

/* loaded from: classes3.dex */
final class unr {
    public final int a;
    public final ujk b;
    public String c;
    public final String d;
    public zdg f;
    public yfy g;
    public ukh e = null;
    public rhj h = null;

    public unr(int i, ujk ujkVar, String str, String str2, zdg zdgVar, yfy yfyVar) {
        this.a = i;
        this.b = ujkVar;
        this.c = str;
        this.d = str2;
        this.f = zdgVar;
        this.g = yfyVar;
    }

    public final wnq a() {
        rhj rhjVar;
        zdg zdgVar;
        yfy yfyVar;
        ukh ukhVar = this.e;
        if (ukhVar == null || (rhjVar = this.h) == null || (zdgVar = this.f) == null || (yfyVar = this.g) == null) {
            return null;
        }
        return new wnq(this.a, this.b, ukhVar, rhjVar, zdgVar, yfyVar);
    }
}
