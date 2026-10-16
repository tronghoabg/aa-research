package com.waze.reports_v2.presentation.a;

import com.waze.reports_v2.c.dj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private final dj f34683a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.e.c f34684b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34685c;

    public av(dj djVar, com.waze.sharedui.e.c cVar, long j2) {
        h.g.b.x.f(djVar, "menuToOpen");
        h.g.b.x.f(cVar, "location");
        this.f34683a = djVar;
        this.f34684b = cVar;
        this.f34685c = j2;
    }

    public final long a() {
        return this.f34685c;
    }

    public final dj b() {
        return this.f34683a;
    }

    public final com.waze.sharedui.e.c c() {
        return this.f34684b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        return this.f34683a == avVar.f34683a && h.g.b.x.n(this.f34684b, avVar.f34684b) && this.f34685c == avVar.f34685c;
    }

    public final int hashCode() {
        return (((this.f34683a.hashCode() * 31) + this.f34684b.hashCode()) * 31) + a.a.b(this.f34685c);
    }

    public final String toString() {
        return "Menu(menuToOpen=" + this.f34683a + ", location=" + this.f34684b + ", reportTimeEpochMs=" + this.f34685c + ")";
    }
}
