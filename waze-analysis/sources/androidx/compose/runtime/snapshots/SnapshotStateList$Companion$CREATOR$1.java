package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotStateList$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
    SnapshotStateList$Companion$CREATOR$1() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public SnapshotStateList<Object> createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        return SnapshotStateListKt.SnapshotStateList(parcel.readInt(), new l() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$Companion$CREATOR$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Parcel parcel2 = parcel;
                ClassLoader classLoader2 = classLoader;
                ((Integer) obj).intValue();
                return parcel2.readValue(classLoader2);
            }
        });
    }

    @Override // android.os.Parcelable.Creator
    public SnapshotStateList<Object>[] newArray(int i2) {
        return new SnapshotStateList[i2];
    }

    @Override // android.os.Parcelable.Creator
    public SnapshotStateList<Object> createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
