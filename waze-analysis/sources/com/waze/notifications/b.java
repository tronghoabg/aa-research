package com.waze.notifications;

import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f32537a;

    /* renamed from: b, reason: collision with root package name */
    private String f32538b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f32539c;

    /* renamed from: d, reason: collision with root package name */
    private int f32540d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f32541e;

    /* renamed from: f, reason: collision with root package name */
    private a f32542f;

    /* renamed from: g, reason: collision with root package name */
    private int f32543g;

    /* renamed from: h, reason: collision with root package name */
    private final int f32544h;

    public b(int i2) {
        this.f32544h = i2;
    }

    public final c a() {
        return new c(this.f32537a, this.f32538b, this.f32539c, this.f32540d, this.f32543g, this.f32541e, this.f32542f, this.f32544h);
    }

    public final void b(String str) {
        this.f32538b = str;
    }

    public final void c(int i2) {
        this.f32543g = i2;
    }

    public final void d(Drawable drawable) {
        this.f32539c = drawable;
    }

    public final void e(a aVar) {
        this.f32542f = aVar;
    }

    public final void f(Runnable runnable) {
        this.f32541e = runnable;
    }

    public final void g(int i2) {
        this.f32540d = i2;
    }

    public final void h(String str) {
        this.f32537a = str;
    }
}
