package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dx {

    /* renamed from: a, reason: collision with root package name */
    private final String f37097a;

    public dx(String str) {
        this.f37097a = str;
    }

    public final String a() {
        return this.f37097a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx) && h.g.b.x.n(this.f37097a, ((dx) obj).f37097a);
    }

    public final int hashCode() {
        String str = this.f37097a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "PassAdded(permitName=" + this.f37097a + ")";
    }
}
