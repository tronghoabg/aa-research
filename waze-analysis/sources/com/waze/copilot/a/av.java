package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class av extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.y f22725a;

    public av(com.waze.copilot.data.y yVar) {
        h.g.b.x.f(yVar, "failedSelectionsIds");
        this.f22725a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av) && h.g.b.x.n(this.f22725a, ((av) obj).f22725a);
    }

    public final int hashCode() {
        return this.f22725a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RefreshCopilotAssetsError(failedSelectionsIds=" + this.f22725a + ")";
    }
}
