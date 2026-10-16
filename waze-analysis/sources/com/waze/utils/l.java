package com.waze.utils;

import android.graphics.Bitmap;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f44896a;

    l(n nVar, m mVar) {
        this.f44896a = mVar;
        Objects.requireNonNull(nVar);
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        m mVar = this.f44896a;
        if (mVar != null) {
            mVar.a(bitmap);
        }
    }

    @Override // com.waze.utils.h
    public final void b() {
        m mVar = this.f44896a;
        if (mVar != null) {
            mVar.a(null);
        }
    }
}
