package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class djl {
    public static final defpackage.djl a = new defpackage.djl(false, 1, defpackage.dkl.a);
    public final boolean b;
    public final int f;
    public final defpackage.dkl g;
    public final int c = 0;
    public final boolean d = true;
    public final int e = 1;
    private final defpackage.djx h = null;

    public djl(boolean z, int i, defpackage.dkl dklVar) {
        this.b = z;
        this.f = i;
        this.g = dklVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.djl)) {
            return false;
        }
        defpackage.djl djlVar = (defpackage.djl) obj;
        if (this.b != djlVar.b) {
            return false;
        }
        int i = djlVar.c;
        boolean z = djlVar.d;
        int i2 = djlVar.e;
        if (this.f != djlVar.f) {
            return false;
        }
        defpackage.djx djxVar = djlVar.h;
        return defpackage.afga.f(this.g, djlVar.g);
    }

    public final int hashCode() {
        return ((((((((true != this.b ? 1237 : 1231) * 961) + 1231) * 31) + 1) * 31) + this.f) * 961) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "ImeOptions(singleLine=" + this.b + ", capitalization=None, autoCorrect=true, keyboardType=" + defpackage.djn.a(1) + ", imeAction=" + defpackage.djk.a(this.f) + ", platformImeOptions=null, hintLocales=" + this.g + ")";
    }
}
