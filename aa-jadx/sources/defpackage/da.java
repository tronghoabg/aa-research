package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class da extends defpackage.cz {
    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(java.lang.String str, java.util.List list, android.os.Bundle bundle) {
        android.support.v4.media.session.MediaSessionCompat.c(bundle);
        android.support.v4.media.MediaBrowserCompat.MediaItem.b(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.MediaSessionCompat.c(bundle);
    }
}
