package android.support.v4.media;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class RatingCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.RatingCompat> CREATOR = new defpackage.x(7);
    public final int a;
    public final float b;
    public java.lang.Object c;

    public RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static android.support.v4.media.RatingCompat a(boolean z) {
        return new android.support.v4.media.RatingCompat(1, true != z ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : 1.0f);
    }

    public final boolean b() {
        return this.b >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? "unrated" : java.lang.String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
