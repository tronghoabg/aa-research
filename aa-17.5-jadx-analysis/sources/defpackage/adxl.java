package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class adxl extends adri {
    final ByteBuffer a;

    public adxl(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.adri, defpackage.adxi
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.adri, defpackage.adxi
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.adri, defpackage.adxi
    public final boolean d() {
        return true;
    }

    @Override // defpackage.adxi
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.adxi
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.adxi
    public final /* bridge */ /* synthetic */ adxi g(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBuffer.position() + i);
        byteBuffer.position(byteBuffer.position() + i);
        return new adxl(byteBufferDuplicate);
    }

    @Override // defpackage.adxi
    public final void i(OutputStream outputStream, int i) throws IOException {
        a(i);
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // defpackage.adxi
    public final void j(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.adxi
    public final void k(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
