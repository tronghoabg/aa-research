package com.waze.bw.c.c;

import androidx.core.app.NotificationCompat;
import com.waze.bw.c.d.bl;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends com.waze.sharedui.api.i {

    /* renamed from: a, reason: collision with root package name */
    private final bl f17865a;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(bl blVar) {
        h.g.b.x.f(blVar, NotificationCompat.CATEGORY_EVENT);
        byte[] bArr = null;
        super(bArr, bArr);
        this.f17865a = blVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && h.g.b.x.n(this.f17865a, ((w) obj).f17865a);
    }

    public final int hashCode() {
        return this.f17865a.hashCode();
    }

    public final bl i() {
        return this.f17865a;
    }

    public final String toString() {
        return "SheetEvent(event=" + this.f17865a + ")";
    }
}
