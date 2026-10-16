package com.waze.modules.c;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends com.waze.ae.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f29900a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(null);
        h.g.b.x.f(str, NotificationCompat.CATEGORY_EVENT);
        this.f29900a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f29900a, ((b) obj).f29900a);
    }

    public final int hashCode() {
        return this.f29900a.hashCode();
    }

    public final String i() {
        return this.f29900a;
    }

    public final String toString() {
        return "Event(event=" + this.f29900a + ")";
    }
}
