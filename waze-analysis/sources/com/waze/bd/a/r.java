package com.waze.bd.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r extends q {

    /* renamed from: a, reason: collision with root package name */
    private final String f16219a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str) {
        super(null);
        x.f(str, "meetingId");
        this.f16219a = str;
    }

    @Override // com.waze.bd.a.q
    public final String a() {
        return this.f16219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && x.n(this.f16219a, ((r) obj).f16219a);
    }

    public final int hashCode() {
        return this.f16219a.hashCode();
    }

    public final String toString() {
        return "PlannedDrive(meetingId=" + this.f16219a + ")";
    }
}
