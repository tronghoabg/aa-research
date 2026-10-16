package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nxg {
    public final defpackage.zbe a;
    public final java.lang.String b;
    public final defpackage.nve c;
    public final long d;
    public final boolean e;

    public nxg(defpackage.nxf nxfVar) {
        this.a = nxfVar.a;
        this.b = nxfVar.b;
        this.c = nxfVar.c;
        this.d = nxfVar.d;
        this.e = nxfVar.e;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "TC[context=%s, pkg=%s]", this.a.name(), this.b);
    }
}
