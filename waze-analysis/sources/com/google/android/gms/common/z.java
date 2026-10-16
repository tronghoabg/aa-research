package com.google.android.gms.common;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private String f5178a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f5179b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f5180c = null;

    /* synthetic */ z() {
    }

    final aa a() {
        Boolean bool = this.f5179b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f5180c == null) {
            throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
        }
        String str = this.f5178a;
        boolean zBooleanValue = bool.booleanValue();
        this.f5180c.booleanValue();
        return new aa(str, zBooleanValue);
    }

    final void b(boolean z) {
        this.f5179b = Boolean.valueOf(z);
    }

    final void c() {
        this.f5180c = true;
    }

    final void d(String str) {
        this.f5178a = str;
    }
}
