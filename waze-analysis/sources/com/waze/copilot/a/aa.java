package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.a.g f22669a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.data.o f22670b;

    public aa(com.waze.copilot.data.a.g gVar, com.waze.copilot.data.o oVar) {
        h.g.b.x.f(gVar, "copilotAssetsMetaData");
        h.g.b.x.f(oVar, "jointCopilotResult");
        this.f22669a = gVar;
        this.f22670b = oVar;
    }

    public final com.waze.copilot.data.o a() {
        return this.f22670b;
    }

    public final com.waze.copilot.data.o b() {
        return this.f22670b;
    }

    public final com.waze.copilot.data.a.g c() {
        return this.f22669a;
    }

    public final com.waze.copilot.data.a.g d() {
        return this.f22669a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return h.g.b.x.n(this.f22669a, aaVar.f22669a) && h.g.b.x.n(this.f22670b, aaVar.f22670b);
    }

    public final int hashCode() {
        return (this.f22669a.hashCode() * 31) + this.f22670b.hashCode();
    }

    public final String toString() {
        return "CopilotMetadataAndAssetsModel(copilotAssetsMetaData=" + this.f22669a + ", jointCopilotResult=" + this.f22670b + ")";
    }
}
