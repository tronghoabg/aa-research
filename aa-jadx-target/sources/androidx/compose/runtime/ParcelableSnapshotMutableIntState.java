package androidx.compose.runtime;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000 \r2\u00020\u0002¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroidx/compose/runtime/SnapshotMutableIntStateImpl;", "Landroid/os/Parcelable;", "value", "", "<init>", "(I)V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "describeContents", "Companion", "runtime"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, 1, defpackage.abnt.b}, xi = 48)
public final class ParcelableSnapshotMutableIntState extends defpackage.byj implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.compose.runtime.ParcelableSnapshotMutableIntState> CREATOR = new defpackage.ea(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(e());
    }
}
