package com.waze.settings.tree;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.ifs.ui.x f37595a;

    v(com.waze.ifs.ui.x xVar) {
        this.f37595a = xVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        h.g.b.x.f(bitmap, "bitmap");
        com.waze.ifs.ui.x xVar = this.f37595a;
        xVar.a(bitmap);
        xVar.c();
    }

    @Override // com.waze.utils.h
    public final void b() {
        this.f37595a.c();
    }
}
