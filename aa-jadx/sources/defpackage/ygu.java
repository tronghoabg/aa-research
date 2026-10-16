package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ygu implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.lang.Object[] a;

    public ygu(java.lang.Object[] objArr) {
        this.a = objArr;
    }

    java.lang.Object readResolve() {
        return defpackage.ygw.p(this.a);
    }
}
