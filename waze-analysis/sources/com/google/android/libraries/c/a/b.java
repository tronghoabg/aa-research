package com.google.android.libraries.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5798a;

    /* renamed from: b, reason: collision with root package name */
    private String f5799b;

    public b(String str) {
        x.f(str, "serverClientId");
        this.f5798a = str;
    }

    public final c a() {
        return new c(this.f5798a, this.f5799b);
    }

    public final void b(String str) {
        this.f5799b = str;
    }
}
