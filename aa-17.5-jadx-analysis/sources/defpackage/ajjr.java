package defpackage;

/* loaded from: classes3.dex */
public final class ajjr implements ajjt {
    public final ajjn a;

    public ajjr(ajjn ajjnVar) {
        this.a = ajjnVar;
    }

    @Override // defpackage.ajjt
    public final ajjn c() {
        return this.a;
    }

    @Override // defpackage.ajjt
    public final /* bridge */ /* synthetic */ ajjs d() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.ajjt
    public final /* bridge */ /* synthetic */ ajjs e() {
        throw new IllegalStateException("already connected");
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
        return true;
    }
}
