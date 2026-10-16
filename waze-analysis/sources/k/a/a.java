package k.a;

import h.g.b.x;
import k.ai;
import k.aq;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f50743a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f50744b = aq.b("0123456789abcdef");

    /* renamed from: c, reason: collision with root package name */
    private static final long[] f50745c = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final /* synthetic */ int a(long j2) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j2)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j2 > f50745c[iNumberOfLeadingZeros] ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(k.h r16, k.z r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.a.a.b(k.h, k.z, boolean):int");
    }

    public static final String c(k.h hVar, long j2) {
        x.f(hVar, "<this>");
        if (j2 > 0) {
            long j3 = (-1) + j2;
            if (hVar.b(j3) == 13) {
                String strW = hVar.w(j3);
                hVar.Q(2L);
                return strW;
            }
        }
        String strW2 = hVar.w(j2);
        hVar.Q(1L);
        return strW2;
    }

    public static final byte[] d() {
        return f50744b;
    }

    public static final long e(k.h hVar, k.k kVar, long j2, long j3, int i2) {
        ai aiVar;
        int i3;
        long j4 = j2;
        long jQ = j3;
        x.f(hVar, "<this>");
        x.f(kVar, "bytes");
        long j5 = i2;
        okhttp3.internal.publicsuffix.a.g(kVar.d(), 0L, j5);
        if (i2 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long jQ2 = 0;
        if (j4 < 0) {
            throw new IllegalArgumentException("fromIndex < 0: " + j4);
        }
        if (j4 > jQ) {
            throw new IllegalArgumentException("fromIndex > toIndex: " + j4 + " > " + jQ);
        }
        if (jQ > hVar.q()) {
            jQ = hVar.q();
        }
        if (j4 == jQ || (aiVar = hVar.f50841a) == null) {
            return -1L;
        }
        if (hVar.q() - j4 < j4) {
            jQ2 = hVar.q();
            while (jQ2 > j4) {
                aiVar = aiVar.f50812g;
                x.c(aiVar);
                jQ2 -= aiVar.f50808c - aiVar.f50807b;
            }
            if (aiVar == null) {
                return -1L;
            }
            byte[] bArrQ = kVar.q();
            byte b2 = bArrQ[0];
            long jMin = Math.min(jQ, (hVar.q() - j5) + 1);
            while (jQ2 < jMin) {
                byte[] bArr = aiVar.f50806a;
                int iMin = (int) Math.min(aiVar.f50808c, (aiVar.f50807b + jMin) - jQ2);
                i3 = (int) ((aiVar.f50807b + j4) - jQ2);
                while (i3 < iMin) {
                    int i4 = i3 + 1;
                    if (bArr[i3] != b2 || !f(aiVar, i4, bArrQ, i2)) {
                        i3 = i4;
                    }
                }
                jQ2 += aiVar.f50808c - aiVar.f50807b;
                aiVar = aiVar.f50811f;
                x.c(aiVar);
                j4 = jQ2;
            }
            return -1L;
        }
        while (true) {
            long j6 = (aiVar.f50808c - aiVar.f50807b) + jQ2;
            if (j6 > j4) {
                break;
            }
            aiVar = aiVar.f50811f;
            x.c(aiVar);
            jQ2 = j6;
        }
        if (aiVar == null) {
            return -1L;
        }
        byte[] bArrQ2 = kVar.q();
        byte b3 = bArrQ2[0];
        long jMin2 = Math.min(jQ, (hVar.q() - j5) + 1);
        while (jQ2 < jMin2) {
            byte[] bArr2 = aiVar.f50806a;
            int iMin2 = (int) Math.min(aiVar.f50808c, (aiVar.f50807b + jMin2) - jQ2);
            i3 = (int) ((aiVar.f50807b + j4) - jQ2);
            while (i3 < iMin2) {
                int i5 = i3 + 1;
                if (bArr2[i3] != b3 || !f(aiVar, i5, bArrQ2, i2)) {
                    i3 = i5;
                }
            }
            jQ2 += aiVar.f50808c - aiVar.f50807b;
            aiVar = aiVar.f50811f;
            x.c(aiVar);
            j4 = jQ2;
        }
        return -1L;
        return (i3 - aiVar.f50807b) + jQ2;
    }

    public static final boolean f(ai aiVar, int i2, byte[] bArr, int i3) {
        x.f(aiVar, "segment");
        x.f(bArr, "bytes");
        int i4 = aiVar.f50808c;
        byte[] bArr2 = aiVar.f50806a;
        for (int i5 = 1; i5 < i3; i5++) {
            if (i2 == i4) {
                aiVar = aiVar.f50811f;
                x.c(aiVar);
                bArr2 = aiVar.f50806a;
                i2 = aiVar.f50807b;
                i4 = aiVar.f50808c;
            }
            if (bArr2[i2] != bArr[i5]) {
                return false;
            }
            i2++;
        }
        return true;
    }
}
