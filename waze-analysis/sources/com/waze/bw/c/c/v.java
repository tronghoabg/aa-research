package com.waze.bw.c.c;

import androidx.core.app.NotificationCompat;
import com.waze.bw.c.d.a.bp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends com.waze.sharedui.api.i {

    /* renamed from: a, reason: collision with root package name */
    private final bp f17864a;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(bp bpVar) {
        h.g.b.x.f(bpVar, NotificationCompat.CATEGORY_EVENT);
        byte[] bArr = null;
        super(bArr, bArr);
        this.f17864a = bpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && h.g.b.x.n(this.f17864a, ((v) obj).f17864a);
    }

    public final int hashCode() {
        return this.f17864a.hashCode();
    }

    public final bp i() {
        return this.f17864a;
    }

    public final String toString() {
        return "OptionsMenuEvent(event=" + this.f17864a + ")";
    }
}
