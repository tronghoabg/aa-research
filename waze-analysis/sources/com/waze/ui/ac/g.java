package com.waze.ui.ac;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f41762a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41763b;

    public g(String str, String str2) {
        x.f(str, "imageUrl");
        this.f41762a = str;
        this.f41763b = str2;
    }

    public final String a() {
        return this.f41762a;
    }

    public final String b() {
        return this.f41763b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return x.n(this.f41762a, gVar.f41762a) && x.n(this.f41763b, gVar.f41763b);
    }

    public final int hashCode() {
        int iHashCode = this.f41762a.hashCode() * 31;
        String str = this.f41763b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Url(imageUrl=" + this.f41762a + ", signature=" + this.f41763b + ")";
    }

    public /* synthetic */ g(String str) {
        this(str, null);
    }
}
