package com.bumptech.glide.load.c.a;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class al implements com.bumptech.glide.load.u {

    /* renamed from: a, reason: collision with root package name */
    private final w f3311a;

    public al(w wVar) {
        this.f3311a = wVar;
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ com.bumptech.glide.load.a.aw a(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return this.f3311a.a((ParcelFileDescriptor) obj, i2, i3, sVar);
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, com.bumptech.glide.load.s sVar) {
        return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && com.bumptech.glide.load.data.s.d();
    }
}
