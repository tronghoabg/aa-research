package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
final class abna extends abnd {
    private final ByteBuffer b;
    private final ByteBuffer c;

    public abna(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        this.c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
    }

    private final void z(String str) throws IOException {
        try {
            ByteBuffer byteBuffer = this.c;
            if (!byteBuffer.hasArray()) {
                woy.dX(str, byteBuffer);
            } else {
                int iArrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(woy.dW(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new abnb(e);
        }
    }

    @Override // defpackage.abmk
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        e(bArr, i, i2);
    }

    @Override // defpackage.abnd
    public final int b() {
        return this.c.remaining();
    }

    @Override // defpackage.abnd
    public final void c() {
        this.b.position(this.c.position());
    }

    @Override // defpackage.abnd
    public final void d(byte b) throws IOException {
        try {
            this.c.put(b);
        } catch (BufferOverflowException e) {
            ByteBuffer byteBuffer = this.c;
            throw new abnb(byteBuffer.position(), byteBuffer.limit(), 1, e);
        }
    }

    public final void e(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.c.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new abnb(e);
        } catch (BufferOverflowException e2) {
            throw new abnb(e2);
        }
    }

    @Override // defpackage.abnd
    public final void f(int i, boolean z) throws IOException {
        v(i << 3);
        d(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.abnd
    public final void g(int i, abms abmsVar) throws IOException {
        v((i << 3) | 2);
        h(abmsVar);
    }

    @Override // defpackage.abnd
    public final void h(abms abmsVar) throws IOException {
        v(abmsVar.d());
        abmsVar.l(this);
    }

    @Override // defpackage.abnd
    public final void i(int i, int i2) throws IOException {
        v((i << 3) | 5);
        j(i2);
    }

    @Override // defpackage.abnd
    public final void j(int i) throws IOException {
        try {
            this.c.putInt(i);
        } catch (BufferOverflowException e) {
            ByteBuffer byteBuffer = this.c;
            throw new abnb(byteBuffer.position(), byteBuffer.limit(), 4, e);
        }
    }

    @Override // defpackage.abnd
    public final void k(int i, long j) throws IOException {
        v((i << 3) | 1);
        l(j);
    }

    @Override // defpackage.abnd
    public final void l(long j) throws IOException {
        try {
            this.c.putLong(j);
        } catch (BufferOverflowException e) {
            ByteBuffer byteBuffer = this.c;
            throw new abnb(byteBuffer.position(), byteBuffer.limit(), 8, e);
        }
    }

    @Override // defpackage.abnd
    public final void m(int i, int i2) throws IOException {
        v(i << 3);
        n(i2);
    }

    @Override // defpackage.abnd
    public final void n(int i) throws IOException {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // defpackage.abnd
    public final void o(abow abowVar) throws IOException {
        v(abowVar.m());
        abowVar.R(this);
    }

    @Override // defpackage.abnd
    public final void p(int i, abow abowVar) throws IOException {
        v(11);
        u(2, i);
        v(26);
        o(abowVar);
        v(12);
    }

    @Override // defpackage.abnd
    public final void q(int i, abms abmsVar) throws IOException {
        v(11);
        u(2, i);
        g(3, abmsVar);
        v(12);
    }

    @Override // defpackage.abnd
    public final void r(int i, String str) throws IOException {
        v((i << 3) | 2);
        s(str);
    }

    @Override // defpackage.abnd
    public final void s(String str) throws IOException {
        ByteBuffer byteBuffer = this.c;
        int iPosition = byteBuffer.position();
        try {
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(str.length() * 3) * 9;
            int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != ((352 - iNumberOfLeadingZeros) >>> 6)) {
                v(woy.dV(str));
                z(str);
                return;
            }
            int iPosition2 = byteBuffer.position() + iNumberOfLeadingZeros2;
            byteBuffer.position(iPosition2);
            z(str);
            int iPosition3 = byteBuffer.position();
            byteBuffer.position(iPosition);
            v(iPosition3 - iPosition2);
            byteBuffer.position(iPosition3);
        } catch (IllegalArgumentException e) {
            throw new abnb(e);
        }
    }

    @Override // defpackage.abnd
    public final void t(int i, int i2) throws IOException {
        v((i << 3) | i2);
    }

    @Override // defpackage.abnd
    public final void u(int i, int i2) throws IOException {
        v(i << 3);
        v(i2);
    }

    @Override // defpackage.abnd
    public final void v(int i) throws IOException {
        while (true) {
            int i2 = i & (-128);
            ByteBuffer byteBuffer = this.c;
            if (i2 == 0) {
                byteBuffer.put((byte) i);
                return;
            }
            try {
                byteBuffer.put((byte) (i | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new abnb(e);
            }
            throw new abnb(e);
        }
    }

    @Override // defpackage.abnd
    public final void w(int i, long j) throws IOException {
        v(i << 3);
        x(j);
    }

    @Override // defpackage.abnd
    public final void x(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            ByteBuffer byteBuffer = this.c;
            if (j2 == 0) {
                byteBuffer.put((byte) j);
                return;
            }
            try {
                byteBuffer.put((byte) (((int) j) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new abnb(e);
            }
            throw new abnb(e);
        }
    }

    @Override // defpackage.abnd
    public final void y(byte[] bArr, int i) throws IOException {
        v(i);
        e(bArr, 0, i);
    }
}
