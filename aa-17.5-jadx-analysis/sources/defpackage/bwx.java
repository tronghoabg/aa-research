package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class bwx implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        bxp bxpVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            bxpVar = bxp.b;
        } else if (i == 1) {
            bxpVar = bxp.c;
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.bn(i, "Unsupported MutableState policy ", " was restored"));
            }
            bxpVar = bxp.a;
        }
        return new ParcelableSnapshotMutableState(value, bxpVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }
}
