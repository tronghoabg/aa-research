package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gor {
    public int a = 1;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.gor) && this.a == ((defpackage.gor) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "MutableInt(value=" + this.a + ")";
    }
}
