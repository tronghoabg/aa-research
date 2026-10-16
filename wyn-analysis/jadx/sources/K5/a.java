package K5;

import E5.o0;
import J5.h;
import J5.k;
import J5.l;
import J5.t;
import J5.w;
import f6.C2584N;
import java.nio.charset.Charset;
import java.util.Arrays;
import k8.AbstractC3198g;
import u6.v;

/* loaded from: classes3.dex */
public final class a implements k {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f6539n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f6540o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f6541p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f6542q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f6543r;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6545b;

    /* renamed from: c, reason: collision with root package name */
    public long f6546c;

    /* renamed from: d, reason: collision with root package name */
    public int f6547d;

    /* renamed from: e, reason: collision with root package name */
    public int f6548e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6549f;

    /* renamed from: h, reason: collision with root package name */
    public int f6551h;

    /* renamed from: i, reason: collision with root package name */
    public long f6552i;

    /* renamed from: j, reason: collision with root package name */
    public C2584N f6553j;
    public w k;

    /* renamed from: l, reason: collision with root package name */
    public t f6554l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6555m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6544a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f6550g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f6540o = iArr;
        int i5 = v.f46721a;
        Charset charset = AbstractC3198g.f39301c;
        f6541p = "#!AMR\n".getBytes(charset);
        f6542q = "#!AMR-WB\n".getBytes(charset);
        f6543r = iArr[8];
    }

    @Override // J5.k
    public final void a(long j8, long j10) {
        this.f6546c = 0L;
        this.f6547d = 0;
        this.f6548e = 0;
        if (j8 != 0) {
            t tVar = this.f6554l;
            if (tVar instanceof Q5.a) {
                this.f6552i = (Math.max(0L, j8 - ((Q5.a) tVar).f9848b) * 8000000) / r0.f9851e;
                return;
            }
        }
        this.f6552i = 0L;
    }

    public final int b(h hVar) throws o0 {
        boolean z2;
        hVar.f5648f = 0;
        byte[] bArr = this.f6544a;
        hVar.c(bArr, 0, 1, false);
        byte b5 = bArr[0];
        if ((b5 & 131) > 0) {
            throw o0.a("Invalid padding bits for frame header " + ((int) b5), null);
        }
        int i5 = (b5 >> 3) & 15;
        if (i5 >= 0 && i5 <= 15 && (((z2 = this.f6545b) && (i5 < 10 || i5 > 13)) || (!z2 && (i5 < 12 || i5 > 14)))) {
            return z2 ? f6540o[i5] : f6539n[i5];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f6545b ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i5);
        throw o0.a(sb2.toString(), null);
    }

    public final boolean c(h hVar) {
        hVar.f5648f = 0;
        byte[] bArr = f6541p;
        byte[] bArr2 = new byte[bArr.length];
        hVar.c(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f6545b = false;
            hVar.j(bArr.length);
            return true;
        }
        hVar.f5648f = 0;
        byte[] bArr3 = f6542q;
        byte[] bArr4 = new byte[bArr3.length];
        hVar.c(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f6545b = true;
        hVar.j(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r10, J5.n r11) throws E5.o0 {
        /*
            r9 = this;
            J5.w r11 = r9.k
            u6.AbstractC4256a.j(r11)
            int r11 = u6.v.f46721a
            r11 = r10
            J5.h r11 = (J5.h) r11
            long r0 = r11.f5646d
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L24
            r11 = r10
            J5.h r11 = (J5.h) r11
            boolean r11 = r9.c(r11)
            if (r11 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r10 = "Could not find AMR header."
            r11 = 0
            E5.o0 r10 = E5.o0.a(r10, r11)
            throw r10
        L24:
            boolean r11 = r9.f6555m
            r0 = 1
            if (r11 != 0) goto L54
            r9.f6555m = r0
            boolean r11 = r9.f6545b
            if (r11 == 0) goto L32
            java.lang.String r1 = "audio/amr-wb"
            goto L34
        L32:
            java.lang.String r1 = "audio/3gpp"
        L34:
            if (r11 == 0) goto L39
            r11 = 16000(0x3e80, float:2.2421E-41)
            goto L3b
        L39:
            r11 = 8000(0x1f40, float:1.121E-41)
        L3b:
            J5.w r2 = r9.k
            E5.S r3 = new E5.S
            r3.<init>()
            r3.k = r1
            int r1 = K5.a.f6543r
            r3.f3205l = r1
            r3.f3217x = r0
            r3.f3218y = r11
            E5.T r11 = new E5.T
            r11.<init>(r3)
            r2.a(r11)
        L54:
            int r11 = r9.f6548e
            r1 = -1
            if (r11 != 0) goto L78
            r11 = r10
            J5.h r11 = (J5.h) r11     // Catch: java.io.EOFException -> La2
            int r11 = r9.b(r11)     // Catch: java.io.EOFException -> La2
            r9.f6547d = r11     // Catch: java.io.EOFException -> La2
            r9.f6548e = r11
            int r2 = r9.f6550g
            if (r2 != r1) goto L6f
            r2 = r10
            J5.h r2 = (J5.h) r2
            long r2 = r2.f5646d
            r9.f6550g = r11
        L6f:
            int r2 = r9.f6550g
            if (r2 != r11) goto L78
            int r11 = r9.f6551h
            int r11 = r11 + r0
            r9.f6551h = r11
        L78:
            J5.w r11 = r9.k
            int r2 = r9.f6548e
            int r10 = r11.d(r10, r2, r0)
            if (r10 != r1) goto L83
            goto La2
        L83:
            int r11 = r9.f6548e
            int r11 = r11 - r10
            r9.f6548e = r11
            r1 = 0
            if (r11 <= 0) goto L8c
            goto La2
        L8c:
            J5.w r2 = r9.k
            long r10 = r9.f6552i
            long r3 = r9.f6546c
            long r3 = r3 + r10
            int r6 = r9.f6547d
            r5 = 1
            r7 = 0
            r8 = 0
            r2.b(r3, r5, r6, r7, r8)
            long r10 = r9.f6546c
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r10 = r10 + r2
            r9.f6546c = r10
        La2:
            boolean r10 = r9.f6549f
            if (r10 == 0) goto La7
            goto Lba
        La7:
            J5.o r10 = new J5.o
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.<init>(r2)
            r9.f6554l = r10
            f6.N r11 = r9.f6553j
            r11.x(r10)
            r9.f6549f = r0
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.a.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f6553j = c2584n;
        this.k = c2584n.m(0, 1);
        c2584n.l();
    }

    @Override // J5.k
    public final boolean i(l lVar) {
        return c((h) lVar);
    }

    @Override // J5.k
    public final void release() {
    }
}
