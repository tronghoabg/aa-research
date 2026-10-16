package com.pgl.ssdk;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public abstract class p {
    public static int a(ByteBuffer byteBuffer, int i5) {
        return byteBuffer.getShort(i5) & 65535;
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i5 = iCapacity - 22;
        int iMin = Math.min(i5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        for (int i10 = 0; i10 <= iMin; i10++) {
            int i11 = i5 - i10;
            if (byteBuffer.getInt(i11) == 101010256 && a(byteBuffer, i11 + 20) == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 16);
    }

    public static long d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 12);
    }

    public static int e(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 10);
    }

    public static o<ByteBuffer, Long> a(q qVar) {
        if (qVar.a() < 22) {
            return null;
        }
        o<ByteBuffer, Long> oVarA = a(qVar, 0);
        return oVarA != null ? oVarA : a(qVar, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    public static long b(ByteBuffer byteBuffer, int i5) {
        return byteBuffer.getInt(i5) & 4294967295L;
    }

    private static o<ByteBuffer, Long> a(q qVar, int i5) {
        if (i5 < 0 || i5 > 65535) {
            throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i5)));
        }
        long jA = qVar.a();
        if (jA < 22) {
            return null;
        }
        int iMin = ((int) Math.min(i5, jA - 22)) + 22;
        long j8 = jA - iMin;
        ByteBuffer byteBufferA = qVar.a(j8, iMin);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferA.order(byteOrder);
        int iB = b(byteBufferA);
        if (iB == -1) {
            return null;
        }
        byteBufferA.position(iB);
        ByteBuffer byteBufferSlice = byteBufferA.slice();
        byteBufferSlice.order(byteOrder);
        return o.a(byteBufferSlice, Long.valueOf(j8 + iB));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
