package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s implements g {

    /* renamed from: a, reason: collision with root package name */
    private final ParcelFileDescriptorRewinder$InternalRewinder f3491a;

    public s(ParcelFileDescriptor parcelFileDescriptor) {
        this.f3491a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public static boolean d() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.g
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() {
        return this.f3491a.rewind();
    }
}
