package com.waze.ui.w.b;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends com.waze.ui.w.ai {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.f.v f43699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.waze.ui.f.v vVar) {
        super(null);
        h.g.b.x.f(vVar, NotificationCompat.CATEGORY_EVENT);
        this.f43699a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f43699a, ((i) obj).f43699a);
    }

    public final int hashCode() {
        return this.f43699a.hashCode();
    }

    public final String toString() {
        return "ReportAgentAction(event=" + this.f43699a + ")";
    }

    public final com.waze.ui.f.v u() {
        return this.f43699a;
    }
}
