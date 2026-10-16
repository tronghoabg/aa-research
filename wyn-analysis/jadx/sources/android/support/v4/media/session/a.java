package android.support.v4.media.session;

import Va.M6;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17694a;

    public /* synthetic */ a(int i5) {
        this.f17694a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f17694a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f17672a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f17670a;

                    /* renamed from: b, reason: collision with root package name */
                    public final long f17671b;

                    {
                        this.f17670a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f17671b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f17670a);
                        sb2.append(", Id=");
                        return M6.s(sb2, this.f17671b, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i5) {
                        this.f17670a.writeToParcel(parcel2, i5);
                        parcel2.writeLong(this.f17671b);
                    }
                };
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null));
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f17675a = parcel.readInt();
                parcelableVolumeInfo.f17677c = parcel.readInt();
                parcelableVolumeInfo.f17678d = parcel.readInt();
                parcelableVolumeInfo.f17679e = parcel.readInt();
                parcelableVolumeInfo.f17676b = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f17694a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i5];
            case 1:
                return new MediaSessionCompat$QueueItem[i5];
            case 2:
                return new MediaSessionCompat$Token[i5];
            case 3:
                return new ParcelableVolumeInfo[i5];
            default:
                return new PlaybackStateCompat[i5];
        }
    }
}
