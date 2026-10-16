package V0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import s1.AbstractC3989b;

/* loaded from: classes.dex */
public final class f extends AbstractC3989b {
    public static final Parcelable.Creator<f> CREATOR = new N7.c(2);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f12884c;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i5 = parcel.readInt();
        int[] iArr = new int[i5];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f12884c = new SparseArray(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            this.f12884c.append(iArr[i10], parcelableArray[i10]);
        }
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        SparseArray sparseArray = this.f12884c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f12884c.keyAt(i10);
            parcelableArr[i10] = (Parcelable) this.f12884c.valueAt(i10);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i5);
    }
}
