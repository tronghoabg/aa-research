package com.waze.z.a.d;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am implements an {

    /* renamed from: a, reason: collision with root package name */
    private final al f45936a;

    public am(al alVar) {
        h.g.b.x.f(alVar, NotificationCompat.CATEGORY_STATUS);
        this.f45936a = alVar;
    }

    public final al a() {
        return this.f45936a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && this.f45936a == ((am) obj).f45936a;
    }

    public final int hashCode() {
        return this.f45936a.hashCode();
    }

    public final String toString() {
        return "SearchMate(status=" + this.f45936a + ")";
    }
}
