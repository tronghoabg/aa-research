package android.support.v4.media.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new t(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f417b;

    /* renamed from: c, reason: collision with root package name */
    public final int f418c;

    /* renamed from: d, reason: collision with root package name */
    public final int f419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420e;

    public w(Parcel parcel) {
        this.f416a = parcel.readInt();
        this.f418c = parcel.readInt();
        this.f419d = parcel.readInt();
        this.f420e = parcel.readInt();
        this.f417b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f416a);
        parcel.writeInt(this.f418c);
        parcel.writeInt(this.f419d);
        parcel.writeInt(this.f420e);
        parcel.writeInt(this.f417b);
    }
}
