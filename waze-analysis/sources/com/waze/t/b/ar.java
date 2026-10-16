package com.waze.t.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final List f40690a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40691b;

    static {
        new ar(h.a.i.h(), h.a.i.h());
    }

    public ar(List list, List list2) {
        h.g.b.x.f(list, "actions");
        h.g.b.x.f(list2, "actionResults");
        this.f40690a = list;
        this.f40691b = list2;
    }

    public final List a() {
        return this.f40691b;
    }

    public final List b() {
        return this.f40690a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return h.g.b.x.n(this.f40690a, arVar.f40690a) && h.g.b.x.n(this.f40691b, arVar.f40691b);
    }

    public final int hashCode() {
        return (this.f40690a.hashCode() * 31) + this.f40691b.hashCode();
    }

    public final String toString() {
        return "ConversationHistory(actions=" + this.f40690a + ", actionResults=" + this.f40691b + ")";
    }
}
