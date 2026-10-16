package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class cz extends android.media.browse.MediaBrowser.SubscriptionCallback {
    final /* synthetic */ defpackage.db a;

    public cz(defpackage.db dbVar) {
        this.a = dbVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(java.lang.String str, java.util.List list) {
        int i;
        defpackage.db dbVar = this.a;
        java.lang.ref.WeakReference weakReference = dbVar.c;
        defpackage.se seVar = weakReference == null ? null : (defpackage.se) weakReference.get();
        if (seVar == null) {
            dbVar.a(str, android.support.v4.media.MediaBrowserCompat.MediaItem.b(list));
            return;
        }
        java.util.List listB = android.support.v4.media.MediaBrowserCompat.MediaItem.b(list);
        for (int i2 = 0; i2 < seVar.a.size(); i2++) {
            android.os.Bundle bundle = (android.os.Bundle) seVar.b.get(i2);
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
                    java.util.List list2 = java.util.Collections.EMPTY_LIST;
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
    public final void onError(java.lang.String str) {
        this.a.b(str);
    }
}
