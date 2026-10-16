package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hwe implements defpackage.hus {
    private final defpackage.hus b;
    private final defpackage.hus c;

    public hwe(defpackage.hus husVar, defpackage.hus husVar2) {
        this.b = husVar;
        this.c = husVar2;
    }

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.hus
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.hwe) {
            defpackage.hwe hweVar = (defpackage.hwe) obj;
            if (this.b.equals(hweVar.b) && this.c.equals(hweVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hus
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.hus husVar = this.c;
        return "DataCacheKey{sourceKey=" + java.lang.String.valueOf(this.b) + ", signature=" + java.lang.String.valueOf(husVar) + "}";
    }
}
