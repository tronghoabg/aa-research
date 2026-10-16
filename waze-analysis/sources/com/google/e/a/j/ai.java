package com.google.e.a.j;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    final ByteBuffer f8685a;

    /* renamed from: b, reason: collision with root package name */
    final ByteBuffer f8686b;

    /* renamed from: c, reason: collision with root package name */
    boolean f8687c;

    /* renamed from: d, reason: collision with root package name */
    private final ag f8688d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8689e;

    public ai(z zVar, OutputStream outputStream, byte[] bArr) throws IOException {
        super(outputStream);
        ag agVarK = zVar.k(bArr);
        this.f8688d = agVarK;
        int iH = zVar.h();
        this.f8689e = iH;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iH);
        this.f8685a = byteBufferAllocate;
        this.f8686b = ByteBuffer.allocate(zVar.f());
        byteBufferAllocate.limit(iH - zVar.e());
        ByteBuffer byteBufferA = agVarK.a();
        byte[] bArr2 = new byte[byteBufferA.remaining()];
        byteBufferA.get(bArr2);
        this.out.write(bArr2);
        this.f8687c = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f8687c) {
            try {
                ByteBuffer byteBuffer = this.f8685a;
                byteBuffer.flip();
                ByteBuffer byteBuffer2 = this.f8686b;
                byteBuffer2.clear();
                this.f8688d.c(byteBuffer, byteBuffer2);
                ByteBuffer byteBuffer3 = this.f8686b;
                byteBuffer3.flip();
                this.out.write(byteBuffer3.array(), byteBuffer3.position(), byteBuffer3.remaining());
                this.f8687c = false;
                super.close();
            } catch (GeneralSecurityException e2) {
                ByteBuffer byteBuffer4 = this.f8685a;
                ByteBuffer byteBuffer5 = this.f8686b;
                throw new IOException("ptBuffer.remaining():" + byteBuffer4.remaining() + " ctBuffer.remaining():" + byteBuffer5.remaining(), e2);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        if (!this.f8687c) {
            throw new IOException("Trying to write to closed stream");
        }
        while (true) {
            ByteBuffer byteBuffer = this.f8685a;
            if (i3 > byteBuffer.remaining()) {
                int iRemaining = byteBuffer.remaining();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, iRemaining);
                i2 += iRemaining;
                i3 -= iRemaining;
                try {
                    byteBuffer.flip();
                    ByteBuffer byteBuffer2 = this.f8686b;
                    byteBuffer2.clear();
                    this.f8688d.b(byteBuffer, byteBufferWrap, byteBuffer2);
                    byteBuffer2.flip();
                    this.out.write(byteBuffer2.array(), byteBuffer2.position(), byteBuffer2.remaining());
                    byteBuffer.clear();
                    byteBuffer.limit(this.f8689e);
                } catch (GeneralSecurityException e2) {
                    throw new IOException(e2);
                }
            } else {
                this.f8685a.put(bArr, i2, i3);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i2) {
        write(new byte[]{(byte) i2});
    }
}
