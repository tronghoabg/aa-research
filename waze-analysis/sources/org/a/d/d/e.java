package org.a.d.d;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e() {
        super("A Koin Application has already been started");
        x.f("A Koin Application has already been started", NotificationCompat.CATEGORY_MESSAGE);
    }
}
