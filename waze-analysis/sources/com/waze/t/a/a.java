package com.waze.t.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40632a;

    /* renamed from: b, reason: collision with root package name */
    private final u f40633b;

    public a(String str, u uVar) {
        x.f(str, "conversationId");
        x.f(uVar, "response");
        this.f40632a = str;
        this.f40633b = uVar;
    }

    public final u a() {
        return this.f40633b;
    }

    public final String b() {
        return this.f40632a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f40632a, aVar.f40632a) && x.n(this.f40633b, aVar.f40633b);
    }

    public final int hashCode() {
        return (this.f40632a.hashCode() * 31) + this.f40633b.hashCode();
    }

    public final String toString() {
        return "StartConversationResponse(conversationId=" + this.f40632a + ", response=" + this.f40633b + ")";
    }
}
