package com.bumptech.glide.load.a.b;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    final Context f3080a;

    /* renamed from: b, reason: collision with root package name */
    final ActivityManager f3081b;

    /* renamed from: c, reason: collision with root package name */
    float f3082c;

    /* renamed from: d, reason: collision with root package name */
    final k f3083d;

    public j(Context context) {
        this.f3082c = 1.0f;
        this.f3080a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f3081b = activityManager;
        this.f3083d = new k(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f3082c = 0.0f;
        }
    }

    public final l a() {
        return new l(this);
    }
}
