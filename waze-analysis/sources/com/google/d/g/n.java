package com.google.d.g;

import com.google.d.d.fo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends d {

    /* renamed from: a, reason: collision with root package name */
    private long f7892a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f7893b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f7894c = 0;

    n() {
    }

    private static long h(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return j4 ^ (j4 >>> 33);
    }

    private static long i(long j2) {
        return Long.rotateLeft(j2 * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long j(long j2) {
        return Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // com.google.d.g.d
    protected final f e() {
        long j2 = this.f7892a;
        long j3 = this.f7894c;
        long j4 = j2 ^ j3;
        long j5 = j3 ^ this.f7893b;
        long j6 = j4 + j5;
        this.f7892a = j6;
        long j7 = j5 + j6;
        this.f7893b = j7;
        long jH = h(j6);
        this.f7892a = jH;
        long jH2 = h(j7);
        long j8 = jH + jH2;
        this.f7892a = j8;
        this.f7893b = jH2 + j8;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f7892a).putLong(this.f7893b).array();
        int i2 = f.f7879b;
        return new e(bArrArray);
    }

    @Override // com.google.d.g.d
    protected final void f(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getLong();
        long j3 = byteBuffer.getLong();
        long jI = i(j2) ^ this.f7892a;
        this.f7892a = jI;
        long jRotateLeft = Long.rotateLeft(jI, 27);
        long j4 = this.f7893b;
        this.f7892a = ((jRotateLeft + j4) * 5) + 1390208809;
        long j5 = j(j3) ^ j4;
        this.f7893b = j5;
        this.f7893b = ((Long.rotateLeft(j5, 31) + this.f7892a) * 5) + 944331445;
        this.f7894c += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.d.g.d
    protected final void g(ByteBuffer byteBuffer) {
        long jK;
        long jK2;
        long jK3;
        long jK4;
        long jK5;
        long jK6;
        long jK7;
        this.f7894c += byteBuffer.remaining();
        long jK8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                jK = 0;
                jK7 = jK ^ fo.k(byteBuffer.get(0));
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 2:
                jK2 = 0;
                jK = jK2 ^ (fo.k(byteBuffer.get(1)) << 8);
                jK7 = jK ^ fo.k(byteBuffer.get(0));
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 3:
                jK3 = 0;
                jK2 = jK3 ^ (fo.k(byteBuffer.get(2)) << 16);
                jK = jK2 ^ (fo.k(byteBuffer.get(1)) << 8);
                jK7 = jK ^ fo.k(byteBuffer.get(0));
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 4:
                jK4 = 0;
                jK3 = jK4 ^ (fo.k(byteBuffer.get(3)) << 24);
                jK2 = jK3 ^ (fo.k(byteBuffer.get(2)) << 16);
                jK = jK2 ^ (fo.k(byteBuffer.get(1)) << 8);
                jK7 = jK ^ fo.k(byteBuffer.get(0));
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 5:
                jK5 = 0;
                jK4 = jK5 ^ (fo.k(byteBuffer.get(4)) << 32);
                jK3 = jK4 ^ (fo.k(byteBuffer.get(3)) << 24);
                jK2 = jK3 ^ (fo.k(byteBuffer.get(2)) << 16);
                jK = jK2 ^ (fo.k(byteBuffer.get(1)) << 8);
                jK7 = jK ^ fo.k(byteBuffer.get(0));
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 6:
                jK6 = 0;
                jK5 = (fo.k(byteBuffer.get(5)) << 40) ^ jK6;
                jK4 = jK5 ^ (fo.k(byteBuffer.get(4)) << 32);
                jK3 = jK4 ^ (fo.k(byteBuffer.get(3)) << 24);
                jK2 = jK3 ^ (fo.k(byteBuffer.get(2)) << 16);
                jK = jK2 ^ (fo.k(byteBuffer.get(1)) << 8);
                jK7 = jK ^ fo.k(byteBuffer.get(0));
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 7:
                jK6 = fo.k(byteBuffer.get(6)) << 48;
                jK5 = (fo.k(byteBuffer.get(5)) << 40) ^ jK6;
                jK4 = jK5 ^ (fo.k(byteBuffer.get(4)) << 32);
                jK3 = jK4 ^ (fo.k(byteBuffer.get(3)) << 24);
                jK2 = jK3 ^ (fo.k(byteBuffer.get(2)) << 16);
                jK = jK2 ^ (fo.k(byteBuffer.get(1)) << 8);
                jK7 = jK ^ fo.k(byteBuffer.get(0));
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 8:
                jK7 = byteBuffer.getLong();
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 9:
                jK8 ^= fo.k(byteBuffer.get(8));
                jK7 = byteBuffer.getLong();
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 10:
                jK8 ^= fo.k(byteBuffer.get(9)) << 8;
                jK8 ^= fo.k(byteBuffer.get(8));
                jK7 = byteBuffer.getLong();
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 11:
                jK8 ^= fo.k(byteBuffer.get(10)) << 16;
                jK8 ^= fo.k(byteBuffer.get(9)) << 8;
                jK8 ^= fo.k(byteBuffer.get(8));
                jK7 = byteBuffer.getLong();
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 12:
                jK8 ^= fo.k(byteBuffer.get(11)) << 24;
                jK8 ^= fo.k(byteBuffer.get(10)) << 16;
                jK8 ^= fo.k(byteBuffer.get(9)) << 8;
                jK8 ^= fo.k(byteBuffer.get(8));
                jK7 = byteBuffer.getLong();
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 13:
                jK8 ^= fo.k(byteBuffer.get(12)) << 32;
                jK8 ^= fo.k(byteBuffer.get(11)) << 24;
                jK8 ^= fo.k(byteBuffer.get(10)) << 16;
                jK8 ^= fo.k(byteBuffer.get(9)) << 8;
                jK8 ^= fo.k(byteBuffer.get(8));
                jK7 = byteBuffer.getLong();
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 14:
                jK8 ^= fo.k(byteBuffer.get(13)) << 40;
                jK8 ^= fo.k(byteBuffer.get(12)) << 32;
                jK8 ^= fo.k(byteBuffer.get(11)) << 24;
                jK8 ^= fo.k(byteBuffer.get(10)) << 16;
                jK8 ^= fo.k(byteBuffer.get(9)) << 8;
                jK8 ^= fo.k(byteBuffer.get(8));
                jK7 = byteBuffer.getLong();
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            case 15:
                jK8 = fo.k(byteBuffer.get(14)) << 48;
                jK8 ^= fo.k(byteBuffer.get(13)) << 40;
                jK8 ^= fo.k(byteBuffer.get(12)) << 32;
                jK8 ^= fo.k(byteBuffer.get(11)) << 24;
                jK8 ^= fo.k(byteBuffer.get(10)) << 16;
                jK8 ^= fo.k(byteBuffer.get(9)) << 8;
                jK8 ^= fo.k(byteBuffer.get(8));
                jK7 = byteBuffer.getLong();
                this.f7892a = i(jK7) ^ this.f7892a;
                this.f7893b ^= j(jK8);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
