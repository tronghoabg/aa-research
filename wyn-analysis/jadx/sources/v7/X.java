package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class X extends AbstractC2614a {
    public static final Parcelable.Creator<X> CREATOR = new U(16);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f46944a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f46945b;

    public X(byte[] bArr, byte[] bArr2) {
        this.f46944a = bArr;
        this.f46945b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x5 = (X) obj;
        return Arrays.equals(this.f46944a, x5.f46944a) && Arrays.equals(this.f46945b, x5.f46945b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46944a, this.f46945b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.T(parcel, 1, this.f46944a, false);
        AbstractC1304a.T(parcel, 2, this.f46945b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
