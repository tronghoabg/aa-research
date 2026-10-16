package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public x(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.a) {
            case 0:
                return new android.support.v4.app.BackStackState(parcel);
            case 1:
                return new android.support.v4.app.BackStackRecordState(parcel);
            case 2:
                return new android.support.v4.app.FragmentManager$LaunchedFragmentInfo(parcel);
            case 3:
                return new android.support.v4.app.FragmentManagerState(parcel);
            case 4:
                return new android.support.v4.app.FragmentState(parcel);
            case 5:
                return new android.support.v4.media.MediaBrowserCompat.MediaItem(parcel);
            case 6:
                return android.support.v4.media.MediaDescriptionCompat.a(android.media.MediaDescription.CREATOR.createFromParcel(parcel));
            case 7:
                return new android.support.v4.media.RatingCompat(parcel.readInt(), parcel.readFloat());
            case 8:
                return new android.support.v4.media.session.MediaSessionCompat.QueueItem(parcel);
            case 9:
                return new android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper(parcel);
            case 10:
                return new android.support.v4.media.session.MediaSessionCompat.Token(parcel.readParcelable(null), null);
            case 11:
                return new android.support.v4.media.session.ParcelableVolumeInfo(parcel);
            case 12:
                return new android.support.v4.media.session.PlaybackStateCompat.CustomAction(parcel);
            case 13:
                return new android.support.v4.os.ResultReceiver(parcel);
            case 14:
                return new android.support.v7.widget.AppCompatSpinner.SavedState(parcel);
            case 15:
                return new android.support.v7.widget.LinearLayoutManager.SavedState(parcel);
            case 16:
                return new android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(parcel);
            case 17:
                return new android.support.v7.widget.StaggeredGridLayoutManager.SavedState(parcel);
            case 18:
                parcel.getClass();
                return new androidx.activity.result.ActivityResult(parcel.readInt(), parcel.readInt() != 0 ? (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel) : null);
            case 19:
                parcel.getClass();
                android.os.Parcelable parcelable = parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new androidx.activity.result.IntentSenderRequest((android.content.IntentSender) parcelable, (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            default:
                android.os.Bundle bundle = parcel.readBundle(getClass().getClassLoader());
                bundle.getClass();
                return new androidx.car.app.serialization.Bundleable(bundle);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new android.support.v4.app.BackStackState[i];
            case 1:
                return new android.support.v4.app.BackStackRecordState[i];
            case 2:
                return new android.support.v4.app.FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new android.support.v4.app.FragmentManagerState[i];
            case 4:
                return new android.support.v4.app.FragmentState[i];
            case 5:
                return new android.support.v4.media.MediaBrowserCompat.MediaItem[i];
            case 6:
                return new android.support.v4.media.MediaDescriptionCompat[i];
            case 7:
                return new android.support.v4.media.RatingCompat[i];
            case 8:
                return new android.support.v4.media.session.MediaSessionCompat.QueueItem[i];
            case 9:
                return new android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper[i];
            case 10:
                return new android.support.v4.media.session.MediaSessionCompat.Token[i];
            case 11:
                return new android.support.v4.media.session.ParcelableVolumeInfo[i];
            case 12:
                return new android.support.v4.media.session.PlaybackStateCompat.CustomAction[i];
            case 13:
                return new android.support.v4.os.ResultReceiver[i];
            case 14:
                return new android.support.v7.widget.AppCompatSpinner.SavedState[i];
            case 15:
                return new android.support.v7.widget.LinearLayoutManager.SavedState[i];
            case 16:
                return new android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
            case 17:
                return new android.support.v7.widget.StaggeredGridLayoutManager.SavedState[i];
            case 18:
                return new androidx.activity.result.ActivityResult[i];
            case 19:
                return new androidx.activity.result.IntentSenderRequest[i];
            default:
                return new androidx.car.app.serialization.Bundleable[i];
        }
    }
}
