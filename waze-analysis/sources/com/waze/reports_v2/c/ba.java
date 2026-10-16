package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba extends bf {

    /* renamed from: a, reason: collision with root package name */
    private final String f34230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(String str) {
        super(null);
        h.g.b.x.f(str, "followupPrompt");
        this.f34230a = str;
    }

    public final String a() {
        return this.f34230a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba) && h.g.b.x.n(this.f34230a, ((ba) obj).f34230a);
    }

    public final int hashCode() {
        return this.f34230a.hashCode();
    }

    public final String toString() {
        return "ExpectingUserFollowup(followupPrompt=" + this.f34230a + ")";
    }
}
