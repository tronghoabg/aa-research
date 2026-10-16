package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class i extends MediaBrowser.SubscriptionCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f459a;

    i(k kVar) {
        this.f459a = kVar;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list) {
        int i2;
        k kVar = this.f459a;
        WeakReference weakReference = kVar.f462c;
        h hVar = weakReference == null ? null : (h) weakReference.get();
        if (hVar == null) {
            kVar.b(MediaBrowserCompat$MediaItem.fromMediaItemList(list));
            return;
        }
        List<MediaBrowserCompat$MediaItem> listFromMediaItemList = MediaBrowserCompat$MediaItem.fromMediaItemList(list);
        List listB = hVar.b();
        List listC = hVar.c();
        for (int i3 = 0; i3 < listB.size(); i3++) {
            Bundle bundle = (Bundle) listC.get(i3);
            if (bundle == null) {
                kVar.b(listFromMediaItemList);
            } else if (listFromMediaItemList != null) {
                int i4 = -1;
                int i5 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i6 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i5 != -1) {
                    i4 = i5;
                } else if (i6 != -1) {
                }
                if (i4 < 0 || i6 <= 0 || (i2 = i4 * i6) >= listFromMediaItemList.size()) {
                    List list2 = Collections.EMPTY_LIST;
                } else {
                    int size = i6 + i2;
                    if (size > listFromMediaItemList.size()) {
                        size = listFromMediaItemList.size();
                    }
                    listFromMediaItemList.subList(i2, size);
                }
            }
        }
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        this.f459a.a(str);
    }
}
