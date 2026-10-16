package com.waze.menus;

import android.app.Activity;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f29756a;

    public t(Activity activity) {
        h.g.b.x.f(activity, "activity");
        this.f29756a = activity;
    }

    @Override // com.waze.menus.w
    public final void a(Intent intent, int i2) {
        this.f29756a.startActivityForResult(intent, i2);
    }
}
