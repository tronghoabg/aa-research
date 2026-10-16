package h2;

import N1.C0765n;
import Q1.x;
import g2.C2691l;
import s2.C;
import s2.o;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public int f36019a;

    /* renamed from: b, reason: collision with root package name */
    public int f36020b;

    /* renamed from: c, reason: collision with root package name */
    public int f36021c;

    /* renamed from: d, reason: collision with root package name */
    public long f36022d;

    /* renamed from: e, reason: collision with root package name */
    public long f36023e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f36024f;

    /* renamed from: g, reason: collision with root package name */
    public Object f36025g;

    public g(C2691l c2691l) {
        this.f36024f = c2691l;
        this.f36022d = -9223372036854775807L;
        this.f36020b = -1;
    }

    @Override // h2.i
    public void a(long j8, long j10) {
        this.f36022d = j8;
        this.f36023e = j10;
        this.f36021c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // h2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(Q1.o r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f36025g
            s2.C r5 = (s2.C) r5
            Q1.k.h(r5)
            int r5 = r0.f36020b
            r6 = -1
            if (r5 == r6) goto L2d
            int r5 = g2.C2688i.a(r5)
            if (r2 == r5) goto L2d
            int r7 = Q1.x.f9724a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = "Received RTP packet with unexpected sequence number. Expected: "
            java.lang.String r8 = "; received: "
            java.lang.String r9 = ". Dropping packet."
            java.lang.String r5 = N0.a.e(r7, r5, r8, r2, r9)
            java.lang.String r7 = "RtpMpeg4Reader"
            Q1.k.w(r7, r5)
        L2d:
            int r5 = r1.a()
            java.lang.Object r7 = r0.f36025g
            s2.C r7 = (s2.C) r7
            r7.e(r5, r1)
            int r7 = r0.f36021c
            r8 = 0
            if (r7 != 0) goto L71
            byte[] r7 = r1.f9702a
            byte[] r9 = new byte[r3]
            r9 = {x00ac: FILL_ARRAY_DATA , data: [0, 0, 1, -74} // fill-array
            java.lang.String r10 = "array"
            Fe.e.t(r7, r10)
            r10 = r8
        L4a:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L5e
            r11 = r8
        L50:
            if (r11 >= r3) goto L5f
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L5c
            int r10 = r10 + r4
            goto L4a
        L5c:
            int r11 = r11 + r4
            goto L50
        L5e:
            r10 = r6
        L5f:
            if (r10 == r6) goto L6e
            int r10 = r10 + r3
            r1.G(r10)
            int r1 = r1.e()
            int r1 = r1 >> 6
            if (r1 != 0) goto L6e
            goto L6f
        L6e:
            r4 = r8
        L6f:
            r0.f36019a = r4
        L71:
            int r1 = r0.f36021c
            int r1 = r1 + r5
            r0.f36021c = r1
            if (r28 == 0) goto La9
            long r3 = r0.f36022d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r11 = r25
            if (r1 != 0) goto L87
            r0.f36022d = r11
        L87:
            long r9 = r0.f36023e
            long r14 = r0.f36022d
            r13 = 90000(0x15f90, float:1.26117E-40)
            long r17 = S3.f.N(r9, r11, r13, r14)
            java.lang.Object r1 = r0.f36025g
            r16 = r1
            s2.C r16 = (s2.C) r16
            int r1 = r0.f36019a
            int r3 = r0.f36021c
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.a(r17, r19, r20, r21, r22)
            r0.f36021c = r8
        La9:
            r0.f36020b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.g.b(Q1.o, long, int, boolean):void");
    }

    @Override // h2.i
    public void c(o oVar, int i5) {
        C cMo0m = oVar.mo0m(i5, 2);
        this.f36025g = cMo0m;
        int i10 = x.f9724a;
        cMo0m.c(((C2691l) this.f36024f).f35621c);
    }

    public g(int i5, int i10, C0765n c0765n, int i11, Object obj, long j8, long j10) {
        this.f36019a = i5;
        this.f36020b = i10;
        this.f36024f = c0765n;
        this.f36021c = i11;
        this.f36025g = obj;
        this.f36022d = j8;
        this.f36023e = j10;
    }

    @Override // h2.i
    public void d(long j8) {
    }
}
