package com.waze.map.main;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aw extends bc {

    /* renamed from: a, reason: collision with root package name */
    private final Lifecycle.Event f29356a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(Lifecycle.Event event) {
        super(null);
        h.g.b.x.f(event, NotificationCompat.CATEGORY_EVENT);
        this.f29356a = event;
    }

    public final Lifecycle.Event a() {
        return this.f29356a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && this.f29356a == ((aw) obj).f29356a;
    }

    public final int hashCode() {
        return this.f29356a.hashCode();
    }

    public final String toString() {
        return "LifecycleEvent(event=" + this.f29356a + ")";
    }
}
