package com.pgl.ssdk;

import com.pgl.ssdk.d;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f32594a = "0123456789abcdef".toCharArray();

    public static i a(q qVar, t tVar, int i5) throws j {
        try {
            d.a aVarA = d.a(qVar, tVar);
            long jB = aVarA.b();
            q qVarA = aVarA.a();
            ByteBuffer byteBufferA = qVarA.a(0L, (int) qVarA.a());
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            return new i(a(byteBufferA, i5), jB, tVar.a(), tVar.e(), tVar.d());
        } catch (b e7) {
            throw new j(e7.getMessage(), e7);
        }
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) throws a {
        if (byteBuffer.remaining() < 4) {
            throw new a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i5 = byteBuffer.getInt();
        if (i5 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i5 <= byteBuffer.remaining()) {
            return b(byteBuffer, i5);
        }
        StringBuilder sbL = pd.f.l(i5, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
        sbL.append(byteBuffer.remaining());
        throw new a(sbL.toString());
    }

    public static byte[] c(ByteBuffer byteBuffer) throws a {
        int i5 = byteBuffer.getInt();
        if (i5 < 0) {
            throw new a("Negative length");
        }
        if (i5 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i5];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbL = pd.f.l(i5, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbL.append(byteBuffer.remaining());
        throw new a(sbL.toString());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i5) throws j {
        a(byteBuffer);
        ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i10 = 0;
        while (byteBufferA.hasRemaining()) {
            i10++;
            if (byteBufferA.remaining() < 8) {
                throw new j("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i10)));
            }
            long j8 = byteBufferA.getLong();
            if (j8 < 4 || j8 > 2147483647L) {
                throw new j("APK Signing Block entry #" + i10 + " size out of range: " + j8);
            }
            int i11 = (int) j8;
            int iPosition = byteBufferA.position() + i11;
            if (i11 > byteBufferA.remaining()) {
                StringBuilder sbH = R8.v.h("APK Signing Block entry #", i10, " size out of range: ", i11, ", available: ");
                sbH.append(byteBufferA.remaining());
                throw new j(sbH.toString());
            }
            if (byteBufferA.getInt() == i5) {
                return b(byteBufferA, i11 - 4);
            }
            byteBufferA.position(iPosition);
        }
        throw new j("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i5)));
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i5)));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i10 = i5 + iPosition;
        if (i10 < iPosition || i10 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i10);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i10);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i5, int i10) {
        if (i5 < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i5)));
        }
        if (i10 < i5) {
            throw new IllegalArgumentException(R8.v.e(i10, i5, "end < start: ", " < "));
        }
        int iCapacity = byteBuffer.capacity();
        if (i10 > byteBuffer.capacity()) {
            throw new IllegalArgumentException(R8.v.e(i10, iCapacity, "end > capacity: ", " > "));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i10);
            byteBuffer.position(i5);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
