package com.waze.bw.c.d;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cd implements ce {

    /* renamed from: a, reason: collision with root package name */
    private final cc f18012a;

    public cd(cc ccVar) {
        h.g.b.x.f(ccVar, NotificationCompat.CATEGORY_STATUS);
        this.f18012a = ccVar;
    }

    public final cc a() {
        return this.f18012a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd) && h.g.b.x.n(this.f18012a, ((cd) obj).f18012a);
    }

    public final int hashCode() {
        return this.f18012a.hashCode();
    }

    public final String toString() {
        return "SearchMate(status=" + this.f18012a + ")";
    }
}
