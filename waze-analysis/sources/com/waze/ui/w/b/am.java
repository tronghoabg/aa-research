package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43587a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43588b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.d.s f43589c;

    public am(com.waze.ui.d.s sVar, boolean z, boolean z2) {
        h.g.b.x.f(sVar, "conversationState");
        this.f43589c = sVar;
        this.f43587a = z;
        this.f43588b = z2;
    }

    public final boolean a() {
        return this.f43588b;
    }

    public final boolean b() {
        return this.f43587a;
    }

    public final com.waze.ui.d.s c() {
        return this.f43589c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return h.g.b.x.n(this.f43589c, amVar.f43589c) && this.f43587a == amVar.f43587a && this.f43588b == amVar.f43588b;
    }

    public final int hashCode() {
        return (((this.f43589c.hashCode() * 31) + a.a.a(this.f43587a)) * 31) + a.a.a(this.f43588b);
    }

    public final String toString() {
        return "ConversationalReportingState(conversationState=" + this.f43589c + ", voiceFocusModeEnabled=" + this.f43587a + ", useLargeReportMenu=" + this.f43588b + ")";
    }
}
