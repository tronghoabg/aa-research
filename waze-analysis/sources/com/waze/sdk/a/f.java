package com.waze.sdk.a;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends android.support.v4.media.k {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f35182d;

    f(h hVar) {
        Objects.requireNonNull(hVar);
        this.f35182d = hVar;
    }

    @Override // android.support.v4.media.k
    public final void a(String str) {
        com.waze.shared_infra.i.h.c("WazeSdk: subscriptionCallback.onError for parentId: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        h hVar = this.f35182d;
        hVar.f35308b = arrayList;
        hVar.f35184d = true;
        i.I(hVar.f35186f);
    }

    @Override // android.support.v4.media.k
    public final void b(List list) {
        ArrayList arrayList = new ArrayList();
        h hVar = this.f35182d;
        hVar.f35308b = arrayList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it.next();
            if (mediaBrowserCompat$MediaItem.isPlayable()) {
                hVar.f35308b.add(mediaBrowserCompat$MediaItem);
                if (mediaBrowserCompat$MediaItem.getDescription().getIconBitmap() == null && mediaBrowserCompat$MediaItem.getDescription().getIconUri() != null) {
                    com.waze.utils.i.a().c(mediaBrowserCompat$MediaItem.getDescription().getIconUri().toString(), new g(hVar));
                }
            }
        }
        hVar.f35184d = true;
        i.I(hVar.f35186f);
    }
}
