package org.a.d.d;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Exception exc) {
        super(str, exc);
        x.f(str, NotificationCompat.CATEGORY_MESSAGE);
        x.f(exc, "parent");
    }
}
