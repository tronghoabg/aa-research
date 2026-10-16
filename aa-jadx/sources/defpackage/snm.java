package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class snm {
    public final java.lang.Object a;
    private final java.lang.String b;

    public snm(java.lang.Object obj, java.lang.String str) {
        this.a = obj;
        this.b = str;
    }

    public final java.lang.String a() {
        return this.b + "@" + java.lang.System.identityHashCode(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.snm)) {
            return false;
        }
        defpackage.snm snmVar = (defpackage.snm) obj;
        return this.a == snmVar.a && this.b.equals(snmVar.b);
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
