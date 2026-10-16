package b6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* loaded from: classes3.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new Z6.c(24);

    /* renamed from: b, reason: collision with root package name */
    public final int f19355b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19356c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19357d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f19358e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f19359f;

    public k(int i5, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f19355b = i5;
        this.f19356c = i10;
        this.f19357d = i11;
        this.f19358e = iArr;
        this.f19359f = iArr2;
    }

    @Override // b6.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f19355b == kVar.f19355b && this.f19356c == kVar.f19356c && this.f19357d == kVar.f19357d && Arrays.equals(this.f19358e, kVar.f19358e) && Arrays.equals(this.f19359f, kVar.f19359f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19359f) + ((Arrays.hashCode(this.f19358e) + ((((((527 + this.f19355b) * 31) + this.f19356c) * 31) + this.f19357d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f19355b);
        parcel.writeInt(this.f19356c);
        parcel.writeInt(this.f19357d);
        parcel.writeIntArray(this.f19358e);
        parcel.writeIntArray(this.f19359f);
    }

    public k(Parcel parcel) {
        super("MLLT");
        this.f19355b = parcel.readInt();
        this.f19356c = parcel.readInt();
        this.f19357d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i5 = v.f46721a;
        this.f19358e = iArrCreateIntArray;
        this.f19359f = parcel.createIntArray();
    }
}
