package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yhf implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.yhe a;

    public yhf(defpackage.yhe yheVar) {
        this.a = yheVar;
    }

    java.lang.Object readResolve() {
        return this.a.entrySet();
    }
}
