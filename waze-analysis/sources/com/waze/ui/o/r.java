package com.waze.ui.o;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends t {

    /* renamed from: a, reason: collision with root package name */
    private final String f43161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str) {
        super(null);
        h.g.b.x.f(str, "debugVersion");
        this.f43161a = str;
    }

    public final String a() {
        return this.f43161a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && h.g.b.x.n(this.f43161a, ((r) obj).f43161a);
    }

    public final int hashCode() {
        return this.f43161a.hashCode();
    }

    public final String toString() {
        return "VersionLongClicked(debugVersion=" + this.f43161a + ")";
    }
}
