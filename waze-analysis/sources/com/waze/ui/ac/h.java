package com.waze.ui.ac;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f41764a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f41765b;

    public h(String str, Integer num) {
        x.f(str, "key");
        this.f41764a = str;
        this.f41765b = num;
    }

    public final Integer a() {
        return this.f41765b;
    }

    public final String b() {
        return this.f41764a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f41764a, hVar.f41764a) && x.n(this.f41765b, hVar.f41765b);
    }

    public final int hashCode() {
        int iHashCode = this.f41764a.hashCode() * 31;
        Integer num = this.f41765b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "WazeResource(key=" + this.f41764a + ", fallbackResource=" + this.f41765b + ")";
    }

    public /* synthetic */ h(String str) {
        this(str, null);
    }
}
