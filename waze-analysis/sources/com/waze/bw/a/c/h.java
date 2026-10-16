package com.waze.bw.a.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    private final long f17647a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17648b;

    /* renamed from: c, reason: collision with root package name */
    private final b f17649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j2, b bVar, String str) {
        super(null);
        x.f(str, "eventName");
        this.f17647a = j2;
        this.f17649c = bVar;
        this.f17648b = str;
    }

    @Override // com.waze.bw.a.c.j
    public final long a() {
        return this.f17647a;
    }

    public final String b() {
        return this.f17648b;
    }

    @Override // com.waze.bw.a.c.j
    public final b c() {
        return this.f17649c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17647a == hVar.f17647a && x.n(this.f17649c, hVar.f17649c) && x.n(this.f17648b, hVar.f17648b);
    }

    public final int hashCode() {
        b bVar = this.f17649c;
        return (((a.a.b(this.f17647a) * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f17648b.hashCode();
    }

    public final String toString() {
        return "CalendarEventDrive(eventId=" + this.f17647a + ", driveTimes=" + this.f17649c + ", eventName=" + this.f17648b + ")";
    }
}
