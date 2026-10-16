package com.bumptech.glide.load.c.d;

import android.graphics.Bitmap;
import android.os.Handler;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i extends com.bumptech.glide.e.a.c {

    /* renamed from: a, reason: collision with root package name */
    final int f3419a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f3420b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3421c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f3422d;

    i(Handler handler, int i2, long j2) {
        this.f3420b = handler;
        this.f3419a = i2;
        this.f3421c = j2;
    }

    final Bitmap a() {
        return this.f3422d;
    }

    @Override // com.bumptech.glide.e.a.g
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f3422d = (Bitmap) obj;
        Handler handler = this.f3420b;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f3421c);
    }

    @Override // com.bumptech.glide.e.a.g
    public final void c() {
        this.f3422d = null;
    }
}
