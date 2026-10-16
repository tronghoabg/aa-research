package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ddb {
    public final defpackage.cno a;
    public final int b;

    public ddb(defpackage.cno cnoVar, int i) {
        this.a = cnoVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ddb)) {
            return false;
        }
        defpackage.ddb ddbVar = (defpackage.ddb) obj;
        return defpackage.afga.f(this.a, ddbVar.a) && this.b == ddbVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
