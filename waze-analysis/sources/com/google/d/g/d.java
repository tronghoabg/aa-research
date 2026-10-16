package com.google.d.g;

import com.google.d.b.an;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class d extends c {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f7876a;

    protected d() {
        an.l(true);
        this.f7876a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void h() {
        ByteBuffer byteBuffer = this.f7876a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            f(byteBuffer);
        }
        byteBuffer.compact();
    }

    private final void i() {
        if (this.f7876a.remaining() < 8) {
            h();
        }
    }

    @Override // com.google.d.g.h
    public final void a() {
        this.f7876a.put((byte) 0);
        i();
    }

    @Override // com.google.d.g.c
    public final void c(byte[] bArr, int i2) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i2).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f7876a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            i();
            return;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i3 = 0; i3 < iPosition; i3++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        h();
        while (byteBufferOrder.remaining() >= 16) {
            f(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
    }

    protected abstract f e();

    protected abstract void f(ByteBuffer byteBuffer);

    protected void g(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // com.google.d.g.h
    public final f k() {
        h();
        ByteBuffer byteBuffer = this.f7876a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            g(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return e();
    }
}
