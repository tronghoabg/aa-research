package com.google.android.material.h;

import android.graphics.Typeface;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f6560a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6561b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6562c;

    public e(a aVar, Typeface typeface) {
        this.f6560a = typeface;
        this.f6561b = aVar;
    }

    private final void d(Typeface typeface) {
        if (this.f6562c) {
            return;
        }
        this.f6561b.a(typeface);
    }

    public final void a() {
        this.f6562c = true;
    }

    public final void b() {
        d(this.f6560a);
    }

    public final void c(Typeface typeface) {
        d(typeface);
    }
}
