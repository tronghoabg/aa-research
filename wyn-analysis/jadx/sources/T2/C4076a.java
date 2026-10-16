package t2;

import N1.D;
import Q1.x;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.C;
import s2.i;
import s2.j;
import s2.l;
import s2.m;
import s2.n;
import s2.o;
import s2.u;
import s2.w;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4076a implements m {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f45624s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f45625t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f45626u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f45627v;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f45628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45629b;

    /* renamed from: c, reason: collision with root package name */
    public final l f45630c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45631d;

    /* renamed from: e, reason: collision with root package name */
    public long f45632e;

    /* renamed from: f, reason: collision with root package name */
    public int f45633f;

    /* renamed from: g, reason: collision with root package name */
    public int f45634g;

    /* renamed from: h, reason: collision with root package name */
    public long f45635h;

    /* renamed from: i, reason: collision with root package name */
    public int f45636i;

    /* renamed from: j, reason: collision with root package name */
    public int f45637j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public o f45638l;

    /* renamed from: m, reason: collision with root package name */
    public C f45639m;

    /* renamed from: n, reason: collision with root package name */
    public C f45640n;

    /* renamed from: o, reason: collision with root package name */
    public w f45641o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f45642p;

    /* renamed from: q, reason: collision with root package name */
    public long f45643q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f45644r;

    static {
        int i5 = x.f9724a;
        Charset charset = StandardCharsets.UTF_8;
        f45626u = "#!AMR\n".getBytes(charset);
        f45627v = "#!AMR-WB\n".getBytes(charset);
    }

    public C4076a(int i5) {
        this.f45629b = (i5 & 2) != 0 ? i5 | 1 : i5;
        this.f45628a = new byte[1];
        this.f45636i = -1;
        l lVar = new l();
        this.f45630c = lVar;
        this.f45640n = lVar;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.f45632e = 0L;
        this.f45633f = 0;
        this.f45634g = 0;
        this.f45643q = j10;
        w wVar = this.f45641o;
        if (!(wVar instanceof u)) {
            if (j8 == 0 || !(wVar instanceof i)) {
                this.k = 0L;
                return;
            } else {
                this.k = (Math.max(0L, j8 - ((i) wVar).f44889b) * 8000000) / r7.f44892e;
                return;
            }
        }
        u uVar = (u) wVar;
        Q1.l lVar = uVar.f44933b;
        long jC = lVar.f9690b == 0 ? -9223372036854775807L : lVar.c(x.b(uVar.f44932a, j8));
        this.k = jC;
        if (Math.abs(this.f45643q - jC) < 20000) {
            return;
        }
        this.f45642p = true;
        this.f45640n = this.f45630c;
    }

    public final int b(j jVar) throws D {
        boolean z2;
        jVar.f44900f = 0;
        byte[] bArr = this.f45628a;
        jVar.c(bArr, 0, 1, false);
        byte b5 = bArr[0];
        if ((b5 & 131) > 0) {
            throw D.a(null, "Invalid padding bits for frame header " + ((int) b5));
        }
        int i5 = (b5 >> 3) & 15;
        if (i5 >= 0 && i5 <= 15 && (((z2 = this.f45631d) && (i5 < 10 || i5 > 13)) || (!z2 && (i5 < 12 || i5 > 14)))) {
            return z2 ? f45625t[i5] : f45624s[i5];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f45631d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i5);
        throw D.a(null, sb2.toString());
    }

    public final boolean c(j jVar) throws EOFException, InterruptedIOException {
        jVar.f44900f = 0;
        byte[] bArr = f45626u;
        byte[] bArr2 = new byte[bArr.length];
        jVar.c(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f45631d = false;
            jVar.j(bArr.length);
            return true;
        }
        jVar.f44900f = 0;
        byte[] bArr3 = f45627v;
        byte[] bArr4 = new byte[bArr3.length];
        jVar.c(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f45631d = true;
        jVar.j(bArr3.length);
        return true;
    }

    @Override // s2.m
    public final void g(o oVar) {
        this.f45638l = oVar;
        C cMo0m = oVar.mo0m(0, 1);
        this.f45639m = cMo0m;
        this.f45640n = cMo0m;
        oVar.l();
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) {
        return c((j) nVar);
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r25, J5.n r26) throws N1.D {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C4076a.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
    }
}
