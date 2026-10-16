package com.google.e.a.j;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f8673a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteBuffer f8674b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8675c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8676d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8677e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8678f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8679g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f8680h;

    /* renamed from: i, reason: collision with root package name */
    private int f8681i;

    /* renamed from: j, reason: collision with root package name */
    private final af f8682j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8683k;

    /* renamed from: l, reason: collision with root package name */
    private final int f8684l;

    public ah(z zVar, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f8682j = zVar.j();
        this.f8675c = zVar.g();
        this.f8680h = Arrays.copyOf(bArr, bArr.length);
        int iF = zVar.f();
        this.f8683k = iF;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iF + 1);
        this.f8673a = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.f8684l = iF - zVar.e();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(zVar.h() + 16);
        this.f8674b = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.f8676d = false;
        this.f8677e = false;
        this.f8678f = false;
        this.f8681i = 0;
        this.f8679g = false;
    }

    private final void a() throws IOException {
        byte b2;
        while (!this.f8677e) {
            ByteBuffer byteBuffer = this.f8673a;
            if (byteBuffer.remaining() <= 0) {
                break;
            }
            int i2 = this.in.read(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            if (i2 > 0) {
                byteBuffer.position(byteBuffer.position() + i2);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IOException("Unexpected return value from in.read");
                    }
                    throw new IOException("Could not read bytes from the ciphertext stream");
                }
                this.f8677e = true;
            }
        }
        if (this.f8677e) {
            b2 = 0;
        } else {
            ByteBuffer byteBuffer2 = this.f8673a;
            b2 = byteBuffer2.get(byteBuffer2.position() - 1);
            byteBuffer2.position(byteBuffer2.position() - 1);
        }
        ByteBuffer byteBuffer3 = this.f8673a;
        byteBuffer3.flip();
        ByteBuffer byteBuffer4 = this.f8674b;
        byteBuffer4.clear();
        try {
            this.f8682j.a(byteBuffer3, this.f8681i, this.f8677e, byteBuffer4);
            this.f8681i++;
            this.f8674b.flip();
            ByteBuffer byteBuffer5 = this.f8673a;
            byteBuffer5.clear();
            if (this.f8677e) {
                return;
            }
            byteBuffer5.clear();
            byteBuffer5.limit(this.f8683k + 1);
            byteBuffer5.put(b2);
        } catch (GeneralSecurityException e2) {
            c();
            throw new IOException(e2.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.f8681i + " endOfCiphertext:" + this.f8677e, e2);
        }
    }

    private final void b() throws IOException {
        if (this.f8676d) {
            c();
            throw new IOException("Decryption failed.");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f8675c);
        while (byteBufferAllocate.remaining() > 0) {
            int i2 = this.in.read(byteBufferAllocate.array(), byteBufferAllocate.position(), byteBufferAllocate.remaining());
            if (i2 < 0) {
                c();
                throw new IOException("Ciphertext is too short");
            }
            if (i2 == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
            byteBufferAllocate.position(byteBufferAllocate.position() + i2);
        }
        byteBufferAllocate.flip();
        try {
            this.f8682j.b(byteBufferAllocate, this.f8680h);
            this.f8676d = true;
        } catch (GeneralSecurityException e2) {
            throw new IOException(e2);
        }
    }

    private final void c() {
        this.f8679g = true;
        this.f8674b.limit(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.f8674b.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i2, int i3) {
        if (this.f8679g) {
            throw new IOException("Decryption failed.");
        }
        if (!this.f8676d) {
            b();
            ByteBuffer byteBuffer = this.f8673a;
            byteBuffer.clear();
            byteBuffer.limit(this.f8684l + 1);
        }
        if (this.f8678f) {
            return -1;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            ByteBuffer byteBuffer2 = this.f8674b;
            if (byteBuffer2.remaining() == 0) {
                if (this.f8677e) {
                    this.f8678f = true;
                    break;
                }
                a();
            }
            int iMin = Math.min(byteBuffer2.remaining(), i3 - i4);
            byteBuffer2.get(bArr, i4 + i2, iMin);
            i4 += iMin;
        }
        if (i4 == 0 && this.f8678f) {
            return -1;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        int i2;
        if (j2 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(this.f8683k, j2);
        byte[] bArr = new byte[iMin];
        long j3 = j2;
        while (j3 > 0 && (i2 = read(bArr, 0, (int) Math.min(iMin, j3))) > 0) {
            j3 -= i2;
        }
        return j2 - j3;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder("StreamingAeadDecryptingStream\nsegmentNr:");
        sb.append(this.f8681i);
        sb.append("\nciphertextSegmentSize:");
        sb.append(this.f8683k);
        sb.append("\nheaderRead:");
        sb.append(this.f8676d);
        sb.append("\nendOfCiphertext:");
        sb.append(this.f8677e);
        sb.append("\nendOfPlaintext:");
        sb.append(this.f8678f);
        sb.append("\ndecryptionErrorOccured:");
        sb.append(this.f8679g);
        sb.append("\nciphertextSgement position:");
        ByteBuffer byteBuffer = this.f8673a;
        sb.append(byteBuffer.position());
        sb.append(" limit:");
        sb.append(byteBuffer.limit());
        sb.append("\nplaintextSegment position:");
        ByteBuffer byteBuffer2 = this.f8674b;
        sb.append(byteBuffer2.position());
        sb.append(" limit:");
        sb.append(byteBuffer2.limit());
        return sb.toString();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i2 = read(bArr, 0, 1);
        if (i2 == 1) {
            return bArr[0] & 255;
        }
        if (i2 == -1) {
            return -1;
        }
        throw new IOException("Reading failed");
    }
}
