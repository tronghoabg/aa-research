package org.a.d.d;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        x.f(str, NotificationCompat.CATEGORY_MESSAGE);
    }
}
