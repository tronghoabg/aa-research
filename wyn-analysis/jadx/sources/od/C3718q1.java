package od;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import org.apache.tika.fork.ForkServer;

/* renamed from: od.q1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3718q1 extends AbstractC3674c {

    /* renamed from: a, reason: collision with root package name */
    public int f42076a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42077b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f42078c;

    /* renamed from: d, reason: collision with root package name */
    public int f42079d = -1;

    public C3718q1(byte[] bArr, int i5, int i10) {
        Fe.e.p("offset must be >= 0", i5 >= 0);
        Fe.e.p("length must be >= 0", i10 >= 0);
        int i11 = i10 + i5;
        Fe.e.p("offset + length exceeds array boundary", i11 <= bArr.length);
        this.f42078c = bArr;
        this.f42076a = i5;
        this.f42077b = i11;
    }

    @Override // od.AbstractC3674c
    public final void B() {
        int i5 = this.f42079d;
        if (i5 == -1) {
            throw new InvalidMarkException();
        }
        this.f42076a = i5;
    }

    @Override // od.AbstractC3674c
    public final void D(int i5) {
        a(i5);
        this.f42076a += i5;
    }

    @Override // od.AbstractC3674c
    public final void b() {
        this.f42079d = this.f42076a;
    }

    @Override // od.AbstractC3674c
    public final AbstractC3674c h(int i5) {
        a(i5);
        int i10 = this.f42076a;
        this.f42076a = i10 + i5;
        return new C3718q1(this.f42078c, i10, i5);
    }

    @Override // od.AbstractC3674c
    public final void i(int i5, int i10, byte[] bArr) {
        System.arraycopy(this.f42078c, this.f42076a, bArr, i5, i10);
        this.f42076a += i10;
    }

    @Override // od.AbstractC3674c
    public final void o(OutputStream outputStream, int i5) throws IOException {
        a(i5);
        outputStream.write(this.f42078c, this.f42076a, i5);
        this.f42076a += i5;
    }

    @Override // od.AbstractC3674c
    public final void w(ByteBuffer byteBuffer) {
        Fe.e.t(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.f42078c, this.f42076a, iRemaining);
        this.f42076a += iRemaining;
    }

    @Override // od.AbstractC3674c
    public final int y() {
        a(1);
        int i5 = this.f42076a;
        this.f42076a = i5 + 1;
        return this.f42078c[i5] & ForkServer.ERROR;
    }

    @Override // od.AbstractC3674c
    public final int z() {
        return this.f42077b - this.f42076a;
    }
}
