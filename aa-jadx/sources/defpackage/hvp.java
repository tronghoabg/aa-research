package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvp implements defpackage.hvg {
    private final defpackage.hxu a;

    public hvp(defpackage.hxu hxuVar) {
        this.a = hxuVar;
    }

    @Override // defpackage.hvg
    public final /* bridge */ /* synthetic */ defpackage.hvh a(java.lang.Object obj) {
        return new defpackage.hvq((java.io.InputStream) obj, this.a);
    }

    @Override // defpackage.hvg
    public final java.lang.Class b() {
        return java.io.InputStream.class;
    }
}
