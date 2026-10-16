package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajwb extends defpackage.ajvv implements java.lang.Cloneable {
    protected final byte[] d;

    public ajwb(java.lang.String str, defpackage.ajvz ajvzVar) throws java.nio.charset.UnsupportedCharsetException {
        defpackage.aguw.e(str, "Source string");
        java.nio.charset.Charset charset = ajvzVar.t;
        this.d = str.getBytes(charset == null ? defpackage.akbz.a : charset);
        j(ajvzVar.toString());
    }

    @Override // defpackage.ajqb
    public final long a() {
        return this.d.length;
    }

    @Override // defpackage.ajqb
    public final java.io.InputStream b() throws java.io.IOException {
        return new java.io.ByteArrayInputStream(this.d);
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    @Override // defpackage.ajqb
    public final void f(java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.write(this.d);
        outputStream.flush();
    }

    @Override // defpackage.ajqb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ajqb
    public final boolean i() {
        return false;
    }
}
