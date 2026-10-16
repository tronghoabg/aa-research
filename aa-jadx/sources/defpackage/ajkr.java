package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajkr implements defpackage.ajkt {
    public final defpackage.ajkn a;

    public ajkr(defpackage.ajkn ajknVar) {
        this.a = ajknVar;
    }

    @Override // defpackage.ajkt
    public final defpackage.ajkn c() {
        return this.a;
    }

    @Override // defpackage.ajkt
    public final /* bridge */ /* synthetic */ defpackage.ajks d() {
        throw new java.lang.IllegalStateException("already connected");
    }

    @Override // defpackage.ajkt
    public final /* bridge */ /* synthetic */ defpackage.ajks e() {
        throw new java.lang.IllegalStateException("already connected");
    }

    @Override // defpackage.ajkt
    public final /* bridge */ /* synthetic */ defpackage.ajkt f() {
        throw new java.lang.IllegalStateException("unexpected retry");
    }

    @Override // defpackage.ajkt, defpackage.ajlb
    public final /* bridge */ /* synthetic */ void g() {
        throw new java.lang.IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.ajkt
    public final boolean j() {
        return true;
    }
}
