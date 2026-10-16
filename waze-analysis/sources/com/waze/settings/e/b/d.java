package com.waze.settings.e.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final String f37138a;

    public d(String str) {
        x.f(str, "url");
        this.f37138a = str;
    }

    public final String a() {
        return this.f37138a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f37138a, ((d) obj).f37138a);
    }

    public final int hashCode() {
        return this.f37138a.hashCode();
    }

    public final String toString() {
        return "OpenUrl(url=" + this.f37138a + ")";
    }
}
