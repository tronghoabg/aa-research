package com.waze.main_screen.y;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f27870a;

    public a(String str) {
        x.f(str, "adId");
        this.f27870a = str;
    }

    public final String a() {
        return this.f27870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f27870a, ((a) obj).f27870a);
    }

    public final int hashCode() {
        return this.f27870a.hashCode();
    }

    public final String toString() {
        return "Ad(adId=" + this.f27870a + ")";
    }
}
