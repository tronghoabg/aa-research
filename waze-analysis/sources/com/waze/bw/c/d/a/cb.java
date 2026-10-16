package com.waze.bw.c.d.a;

import com.waze.bw.c.d.cw;
import com.waze.bw.c.d.dc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cb extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final cw f17923a;

    /* renamed from: b, reason: collision with root package name */
    private final dc f17924b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(cw cwVar, dc dcVar, boolean z) {
        super((byte[]) null);
        h.g.b.x.f(cwVar, "drive");
        h.g.b.x.f(dcVar, "upcomingDriveType");
        this.f17923a = cwVar;
        this.f17924b = dcVar;
        this.f17925c = z;
    }

    public final cw a() {
        return this.f17923a;
    }

    public final dc b() {
        return this.f17924b;
    }

    public final boolean c() {
        return this.f17925c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return h.g.b.x.n(this.f17923a, cbVar.f17923a) && h.g.b.x.n(this.f17924b, cbVar.f17924b) && this.f17925c == cbVar.f17925c;
    }

    public final int hashCode() {
        return (((this.f17923a.hashCode() * 31) + this.f17924b.hashCode()) * 31) + a.a.a(this.f17925c);
    }

    public final String toString() {
        return "UpcomingCell(drive=" + this.f17923a + ", upcomingDriveType=" + this.f17924b + ", isLatam=" + this.f17925c + ")";
    }
}
