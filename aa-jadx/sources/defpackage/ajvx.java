package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajvx extends defpackage.ajwa {
    private final byte[] a;

    public ajvx(defpackage.ajqb ajqbVar) throws java.io.IOException {
        byte[] byteArray;
        super(ajqbVar);
        if (!ajqbVar.h() || ajqbVar.a() < 0) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            ajqbVar.f(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArray = null;
        }
        this.a = byteArray;
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final long a() {
        byte[] bArr = this.a;
        return bArr != null ? bArr.length : super.a();
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final java.io.InputStream b() throws java.io.IOException {
        byte[] bArr = this.a;
        return bArr != null ? new java.io.ByteArrayInputStream(bArr) : super.b();
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final void f(java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = this.a;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.f(outputStream);
        }
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final boolean g() {
        return this.a == null && super.g();
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final boolean i() {
        return this.a == null && super.i();
    }
}
