package com.airbnb.lottie.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final List f2273a;

    /* renamed from: b, reason: collision with root package name */
    private final char f2274b;

    /* renamed from: c, reason: collision with root package name */
    private final double f2275c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2276d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2277e;

    public d(List list, char c2, double d2, String str, String str2) {
        this.f2273a = list;
        this.f2274b = c2;
        this.f2275c = d2;
        this.f2276d = str;
        this.f2277e = str2;
    }

    public final double a() {
        return this.f2275c;
    }

    public final List b() {
        return this.f2273a;
    }

    public final int hashCode() {
        return (((this.f2274b * 31) + this.f2277e.hashCode()) * 31) + this.f2276d.hashCode();
    }
}
