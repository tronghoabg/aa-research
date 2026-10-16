package com.waze.sdk.a;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends android.support.v4.media.k {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ i f35180d;

    d(i iVar) {
        Objects.requireNonNull(iVar);
        this.f35180d = iVar;
    }

    @Override // android.support.v4.media.k
    public final void a(String str) {
        com.waze.shared_infra.i.h.c("WazeSdk: rootSubscriptionCallback.onError for parentId: ".concat(String.valueOf(str)));
        i iVar = this.f35180d;
        iVar.f35196j = System.currentTimeMillis();
        if (iVar.f35195i == null) {
            iVar.f35195i = new ArrayList();
        }
        i.I(iVar);
    }

    @Override // android.support.v4.media.k
    public final void b(List list) {
        i iVar = this.f35180d;
        iVar.f35196j = System.currentTimeMillis();
        HashMap map = new HashMap();
        if (iVar.f35195i != null) {
            for (h hVar : iVar.f35195i) {
                map.put(hVar.f35183c, hVar);
            }
        }
        iVar.f35195i = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it.next();
            if (mediaBrowserCompat$MediaItem == null) {
                com.waze.shared_infra.i.h.j("WazeSdk: unexpected null item, skipping to avoid NPE");
            } else if (mediaBrowserCompat$MediaItem.isBrowsable()) {
                String mediaId = mediaBrowserCompat$MediaItem.getMediaId();
                if (map.containsKey(mediaId)) {
                    iVar.f35195i.add((h) map.get(mediaId));
                    map.remove(mediaId);
                } else {
                    iVar.f35195i.add(new h(iVar, mediaBrowserCompat$MediaItem));
                }
            } else {
                arrayList.add(mediaBrowserCompat$MediaItem);
            }
        }
        if (!arrayList.isEmpty()) {
            h hVar2 = new h(iVar);
            iVar.f35195i.add(0, hVar2);
            hVar2.f35185e.b(arrayList);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            iVar.f35190d.f((String) it2.next());
        }
        if (iVar.f35195i.isEmpty()) {
            i.I(iVar);
        } else {
            iVar.f35197k.postDelayed(new Runnable() { // from class: com.waze.sdk.a.c
                @Override // java.lang.Runnable
                public final void run() {
                    i.I(this.f35179a.f35180d);
                }
            }, 11000L);
        }
    }
}
