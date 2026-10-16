package android.support.v4.app;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class FragmentManagerState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.app.FragmentManagerState> CREATOR = new x(3);
    public java.util.ArrayList a;
    public java.util.ArrayList b;
    public android.support.v4.app.BackStackRecordState[] c;
    public int d;
    public java.lang.String e;
    public java.util.ArrayList f;
    public java.util.ArrayList g;
    public java.util.ArrayList h;

    public FragmentManagerState(android.os.Parcel parcel) {
        this.e = null;
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (android.support.v4.app.BackStackRecordState[]) parcel.createTypedArray(android.support.v4.app.BackStackRecordState.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(android.support.v4.app.BackStackState.CREATOR);
        this.h = parcel.createTypedArrayList(android.support.v4.app.FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
    }

    public FragmentManagerState() {
        this.e = null;
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
    }
}
