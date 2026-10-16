package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yfh implements java.lang.Iterable {
    private final java.lang.Iterable a;

    public yfh(java.lang.Iterable iterable) {
        iterable.getClass();
        this.a = iterable;
    }

    public static defpackage.yfh a(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        return i(iterable, iterable2);
    }

    public static defpackage.yfh b(java.lang.Iterable iterable, java.lang.Iterable iterable2, java.lang.Iterable iterable3, java.lang.Iterable iterable4) {
        return i(iterable, iterable2, iterable3, iterable4);
    }

    public static defpackage.yfh d(java.lang.Iterable iterable) {
        return iterable instanceof defpackage.yfh ? (defpackage.yfh) iterable : new yfe(iterable, iterable);
    }

    private static defpackage.yfh i(java.lang.Iterable... iterableArr) {
        for (java.lang.Iterable iterable : iterableArr) {
            iterable.getClass();
        }
        return new yfg(iterableArr);
    }

    public final defpackage.yfh c(defpackage.xyp xypVar) {
        return d(defpackage.ysr.aj(h(), xypVar));
    }

    public final defpackage.yfh e(defpackage.xyd xydVar) {
        return d(defpackage.ysr.am(h(), xydVar));
    }

    public final defpackage.ygw f() {
        return defpackage.ygw.n(h());
    }

    public final defpackage.yhe g(defpackage.xyd xydVar) {
        java.lang.Iterable iterableH = h();
        return ((iterableH instanceof java.util.List) || (iterableH instanceof defpackage.ygm)) ? defpackage.ysr.H(iterableH.iterator(), xydVar, defpackage.yhe.h(((java.util.Collection) iterableH).size())) : defpackage.ysr.H(iterableH.iterator(), xydVar, new defpackage.yha(4));
    }

    public final java.lang.Iterable h() {
        java.lang.Iterable iterable = this.a;
        return iterable != null ? iterable : this;
    }

    public final java.lang.String toString() {
        return defpackage.ysr.aa(h().iterator());
    }

    protected yfh() {
        this.a = null;
    }
}
