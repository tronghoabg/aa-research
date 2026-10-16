package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final Object f17673a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f17674b;

    public MediaSessionCompat$Token(Parcelable parcelable) {
        this.f17674b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Parcelable parcelable = this.f17674b;
        if (parcelable == null) {
            return mediaSessionCompat$Token.f17674b == null;
        }
        Parcelable parcelable2 = mediaSessionCompat$Token.f17674b;
        if (parcelable2 == null) {
            return false;
        }
        return parcelable.equals(parcelable2);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f17674b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f17674b, i5);
    }
}
