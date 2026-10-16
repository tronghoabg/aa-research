package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ast extends defpackage.asv {
    private final defpackage.izq a;

    public ast(defpackage.izq izqVar) {
        this.a = izqVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [affc, java.lang.Object] */
    @Override // defpackage.asv
    public final int a(defpackage.cux cuxVar) {
        return ((java.lang.Number) this.a.a.invoke(cuxVar)).intValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ast) && defpackage.afga.f(this.a, ((defpackage.ast) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Block(lineProviderBlock=" + this.a + ")";
    }
}
