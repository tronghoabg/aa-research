package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bo implements Parcelable {
    public static final Parcelable.Creator<bo> CREATOR = new c(2);

    /* renamed from: a, reason: collision with root package name */
    final String f182a;

    /* renamed from: b, reason: collision with root package name */
    final int f183b;

    bo(Parcel parcel) {
        this.f182a = parcel.readString();
        this.f183b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f182a);
        parcel.writeInt(this.f183b);
    }

    bo(String str, int i2) {
        this.f182a = str;
        this.f183b = i2;
    }
}
