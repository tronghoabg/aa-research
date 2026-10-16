package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ceu implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.runtime.snapshots.SnapshotStateList createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        int i = parcel.readInt();
        defpackage.beh behVar = new defpackage.beh(parcel, classLoader, 15, null);
        if (i == 0) {
            return new androidx.compose.runtime.snapshots.SnapshotStateList();
        }
        defpackage.cbr cbrVarJ = defpackage.cbv.a.j();
        for (int i2 = 0; i2 < i; i2++) {
            cbrVarJ.add(behVar.invoke(java.lang.Integer.valueOf(i2)));
        }
        return new androidx.compose.runtime.snapshots.SnapshotStateList(cbrVarJ.c());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new androidx.compose.runtime.snapshots.SnapshotStateList[i];
    }
}
