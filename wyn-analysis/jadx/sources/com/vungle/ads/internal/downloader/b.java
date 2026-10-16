package com.vungle.ads.internal.downloader;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f32940a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f32941b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32942c;

    public b(int i5, Exception cause, int i10) {
        AbstractC3340k.e(cause, "cause");
        this.f32940a = i5;
        this.f32941b = cause;
        this.f32942c = i10;
    }

    public final Throwable a() {
        return this.f32941b;
    }

    public final int b() {
        return this.f32942c;
    }

    public final int c() {
        return this.f32940a;
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("DownloadError(serverCode=");
        sbA.append(this.f32940a);
        sbA.append(", reason=");
        sbA.append(this.f32942c);
        sbA.append(", cause=");
        sbA.append(this.f32941b);
        sbA.append(')');
        return sbA.toString();
    }
}
