package com.waze.av.c;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f16036a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16037b;

    /* renamed from: c, reason: collision with root package name */
    private final List f16038c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16039d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16040e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16041f;

    public l(String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        x.f(list, "places");
        this.f16036a = str;
        this.f16037b = str2;
        this.f16038c = list;
        this.f16039d = z;
        this.f16040e = z2;
        this.f16041f = z3;
    }

    public static /* synthetic */ l g(l lVar, List list, boolean z, int i2) {
        String str = (i2 & 1) != 0 ? lVar.f16036a : null;
        String str2 = (i2 & 2) != 0 ? lVar.f16037b : null;
        if ((i2 & 4) != 0) {
            list = lVar.f16038c;
        }
        List list2 = list;
        boolean z2 = (i2 & 8) != 0 ? lVar.f16039d : false;
        boolean z3 = (i2 & 16) != 0 ? lVar.f16040e : false;
        if ((i2 & 32) != 0) {
            z = lVar.f16041f;
        }
        x.f(list2, "places");
        return new l(str, str2, list2, z2, z3, z);
    }

    public final String a() {
        return this.f16037b;
    }

    public final String b() {
        return this.f16036a;
    }

    public final List c() {
        return this.f16038c;
    }

    public final boolean d() {
        return this.f16039d;
    }

    public final boolean e() {
        return this.f16040e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return x.n(this.f16036a, lVar.f16036a) && x.n(this.f16037b, lVar.f16037b) && x.n(this.f16038c, lVar.f16038c) && this.f16039d == lVar.f16039d && this.f16040e == lVar.f16040e && this.f16041f == lVar.f16041f;
    }

    public final boolean f() {
        return this.f16041f;
    }

    public final int hashCode() {
        String str = this.f16036a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f16037b;
        return (((((((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f16038c.hashCode()) * 31) + a.a.a(this.f16039d)) * 31) + a.a.a(this.f16040e)) * 31) + a.a.a(this.f16041f);
    }

    public final String toString() {
        return "SearchV2ResultsResponse(categoryId=" + this.f16036a + ", categoryGroupId=" + this.f16037b + ", places=" + this.f16038c + ", canAddDetourTimes=" + this.f16039d + ", hideFilters=" + this.f16040e + ", isSingleSearchResult=" + this.f16041f + ")";
    }

    public /* synthetic */ l(List list, boolean z, int i2) {
        this(null, null, list, ((i2 & 8) == 0) & z, false, false);
    }
}
