package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bu extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.d.t f19437a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(com.waze.av.d.t tVar) {
        super(null);
        h.g.b.x.f(tVar, NotificationCompat.CATEGORY_EVENT);
        this.f19437a = tVar;
    }

    public final com.waze.av.d.t a() {
        return this.f19437a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu) && h.g.b.x.n(this.f19437a, ((bu) obj).f19437a);
    }

    public final int hashCode() {
        return this.f19437a.hashCode();
    }

    public final String toString() {
        return "StartNavigation(event=" + this.f19437a + ")";
    }
}
