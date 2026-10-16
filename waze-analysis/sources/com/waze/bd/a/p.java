package com.waze.bd.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name */
    private final String f16217a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, String str2) {
        super(null);
        x.f(str, "meetingId");
        x.f(str2, "meetingName");
        this.f16217a = str;
        this.f16218b = str2;
    }

    @Override // com.waze.bd.a.q
    public final String a() {
        return this.f16217a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return x.n(this.f16217a, pVar.f16217a) && x.n(this.f16218b, pVar.f16218b);
    }

    public final int hashCode() {
        return (this.f16217a.hashCode() * 31) + this.f16218b.hashCode();
    }

    public final String toString() {
        return "CalendarDrive(meetingId=" + this.f16217a + ", meetingName=" + this.f16218b + ")";
    }
}
