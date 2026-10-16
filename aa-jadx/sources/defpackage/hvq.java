package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvq implements defpackage.hvh {
    public final defpackage.iby a;

    public hvq(java.io.InputStream inputStream, defpackage.hxu hxuVar) {
        defpackage.iby ibyVar = new defpackage.iby(inputStream, hxuVar);
        this.a = ibyVar;
        ibyVar.mark(5242880);
    }

    @Override // defpackage.hvh
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.hvh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.io.InputStream a() throws java.io.IOException {
        defpackage.iby ibyVar = this.a;
        ibyVar.reset();
        return ibyVar;
    }
}
