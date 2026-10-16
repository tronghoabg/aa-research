package n2;

import N1.O;
import R8.v;
import l8.AbstractC3399A;
import l8.AbstractC3409K;
import l8.c0;
import l8.d0;
import l8.e0;

/* renamed from: n2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3588k extends m implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f40859e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f40860f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f40861g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40862h;

    /* renamed from: i, reason: collision with root package name */
    public final int f40863i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40864j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f40865l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f40866m;

    public C3588k(int i5, O o7, int i10, C3586i c3586i, int i11, String str) {
        int iBitCount;
        int iC;
        super(i5, o7, i10);
        int i12 = 0;
        this.f40860f = v.c(i11, false);
        int i13 = this.f40870d.f8224e;
        c3586i.getClass();
        this.f40861g = (i13 & 1) != 0;
        this.f40862h = (i13 & 2) != 0;
        e0 e0Var = c3586i.f8113n;
        e0 e0VarN = e0Var.isEmpty() ? AbstractC3409K.n("") : e0Var;
        int i14 = 0;
        while (true) {
            int i15 = e0VarN.f40103d;
            iBitCount = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i14 >= i15) {
                iC = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iC = o.c(this.f40870d, (String) e0VarN.get(i14), false);
                if (iC > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f40863i = i14;
        this.f40864j = iC;
        int i16 = this.f40870d.f8225f;
        d0 d0Var = o.f40885j;
        int i17 = c3586i.f8114o;
        iBitCount = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : iBitCount;
        this.k = iBitCount;
        this.f40866m = (this.f40870d.f8225f & 1088) != 0;
        int iC2 = o.c(this.f40870d, str, o.f(str) == null);
        this.f40865l = iC2;
        boolean z2 = iC > 0 || (e0Var.isEmpty() && iBitCount > 0) || this.f40861g || (this.f40862h && iC2 > 0);
        if (v.c(i11, c3586i.f40853w) && z2) {
            i12 = 1;
        }
        this.f40859e = i12;
    }

    @Override // n2.m
    public final int a() {
        return this.f40859e;
    }

    @Override // n2.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3588k c3588k) {
        AbstractC3399A abstractC3399AC = AbstractC3399A.f40038a.c(this.f40860f, c3588k.f40860f);
        Integer numValueOf = Integer.valueOf(this.f40863i);
        Integer numValueOf2 = Integer.valueOf(c3588k.f40863i);
        c0 c0Var = c0.f40091c;
        AbstractC3399A abstractC3399AB = abstractC3399AC.b(numValueOf, numValueOf2, c0Var);
        int i5 = this.f40864j;
        AbstractC3399A abstractC3399AA = abstractC3399AB.a(i5, c3588k.f40864j);
        int i10 = this.k;
        AbstractC3399A abstractC3399AC2 = abstractC3399AA.a(i10, c3588k.k).c(this.f40861g, c3588k.f40861g);
        Boolean boolValueOf = Boolean.valueOf(this.f40862h);
        Boolean boolValueOf2 = Boolean.valueOf(c3588k.f40862h);
        if (i5 == 0) {
            c0Var = c0.f40090b;
        }
        AbstractC3399A abstractC3399AA2 = abstractC3399AC2.b(boolValueOf, boolValueOf2, c0Var).a(this.f40865l, c3588k.f40865l);
        if (i10 == 0) {
            abstractC3399AA2 = abstractC3399AA2.d(this.f40866m, c3588k.f40866m);
        }
        return abstractC3399AA2.e();
    }
}
