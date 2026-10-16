package com.bumptech.glide.load.b;

import android.content.res.AssetManager;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements ae, a {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f3248a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f3249b;

    public b(AssetManager assetManager, int i2) {
        this.f3249b = i2;
        this.f3248a = assetManager;
    }

    @Override // com.bumptech.glide.load.b.a
    public final com.bumptech.glide.load.data.e a(AssetManager assetManager, String str) {
        return this.f3249b != 0 ? new com.bumptech.glide.load.data.l(assetManager, str) : new com.bumptech.glide.load.data.t(assetManager, str);
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        return this.f3249b != 0 ? new ao(this.f3248a, this, 1) : new ao(this.f3248a, this, 1);
    }
}
