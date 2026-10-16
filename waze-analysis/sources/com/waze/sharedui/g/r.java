package com.waze.sharedui.g;

import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f39002a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39003b;

    /* renamed from: c, reason: collision with root package name */
    private String f39004c = null;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f39005d;

    public r(int i2, String str) {
        this.f39002a = i2;
        this.f39003b = str;
    }

    public final s c() {
        return new s(this, null);
    }

    public final void f(String str) {
        this.f39004c = str;
    }

    public final void g(Drawable drawable) {
        this.f39005d = drawable;
    }
}
