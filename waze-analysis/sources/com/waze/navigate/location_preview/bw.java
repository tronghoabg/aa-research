package com.waze.navigate.location_preview;

import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bw extends com.waze.reports_v2.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f31696a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f31697b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31698c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31699d;

    public bw(int i2, Intent intent, boolean z, boolean z2) {
        super(null, null);
        this.f31696a = i2;
        this.f31697b = intent;
        this.f31698c = z;
        this.f31699d = z2;
    }

    public final int a() {
        return this.f31696a;
    }

    public final Intent b() {
        return this.f31697b;
    }

    public final boolean c() {
        return this.f31698c;
    }

    public final boolean d() {
        return this.f31699d;
    }

    public bw() {
        this(0, null, false, true);
    }
}
