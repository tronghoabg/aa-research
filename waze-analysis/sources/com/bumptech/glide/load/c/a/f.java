package com.bumptech.glide.load.c.a;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements com.bumptech.glide.load.u {

    /* renamed from: a, reason: collision with root package name */
    private final d f3346a = new d();

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ com.bumptech.glide.load.a.aw a(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return this.f3346a.c(ImageDecoder.createSource((ByteBuffer) obj), i2, i3, sVar);
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, com.bumptech.glide.load.s sVar) {
        return true;
    }
}
