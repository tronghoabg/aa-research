package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajxr extends defpackage.ajwa {
    final /* synthetic */ defpackage.ajxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajxr(defpackage.ajxs ajxsVar, defpackage.ajqb ajqbVar) {
        super(ajqbVar);
        this.a = ajxsVar;
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final java.io.InputStream b() throws java.io.IOException {
        this.a.g = true;
        return super.b();
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final void e() throws java.io.IOException {
        this.a.g = true;
        super.e();
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final void f(java.io.OutputStream outputStream) throws java.io.IOException {
        this.a.g = true;
        super.f(outputStream);
    }
}
