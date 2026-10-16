package com.bumptech.glide.load.b;

import com.google.android.gms.common.api.internal.be;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class at implements ad {

    /* renamed from: a, reason: collision with root package name */
    private static final at f3235a = new at(0);

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f3236b;

    @Deprecated
    public at(int i2) {
        this.f3236b = i2;
    }

    public static at c() {
        return f3235a;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final boolean a(Object obj) {
        if (this.f3236b != 0) {
            return obj.toString().startsWith("data:image");
        }
        return true;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final be b(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return this.f3236b != 0 ? new be(new com.bumptech.glide.f.d(obj), new i(obj.toString())) : new be(new com.bumptech.glide.f.d(obj), new as(obj, 0));
    }

    public at(int i2, byte[] bArr) {
        this.f3236b = i2;
    }
}
