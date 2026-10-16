package com.waze.web;

import android.app.Activity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final Activity f45480a;

    /* renamed from: b, reason: collision with root package name */
    String f45481b;

    /* renamed from: c, reason: collision with root package name */
    String f45482c;

    b(Activity activity) {
        this.f45480a = activity;
    }

    public final void a() {
        Activity activity = this.f45480a;
        if (activity == null) {
            return;
        }
        activity.startActivityForResult(SimpleWebActivity.z(activity, this.f45481b, this.f45482c), SimpleWebActivity.f45474g);
    }

    public final void b(String str) {
        this.f45482c = str;
    }

    public final void c() {
        this.f45481b = "";
    }
}
