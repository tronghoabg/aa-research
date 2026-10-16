package n2;

import N1.C0765n;
import android.text.TextUtils;
import j$.util.Objects;
import l8.AbstractC3399A;
import l8.c0;
import l8.d0;

/* renamed from: n2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3582e extends m implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f40815e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f40816f;

    /* renamed from: g, reason: collision with root package name */
    public final String f40817g;

    /* renamed from: h, reason: collision with root package name */
    public final C3586i f40818h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f40819i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40820j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f40821l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f40822m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f40823n;

    /* renamed from: o, reason: collision with root package name */
    public final int f40824o;

    /* renamed from: p, reason: collision with root package name */
    public final int f40825p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f40826q;

    /* renamed from: r, reason: collision with root package name */
    public final int f40827r;

    /* renamed from: s, reason: collision with root package name */
    public final int f40828s;

    /* renamed from: t, reason: collision with root package name */
    public final int f40829t;

    /* renamed from: u, reason: collision with root package name */
    public final int f40830u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f40831v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f40832w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f40833x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3582e(int r14, N1.O r15, int r16, n2.C3586i r17, int r18, boolean r19, n2.C3581d r20, int r21) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C3582e.<init>(int, N1.O, int, n2.i, int, boolean, n2.d, int):void");
    }

    @Override // n2.m
    public final int a() {
        return this.f40815e;
    }

    @Override // n2.m
    public final boolean b(m mVar) {
        int i5;
        String str;
        C3582e c3582e = (C3582e) mVar;
        this.f40818h.getClass();
        C0765n c0765n = this.f40870d;
        int i10 = c0765n.f8210C;
        if (i10 == -1) {
            return false;
        }
        C0765n c0765n2 = c3582e.f40870d;
        if (i10 != c0765n2.f8210C) {
            return false;
        }
        if ((this.f40822m || ((str = c0765n.f8232n) != null && TextUtils.equals(str, c0765n2.f8232n))) && (i5 = c0765n.f8211D) != -1 && i5 == c0765n2.f8211D) {
            return this.f40831v == c3582e.f40831v && this.f40832w == c3582e.f40832w;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3582e c3582e) {
        boolean z2 = this.f40819i;
        boolean z10 = this.f40816f;
        d0 d0VarA = (z10 && z2) ? o.f40885j : o.f40885j.a();
        AbstractC3399A abstractC3399AC = AbstractC3399A.f40038a.c(z2, c3582e.f40819i);
        Integer numValueOf = Integer.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(c3582e.k);
        c0 c0Var = c0.f40091c;
        AbstractC3399A abstractC3399AB = abstractC3399AC.b(numValueOf, numValueOf2, c0Var).a(this.f40820j, c3582e.f40820j).a(this.f40821l, c3582e.f40821l).c(this.f40826q, c3582e.f40826q).c(this.f40823n, c3582e.f40823n).b(Integer.valueOf(this.f40824o), Integer.valueOf(c3582e.f40824o), c0Var).a(this.f40825p, c3582e.f40825p).c(z10, c3582e.f40816f).b(Integer.valueOf(this.f40830u), Integer.valueOf(c3582e.f40830u), c0Var);
        this.f40818h.getClass();
        AbstractC3399A abstractC3399AB2 = abstractC3399AB.c(this.f40831v, c3582e.f40831v).c(this.f40832w, c3582e.f40832w).c(this.f40833x, c3582e.f40833x).b(Integer.valueOf(this.f40827r), Integer.valueOf(c3582e.f40827r), d0VarA).b(Integer.valueOf(this.f40828s), Integer.valueOf(c3582e.f40828s), d0VarA);
        if (Objects.equals(this.f40817g, c3582e.f40817g)) {
            abstractC3399AB2 = abstractC3399AB2.b(Integer.valueOf(this.f40829t), Integer.valueOf(c3582e.f40829t), d0VarA);
        }
        return abstractC3399AB2.e();
    }
}
