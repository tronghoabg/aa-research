package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ufl implements java.lang.Comparable {
    public defpackage.akde a = new defpackage.akde(null);
    public final defpackage.tpm b;
    private final defpackage.tpa c;

    public ufl(defpackage.tpa tpaVar, defpackage.tpm tpmVar) {
        this.c = tpaVar;
        this.b = tpmVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a.compareTo(((defpackage.ufl) obj).a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ufl)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.c.equals(((defpackage.ufl) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
