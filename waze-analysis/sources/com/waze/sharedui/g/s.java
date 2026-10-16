package com.waze.sharedui.g;

import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f39006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39007b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39008c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f39009d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f39010e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f39011f;

    private s(r rVar) {
        this.f39006a = rVar.f39002a;
        this.f39007b = rVar.f39003b;
        this.f39008c = rVar.f39004c;
        this.f39009d = rVar.f39005d;
        this.f39011f = false;
        this.f39010e = null;
    }

    /* synthetic */ s(r rVar, byte[] bArr) {
        this(rVar);
    }

    public s(int i2, String str, Drawable drawable) {
        r rVar = new r(i2, str);
        rVar.g(drawable);
        this(rVar);
    }
}
