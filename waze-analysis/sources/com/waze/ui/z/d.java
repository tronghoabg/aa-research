package com.waze.ui.z;

import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f43942a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43943b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f43944c;

    /* renamed from: d, reason: collision with root package name */
    private final List f43945d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43946e;

    public d(String str, int i2, boolean z, List list, String str2) {
        h.g.b.x.f(str, "destinationName");
        h.g.b.x.f(list, "participants");
        this.f43942a = str;
        this.f43943b = i2;
        this.f43944c = z;
        this.f43945d = list;
        this.f43946e = str2;
    }

    public final String a() {
        return this.f43942a;
    }

    public final String b() {
        return this.f43946e;
    }

    public final List c() {
        return this.f43945d;
    }

    public final boolean d() {
        List<aq> list = this.f43945d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (aq aqVar : list) {
            if ((aqVar instanceof al) && ((al) aqVar).e()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.f43944c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.g.b.x.n(this.f43942a, dVar.f43942a) && this.f43943b == dVar.f43943b && this.f43944c == dVar.f43944c && h.g.b.x.n(this.f43945d, dVar.f43945d) && h.g.b.x.n(this.f43946e, dVar.f43946e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f43942a.hashCode() * 31) + this.f43943b) * 31) + a.a.a(this.f43944c)) * 31) + this.f43945d.hashCode();
        String str = this.f43946e;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LiveDriveSheetContent(destinationName=" + this.f43942a + ", participantsCount=" + this.f43943b + ", isInGracePeriod=" + this.f43944c + ", participants=" + this.f43945d + ", shareMessage=" + this.f43946e + ")";
    }
}
