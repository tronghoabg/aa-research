package com.bumptech.glide.load.b;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class am implements ae {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f3224a;

    public am(Resources resources) {
        this.f3224a = resources;
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        return new ao(this.f3224a, alVar.a(Uri.class, AssetFileDescriptor.class), 0);
    }
}
