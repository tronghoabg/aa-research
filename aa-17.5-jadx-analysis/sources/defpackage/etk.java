package defpackage;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;

/* loaded from: classes2.dex */
final class etk extends etp {
    final /* synthetic */ erb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etk(Object obj, erb erbVar) {
        super(obj);
        this.a = erbVar;
    }

    @Override // defpackage.etp
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        if (mediaItem == null) {
            this.a.I(null);
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        mediaItem.writeToParcel(parcelObtain, 0);
        this.a.I(parcelObtain);
    }
}
