package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class aebj extends adri {
    private final ajmy a;

    public aebj(ajmy ajmyVar) {
        this.a = ajmyVar;
    }

    @Override // defpackage.adri, defpackage.adxi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.a.y();
    }

    @Override // defpackage.adxi
    public final int e() {
        try {
            return this.a.d() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.adxi
    public final int f() {
        return (int) this.a.b;
    }

    @Override // defpackage.adxi
    public final adxi g(int i) {
        ajmy ajmyVar = new ajmy();
        ajmyVar.a(this.a, i);
        return new aebj(ajmyVar);
    }

    @Override // defpackage.adxi
    public final void i(OutputStream outputStream, int i) throws IOException {
        this.a.R(outputStream, i);
    }

    @Override // defpackage.adxi
    public final void j(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iE = this.a.e(bArr, i, i2);
            if (iE == -1) {
                throw new IndexOutOfBoundsException(a.bn(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= iE;
            i += iE;
        }
    }

    @Override // defpackage.adxi
    public final void k(int i) {
        try {
            this.a.A(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
