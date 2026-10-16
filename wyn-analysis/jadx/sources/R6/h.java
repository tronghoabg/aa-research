package r6;

import f6.Z;
import l8.AbstractC3399A;
import l8.AbstractC3409K;
import l8.c0;
import l8.e0;

/* loaded from: classes3.dex */
public final class h extends j implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f44429e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44430f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f44431g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f44432h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44433i;

    /* renamed from: j, reason: collision with root package name */
    public final int f44434j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f44435l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f44436m;

    public h(int i5, Z z2, int i10, f fVar, int i11, String str) {
        int iBitCount;
        int iC;
        super(i5, z2, i10);
        int i12 = 0;
        this.f44430f = l.e(i11, false);
        int i13 = this.f44440d.f3231d & (~fVar.f44512u);
        this.f44431g = (i13 & 1) != 0;
        this.f44432h = (i13 & 2) != 0;
        e0 e0Var = fVar.f44510s;
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
                iC = l.c(this.f44440d, (String) e0VarN.get(i14), fVar.f44513v);
                if (iC > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f44433i = i14;
        this.f44434j = iC;
        int i16 = this.f44440d.f3232e;
        int i17 = fVar.f44511t;
        iBitCount = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : iBitCount;
        this.k = iBitCount;
        this.f44436m = (this.f44440d.f3232e & 1088) != 0;
        int iC2 = l.c(this.f44440d, str, l.g(str) == null);
        this.f44435l = iC2;
        boolean z10 = iC > 0 || (e0Var.isEmpty() && iBitCount > 0) || this.f44431g || (this.f44432h && iC2 > 0);
        if (l.e(i11, fVar.f44425K) && z10) {
            i12 = 1;
        }
        this.f44429e = i12;
    }

    @Override // r6.j
    public final int a() {
        return this.f44429e;
    }

    @Override // r6.j
    public final /* bridge */ /* synthetic */ boolean b(j jVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        AbstractC3399A abstractC3399AC = AbstractC3399A.f40038a.c(this.f44430f, hVar.f44430f);
        Integer numValueOf = Integer.valueOf(this.f44433i);
        Integer numValueOf2 = Integer.valueOf(hVar.f44433i);
        c0 c0Var = c0.f40091c;
        AbstractC3399A abstractC3399AB = abstractC3399AC.b(numValueOf, numValueOf2, c0Var);
        int i5 = this.f44434j;
        AbstractC3399A abstractC3399AA = abstractC3399AB.a(i5, hVar.f44434j);
        int i10 = this.k;
        AbstractC3399A abstractC3399AC2 = abstractC3399AA.a(i10, hVar.k).c(this.f44431g, hVar.f44431g);
        Boolean boolValueOf = Boolean.valueOf(this.f44432h);
        Boolean boolValueOf2 = Boolean.valueOf(hVar.f44432h);
        if (i5 == 0) {
            c0Var = c0.f40090b;
        }
        AbstractC3399A abstractC3399AA2 = abstractC3399AC2.b(boolValueOf, boolValueOf2, c0Var).a(this.f44435l, hVar.f44435l);
        if (i10 == 0) {
            abstractC3399AA2 = abstractC3399AA2.d(this.f44436m, hVar.f44436m);
        }
        return abstractC3399AA2.e();
    }
}
