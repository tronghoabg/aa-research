package N;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class X implements Parcelable.ClassLoaderCreator {
    public static Y a(Parcel parcel, ClassLoader classLoader) {
        P p10;
        if (classLoader == null) {
            classLoader = X.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i5 = parcel.readInt();
        if (i5 == 0) {
            p10 = P.f7727c;
        } else if (i5 == 1) {
            p10 = P.f7730f;
        } else {
            if (i5 != 2) {
                throw new IllegalStateException(AbstractC0279p0.i(i5, "Unsupported MutableState policy ", " was restored"));
            }
            p10 = P.f7728d;
        }
        return new Y(value, p10);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new Y[i5];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
