package com.waze.ui.w.b;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.ui.w.ai {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.w.a.b f43693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.waze.ui.w.a.b bVar) {
        super(null);
        h.g.b.x.f(bVar, NotificationCompat.CATEGORY_EVENT);
        this.f43693a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && h.g.b.x.n(this.f43693a, ((e) obj).f43693a);
    }

    public final int hashCode() {
        return this.f43693a.hashCode();
    }

    public final String toString() {
        return "ConversationalReportingAction(event=" + this.f43693a + ")";
    }

    public final com.waze.ui.w.a.b u() {
        return this.f43693a;
    }
}
