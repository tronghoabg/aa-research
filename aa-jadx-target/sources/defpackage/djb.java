package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class djb implements defpackage.djg {
    public final int a;
    private final defpackage.dfb b;

    public djb(java.lang.String str, int i) {
        this(new defpackage.dfb(str), i);
    }

    @Override // defpackage.djg
    public final void a(defpackage.djh djhVar) {
        if (djhVar.k()) {
            djhVar.h(djhVar.c, djhVar.d, b());
        } else {
            djhVar.h(djhVar.a, djhVar.b, b());
        }
        int iB = djhVar.b();
        int i = this.a;
        int i2 = iB + i;
        int iG = defpackage.afqt.g(i > 0 ? i2 - 1 : i2 - b().length(), 0, djhVar.c());
        djhVar.j(iG, iG);
    }

    public final java.lang.String b() {
        return this.b.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.djb)) {
            return false;
        }
        defpackage.djb djbVar = (defpackage.djb) obj;
        return defpackage.afga.f(b(), djbVar.b()) && this.a == djbVar.a;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final java.lang.String toString() {
        return "CommitTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ")";
    }

    public djb(defpackage.dfb dfbVar, int i) {
        this.b = dfbVar;
        this.a = i;
    }
}
