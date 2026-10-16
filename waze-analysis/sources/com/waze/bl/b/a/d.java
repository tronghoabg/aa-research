package com.waze.bl.b.a;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d() {
        super("missing audio locale");
        x.f("missing audio locale", NotificationCompat.CATEGORY_MESSAGE);
    }
}
