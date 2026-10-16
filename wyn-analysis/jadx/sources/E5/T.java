package E5;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v6.C4303b;

/* loaded from: classes3.dex */
public final class T implements InterfaceC0453h {

    /* renamed from: G, reason: collision with root package name */
    public static final T f3220G = new T(new S());

    /* renamed from: H, reason: collision with root package name */
    public static final A5.f f3221H = new A5.f(7);

    /* renamed from: A, reason: collision with root package name */
    public final int f3222A;

    /* renamed from: B, reason: collision with root package name */
    public final int f3223B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3224C;

    /* renamed from: D, reason: collision with root package name */
    public final int f3225D;

    /* renamed from: E, reason: collision with root package name */
    public final int f3226E;

    /* renamed from: F, reason: collision with root package name */
    public int f3227F;

    /* renamed from: a, reason: collision with root package name */
    public final String f3228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3229b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3230c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3231d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3232e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3233f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3234g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3235h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3236i;

    /* renamed from: j, reason: collision with root package name */
    public final W5.c f3237j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3238l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3239m;

    /* renamed from: n, reason: collision with root package name */
    public final List f3240n;

    /* renamed from: o, reason: collision with root package name */
    public final I5.c f3241o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3242p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3243q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3244r;

    /* renamed from: s, reason: collision with root package name */
    public final float f3245s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3246t;

    /* renamed from: u, reason: collision with root package name */
    public final float f3247u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f3248v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3249w;

    /* renamed from: x, reason: collision with root package name */
    public final C4303b f3250x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3251y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3252z;

    public T(S s10) {
        this.f3228a = s10.f3195a;
        this.f3229b = s10.f3196b;
        this.f3230c = u6.v.z(s10.f3197c);
        this.f3231d = s10.f3198d;
        this.f3232e = s10.f3199e;
        int i5 = s10.f3200f;
        this.f3233f = i5;
        int i10 = s10.f3201g;
        this.f3234g = i10;
        this.f3235h = i10 != -1 ? i10 : i5;
        this.f3236i = s10.f3202h;
        this.f3237j = s10.f3203i;
        this.k = s10.f3204j;
        this.f3238l = s10.k;
        this.f3239m = s10.f3205l;
        List list = s10.f3206m;
        this.f3240n = list == null ? Collections.EMPTY_LIST : list;
        I5.c cVar = s10.f3207n;
        this.f3241o = cVar;
        this.f3242p = s10.f3208o;
        this.f3243q = s10.f3209p;
        this.f3244r = s10.f3210q;
        this.f3245s = s10.f3211r;
        int i11 = s10.f3212s;
        this.f3246t = i11 == -1 ? 0 : i11;
        float f10 = s10.f3213t;
        this.f3247u = f10 == -1.0f ? 1.0f : f10;
        this.f3248v = s10.f3214u;
        this.f3249w = s10.f3215v;
        this.f3250x = s10.f3216w;
        this.f3251y = s10.f3217x;
        this.f3252z = s10.f3218y;
        this.f3222A = s10.f3219z;
        int i12 = s10.f3191A;
        this.f3223B = i12 == -1 ? 0 : i12;
        int i13 = s10.f3192B;
        this.f3224C = i13 != -1 ? i13 : 0;
        this.f3225D = s10.f3193C;
        int i14 = s10.f3194D;
        if (i14 != 0 || cVar == null) {
            this.f3226E = i14;
        } else {
            this.f3226E = 1;
        }
    }

    public final S a() {
        S s10 = new S();
        s10.f3195a = this.f3228a;
        s10.f3196b = this.f3229b;
        s10.f3197c = this.f3230c;
        s10.f3198d = this.f3231d;
        s10.f3199e = this.f3232e;
        s10.f3200f = this.f3233f;
        s10.f3201g = this.f3234g;
        s10.f3202h = this.f3236i;
        s10.f3203i = this.f3237j;
        s10.f3204j = this.k;
        s10.k = this.f3238l;
        s10.f3205l = this.f3239m;
        s10.f3206m = this.f3240n;
        s10.f3207n = this.f3241o;
        s10.f3208o = this.f3242p;
        s10.f3209p = this.f3243q;
        s10.f3210q = this.f3244r;
        s10.f3211r = this.f3245s;
        s10.f3212s = this.f3246t;
        s10.f3213t = this.f3247u;
        s10.f3214u = this.f3248v;
        s10.f3215v = this.f3249w;
        s10.f3216w = this.f3250x;
        s10.f3217x = this.f3251y;
        s10.f3218y = this.f3252z;
        s10.f3219z = this.f3222A;
        s10.f3191A = this.f3223B;
        s10.f3192B = this.f3224C;
        s10.f3193C = this.f3225D;
        s10.f3194D = this.f3226E;
        return s10;
    }

    public final boolean b(T t10) {
        List list = this.f3240n;
        if (list.size() != t10.f3240n.size()) {
            return false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!Arrays.equals((byte[]) list.get(i5), (byte[]) t10.f3240n.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i5;
        if (this == obj) {
            return true;
        }
        if (obj != null && T.class == obj.getClass()) {
            T t10 = (T) obj;
            int i10 = this.f3227F;
            if ((i10 == 0 || (i5 = t10.f3227F) == 0 || i10 == i5) && this.f3231d == t10.f3231d && this.f3232e == t10.f3232e && this.f3233f == t10.f3233f && this.f3234g == t10.f3234g && this.f3239m == t10.f3239m && this.f3242p == t10.f3242p && this.f3243q == t10.f3243q && this.f3244r == t10.f3244r && this.f3246t == t10.f3246t && this.f3249w == t10.f3249w && this.f3251y == t10.f3251y && this.f3252z == t10.f3252z && this.f3222A == t10.f3222A && this.f3223B == t10.f3223B && this.f3224C == t10.f3224C && this.f3225D == t10.f3225D && this.f3226E == t10.f3226E && Float.compare(this.f3245s, t10.f3245s) == 0 && Float.compare(this.f3247u, t10.f3247u) == 0 && u6.v.a(this.f3228a, t10.f3228a) && u6.v.a(this.f3229b, t10.f3229b) && u6.v.a(this.f3236i, t10.f3236i) && u6.v.a(this.k, t10.k) && u6.v.a(this.f3238l, t10.f3238l) && u6.v.a(this.f3230c, t10.f3230c) && Arrays.equals(this.f3248v, t10.f3248v) && u6.v.a(this.f3237j, t10.f3237j) && u6.v.a(this.f3250x, t10.f3250x) && u6.v.a(this.f3241o, t10.f3241o) && b(t10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3227F == 0) {
            String str = this.f3228a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f3229b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f3230c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f3231d) * 31) + this.f3232e) * 31) + this.f3233f) * 31) + this.f3234g) * 31;
            String str4 = this.f3236i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            W5.c cVar = this.f3237j;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f3238l;
            this.f3227F = ((((((((((((((AbstractC0213f.c(this.f3247u, (AbstractC0213f.c(this.f3245s, (((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f3239m) * 31) + ((int) this.f3242p)) * 31) + this.f3243q) * 31) + this.f3244r) * 31, 31) + this.f3246t) * 31, 31) + this.f3249w) * 31) + this.f3251y) * 31) + this.f3252z) * 31) + this.f3222A) * 31) + this.f3223B) * 31) + this.f3224C) * 31) + this.f3225D) * 31) + this.f3226E;
        }
        return this.f3227F;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f3228a);
        sb2.append(", ");
        sb2.append(this.f3229b);
        sb2.append(", ");
        sb2.append(this.k);
        sb2.append(", ");
        sb2.append(this.f3238l);
        sb2.append(", ");
        sb2.append(this.f3236i);
        sb2.append(", ");
        sb2.append(this.f3235h);
        sb2.append(", ");
        sb2.append(this.f3230c);
        sb2.append(", [");
        sb2.append(this.f3243q);
        sb2.append(", ");
        sb2.append(this.f3244r);
        sb2.append(", ");
        sb2.append(this.f3245s);
        sb2.append("], [");
        sb2.append(this.f3251y);
        sb2.append(", ");
        return AbstractC0279p0.j(this.f3252z, "])", sb2);
    }
}
