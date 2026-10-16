package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ft implements Parcelable {
    public static final Parcelable.Creator<ft> CREATOR = new df(2);

    /* renamed from: a, reason: collision with root package name */
    int f1510a;

    /* renamed from: b, reason: collision with root package name */
    int f1511b;

    /* renamed from: c, reason: collision with root package name */
    int[] f1512c;

    /* renamed from: d, reason: collision with root package name */
    boolean f1513d;

    ft(Parcel parcel) {
        this.f1510a = parcel.readInt();
        this.f1511b = parcel.readInt();
        this.f1513d = parcel.readInt() == 1;
        int i2 = parcel.readInt();
        if (i2 > 0) {
            int[] iArr = new int[i2];
            this.f1512c = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1510a + ", mGapDir=" + this.f1511b + ", mHasUnwantedGapAfter=" + this.f1513d + ", mGapPerSpan=" + Arrays.toString(this.f1512c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1510a);
        parcel.writeInt(this.f1511b);
        parcel.writeInt(this.f1513d ? 1 : 0);
        int[] iArr = this.f1512c;
        if (iArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1512c);
        }
    }

    ft() {
    }
}
