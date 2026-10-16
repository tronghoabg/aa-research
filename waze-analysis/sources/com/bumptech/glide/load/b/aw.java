package com.bumptech.glide.load.b;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aw implements ae, av {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f3239a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3240b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f3241c;

    public aw(ContentResolver contentResolver, boolean z, int i2) {
        this.f3241c = i2;
        this.f3239a = contentResolver;
        this.f3240b = z;
    }

    @Override // com.bumptech.glide.load.b.av
    public final com.bumptech.glide.load.data.e a(Uri uri) {
        return this.f3241c != 0 ? new com.bumptech.glide.load.data.m(this.f3239a, uri, this.f3240b) : new com.bumptech.glide.load.data.u(this.f3239a, uri, this.f3240b);
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        return this.f3241c != 0 ? new ax(this) : new ax(this);
    }
}
