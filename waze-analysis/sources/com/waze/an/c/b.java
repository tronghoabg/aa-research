package com.waze.an.c;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f14764a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14765b;

    public b(String str) {
        h.g.b.x.f(str, "text");
        this.f14764a = R.raw.road_insights;
        this.f14765b = str;
    }

    public final String a() {
        return this.f14765b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i2 = bVar.f14764a;
        return h.g.b.x.n(this.f14765b, bVar.f14765b);
    }

    public final int hashCode() {
        return this.f14765b.hashCode() + 1661928509;
    }

    public final String toString() {
        return "Major(animationResId=2131820579, text=" + this.f14765b + ")";
    }
}
