package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzj {
    public final java.lang.String a;

    public hzj(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.hzj) {
            return this.a.equals(((defpackage.hzj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
