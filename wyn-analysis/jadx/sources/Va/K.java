package Va;

import java.util.List;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f13465d = {5685, 5334, 5101, 7918, 'v', 640, 14408, 15035, 15760, 12420, 13281, 39582, 39031, 40780, 37465, 37171, 14742, 28669, 27940, 27158, 26397, 25714, 24894, 32325, 31572, 30952, 30101, 29340, 20461, 19685, 18882, 18136, 17422, 16689, 24069, 23397, 22640, 21836, 21083};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13466e = {-29, -89, -92, 74, -92, -85, -30, 34, -54, -64, -52, -31, 8, -1, 15, -13, -89, 90, -95, -90, 117, -121, -96, 83, 88, -73, 83, 124, -117, 90, -94, 72, -89, -82, 89, -90, 117};

    /* renamed from: f, reason: collision with root package name */
    public static int f13467f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13468g = 1;

    /* renamed from: a, reason: collision with root package name */
    public J f13469a;

    /* renamed from: b, reason: collision with root package name */
    public List f13470b;

    /* renamed from: c, reason: collision with root package name */
    public String f13471c;

    public static String a(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 35;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13466e[1697689265 + i11] + 35);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-1697689263)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 1324714898);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13466e;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static String c(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13465d[i5 + i11] ^ (i11 * (-2570210752393837842L))) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (Va.AbstractC1104pb.b(r10, (java.lang.String) r4.get(0)) < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r10) {
        /*
            r9 = this;
            int r0 = Va.K.f13468g
            int r0 = r0 + 53
            int r0 = r0 % 128
            Va.K.f13467f = r0
            r0 = 1
            r1 = 0
            int[] r2 = Va.I.f13422a     // Catch: java.lang.Exception -> L43
            Va.J r3 = r9.f13469a     // Catch: java.lang.Exception -> L43
            int r3 = r3.ordinal()     // Catch: java.lang.Exception -> L43
            r2 = r2[r3]     // Catch: java.lang.Exception -> L43
            if (r2 == r0) goto L89
            r3 = 2
            java.util.List r4 = r9.f13470b
            if (r2 == r3) goto L84
            r5 = 3
            r6 = 73
            if (r2 == r5) goto L25
            r5 = 4
            if (r2 == r5) goto L5e
            goto Ldb
        L25:
            int r2 = r4.size()     // Catch: java.lang.Exception -> L43
            if (r2 <= 0) goto L5e
            int r2 = Va.K.f13468g
            int r2 = r2 + 119
            int r5 = r2 % 128
            Va.K.f13467f = r5
            int r2 = r2 % r3
            if (r2 == 0) goto L45
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L43
            int r10 = Va.AbstractC1104pb.b(r10, r2)     // Catch: java.lang.Exception -> L43
            if (r10 >= 0) goto L5d
            goto L51
        L43:
            r10 = move-exception
            goto L8a
        L45:
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L43
            int r10 = Va.AbstractC1104pb.b(r10, r2)     // Catch: java.lang.Exception -> L43
            if (r10 >= 0) goto L5d
        L51:
            int r10 = Va.K.f13467f
            int r10 = r10 + r6
            int r2 = r10 % 128
            Va.K.f13468g = r2
            int r10 = r10 % r3
            if (r10 != 0) goto L5c
            return r1
        L5c:
            return r0
        L5d:
            return r1
        L5e:
            int r2 = r4.size()     // Catch: java.lang.Exception -> L43
            if (r2 <= 0) goto Ldb
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L43
            int r10 = Va.AbstractC1104pb.b(r10, r2)     // Catch: java.lang.Exception -> L43
            if (r10 < 0) goto L83
            int r10 = Va.K.f13467f
            int r10 = r10 + 17
            int r10 = r10 % 128
            Va.K.f13468g = r10
            int r10 = r10 + 31
            int r2 = r10 % 128
            Va.K.f13467f = r2
            int r10 = r10 % r3
            if (r10 == 0) goto L82
            int r6 = r6 / r1
        L82:
            return r0
        L83:
            return r1
        L84:
            boolean r10 = r4.contains(r10)     // Catch: java.lang.Exception -> L43
            return r10
        L89:
            return r0
        L8a:
            long r2 = android.os.Process.getElapsedCpuTime()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r0 = r0 - r2
            short r0 = (short) r0
            r2 = -1307937615(0xffffffffb20a74b1, float:-8.05919E-9)
            int r3 = android.graphics.Color.rgb(r1, r1, r1)
            int r3 = r3 + r2
            int r2 = android.view.View.MeasureSpec.getMode(r1)
            int r2 = (-36) - r2
            r6 = -1697689250(0xffffffff9acf515e, float:-8.574465E-23)
            int r7 = android.graphics.Color.alpha(r1)
            int r6 = r6 - r7
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            int r4 = 90 - r4
            byte r4 = (byte) r4
            java.lang.String r0 = a(r3, r2, r4, r0, r6)
            java.lang.String r0 = r0.intern()
            int r2 = android.graphics.Color.argb(r1, r1, r1, r1)
            int r2 = r2 + 28600
            char r2 = (char) r2
            int r3 = android.graphics.Color.argb(r1, r1, r1, r1)
            int r3 = r3 + 17
            int r4 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r4 = r4 >> 16
            int r4 = 22 - r4
            java.lang.String r2 = c(r3, r4, r2)
            java.lang.String r2 = r2.intern()
            Va.Ab.a0(r0, r2, r10, r1)
        Ldb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.K.b(java.lang.String):boolean");
    }
}
