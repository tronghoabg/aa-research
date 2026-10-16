package android.support.v4.app;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentManager$LaunchedFragmentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.app.FragmentManager$LaunchedFragmentInfo> CREATOR = new defpackage.x(2);
    public final java.lang.String a;
    public final int b;

    public FragmentManager$LaunchedFragmentInfo(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public FragmentManager$LaunchedFragmentInfo(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }
}
