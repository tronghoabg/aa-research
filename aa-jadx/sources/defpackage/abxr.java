package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abxr implements java.io.Serializable, defpackage.yxl {
    public final int a;

    public abxr(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.abxr) && this.a == ((defpackage.abxr) obj).a;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final java.lang.String toString() {
        return "veType: " + this.a;
    }
}
