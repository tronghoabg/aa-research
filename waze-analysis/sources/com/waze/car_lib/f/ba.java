package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ba extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19413a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(boolean z, String str) {
        super(null);
        h.g.b.x.f(str, "appDownloadUrl");
        this.f19413a = z;
        this.f19414b = str;
    }

    public final String a() {
        return this.f19414b;
    }

    public final boolean b() {
        return this.f19413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return this.f19413a == baVar.f19413a && h.g.b.x.n(this.f19414b, baVar.f19414b);
    }

    public final int hashCode() {
        return (a.a.a(this.f19413a) * 31) + this.f19414b.hashCode();
    }

    public final String toString() {
        return "ForceUpgrade(hasUnsupportedOs=" + this.f19413a + ", appDownloadUrl=" + this.f19414b + ")";
    }
}
