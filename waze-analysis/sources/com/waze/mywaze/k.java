package com.waze.mywaze;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f30591a;

    k(l lVar) {
        this.f30591a = lVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        h.ab abVar;
        com.waze.sharedui.views.i iVar = new com.waze.sharedui.views.i(bitmap, 0);
        l lVar = this.f30591a;
        ImageView imageView = lVar.q;
        if (imageView != null) {
            imageView.setImageDrawable(iVar);
        }
        ImageView imageView2 = lVar.q;
        if (imageView2 != null) {
            imageView2.requestLayout();
            abVar = h.ab.f48028a;
        } else {
            abVar = null;
        }
        if (abVar == null) {
            lVar.f30598g.b("failed to download image ".concat(String.valueOf(lVar.f30601j)));
        }
    }

    @Override // com.waze.utils.h
    public final void b() {
        l lVar = this.f30591a;
        lVar.f30598g.b("failed to download image ".concat(String.valueOf(lVar.f30601j)));
    }
}
