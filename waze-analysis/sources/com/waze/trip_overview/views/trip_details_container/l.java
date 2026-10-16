package com.waze.trip_overview.views.trip_details_container;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final long f41571a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f41572b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41573c;

    public l(long j2, boolean z, List list) {
        x.f(list, "routes");
        this.f41571a = j2;
        this.f41572b = z;
        this.f41573c = list;
    }

    public final long a() {
        return this.f41571a;
    }

    public final List b() {
        return this.f41573c;
    }

    public final boolean c() {
        return this.f41572b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f41571a == lVar.f41571a && this.f41572b == lVar.f41572b && x.n(this.f41573c, lVar.f41573c);
    }

    public final int hashCode() {
        return (((a.a.b(this.f41571a) * 31) + a.a.a(this.f41572b)) * 31) + this.f41573c.hashCode();
    }

    public final String toString() {
        return "ContainerData(selectedRouteId=" + this.f41571a + ", isNow=" + this.f41572b + ", routes=" + this.f41573c + ")";
    }

    public l() {
        this(null);
    }

    public /* synthetic */ l(byte[] bArr) {
        this(-1L, true, h.a.i.h());
    }
}
