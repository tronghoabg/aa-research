package com.waze.menus;

import android.app.Activity;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s implements v {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f29755a;

    public s(Activity activity) {
        h.g.b.x.f(activity, "activity");
        this.f29755a = activity;
    }

    @Override // com.waze.menus.v
    public final void a(Intent intent) {
        Activity activity = this.f29755a;
        activity.setResult(-1, intent);
        activity.finish();
    }
}
