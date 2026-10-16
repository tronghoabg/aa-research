package com.pgl.ssdk;

import Va.M6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public class d {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f32588a;

        /* renamed from: b, reason: collision with root package name */
        private final q f32589b;

        public a(long j8, q qVar) {
            this.f32588a = j8;
            this.f32589b = qVar;
        }

        public q a() {
            return this.f32589b;
        }

        public long b() {
            return this.f32588a;
        }
    }

    public static a a(q qVar, t tVar) throws b {
        long jA = tVar.a();
        long jC = tVar.c() + jA;
        long jE = tVar.e();
        if (jC != jE) {
            StringBuilder sbU = M6.u(jC, "ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", ", EoCD start: ");
            sbU.append(jE);
            throw new b(sbU.toString());
        }
        if (jA < 32) {
            throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
        }
        ByteBuffer byteBufferA = qVar.a(jA - 24, 24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferA.order(byteOrder);
        if (byteBufferA.getLong(8) != 2334950737559900225L || byteBufferA.getLong(16) != 3617552046287187010L) {
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        long j8 = byteBufferA.getLong(0);
        if (j8 < byteBufferA.capacity() || j8 > 2147483639) {
            throw new b("APK Signing Block size out of range: ".concat(String.valueOf(j8)));
        }
        long j10 = (int) (8 + j8);
        long j11 = jA - j10;
        if (j11 < 0) {
            throw new b("APK Signing Block offset out of range: ".concat(String.valueOf(j11)));
        }
        ByteBuffer byteBufferA2 = qVar.a(j11, 8);
        byteBufferA2.order(byteOrder);
        long j12 = byteBufferA2.getLong(0);
        if (j12 == j8) {
            return new a(j11, qVar.a(j11, j10));
        }
        StringBuilder sbU2 = M6.u(j12, "APK Signing Block sizes in header and footer do not match: ", " vs ");
        sbU2.append(j8);
        throw new b(sbU2.toString());
    }

    public static t a(q qVar) throws s {
        o<ByteBuffer, Long> oVarA = p.a(qVar);
        if (oVarA == null) {
            throw new s("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = oVarA.a();
        long jLongValue = oVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = p.c(byteBufferA);
        if (jC > jLongValue) {
            StringBuilder sbU = M6.u(jC, "ZIP Central Directory start offset out of range: ", ". ZIP End of Central Directory offset: ");
            sbU.append(jLongValue);
            throw new s(sbU.toString());
        }
        long jD = p.d(byteBufferA);
        long j8 = jC + jD;
        if (j8 <= jLongValue) {
            return new t(jC, jD, p.e(byteBufferA), jLongValue, byteBufferA);
        }
        StringBuilder sbU2 = M6.u(j8, "ZIP Central Directory overlaps with End of Central Directory. CD end: ", ", EoCD start: ");
        sbU2.append(jLongValue);
        throw new s(sbU2.toString());
    }
}
