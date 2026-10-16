package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class au implements com.bumptech.glide.load.u {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3331a;

    public au(int i2) {
        this.f3331a = i2;
    }

    @Override // com.bumptech.glide.load.u
    public final /* synthetic */ com.bumptech.glide.load.a.aw a(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return this.f3331a != 0 ? new com.bumptech.glide.load.c.c((File) obj) : new at((Bitmap) obj);
    }

    @Override // com.bumptech.glide.load.u
    public final /* synthetic */ boolean b(Object obj, com.bumptech.glide.load.s sVar) {
        if (this.f3331a != 0) {
            return true;
        }
        return true;
    }
}
