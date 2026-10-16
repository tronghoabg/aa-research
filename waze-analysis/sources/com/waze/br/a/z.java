package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements aa {

    /* renamed from: a, reason: collision with root package name */
    private final String f17314a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.t.a.u f17315b;

    public z(String str, com.waze.t.a.u uVar) {
        h.g.b.x.f(str, "chatId");
        h.g.b.x.f(uVar, "conversationAgentResponse");
        this.f17314a = str;
        this.f17315b = uVar;
    }

    public final com.waze.t.a.u a() {
        return this.f17315b;
    }

    public final String b() {
        return this.f17314a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return h.g.b.x.n(this.f17314a, zVar.f17314a) && h.g.b.x.n(this.f17315b, zVar.f17315b);
    }

    public final int hashCode() {
        return (this.f17314a.hashCode() * 31) + this.f17315b.hashCode();
    }

    public final String toString() {
        return "Success(chatId=" + this.f17314a + ", conversationAgentResponse=" + this.f17315b + ")";
    }
}
