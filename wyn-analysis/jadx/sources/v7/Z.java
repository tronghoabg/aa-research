package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Z extends AbstractC2614a {
    public static final Parcelable.Creator<Z> CREATOR = new U(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f46948a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f46949b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f46950c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f46951d;

    public Z(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f46948a = j8;
        AbstractC1732v.i(bArr);
        this.f46949b = bArr;
        AbstractC1732v.i(bArr2);
        this.f46950c = bArr2;
        AbstractC1732v.i(bArr3);
        this.f46951d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return this.f46948a == z2.f46948a && Arrays.equals(this.f46949b, z2.f46949b) && Arrays.equals(this.f46950c, z2.f46950c) && Arrays.equals(this.f46951d, z2.f46951d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f46948a), this.f46949b, this.f46950c, this.f46951d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 8);
        parcel.writeLong(this.f46948a);
        AbstractC1304a.T(parcel, 2, this.f46949b, false);
        AbstractC1304a.T(parcel, 3, this.f46950c, false);
        AbstractC1304a.T(parcel, 4, this.f46951d, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
