package android.support.v4.app;

/* JADX INFO: loaded from: classes2.dex */
public class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.app.BackStackState> CREATOR = new defpackage.x(0);
    public final java.util.List a;
    public final java.util.List b;

    public BackStackState(android.os.Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(android.support.v4.app.BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }

    public BackStackState(java.util.List list, java.util.List list2) {
        this.a = list;
        this.b = list2;
    }
}
