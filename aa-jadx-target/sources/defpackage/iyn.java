package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iyn {
    public final java.lang.String a;
    public final java.util.Set b;
    private final java.lang.String c;

    public iyn(java.lang.String str, java.lang.String str2, java.util.Set set) {
        this.c = str;
        this.a = str2;
        this.b = set;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.iyn)) {
            return false;
        }
        defpackage.iyn iynVar = (defpackage.iyn) obj;
        return j$.util.Objects.equals(this.c, iynVar.c) && j$.util.Objects.equals(this.a, iynVar.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.c, this.a});
    }
}
