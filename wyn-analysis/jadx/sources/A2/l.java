package a2;

import N1.C0761j;
import N1.C0765n;
import Y2.y;
import android.net.Uri;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class l extends l2.l {
    public static final AtomicInteger L = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f17190A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f17191B;

    /* renamed from: C, reason: collision with root package name */
    public C1322b f17192C;

    /* renamed from: D, reason: collision with root package name */
    public s f17193D;

    /* renamed from: E, reason: collision with root package name */
    public int f17194E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17195F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f17196G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f17197H;

    /* renamed from: I, reason: collision with root package name */
    public e0 f17198I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f17199J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f17200K;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17201l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f17202m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f17203n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17204o;

    /* renamed from: p, reason: collision with root package name */
    public final S1.h f17205p;

    /* renamed from: q, reason: collision with root package name */
    public final S1.k f17206q;

    /* renamed from: r, reason: collision with root package name */
    public final C1322b f17207r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17208s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f17209t;

    /* renamed from: u, reason: collision with root package name */
    public final Q1.u f17210u;

    /* renamed from: v, reason: collision with root package name */
    public final C1324d f17211v;

    /* renamed from: w, reason: collision with root package name */
    public final List f17212w;

    /* renamed from: x, reason: collision with root package name */
    public final C0761j f17213x;

    /* renamed from: y, reason: collision with root package name */
    public final G2.i f17214y;

    /* renamed from: z, reason: collision with root package name */
    public final Q1.o f17215z;

    public l(C1324d c1324d, S1.h hVar, S1.k kVar, C0765n c0765n, boolean z2, S1.h hVar2, S1.k kVar2, boolean z10, Uri uri, List list, int i5, Object obj, long j8, long j10, long j11, int i10, boolean z11, int i11, boolean z12, boolean z13, Q1.u uVar, C0761j c0761j, C1322b c1322b, G2.i iVar, Q1.o oVar, boolean z14, V1.k kVar3) {
        super(hVar, kVar, c0765n, i5, obj, j8, j10, j11);
        this.f17190A = z2;
        this.f17204o = i10;
        this.f17200K = z11;
        this.f17201l = i11;
        this.f17206q = kVar2;
        this.f17205p = hVar2;
        this.f17195F = kVar2 != null;
        this.f17191B = z10;
        this.f17202m = uri;
        this.f17208s = z13;
        this.f17210u = uVar;
        this.f17209t = z12;
        this.f17211v = c1324d;
        this.f17212w = list;
        this.f17213x = c0761j;
        this.f17207r = c1322b;
        this.f17214y = iVar;
        this.f17215z = oVar;
        this.f17203n = z14;
        C3407I c3407i = AbstractC3409K.f40056b;
        this.f17198I = e0.f40101e;
        this.k = L.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (A6.h.O(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // l2.l
    public final boolean b() {
        throw null;
    }

    public final void c(S1.h hVar, S1.k kVar, boolean z2, boolean z10) {
        S1.k kVarA;
        long j8;
        long j10;
        if (z2) {
            z = this.f17194E != 0;
            kVarA = kVar;
        } else {
            kVarA = kVar.a(this.f17194E);
        }
        try {
            s2.j jVarF = f(hVar, kVarA, z10);
            if (z) {
                jVarF.j(this.f17194E);
            }
            while (!this.f17196G) {
                try {
                    try {
                        if (this.f17192C.f17150a.k(jVarF, C1322b.f17149f) != 0) {
                            break;
                        }
                    } catch (EOFException e7) {
                        if ((this.f39892d.f8225f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            throw e7;
                        }
                        this.f17192C.f17150a.a(0L, 0L);
                        j8 = jVarF.f44898d;
                        j10 = kVar.f10874e;
                    }
                } catch (Throwable th) {
                    this.f17194E = (int) (jVarF.f44898d - kVar.f10874e);
                    throw th;
                }
            }
            j8 = jVarF.f44898d;
            j10 = kVar.f10874e;
            this.f17194E = (int) (j8 - j10);
        } finally {
            Fe.b.m(hVar);
        }
    }

    public final int e(int i5) {
        Q1.k.g(!this.f17203n);
        e0 e0Var = this.f17198I;
        if (i5 >= e0Var.f40103d) {
            return 0;
        }
        return ((Integer) e0Var.get(i5)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s2.j f(S1.h r37, S1.k r38, boolean r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.l.f(S1.h, S1.k, boolean):s2.j");
    }

    @Override // o2.j
    public final void g() {
        this.f17196G = true;
    }

    @Override // o2.j
    public final void load() {
        C1322b c1322b;
        this.f17193D.getClass();
        if (this.f17192C == null && (c1322b = this.f17207r) != null) {
            s2.m mVarH = c1322b.f17150a.h();
            if ((mVarH instanceof y) || (mVarH instanceof M2.l)) {
                this.f17192C = this.f17207r;
                this.f17195F = false;
            }
        }
        if (this.f17195F) {
            S1.h hVar = this.f17205p;
            hVar.getClass();
            S1.k kVar = this.f17206q;
            kVar.getClass();
            c(hVar, kVar, this.f17191B, false);
            this.f17194E = 0;
            this.f17195F = false;
        }
        if (this.f17196G) {
            return;
        }
        if (!this.f17209t) {
            c(this.f39897i, this.f39890b, this.f17190A, true);
        }
        this.f17197H = !this.f17196G;
    }
}
