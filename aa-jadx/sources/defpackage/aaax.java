package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaax extends defpackage.wpv {
    protected final defpackage.aaav a;
    protected final defpackage.aaav b;

    public aaax(defpackage.aaav aaavVar, defpackage.aaav aaavVar2) {
        super(null);
        this.a = aaavVar;
        this.b = aaavVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aaax) {
            defpackage.aaax aaaxVar = (defpackage.aaax) obj;
            if (aaaxVar.b.equals(this.b) && aaaxVar.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 31) * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "[" + this.a.toString() + ", " + this.b.toString() + "]";
    }
}
