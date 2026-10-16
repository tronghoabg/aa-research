package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import d.C2381d;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C2381d {
    @Override // d.C2381d
    public final void c(int i5, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.s0(bundle);
        }
        if (i5 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
