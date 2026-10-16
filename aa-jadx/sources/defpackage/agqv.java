package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agqv {
    private final defpackage.afie<? extends defpackage.agqu> klass;

    public agqv(defpackage.afie<? extends defpackage.agqu> afieVar) {
        afieVar.getClass();
        this.klass = afieVar;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.agqv) && defpackage.afga.f(this.klass, ((defpackage.agqv) obj).klass);
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String name = defpackage.afga.h(this.klass).getName();
        name.getClass();
        return name;
    }
}
