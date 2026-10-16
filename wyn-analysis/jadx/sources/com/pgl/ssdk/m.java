package com.pgl.ssdk;

import Va.M6;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public class m implements q {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f32600a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32601b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32602c;

    public m(FileChannel fileChannel, long j8, long j10) {
        if (j8 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j10)));
        }
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j10)));
        }
        this.f32600a = fileChannel;
        this.f32601b = j8;
        this.f32602c = j10;
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j8 = this.f32602c;
        if (j8 != -1) {
            return j8;
        }
        try {
            return this.f32600a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // com.pgl.ssdk.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j8, long j10) {
        long jA = a();
        a(j8, j10, jA);
        return (j8 == 0 && j10 == jA) ? this : new m(this.f32600a, this.f32601b + j8, j10);
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j8, int i5) {
        if (i5 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i5)));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i5);
        a(j8, i5, byteBufferAllocate);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public void a(long j8, int i5, ByteBuffer byteBuffer) {
        int i10;
        a(j8, i5, a());
        if (i5 == 0) {
            return;
        }
        if (i5 > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j10 = this.f32601b + j8;
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i5);
            while (i5 > 0) {
                synchronized (this.f32600a) {
                    this.f32600a.position(j10);
                    i10 = this.f32600a.read(byteBuffer);
                }
                j10 += i10;
                i5 -= i10;
            }
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static void a(long j8, long j10, long j11) {
        if (j8 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j8)));
        }
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j10)));
        }
        if (j8 > j11) {
            throw new IndexOutOfBoundsException(M6.s(M6.u(j8, "offset (", ") > source size ("), j11, ")"));
        }
        long j12 = j8 + j10;
        if (j12 < j8) {
            throw new IndexOutOfBoundsException(M6.s(M6.u(j8, "offset (", ") + size ("), j10, ") overflow"));
        }
        if (j12 <= j11) {
            return;
        }
        StringBuilder sbU = M6.u(j8, "offset (", ") + size (");
        sbU.append(j10);
        sbU.append(") > source size (");
        sbU.append(j11);
        sbU.append(")");
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
