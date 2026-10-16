package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajkg implements defpackage.ajkt {
    public final defpackage.ajks a;

    public ajkg(java.lang.Throwable th) {
        this.a = new defpackage.ajks(this, null, th);
    }

    @Override // defpackage.ajkt
    public final /* bridge */ /* synthetic */ defpackage.ajkn c() {
        throw new java.lang.IllegalStateException("unexpected call");
    }

    @Override // defpackage.ajkt
    public final defpackage.ajks d() {
        return this.a;
    }

    @Override // defpackage.ajkt
    public final defpackage.ajks e() {
        return this.a;
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
        return false;
    }
}
