package com.waze.copilot.data.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final h.m f22923a;

    /* renamed from: b, reason: collision with root package name */
    private final h.m f22924b;

    /* renamed from: c, reason: collision with root package name */
    private final h.m f22925c;

    public g(h.m mVar, h.m mVar2, h.m mVar3) {
        this.f22923a = mVar;
        this.f22924b = mVar2;
        this.f22925c = mVar3;
    }

    public final h.m a() {
        return this.f22923a;
    }

    public final h.m b() {
        return this.f22924b;
    }

    public final h.m c() {
        return this.f22925c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return x.n(this.f22923a, gVar.f22923a) && x.n(this.f22924b, gVar.f22924b) && x.n(this.f22925c, gVar.f22925c);
    }

    public final int hashCode() {
        h.m mVar = this.f22923a;
        int iA = mVar == null ? 0 : h.m.a(mVar.b());
        h.m mVar2 = this.f22924b;
        int iA2 = mVar2 == null ? 0 : h.m.a(mVar2.b());
        int i2 = iA * 31;
        h.m mVar3 = this.f22925c;
        return ((i2 + iA2) * 31) + (mVar3 != null ? h.m.a(mVar3.b()) : 0);
    }

    public final String toString() {
        return "CopilotAssetsMetaData(carResult=" + this.f22923a + ", moodResult=" + this.f22924b + ", voiceResult=" + this.f22925c + ")";
    }
}
