package pd;

import A7.AbstractC0279p0;
import cg.AbstractC1613b;
import cg.C1611C;
import cg.C1618g;
import cg.D;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3340k;
import od.AbstractC3674c;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes5.dex */
public final class q extends AbstractC3674c {

    /* renamed from: a, reason: collision with root package name */
    public final C1618g f43598a;

    public q(C1618g c1618g) {
        this.f43598a = c1618g;
    }

    @Override // od.AbstractC3674c
    public final void D(int i5) {
        try {
            this.f43598a.skip(i5);
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // od.AbstractC3674c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43598a.a();
    }

    @Override // od.AbstractC3674c
    public final AbstractC3674c h(int i5) {
        C1618g c1618g = new C1618g();
        c1618g.E(this.f43598a, i5);
        return new q(c1618g);
    }

    @Override // od.AbstractC3674c
    public final void i(int i5, int i10, byte[] bArr) {
        while (i10 > 0) {
            int i11 = this.f43598a.read(bArr, i5, i10);
            if (i11 == -1) {
                throw new IndexOutOfBoundsException(AbstractC0279p0.i(i10, "EOF trying to read ", " bytes"));
            }
            i10 -= i11;
            i5 += i11;
        }
    }

    @Override // od.AbstractC3674c
    public final void o(OutputStream out, int i5) throws IOException {
        long j8 = i5;
        C1618g c1618g = this.f43598a;
        c1618g.getClass();
        AbstractC3340k.e(out, "out");
        AbstractC1613b.f(c1618g.f19902b, 0L, j8);
        C1611C c1611c = c1618g.f19901a;
        while (j8 > 0) {
            AbstractC3340k.b(c1611c);
            int iMin = (int) Math.min(j8, c1611c.f19868c - c1611c.f19867b);
            out.write(c1611c.f19866a, c1611c.f19867b, iMin);
            int i10 = c1611c.f19867b + iMin;
            c1611c.f19867b = i10;
            long j10 = iMin;
            c1618g.f19902b -= j10;
            j8 -= j10;
            if (i10 == c1611c.f19868c) {
                C1611C c1611cA = c1611c.a();
                c1618g.f19901a = c1611cA;
                D.a(c1611c);
                c1611c = c1611cA;
            }
        }
    }

    @Override // od.AbstractC3674c
    public final void w(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // od.AbstractC3674c
    public final int y() {
        try {
            return this.f43598a.readByte() & ForkServer.ERROR;
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // od.AbstractC3674c
    public final int z() {
        return (int) this.f43598a.f19902b;
    }
}
