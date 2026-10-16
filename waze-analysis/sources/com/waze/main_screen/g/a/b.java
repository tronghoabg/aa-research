package com.waze.main_screen.g.a;

import com.waze.view.bottom.BottomNotificationNativeManager;
import h.g.b.x;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final BottomNotificationNativeManager f26343a;

    public b(BottomNotificationNativeManager bottomNotificationNativeManager) {
        x.f(bottomNotificationNativeManager, "bottomNotificationNativeManager");
        this.f26343a = bottomNotificationNativeManager;
    }

    @Override // com.waze.main_screen.g.a.a
    public final k a() {
        return this.f26343a.getNotificationDataFlow();
    }
}
