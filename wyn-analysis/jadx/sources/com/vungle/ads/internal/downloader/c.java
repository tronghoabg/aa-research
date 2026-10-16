package com.vungle.ads.internal.downloader;

import A.AbstractC0213f;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f32943a;

    /* renamed from: b, reason: collision with root package name */
    public int f32944b;

    /* renamed from: c, reason: collision with root package name */
    public long f32945c;

    /* renamed from: d, reason: collision with root package name */
    public long f32946d;

    /* renamed from: e, reason: collision with root package name */
    public long f32947e;

    public final int a() {
        return this.f32944b;
    }

    public final int b() {
        return this.f32943a;
    }

    public final void c(long j8) {
        this.f32945c = j8;
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Progress(status=");
        sbA.append(this.f32943a);
        sbA.append(", percent=");
        sbA.append(this.f32944b);
        sbA.append(", startAt=");
        sbA.append(this.f32945c);
        sbA.append(", readed=");
        sbA.append(this.f32946d);
        sbA.append(", total=");
        return AbstractC0213f.e(sbA, this.f32947e, ')');
    }

    public final void a(int i5) {
        this.f32944b = i5;
    }

    public final void b(int i5) {
        this.f32943a = i5;
    }

    public final void a(long j8) {
        this.f32946d = j8;
    }

    public final void b(long j8) {
        this.f32947e = j8;
    }
}
