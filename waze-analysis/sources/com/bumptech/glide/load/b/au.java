package com.bumptech.glide.load.b;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class au implements ae, av {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f3237a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3238b;

    public au(ContentResolver contentResolver, boolean z) {
        this.f3237a = contentResolver;
        this.f3238b = z;
    }

    @Override // com.bumptech.glide.load.b.av
    public final com.bumptech.glide.load.data.e a(Uri uri) {
        return new com.bumptech.glide.load.data.a(this.f3237a, uri, this.f3238b);
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        return new ax(this);
    }
}
