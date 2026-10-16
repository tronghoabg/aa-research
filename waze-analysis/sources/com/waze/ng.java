package com.waze;

import android.content.Context;
import com.waze.resources.ResourcesNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ng implements com.waze.ui.r.a.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32427a;

    public ng(Context context) {
        h.g.b.x.f(context, "applicationContext");
        this.f32427a = context;
    }

    @Override // com.waze.ui.r.a.a.q
    public final Object a(String str, h.c.e eVar) {
        kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar.u();
        ResourcesNativeManager.getInstance().getOrDownloadSkinDrawable(this.f32427a.getResources(), str, ResourceDownloadType.RES_DOWNLOAD_IMAGE, new nf(lVar));
        Object objJ = lVar.j();
        if (objJ == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objJ;
    }
}
