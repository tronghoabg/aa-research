package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.a.v;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class j extends i {
    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list, Bundle bundle) {
        v.b(bundle);
        MediaBrowserCompat$MediaItem.fromMediaItemList(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str, Bundle bundle) {
        v.b(bundle);
    }
}
