package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new B1(19);

    /* renamed from: b, reason: collision with root package name */
    public final int f4190b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4191c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4192d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f4193e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4194f;

    public m(int i5, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4190b = i5;
        this.f4191c = i10;
        this.f4192d = i11;
        this.f4193e = iArr;
        this.f4194f = iArr2;
    }

    @Override // G2.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f4190b == mVar.f4190b && this.f4191c == mVar.f4191c && this.f4192d == mVar.f4192d && Arrays.equals(this.f4193e, mVar.f4193e) && Arrays.equals(this.f4194f, mVar.f4194f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4194f) + ((Arrays.hashCode(this.f4193e) + ((((((527 + this.f4190b) * 31) + this.f4191c) * 31) + this.f4192d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f4190b);
        parcel.writeInt(this.f4191c);
        parcel.writeInt(this.f4192d);
        parcel.writeIntArray(this.f4193e);
        parcel.writeIntArray(this.f4194f);
    }

    public m(Parcel parcel) {
        super("MLLT");
        this.f4190b = parcel.readInt();
        this.f4191c = parcel.readInt();
        this.f4192d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i5 = x.f9724a;
        this.f4193e = iArrCreateIntArray;
        this.f4194f = parcel.createIntArray();
    }
}
