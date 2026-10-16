package r6;

import E5.T;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import f6.Z;
import java.util.Locale;
import l8.AbstractC3399A;
import l8.c0;
import l8.d0;
import l8.e0;
import n2.C3581d;
import u6.v;

/* renamed from: r6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3928c extends j implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f44381e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44382f;

    /* renamed from: g, reason: collision with root package name */
    public final String f44383g;

    /* renamed from: h, reason: collision with root package name */
    public final f f44384h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f44385i;

    /* renamed from: j, reason: collision with root package name */
    public final int f44386j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f44387l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f44388m;

    /* renamed from: n, reason: collision with root package name */
    public final int f44389n;

    /* renamed from: o, reason: collision with root package name */
    public final int f44390o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f44391p;

    /* renamed from: q, reason: collision with root package name */
    public final int f44392q;

    /* renamed from: r, reason: collision with root package name */
    public final int f44393r;

    /* renamed from: s, reason: collision with root package name */
    public final int f44394s;

    /* renamed from: t, reason: collision with root package name */
    public final int f44395t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f44396u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f44397v;

    public C3928c(int i5, Z z2, int i10, f fVar, int i11, boolean z10, C3581d c3581d) {
        int i12;
        int iC;
        String[] strArrSplit;
        int iC2;
        boolean z11;
        super(i5, z2, i10);
        this.f44384h = fVar;
        this.f44383g = l.g(this.f44440d.f3230c);
        int i13 = 0;
        this.f44385i = l.e(i11, false);
        int i14 = 0;
        while (true) {
            e0 e0Var = fVar.f44505n;
            int i15 = e0Var.f40103d;
            i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i14 >= i15) {
                iC = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iC = l.c(this.f44440d, (String) e0Var.get(i14), false);
                if (iC > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.k = i14;
        this.f44386j = iC;
        int i16 = this.f44440d.f3232e;
        int i17 = fVar.f44506o;
        this.f44387l = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
        T t10 = this.f44440d;
        int i18 = t10.f3232e;
        this.f44388m = i18 == 0 || (i18 & 1) != 0;
        this.f44391p = (t10.f3231d & 1) != 0;
        int i19 = t10.f3251y;
        this.f44392q = i19;
        this.f44393r = t10.f3252z;
        int i20 = t10.f3235h;
        this.f44394s = i20;
        this.f44382f = (i20 == -1 || i20 <= fVar.f44508q) && (i19 == -1 || i19 <= fVar.f44507p) && c3581d.apply(t10);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i21 = v.f46721a;
        if (i21 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i21 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i22 = 0; i22 < strArrSplit.length; i22++) {
            strArrSplit[i22] = v.z(strArrSplit[i22]);
        }
        int i23 = 0;
        while (true) {
            if (i23 >= strArrSplit.length) {
                iC2 = 0;
                i23 = Integer.MAX_VALUE;
                break;
            } else {
                iC2 = l.c(this.f44440d, strArrSplit[i23], false);
                if (iC2 > 0) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.f44389n = i23;
        this.f44390o = iC2;
        int i24 = 0;
        while (true) {
            e0 e0Var2 = fVar.f44509r;
            if (i24 >= e0Var2.f40103d) {
                break;
            }
            String str = this.f44440d.f3238l;
            if (str != null && str.equals(e0Var2.get(i24))) {
                i12 = i24;
                break;
            }
            i24++;
        }
        this.f44395t = i12;
        this.f44396u = (i11 & 384) == 128;
        this.f44397v = (i11 & 64) == 64;
        f fVar2 = this.f44384h;
        if (l.e(i11, fVar2.f44425K) && ((z11 = this.f44382f) || fVar2.f44419E)) {
            i13 = (!l.e(i11, false) || !z11 || this.f44440d.f3235h == -1 || fVar2.f44515x || fVar2.f44514w || (!fVar2.f44426M && z10)) ? 1 : 2;
        }
        this.f44381e = i13;
    }

    @Override // r6.j
    public final int a() {
        return this.f44381e;
    }

    @Override // r6.j
    public final boolean b(j jVar) {
        int i5;
        String str;
        int i10;
        C3928c c3928c = (C3928c) jVar;
        f fVar = this.f44384h;
        boolean z2 = fVar.f44422H;
        T t10 = c3928c.f44440d;
        T t11 = this.f44440d;
        if (!z2 && ((i10 = t11.f3251y) == -1 || i10 != t10.f3251y)) {
            return false;
        }
        if (!fVar.f44420F && ((str = t11.f3238l) == null || !TextUtils.equals(str, t10.f3238l))) {
            return false;
        }
        if (!fVar.f44421G && ((i5 = t11.f3252z) == -1 || i5 != t10.f3252z)) {
            return false;
        }
        if (fVar.f44423I) {
            return true;
        }
        return this.f44396u == c3928c.f44396u && this.f44397v == c3928c.f44397v;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3928c c3928c) {
        boolean z2 = this.f44385i;
        boolean z10 = this.f44382f;
        d0 d0VarA = (z10 && z2) ? l.f44454j : l.f44454j.a();
        AbstractC3399A abstractC3399AC = AbstractC3399A.f40038a.c(z2, c3928c.f44385i);
        Integer numValueOf = Integer.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(c3928c.k);
        c0 c0Var = c0.f40091c;
        AbstractC3399A abstractC3399AB = abstractC3399AC.b(numValueOf, numValueOf2, c0Var).a(this.f44386j, c3928c.f44386j).a(this.f44387l, c3928c.f44387l).c(this.f44391p, c3928c.f44391p).c(this.f44388m, c3928c.f44388m).b(Integer.valueOf(this.f44389n), Integer.valueOf(c3928c.f44389n), c0Var).a(this.f44390o, c3928c.f44390o).c(z10, c3928c.f44382f).b(Integer.valueOf(this.f44395t), Integer.valueOf(c3928c.f44395t), c0Var);
        int i5 = this.f44394s;
        Integer numValueOf3 = Integer.valueOf(i5);
        int i10 = c3928c.f44394s;
        AbstractC3399A abstractC3399AB2 = abstractC3399AB.b(numValueOf3, Integer.valueOf(i10), this.f44384h.f44514w ? l.f44454j.a() : l.k).c(this.f44396u, c3928c.f44396u).c(this.f44397v, c3928c.f44397v).b(Integer.valueOf(this.f44392q), Integer.valueOf(c3928c.f44392q), d0VarA).b(Integer.valueOf(this.f44393r), Integer.valueOf(c3928c.f44393r), d0VarA);
        Integer numValueOf4 = Integer.valueOf(i5);
        Integer numValueOf5 = Integer.valueOf(i10);
        if (!v.a(this.f44383g, c3928c.f44383g)) {
            d0VarA = l.k;
        }
        return abstractC3399AB2.b(numValueOf4, numValueOf5, d0VarA).e();
    }
}
