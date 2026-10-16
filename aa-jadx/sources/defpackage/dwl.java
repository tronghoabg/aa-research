package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dwl {
    final java.lang.String a;
    final java.lang.String b;
    final java.util.List c;

    public dwl(java.lang.String str, java.lang.String str2, java.util.List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dwl)) {
            return false;
        }
        defpackage.dwl dwlVar = (defpackage.dwl) obj;
        return j$.util.Objects.equals(this.a, dwlVar.a) && j$.util.Objects.equals(this.b, dwlVar.b) && j$.util.Objects.equals(this.c, dwlVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, this.c);
    }
}
