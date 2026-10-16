package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
final class abmn extends abmp {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int e;

    public abmn(byte[] bArr, int i, int i2) {
        a.F(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.abms
    public final byte a(int i) {
        a.G(i, this.e);
        return this.a[this.b + i];
    }

    @Override // defpackage.abms
    public final byte b(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.abms
    protected final int c(int i, int i2, int i3) {
        return aboi.a(i, this.a, this.b + i2, i3);
    }

    @Override // defpackage.abms
    public final int d() {
        return this.e;
    }

    @Override // defpackage.abms
    public final abms e(int i, int i2) {
        int iF = a.F(i, i2, this.e);
        return iF == 0 ? abms.d : new abmn(this.a, this.b + i, iF);
    }

    @Override // defpackage.abms
    public final abms f(int i, int i2) {
        int iF = a.F(i, i2, this.e);
        return iF == 0 ? abms.d : new abmn(this.a, this.b + i, iF);
    }

    @Override // defpackage.abms
    public final abmw g() {
        return abmw.P(this.a, this.b, this.e);
    }

    @Override // defpackage.abms
    public final InputStream h() {
        return new ByteArrayInputStream(this.a, this.b, this.e);
    }

    @Override // defpackage.abms
    protected final String i(Charset charset) {
        return new String(this.a, this.b, this.e, charset);
    }

    @Override // defpackage.abms
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.a, this.b, this.e).asReadOnlyBuffer();
    }

    @Override // defpackage.abms
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.b + i, bArr, i2, i3);
    }

    @Override // defpackage.abms
    public final void l(abmk abmkVar) throws IOException {
        abmkVar.a(this.a, this.b, this.e);
    }

    @Override // defpackage.abms
    public final void m(OutputStream outputStream) throws IOException {
        outputStream.write(D());
    }

    @Override // defpackage.abms
    protected final boolean n(abms abmsVar) {
        return ((abmsVar instanceof abmq) || (abmsVar instanceof abmn)) ? o(abmsVar, 0, this.e) : abmsVar.n(this);
    }

    @Override // defpackage.abmp
    public final boolean o(abms abmsVar, int i, int i2) {
        if (i2 > abmsVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + this.e);
        }
        int i3 = i + i2;
        if (i3 > abmsVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abmsVar.d());
        }
        if (abmsVar instanceof abmq) {
            byte[] bArr = this.a;
            int i4 = this.b;
            int i5 = abmq.b;
            return abms.C(bArr, i4, ((abmq) abmsVar).a, i, i2);
        }
        if (abmsVar instanceof abmn) {
            abmn abmnVar = (abmn) abmsVar;
            return abms.C(this.a, this.b, abmnVar.a, abmnVar.b + i, i2);
        }
        abms abmsVarF = abmsVar.f(i, i3);
        int i6 = this.b;
        return abmsVarF.equals(f(i6, i2 + i6));
    }

    Object writeReplace() {
        return abms.y(D());
    }
}
