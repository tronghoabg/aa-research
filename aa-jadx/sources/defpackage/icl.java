package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icl implements defpackage.hxg {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public icl(byte[] bArr, int i) {
        this.a = i;
        defpackage.a.ak(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // defpackage.hxg
    public final int a() {
        int i = this.a;
        java.lang.Object obj = this.b;
        return i != 0 ? defpackage.igg.a((android.graphics.Bitmap) obj) : ((byte[]) obj).length;
    }

    @Override // defpackage.hxg
    public final java.lang.Class b() {
        return this.a != 0 ? android.graphics.Bitmap.class : byte[].class;
    }

    @Override // defpackage.hxg
    public final /* synthetic */ java.lang.Object c() {
        return this.b;
    }

    public icl(android.graphics.Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // defpackage.hxg
    public final void e() {
    }
}
