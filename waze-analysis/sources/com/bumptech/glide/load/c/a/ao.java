package com.bumptech.glide.load.c.a;

import android.content.pm.PackageManager;
import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ao implements com.bumptech.glide.load.u {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.c.c.g f3318a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.c f3319b;

    public ao(com.bumptech.glide.load.c.c.g gVar, com.bumptech.glide.load.a.a.c cVar) {
        this.f3318a = gVar;
        this.f3319b = cVar;
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ com.bumptech.glide.load.a.aw a(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        com.bumptech.glide.load.a.aw awVarC = this.f3318a.c((Uri) obj, sVar);
        if (awVarC == null) {
            return null;
        }
        return y.a(this.f3319b, ((com.bumptech.glide.load.c.c.e) awVarC).c(), i2, i3);
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, com.bumptech.glide.load.s sVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
