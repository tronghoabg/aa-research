package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ybx extends defpackage.ycs implements defpackage.yjm {
    private static final long serialVersionUID = 6588350623831699109L;

    public ybx(java.util.Map map) {
        super(map);
    }

    @Override // defpackage.ycs
    public /* bridge */ /* synthetic */ java.util.Collection a() {
        throw null;
    }

    @Override // defpackage.ycs
    public final /* synthetic */ java.util.Collection b() {
        return java.util.Collections.EMPTY_LIST;
    }

    @Override // defpackage.ycs
    public final java.util.Collection d(java.util.Collection collection) {
        return j$.util.DesugarCollections.unmodifiableList((java.util.List) collection);
    }

    @Override // defpackage.ycs
    public final java.util.Collection e(java.lang.Object obj, java.util.Collection collection) {
        return n(obj, (java.util.List) collection, null);
    }

    @Override // defpackage.ycs, defpackage.ylx
    /* JADX INFO: renamed from: f */
    public final java.util.List c(java.lang.Object obj) {
        return (java.util.List) super.c(obj);
    }

    @Override // defpackage.yjm
    public final java.util.List g(java.lang.Object obj) {
        return (java.util.List) super.k(obj);
    }
}
