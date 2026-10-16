package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iyg {
    public final android.content.Intent a;
    public final defpackage.qqe b;
    final int c;

    public iyg(android.content.Intent intent, defpackage.qqe qqeVar, int i) {
        this.a = intent;
        this.b = qqeVar;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.iyg)) {
            return false;
        }
        defpackage.iyg iygVar = (defpackage.iyg) obj;
        return this.a.filterEquals(iygVar.a) && this.b == iygVar.b && this.c == iygVar.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a.filterHashCode()), this.b, java.lang.Integer.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        defpackage.qqe qqeVar = this.b;
        return "Q[i=" + java.lang.String.valueOf(this.a) + ", t=" + java.lang.String.valueOf(qqeVar) + ", f=" + this.c + "]";
    }
}
