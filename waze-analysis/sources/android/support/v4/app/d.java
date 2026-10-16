package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    final List f319a;

    /* renamed from: b, reason: collision with root package name */
    final List f320b;

    d(Parcel parcel) {
        this.f319a = parcel.createStringArrayList();
        this.f320b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f319a);
        parcel.writeTypedList(this.f320b);
    }

    d(List list, List list2) {
        this.f319a = list;
        this.f320b = list2;
    }
}
