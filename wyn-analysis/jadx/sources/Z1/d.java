package Z1;

import N1.C0765n;
import Q1.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.C3168z;
import k2.H;
import k2.J;
import k2.K;
import k2.L;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f16926a;

    /* renamed from: b, reason: collision with root package name */
    public final H f16927b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f16928c;

    public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, int i5, H h10) {
        this.f16928c = copyOnWriteArrayList;
        this.f16926a = i5;
        this.f16927b = h10;
    }

    public void a(Q1.c cVar) {
        Iterator it = this.f16928c.iterator();
        while (it.hasNext()) {
            L l10 = (L) it.next();
            x.O(l10.f38917a, new com.applovin.impl.sdk.nativeAd.e(24, cVar, l10.f38918b));
        }
    }

    public void b(int i5, C0765n c0765n, int i10, Object obj, long j8) {
        a(new aa.f(11, this, new h2.g(1, i5, c0765n, i10, obj, x.W(j8), -9223372036854775807L)));
    }

    public void c(C3168z c3168z, int i5, int i10, C0765n c0765n, int i11, Object obj, long j8, long j10) {
        a(new J(this, c3168z, new h2.g(i5, i10, c0765n, i11, obj, x.W(j8), x.W(j10)), 2));
    }

    public void d(C3168z c3168z, int i5) {
        e(c3168z, i5, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void e(C3168z c3168z, int i5, int i10, C0765n c0765n, int i11, Object obj, long j8, long j10) {
        a(new J(this, c3168z, new h2.g(i5, i10, c0765n, i11, obj, x.W(j8), x.W(j10)), 1));
    }

    public void f(C3168z c3168z, int i5, int i10, C0765n c0765n, int i11, Object obj, long j8, long j10, IOException iOException, boolean z2) {
        a(new K(this, c3168z, new h2.g(i5, i10, c0765n, i11, obj, x.W(j8), x.W(j10)), iOException, z2));
    }

    public void g(C3168z c3168z, int i5, IOException iOException, boolean z2) {
        f(c3168z, i5, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z2);
    }

    public void h(C3168z c3168z, int i5, int i10, C0765n c0765n, int i11, Object obj, long j8, long j10) {
        a(new J(this, c3168z, new h2.g(i5, i10, c0765n, i11, obj, x.W(j8), x.W(j10)), 0));
    }
}
