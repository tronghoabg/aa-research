package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ac extends com.waze.ae.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f27926a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(String str) {
        super(null);
        h.g.b.x.f(str, "mapId");
        this.f27926a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac) && h.g.b.x.n(this.f27926a, ((ac) obj).f27926a);
    }

    public final int hashCode() {
        return this.f27926a.hashCode();
    }

    public final String i() {
        return this.f27926a;
    }

    public final String toString() {
        return "NativeMap(mapId=" + this.f27926a + ")";
    }
}
