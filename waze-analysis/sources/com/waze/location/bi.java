package com.waze.location;

import android.location.Location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final long f25348a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25349b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25350c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25351d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25352e;

    /* renamed from: f, reason: collision with root package name */
    private int f25353f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25354g;

    /* renamed from: h, reason: collision with root package name */
    private int f25355h;

    /* renamed from: i, reason: collision with root package name */
    private final double f25356i;

    /* renamed from: j, reason: collision with root package name */
    private int f25357j;

    /* renamed from: k, reason: collision with root package name */
    private int f25358k;

    bi(Location location) {
        this.f25353f = 0;
        this.f25355h = 0;
        this.f25357j = -1;
        this.f25358k = -1;
        this.f25348a = location.getTime();
        this.f25349b = bg.b(location.getLatitude());
        this.f25350c = bg.b(location.getLongitude());
        this.f25351d = (int) Math.round(location.getAltitude());
        boolean zHasSpeed = location.hasSpeed();
        this.f25352e = zHasSpeed;
        if (zHasSpeed) {
            this.f25353f = (int) (location.getSpeed() * 1000.0f);
        }
        boolean zHasBearing = location.hasBearing();
        this.f25354g = zHasBearing;
        if (zHasBearing) {
            this.f25355h = (int) location.getBearing();
        }
        this.f25356i = location.getAccuracy();
        if (location.hasSpeedAccuracy()) {
            this.f25357j = (int) (location.getSpeedAccuracyMetersPerSecond() * 1000.0f);
        }
        if (location.hasBearingAccuracy()) {
            this.f25358k = (int) location.getBearingAccuracyDegrees();
        }
    }

    public final double a() {
        return this.f25356i;
    }

    public final int b() {
        return this.f25351d;
    }

    public final int c() {
        return this.f25349b;
    }

    public final int d() {
        return this.f25350c;
    }

    public final int e() {
        return this.f25353f;
    }

    public final int f() {
        return this.f25357j;
    }

    public final int g() {
        return this.f25355h;
    }

    public final int h() {
        return this.f25358k;
    }

    public final long i() {
        return this.f25348a;
    }

    public final boolean j() {
        return this.f25352e;
    }

    public final boolean k() {
        return this.f25354g;
    }
}
