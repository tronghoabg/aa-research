package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.x;
import java.util.List;

/* loaded from: classes2.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new x(0);
    public final List a;
    public final List b;

    public BackStackState(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }

    public BackStackState(List list, List list2) {
        this.a = list;
        this.b = list2;
    }
}
