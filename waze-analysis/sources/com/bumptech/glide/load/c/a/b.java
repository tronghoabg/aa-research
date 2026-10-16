package com.bumptech.glide.load.c.a;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements com.bumptech.glide.load.v {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.c f3335a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.v f3336b;

    public b(com.bumptech.glide.load.a.a.c cVar, com.bumptech.glide.load.v vVar) {
        this.f3335a = cVar;
        this.f3336b = vVar;
    }

    @Override // com.bumptech.glide.load.b
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, com.bumptech.glide.load.s sVar) {
        return this.f3336b.a(new ak(((BitmapDrawable) ((com.bumptech.glide.load.a.aw) obj).c()).getBitmap(), this.f3335a, 1), file, sVar);
    }

    @Override // com.bumptech.glide.load.v
    public final int b() {
        return 2;
    }
}
