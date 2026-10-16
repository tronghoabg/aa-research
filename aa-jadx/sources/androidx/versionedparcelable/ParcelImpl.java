package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new defpackage.eep(10);
    public final defpackage.fid a;

    public ParcelImpl(android.os.Parcel parcel) {
        this.a = new defpackage.fic(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new defpackage.fic(parcel).k(this.a);
    }

    public ParcelImpl(defpackage.fid fidVar) {
        this.a = fidVar;
    }
}
