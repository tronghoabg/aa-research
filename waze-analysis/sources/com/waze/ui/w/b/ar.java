package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.f.ak f43605a;

    /* renamed from: b, reason: collision with root package name */
    private final aq f43606b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f43607c;

    public ar(com.waze.ui.f.ak akVar, aq aqVar, boolean z) {
        h.g.b.x.f(akVar, "conversationUiState");
        h.g.b.x.f(aqVar, "mapMode");
        this.f43605a = akVar;
        this.f43606b = aqVar;
        this.f43607c = z;
    }

    public final com.waze.ui.f.ak a() {
        return this.f43605a;
    }

    public final boolean b() {
        return this.f43606b == aq.f43602a;
    }

    public final boolean c() {
        return this.f43607c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return h.g.b.x.n(this.f43605a, arVar.f43605a) && this.f43606b == arVar.f43606b && this.f43607c == arVar.f43607c;
    }

    public final int hashCode() {
        return (((this.f43605a.hashCode() * 31) + this.f43606b.hashCode()) * 31) + a.a.a(this.f43607c);
    }

    public final String toString() {
        return "ReportAgentUiState(conversationUiState=" + this.f43605a + ", mapMode=" + this.f43606b + ", useLargeReportMenu=" + this.f43607c + ")";
    }
}
