package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ubw {
    public int a;
    public defpackage.abfj b;

    public ubw(int i, defpackage.abfj abfjVar) {
        this.a = i;
        this.b = abfjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ubw) {
            defpackage.ubw ubwVar = (defpackage.ubw) obj;
            if (this.a == ubwVar.a && this.b == ubwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 37) + java.lang.System.identityHashCode(this.b);
    }
}
