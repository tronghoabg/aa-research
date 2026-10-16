package androidx.compose.runtime;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0003¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "runtime"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, 1, defpackage.abnt.b}, xi = 48)
public final class ParcelableSnapshotMutableState<T> extends defpackage.byn<T> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.compose.runtime.ParcelableSnapshotMutableState<java.lang.Object>> CREATOR = new defpackage.bxd();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2;
        parcel.writeValue(a());
        defpackage.byo byoVar = ((defpackage.byn) this).a;
        if (defpackage.afga.f(byoVar, defpackage.bxv.b)) {
            i2 = 0;
        } else if (defpackage.afga.f(byoVar, defpackage.bxv.c)) {
            i2 = 1;
        } else {
            if (!defpackage.afga.f(byoVar, defpackage.bxv.a)) {
                throw new java.lang.IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
