package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes.dex */
public final class cen implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SnapshotStateList createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        int i = parcel.readInt();
        bee beeVar = new bee(parcel, classLoader, 15, null);
        if (i == 0) {
            return new SnapshotStateList();
        }
        cbl cblVarJ = cbp.a.j();
        for (int i2 = 0; i2 < i; i2++) {
            cblVarJ.add(beeVar.invoke(Integer.valueOf(i2)));
        }
        return new SnapshotStateList(cblVarJ.c());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SnapshotStateList[i];
    }
}
