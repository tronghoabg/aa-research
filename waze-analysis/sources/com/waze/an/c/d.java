package com.waze.an.c;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f14768a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14769b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14770c;

    public d(String str) {
        h.g.b.x.f(str, "text");
        this.f14768a = R.raw.bigger_picture;
        this.f14769b = str;
        this.f14770c = R.raw.how_long;
    }

    public final String a() {
        return this.f14769b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i2 = dVar.f14768a;
        if (!h.g.b.x.n(this.f14769b, dVar.f14769b)) {
            return false;
        }
        int i3 = dVar.f14770c;
        return true;
    }

    public final int hashCode() {
        return ((this.f14769b.hashCode() + 1661927486) * 31) + R.raw.how_long;
    }

    public final String toString() {
        return "Split(animationResId=2131820546, text=" + this.f14769b + ", splitAnimationResId=2131820569)";
    }
}
