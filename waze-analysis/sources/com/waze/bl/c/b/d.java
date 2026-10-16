package com.waze.bl.c.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.bl.b.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f17007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(null, null);
        x.f(str, "ordinalId");
        this.f17007a = str;
    }

    public final String b() {
        return this.f17007a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f17007a, ((d) obj).f17007a);
    }

    public final int hashCode() {
        return this.f17007a.hashCode();
    }

    public final String toString() {
        return "ReportClosure(ordinalId=" + this.f17007a + ")";
    }
}
