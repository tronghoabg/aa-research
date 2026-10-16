package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class vqq {
    public abstract java.lang.Object a();

    public abstract java.lang.String b();

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.vqq) {
            return j$.util.Objects.equals(a(), ((defpackage.vqq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final java.lang.String toString() {
        return b();
    }
}
