package com.google.android.gms.common.a;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4661a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4662b = "";

    /* renamed from: c, reason: collision with root package name */
    private final int f4663c;

    public a(String str) {
        this.f4661a = str;
        int i2 = 2;
        while (i2 <= 7 && !Log.isLoggable(this.f4661a, i2)) {
            i2++;
        }
        this.f4663c = i2;
    }

    protected final String a(String str) {
        return this.f4662b.concat(str);
    }

    public final void b(String str) {
        if (this.f4663c <= 3) {
            Log.d(this.f4661a, a(str));
        }
    }

    public final void c(String str) {
        Log.e(this.f4661a, a(str));
    }
}
