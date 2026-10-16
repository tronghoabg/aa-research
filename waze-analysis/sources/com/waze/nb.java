package com.waze;

import android.graphics.Bitmap;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class nb implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.g f31839a;

    nb(nc ncVar, com.waze.sharedui.g gVar) {
        this.f31839a = gVar;
        Objects.requireNonNull(ncVar);
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        this.f31839a.a(bitmap);
    }

    @Override // com.waze.utils.h
    public final void b() {
        this.f31839a.a(null);
    }
}
