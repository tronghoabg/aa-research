package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajvy extends defpackage.ajvv implements java.lang.Cloneable {
    private final byte[] d;
    private final int e;

    public ajvy(byte[] bArr) {
        defpackage.aguw.e(bArr, "Source byte array");
        this.d = bArr;
        this.e = bArr.length;
    }

    @Override // defpackage.ajqb
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ajqb
    public final java.io.InputStream b() {
        return new java.io.ByteArrayInputStream(this.d, 0, this.e);
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    @Override // defpackage.ajqb
    public final void f(java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.write(this.d, 0, this.e);
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
