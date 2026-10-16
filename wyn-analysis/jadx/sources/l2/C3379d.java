package l2;

import E4.F;
import N1.C0765n;
import Y2.B;
import android.util.SparseArray;
import s2.C;
import s2.o;
import s2.w;
import wa.C4398a;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3379d implements o, InterfaceC3381f {

    /* renamed from: j, reason: collision with root package name */
    public static final F f39879j;
    public static final J5.n k;

    /* renamed from: a, reason: collision with root package name */
    public final s2.m f39880a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39881b;

    /* renamed from: c, reason: collision with root package name */
    public final C0765n f39882c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f39883d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f39884e;

    /* renamed from: f, reason: collision with root package name */
    public B f39885f;

    /* renamed from: g, reason: collision with root package name */
    public long f39886g;

    /* renamed from: h, reason: collision with root package name */
    public w f39887h;

    /* renamed from: i, reason: collision with root package name */
    public C0765n[] f39888i;

    static {
        F f10 = new F(11);
        f10.f2854c = new C4398a(24);
        f39879j = f10;
        k = new J5.n();
    }

    public C3379d(s2.m mVar, int i5, C0765n c0765n) {
        this.f39880a = mVar;
        this.f39881b = i5;
        this.f39882c = c0765n;
    }

    public final void a(B b5, long j8, long j10) {
        this.f39885f = b5;
        this.f39886g = j10;
        boolean z2 = this.f39884e;
        s2.m mVar = this.f39880a;
        if (!z2) {
            mVar.g(this);
            if (j8 != -9223372036854775807L) {
                mVar.a(0L, j8);
            }
            this.f39884e = true;
            return;
        }
        if (j8 == -9223372036854775807L) {
            j8 = 0;
        }
        mVar.a(0L, j8);
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f39883d;
            if (i5 >= sparseArray.size()) {
                return;
            }
            C3378c c3378c = (C3378c) sparseArray.valueAt(i5);
            if (b5 == null) {
                c3378c.f39877e = c3378c.f39875c;
            } else {
                c3378c.f39878f = j10;
                C cF = b5.F(c3378c.f39873a);
                c3378c.f39877e = cF;
                C0765n c0765n = c3378c.f39876d;
                if (c0765n != null) {
                    cF.c(c0765n);
                }
            }
            i5++;
        }
    }

    @Override // s2.o, J5.m
    public final void l() {
        SparseArray sparseArray = this.f39883d;
        C0765n[] c0765nArr = new C0765n[sparseArray.size()];
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            C0765n c0765n = ((C3378c) sparseArray.valueAt(i5)).f39876d;
            Q1.k.h(c0765n);
            c0765nArr[i5] = c0765n;
        }
        this.f39888i = c0765nArr;
    }

    @Override // s2.o
    /* renamed from: m */
    public final C mo0m(int i5, int i10) {
        SparseArray sparseArray = this.f39883d;
        C3378c c3378c = (C3378c) sparseArray.get(i5);
        if (c3378c == null) {
            Q1.k.g(this.f39888i == null);
            c3378c = new C3378c(i5, i10, i10 == this.f39881b ? this.f39882c : null);
            B b5 = this.f39885f;
            long j8 = this.f39886g;
            if (b5 == null) {
                c3378c.f39877e = c3378c.f39875c;
            } else {
                c3378c.f39878f = j8;
                C cF = b5.F(i10);
                c3378c.f39877e = cF;
                C0765n c0765n = c3378c.f39876d;
                if (c0765n != null) {
                    cF.c(c0765n);
                }
            }
            sparseArray.put(i5, c3378c);
        }
        return c3378c;
    }

    @Override // s2.o
    public final void s(w wVar) {
        this.f39887h = wVar;
    }
}
