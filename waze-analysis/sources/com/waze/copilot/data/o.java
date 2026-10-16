package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final h.m f23041a;

    /* renamed from: b, reason: collision with root package name */
    private final h.m f23042b;

    /* renamed from: c, reason: collision with root package name */
    private final h.m f23043c;

    public o(h.m mVar, h.m mVar2, h.m mVar3) {
        this.f23041a = mVar;
        this.f23042b = mVar2;
        this.f23043c = mVar3;
    }

    public final h.m a() {
        return this.f23041a;
    }

    public final h.m b() {
        return this.f23042b;
    }

    public final h.m c() {
        return this.f23043c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return h.g.b.x.n(this.f23041a, oVar.f23041a) && h.g.b.x.n(this.f23042b, oVar.f23042b) && h.g.b.x.n(this.f23043c, oVar.f23043c);
    }

    public final int hashCode() {
        h.m mVar = this.f23041a;
        int iA = mVar == null ? 0 : h.m.a(mVar.b());
        h.m mVar2 = this.f23042b;
        int iA2 = mVar2 == null ? 0 : h.m.a(mVar2.b());
        int i2 = iA * 31;
        h.m mVar3 = this.f23043c;
        return ((i2 + iA2) * 31) + (mVar3 != null ? h.m.a(mVar3.b()) : 0);
    }

    public final String toString() {
        return "JointCopilotResult(carResult=" + this.f23041a + ", moodResult=" + this.f23042b + ", voiceResult=" + this.f23043c + ")";
    }
}
