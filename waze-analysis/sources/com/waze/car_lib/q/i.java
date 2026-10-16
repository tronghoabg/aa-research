package com.waze.car_lib.q;

import android.content.Context;
import com.waze.ResourceDownloadType;
import com.waze.resources.ResourcesNativeManager;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20862a;

    public i(Context context) {
        x.f(context, "applicationContext");
        this.f20862a = context;
    }

    @Override // com.waze.car_lib.q.h
    public final Object a(String str, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        ResourcesNativeManager.getInstance().getOrDownloadSkinDrawable(this.f20862a.getResources(), str, ResourceDownloadType.RES_DOWNLOAD_IMAGE, new com.waze.destination_cell.b.b(completableDeferredJ, 1));
        return completableDeferredJ.c(eVar);
    }
}
