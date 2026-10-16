package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends y {

    /* renamed from: a, reason: collision with root package name */
    private final String f34139a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, String str2) {
        super(null);
        h.g.b.x.f(str, "message");
        h.g.b.x.f(str2, "conversationId");
        this.f34139a = str;
        this.f34140b = str2;
    }

    public final String a() {
        return this.f34139a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return h.g.b.x.n(this.f34139a, xVar.f34139a) && h.g.b.x.n(this.f34140b, xVar.f34140b);
    }

    public final int hashCode() {
        return (this.f34139a.hashCode() * 31) + this.f34140b.hashCode();
    }

    public final String toString() {
        return "FollowUpMessage(message=" + this.f34139a + ", conversationId=" + this.f34140b + ")";
    }
}
