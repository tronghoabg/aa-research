package com.waze.ui.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final String f43421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(String str) {
        super(null);
        h.g.b.x.f(str, "eventName");
        this.f43421a = str;
    }

    public final String a() {
        return this.f43421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa) && h.g.b.x.n(this.f43421a, ((aa) obj).f43421a);
    }

    public final int hashCode() {
        return this.f43421a.hashCode();
    }

    public final String toString() {
        return "CalendarEvent(eventName=" + this.f43421a + ")";
    }
}
