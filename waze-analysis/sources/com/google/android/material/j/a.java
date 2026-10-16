package com.google.android.material.j;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.graphics.ColorUtils;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f6626a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f6627b;

    /* renamed from: c, reason: collision with root package name */
    private int f6628c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f6629d;

    public a() {
        new Path();
        Paint paint = new Paint();
        this.f6629d = paint;
        this.f6626a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f6627b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        new Paint(paint2);
    }

    public final void a(int i2) {
        this.f6628c = ColorUtils.setAlphaComponent(i2, 68);
        ColorUtils.setAlphaComponent(i2, 20);
        ColorUtils.setAlphaComponent(i2, 0);
        this.f6626a.setColor(this.f6628c);
    }
}
