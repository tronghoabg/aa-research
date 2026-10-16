package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ymd extends defpackage.ymf implements defpackage.yjm {
    private static final long serialVersionUID = 0;

    public ymd(defpackage.yjm yjmVar) {
        super(yjmVar);
    }

    @Override // defpackage.ymf, defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ymf, defpackage.yfq
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ defpackage.ylx d() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yjm, ylx] */
    @Override // defpackage.ymf, defpackage.yfq, defpackage.ylx
    /* JADX INFO: renamed from: f */
    public final java.util.List c(java.lang.Object obj) {
        return j$.util.DesugarCollections.unmodifiableList(this.a.c(obj));
    }

    @Override // defpackage.yjm
    public final java.util.List g(java.lang.Object obj) {
        throw null;
    }
}
