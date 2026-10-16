package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zdz extends defpackage.yfn implements java.io.Serializable {
    final defpackage.yjm a;
    transient java.util.Collection b;
    transient java.util.Map c;

    public zdz(defpackage.yjm yjmVar) {
        this.a = yjmVar;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final boolean B(defpackage.ylx ylxVar) {
        boolean zT = false;
        for (java.util.Map.Entry entry : ylxVar.u()) {
            zT |= t(entry.getKey(), entry.getValue());
        }
        return zT;
    }

    @Override // defpackage.yfn
    protected final defpackage.yjm a() {
        return this.a;
    }

    @Override // defpackage.yfn, defpackage.yfq, defpackage.ylx
    public final /* bridge */ /* synthetic */ java.util.Collection c(java.lang.Object obj) {
        return c(obj);
    }

    @Override // defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.a;
    }

    @Override // defpackage.yfn, defpackage.yfq
    protected final /* synthetic */ defpackage.ylx e() {
        return this.a;
    }

    @Override // defpackage.yfn, defpackage.yjm
    /* JADX INFO: renamed from: f */
    public final java.util.List c(java.lang.Object obj) {
        return new defpackage.zdw(this.a.c(obj));
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final boolean t(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.a.t(obj, obj2);
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final java.util.Collection u() {
        java.util.Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        defpackage.zdv zdvVar = new defpackage.zdv(this.a.u());
        this.b = zdvVar;
        return zdvVar;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final java.util.Map w() {
        java.util.Map map = this.c;
        if (map != null) {
            return map;
        }
        defpackage.zdy zdyVar = new defpackage.zdy(this, this.a.w());
        this.c = zdyVar;
        return zdyVar;
    }
}
