package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxd implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.runtime.ParcelableSnapshotMutableState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        defpackage.bxv bxvVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        java.lang.Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            bxvVar = defpackage.bxv.b;
        } else if (i == 1) {
            bxvVar = defpackage.bxv.c;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException(defpackage.a.bm(i, "Unsupported MutableState policy ", " was restored"));
            }
            bxvVar = defpackage.bxv.a;
        }
        return new androidx.compose.runtime.ParcelableSnapshotMutableState(value, bxvVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new androidx.compose.runtime.ParcelableSnapshotMutableState[i];
    }
}
