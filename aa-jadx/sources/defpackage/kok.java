package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kok extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    public final java.io.InputStream a;
    private final defpackage.pbp b;

    public kok(java.io.InputStream inputStream, defpackage.pbp pbpVar) {
        this.a = inputStream;
        this.b = pbpVar;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        defpackage.pbp pbpVar = this.b;
        if (pbpVar == defpackage.pbp.WPP_READ) {
            defpackage.kou.m().h(defpackage.pbp.WPP_PRE_READ);
        } else if (pbpVar == defpackage.pbp.GAL_READ) {
            defpackage.kou.m().h(defpackage.pbp.GAL_PRE_READ);
        }
        return ((java.lang.Integer) defpackage.kou.m().b(pbpVar, new defpackage.pda(this, 1))).intValue();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return ((java.lang.Integer) defpackage.kou.m().b(this.b, new defpackage.kom(this, bArr, i, i2, 1))).intValue();
    }
}
