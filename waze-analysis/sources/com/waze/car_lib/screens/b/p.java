package com.waze.car_lib.screens.b;

import android.text.SpannableString;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final SpannableString f21854a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21855b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21856c;

    public p(SpannableString spannableString, List list, String str) {
        x.f(spannableString, "rowTitle");
        x.f(list, "rowContentList");
        this.f21854a = spannableString;
        this.f21855b = list;
        this.f21856c = str;
    }

    public final SpannableString a() {
        return this.f21854a;
    }

    public final String b() {
        return this.f21856c;
    }

    public final List c() {
        return this.f21855b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return x.n(this.f21854a, pVar.f21854a) && x.n(this.f21855b, pVar.f21855b) && x.n(this.f21856c, pVar.f21856c);
    }

    public final int hashCode() {
        int iHashCode = (this.f21854a.hashCode() * 31) + this.f21855b.hashCode();
        String str = this.f21856c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TripOverviewRouteInfo(rowTitle=" + ((Object) this.f21854a) + ", rowContentList=" + this.f21855b + ", carbonEmission=" + this.f21856c + ")";
    }
}
