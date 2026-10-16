package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t0 implements Parcelable {
    public static final Parcelable.Creator<t0> CREATOR = new Z6.c(15);

    /* renamed from: a, reason: collision with root package name */
    public int f18986a;

    /* renamed from: b, reason: collision with root package name */
    public int f18987b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f18988c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18989d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f18986a + ", mGapDir=" + this.f18987b + ", mHasUnwantedGapAfter=" + this.f18989d + ", mGapPerSpan=" + Arrays.toString(this.f18988c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f18986a);
        parcel.writeInt(this.f18987b);
        parcel.writeInt(this.f18989d ? 1 : 0);
        int[] iArr = this.f18988c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f18988c);
        }
    }
}
