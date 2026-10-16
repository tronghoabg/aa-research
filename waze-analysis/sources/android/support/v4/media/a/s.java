package android.support.v4.media.a;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new t(1);

    /* renamed from: a, reason: collision with root package name */
    private final MediaDescriptionCompat f410a;

    /* renamed from: b, reason: collision with root package name */
    private final long f411b;

    private s(MediaDescriptionCompat mediaDescriptionCompat, long j2) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j2 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f410a = mediaDescriptionCompat;
        this.f411b = j2;
    }

    public static s a(Object obj) {
        if (obj == null) {
            return null;
        }
        MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
        return new s(MediaDescriptionCompat.fromMediaDescription(queueItem.getDescription()), queueItem.getQueueId());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f410a + ", Id=" + this.f411b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        this.f410a.writeToParcel(parcel, i2);
        parcel.writeLong(this.f411b);
    }

    s(Parcel parcel) {
        this.f410a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f411b = parcel.readLong();
    }
}
