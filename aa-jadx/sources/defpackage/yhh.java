package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yhh implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.yhe a;

    public yhh(defpackage.yhe yheVar) {
        this.a = yheVar;
    }

    java.lang.Object readResolve() {
        return this.a.keySet();
    }
}
