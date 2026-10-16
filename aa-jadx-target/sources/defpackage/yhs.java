package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yhs<K, V> extends defpackage.ydh<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final transient defpackage.yhe<K, ? extends defpackage.ygm<V>> map;
    final transient int size;

    public yhs(defpackage.yhe yheVar, int i) {
        this.map = yheVar;
        this.size = i;
    }

    @Override // defpackage.yda, defpackage.ylx
    @java.lang.Deprecated
    public final boolean B(defpackage.ylx ylxVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.yda, defpackage.ylx
    @java.lang.Deprecated
    public final boolean C(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.yda, defpackage.ylx
    @java.lang.Deprecated
    public final void D(java.lang.Object obj, java.lang.Iterable iterable) {
        throw null;
    }

    @Override // defpackage.yda, defpackage.ylx
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public defpackage.ygm u() {
        return (defpackage.ygm) super.u();
    }

    @Override // defpackage.ylx
    public /* bridge */ /* synthetic */ java.util.Collection c(java.lang.Object obj) {
        throw null;
    }

    public final defpackage.ygm d() {
        return (defpackage.ygm) super.v();
    }

    @Override // defpackage.yda, defpackage.ylx
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final defpackage.yhx x() {
        return this.map.keySet();
    }

    @Override // defpackage.ylx
    public final int h() {
        return this.size;
    }

    @Override // defpackage.yda
    public final /* synthetic */ java.util.Collection i() {
        return new defpackage.yhq(this);
    }

    @Override // defpackage.yda
    public final /* synthetic */ java.util.Collection j() {
        return new defpackage.yhr(this);
    }

    @Override // defpackage.yda
    public final /* bridge */ /* synthetic */ java.util.Iterator l() {
        throw null;
    }

    @Override // defpackage.yda
    public final java.util.Map o() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // defpackage.yda
    public final java.util.Set p() {
        throw new java.lang.AssertionError("unreachable");
    }

    @Override // defpackage.ylx
    @java.lang.Deprecated
    public final void q() {
        throw null;
    }

    @Override // defpackage.ylx
    public final boolean s(java.lang.Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // defpackage.yda, defpackage.ylx
    @java.lang.Deprecated
    public final boolean t(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.yda, defpackage.ylx
    public final /* bridge */ /* synthetic */ java.util.Collection v() {
        throw null;
    }

    @Override // defpackage.yda, defpackage.ylx
    public /* synthetic */ java.util.Map w() {
        return this.map;
    }

    @Override // defpackage.yda, defpackage.ylx
    public final boolean z(java.lang.Object obj) {
        return obj != null && super.z(obj);
    }
}
