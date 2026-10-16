package android.support.v4.media;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class m implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f465a;

    m(int i2) {
        this.f465a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f465a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new p(parcel.readInt(), parcel.readFloat()) : new MediaMetadataCompat(parcel) : new MediaBrowserCompat$MediaItem(parcel) : MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f465a;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? new p[i2] : new MediaMetadataCompat[i2] : new MediaBrowserCompat$MediaItem[i2] : new MediaDescriptionCompat[i2];
    }
}
