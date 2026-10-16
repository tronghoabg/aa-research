package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class abmq extends abmp {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public abmq(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.abms
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.abms
    public final byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.abms
    protected final int c(int i, int i2, int i3) {
        return aboi.a(i, this.a, i2, i3);
    }

    @Override // defpackage.abms
    public final int d() {
        return this.a.length;
    }

    @Override // defpackage.abms
    public final abms e(int i, int i2) {
        int iF = a.F(i, i2, d());
        return iF == 0 ? abms.d : new abmn(this.a, i, iF);
    }

    @Override // defpackage.abms
    public final abms f(int i, int i2) {
        int iF = a.F(i, i2, d());
        return iF == 0 ? abms.d : new abmn(this.a, i, iF);
    }

    @Override // defpackage.abms
    public final abmw g() {
        return abmw.P(this.a, 0, d());
    }

    @Override // defpackage.abms
    public final InputStream h() {
        return new ByteArrayInputStream(this.a, 0, d());
    }

    @Override // defpackage.abms
    protected final String i(Charset charset) {
        return new String(this.a, charset);
    }

    @Override // defpackage.abms
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    @Override // defpackage.abms
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.abms
    public final void l(abmk abmkVar) throws IOException {
        abmkVar.a(this.a, 0, d());
    }

    @Override // defpackage.abms
    public final void m(OutputStream outputStream) throws IOException {
        outputStream.write(D());
    }

    @Override // defpackage.abms
    protected final boolean n(abms abmsVar) {
        return abmsVar instanceof abmq ? Arrays.equals(this.a, ((abmq) abmsVar).a) : abmsVar instanceof abmn ? o(abmsVar, 0, d()) : abmsVar.n(this);
    }

    @Override // defpackage.abmp
    public final boolean o(abms abmsVar, int i, int i2) {
        if (i2 > abmsVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 <= abmsVar.d()) {
            if (abmsVar instanceof abmq) {
                return abms.C(this.a, 0, ((abmq) abmsVar).a, i, i2);
            }
            if (!(abmsVar instanceof abmn)) {
                return abmsVar.f(i, i3).equals(f(0, i2));
            }
            abmn abmnVar = (abmn) abmsVar;
            byte[] bArr = this.a;
            int i4 = abmn.c;
            return abms.C(bArr, 0, abmnVar.a, abmnVar.b + i, i2);
        }
        throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abmsVar.d());
    }
}
