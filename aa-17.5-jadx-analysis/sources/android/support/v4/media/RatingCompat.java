package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.x;

@Deprecated
/* loaded from: classes2.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new x(7);
    public final int a;
    public final float b;
    public Object c;

    public RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static RatingCompat a(boolean z) {
        return new RatingCompat(1, true != z ? BitmapDescriptorFactory.HUE_RED : 1.0f);
    }

    public final boolean b() {
        return this.b >= BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < BitmapDescriptorFactory.HUE_RED ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
