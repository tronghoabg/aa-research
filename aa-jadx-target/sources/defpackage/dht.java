package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dht {
    private final defpackage.dhy a;
    private final java.lang.Object b = null;

    public dht(defpackage.dhy dhyVar) {
        this.a = dhyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dht)) {
            return false;
        }
        defpackage.dht dhtVar = (defpackage.dht) obj;
        if (!defpackage.afga.f(this.a, dhtVar.a)) {
            return false;
        }
        java.lang.Object obj2 = dhtVar.b;
        return defpackage.afga.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
