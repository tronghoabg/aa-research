package com.waze.copilot.data.a;

import androidx.core.app.NotificationCompat;
import com.waze.copilot.data.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends l {

    /* renamed from: a, reason: collision with root package name */
    private final x f22927a;

    public i(x xVar) {
        h.g.b.x.f(xVar, NotificationCompat.CATEGORY_STATUS);
        this.f22927a = xVar;
    }

    public final x a() {
        return this.f22927a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f22927a == ((i) obj).f22927a;
    }

    public final int hashCode() {
        return this.f22927a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "BadStatusError(status=" + this.f22927a + ")";
    }
}
