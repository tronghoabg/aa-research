package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bwe implements defpackage.cfk {
    private final defpackage.bvh a;

    public bwe(defpackage.bvh bvhVar) {
        this.a = bvhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.bwe) && defpackage.afga.f(this.a, ((defpackage.bwe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
