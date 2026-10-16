package com.waze.an.c;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f14661a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14662b;

    public a(String str) {
        h.g.b.x.f(str, "text");
        this.f14661a = R.raw.lets_go;
        this.f14662b = str;
    }

    public final String a() {
        return this.f14662b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i2 = aVar.f14661a;
        return h.g.b.x.n(this.f14662b, aVar.f14662b);
    }

    public final int hashCode() {
        return this.f14662b.hashCode() + 1661928230;
    }

    public final String toString() {
        return "End(animationResId=2131820570, text=" + this.f14662b + ")";
    }
}
