package i0;

import A.AbstractC0213f;
import e0.AbstractC2461m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class O extends J {

    /* renamed from: a, reason: collision with root package name */
    public final String f36546a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36547b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36548c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2461m f36549d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36550e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2461m f36551f;

    /* renamed from: g, reason: collision with root package name */
    public final float f36552g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36553h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36554i;

    /* renamed from: j, reason: collision with root package name */
    public final int f36555j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public final float f36556l;

    /* renamed from: m, reason: collision with root package name */
    public final float f36557m;

    /* renamed from: n, reason: collision with root package name */
    public final float f36558n;

    public O(String str, List list, int i5, AbstractC2461m abstractC2461m, float f10, AbstractC2461m abstractC2461m2, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16) {
        this.f36546a = str;
        this.f36547b = list;
        this.f36548c = i5;
        this.f36549d = abstractC2461m;
        this.f36550e = f10;
        this.f36551f = abstractC2461m2;
        this.f36552g = f11;
        this.f36553h = f12;
        this.f36554i = i10;
        this.f36555j = i11;
        this.k = f13;
        this.f36556l = f14;
        this.f36557m = f15;
        this.f36558n = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
        if (!AbstractC3340k.a(i5.getOrCreateKotlinClass(O.class), i5.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        O o7 = (O) obj;
        return this.f36546a.equals(o7.f36546a) && AbstractC3340k.a(this.f36549d, o7.f36549d) && this.f36550e == o7.f36550e && AbstractC3340k.a(this.f36551f, o7.f36551f) && this.f36552g == o7.f36552g && this.f36553h == o7.f36553h && this.f36554i == o7.f36554i && this.f36555j == o7.f36555j && this.k == o7.k && this.f36556l == o7.f36556l && this.f36557m == o7.f36557m && this.f36558n == o7.f36558n && this.f36548c == o7.f36548c && AbstractC3340k.a(this.f36547b, o7.f36547b);
    }

    public final int hashCode() {
        int iHashCode = (this.f36547b.hashCode() + (this.f36546a.hashCode() * 31)) * 31;
        AbstractC2461m abstractC2461m = this.f36549d;
        int iC = AbstractC0213f.c(this.f36550e, (iHashCode + (abstractC2461m != null ? abstractC2461m.hashCode() : 0)) * 31, 31);
        AbstractC2461m abstractC2461m2 = this.f36551f;
        return AbstractC0213f.c(this.f36558n, AbstractC0213f.c(this.f36557m, AbstractC0213f.c(this.f36556l, AbstractC0213f.c(this.k, (((AbstractC0213f.c(this.f36553h, AbstractC0213f.c(this.f36552g, (iC + (abstractC2461m2 != null ? abstractC2461m2.hashCode() : 0)) * 31, 31), 31) + this.f36554i) * 31) + this.f36555j) * 31, 31), 31), 31), 31) + this.f36548c;
    }
}
