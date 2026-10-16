package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class dfv implements defpackage.dex {
    public final java.lang.String a;

    public /* synthetic */ dfv(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dfv) && defpackage.afga.f(this.a, ((defpackage.dfv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "StringAnnotation(value=" + this.a + ")";
    }
}
