package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import d.C2381d;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C2381d {
    @Override // d.C2381d
    public final void c(int i5, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.s0(bundle);
        }
        if (i5 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
