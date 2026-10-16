package defpackage;

/* loaded from: classes3.dex */
public final class ajjg implements ajjt {
    public final ajjs a;

    public ajjg(Throwable th) {
        this.a = new ajjs(this, null, th);
    }

    @Override // defpackage.ajjt
    public final /* bridge */ /* synthetic */ ajjn c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.ajjt
    public final ajjs d() {
        return this.a;
    }

    @Override // defpackage.ajjt
    public final ajjs e() {
        return this.a;
    }

    @Override // defpackage.ajjt
    public final /* bridge */ /* synthetic */ ajjt f() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.ajjt, defpackage.ajkb
    public final /* bridge */ /* synthetic */ void g() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.ajjt
    public final boolean j() {
        return false;
    }
}
