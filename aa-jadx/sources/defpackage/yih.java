package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yih implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator a;
    final java.lang.Object[] b;

    public yih(java.util.Comparator comparator, java.lang.Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    java.lang.Object readResolve() {
        defpackage.yig yigVar = new defpackage.yig(this.a);
        yigVar.o(this.b);
        return yigVar.g();
    }
}
