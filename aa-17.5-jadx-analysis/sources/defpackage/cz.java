package defpackage;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
class cz extends MediaBrowser.SubscriptionCallback {
    final /* synthetic */ db a;

    public cz(db dbVar) {
        this.a = dbVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list) {
        int i;
        db dbVar = this.a;
        WeakReference weakReference = dbVar.c;
        rz rzVar = weakReference == null ? null : (rz) weakReference.get();
        if (rzVar == null) {
            dbVar.a(str, MediaBrowserCompat.MediaItem.b(list));
            return;
        }
        List listB = MediaBrowserCompat.MediaItem.b(list);
        for (int i2 = 0; i2 < rzVar.a.size(); i2++) {
            Bundle bundle = (Bundle) rzVar.b.get(i2);
            if (bundle == null) {
                dbVar.a(str, listB);
            } else if (listB != null) {
                int i3 = -1;
                int i4 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i5 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i4 != -1) {
                    i3 = i4;
                } else if (i5 != -1) {
                }
                if (i3 < 0 || i5 <= 0 || (i = i3 * i5) >= listB.size()) {
                    List list2 = Collections.EMPTY_LIST;
                } else {
                    int size = i5 + i;
                    if (size > listB.size()) {
                        size = listB.size();
                    }
                    listB.subList(i, size);
                }
            }
        }
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        this.a.b(str);
    }
}
