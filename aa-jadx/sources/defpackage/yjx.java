package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class yjx extends defpackage.yfj implements java.io.Serializable {
    private static final long serialVersionUID = 3;
    final defpackage.ykk a;
    final defpackage.ykk b;
    final defpackage.xyc c;
    final int d;
    transient java.util.concurrent.ConcurrentMap e;

    public yjx(defpackage.ykk ykkVar, defpackage.ykk ykkVar2, defpackage.xyc xycVar, int i, java.util.concurrent.ConcurrentMap concurrentMap) {
        this.a = ykkVar;
        this.b = ykkVar2;
        this.c = xycVar;
        this.d = i;
        this.e = concurrentMap;
    }

    @Override // defpackage.yfj, defpackage.yfo
    protected final /* synthetic */ java.util.Map a() {
        return this.e;
    }

    @Override // defpackage.yfj
    protected final java.util.concurrent.ConcurrentMap c() {
        return this.e;
    }

    @Override // defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.e;
    }
}
