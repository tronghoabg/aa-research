package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f37439a;

    public k(String str) {
        this.f37439a = str;
    }

    public final String a() {
        return this.f37439a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.g.b.x.n(this.f37439a, ((k) obj).f37439a);
    }

    public final int hashCode() {
        String str = this.f37439a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "SetFallbackItem(subtitle=" + this.f37439a + ")";
    }
}
