package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkb implements defpackage.djg {
    public final int a;
    private final defpackage.dfb b;

    public dkb(java.lang.String str, int i) {
        this.b = new defpackage.dfb(str);
        this.a = i;
    }

    @Override // defpackage.djg
    public final void a(defpackage.djh djhVar) {
        if (djhVar.k()) {
            int i = djhVar.c;
            djhVar.h(i, djhVar.d, b());
            if (b().length() > 0) {
                djhVar.i(i, b().length() + i);
            }
        } else {
            int i2 = djhVar.a;
            djhVar.h(i2, djhVar.b, b());
            if (b().length() > 0) {
                djhVar.i(i2, b().length() + i2);
            }
        }
        int iB = djhVar.b();
        int i3 = this.a;
        int i4 = iB + i3;
        int iG = defpackage.afqt.g(i3 > 0 ? i4 - 1 : i4 - b().length(), 0, djhVar.c());
        djhVar.j(iG, iG);
    }

    public final java.lang.String b() {
        return this.b.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dkb)) {
            return false;
        }
        defpackage.dkb dkbVar = (defpackage.dkb) obj;
        return defpackage.afga.f(b(), dkbVar.b()) && this.a == dkbVar.a;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final java.lang.String toString() {
        return "SetComposingTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ")";
    }
}
