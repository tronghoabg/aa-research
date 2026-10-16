package com.airbnb.lottie;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final int f2496a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2497b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2498c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2499d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2500e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f2501f;

    public t(int i2, int i3, String str, String str2, String str3) {
        this.f2496a = i2;
        this.f2497b = i3;
        this.f2498c = str;
        this.f2499d = str2;
        this.f2500e = str3;
    }

    public final int a() {
        return this.f2497b;
    }

    public final int b() {
        return this.f2496a;
    }

    public final Bitmap c() {
        return this.f2501f;
    }

    public final t d(float f2) {
        t tVar = new t((int) (this.f2496a * f2), (int) (this.f2497b * f2), this.f2498c, this.f2499d, this.f2500e);
        Bitmap bitmap = this.f2501f;
        if (bitmap != null) {
            tVar.f2501f = Bitmap.createScaledBitmap(bitmap, tVar.f2496a, tVar.f2497b, true);
        }
        return tVar;
    }

    public final String e() {
        return this.f2499d;
    }

    public final String f() {
        return this.f2498c;
    }

    public final void g(Bitmap bitmap) {
        this.f2501f = bitmap;
    }
}
