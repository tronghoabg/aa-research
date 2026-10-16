package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hb extends hc {

    /* renamed from: a, reason: collision with root package name */
    private final String f37380a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(String str, String str2) {
        super(null);
        h.g.b.x.f(str, "model");
        this.f37380a = str;
        this.f37381b = str2;
    }

    public final String a() {
        return this.f37380a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return h.g.b.x.n(this.f37380a, hbVar.f37380a) && h.g.b.x.n(this.f37381b, hbVar.f37381b);
    }

    public final int hashCode() {
        int iHashCode = this.f37380a.hashCode() * 31;
        String str = this.f37381b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Opened(model=" + this.f37380a + ", origin=" + this.f37381b + ")";
    }
}
