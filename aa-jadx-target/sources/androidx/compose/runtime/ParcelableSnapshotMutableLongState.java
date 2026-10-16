package androidx.compose.runtime;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u0000 \u000e2\u00020\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroid/os/Parcelable;", "value", "", "<init>", "(J)V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "runtime"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, 1, defpackage.abnt.b}, xi = 48)
public final class ParcelableSnapshotMutableLongState extends defpackage.byl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.compose.runtime.ParcelableSnapshotMutableLongState> CREATOR = new defpackage.ea(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(e());
    }
}
