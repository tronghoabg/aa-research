package android.support.v4.media;

import Z6.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new c(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f17668a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17669b;

    public RatingCompat(int i5, float f10) {
        this.f17668a = i5;
        this.f17669b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f17668a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f17668a);
        sb2.append(" rating=");
        float f10 = this.f17669b;
        sb2.append(f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f17668a);
        parcel.writeFloat(this.f17669b);
    }
}
