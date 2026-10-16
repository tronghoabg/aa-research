package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wia {
    public final defpackage.abpy a;
    private final defpackage.abol b;

    public wia(defpackage.abpy abpyVar, defpackage.abol abolVar) {
        if (abpyVar == null) {
            throw new java.lang.NullPointerException("Null defaultValue");
        }
        this.a = abpyVar;
        if (abolVar == null) {
            throw new java.lang.NullPointerException("Null extensionRegistryLite");
        }
        this.b = abolVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [abpy, java.lang.Object] */
    public final defpackage.abpy a(java.io.InputStream inputStream) throws java.io.IOException {
        return this.a.M().i(inputStream, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wia) {
            defpackage.wia wiaVar = (defpackage.wia) obj;
            if (this.a.equals(wiaVar.a) && this.b.equals(wiaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.abol abolVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + abolVar.toString() + "}";
    }

    public wia() {
        throw null;
    }
}
