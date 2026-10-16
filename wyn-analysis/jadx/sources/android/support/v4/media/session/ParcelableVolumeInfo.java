package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public int f17675a;

    /* renamed from: b, reason: collision with root package name */
    public int f17676b;

    /* renamed from: c, reason: collision with root package name */
    public int f17677c;

    /* renamed from: d, reason: collision with root package name */
    public int f17678d;

    /* renamed from: e, reason: collision with root package name */
    public int f17679e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f17675a);
        parcel.writeInt(this.f17677c);
        parcel.writeInt(this.f17678d);
        parcel.writeInt(this.f17679e);
        parcel.writeInt(this.f17676b);
    }
}
