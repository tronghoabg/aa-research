package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class T extends AbstractC2614a {
    public static final Parcelable.Creator<T> CREATOR = new C2555b(26);

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f46940a;

    public T(byte[][] bArr) {
        AbstractC1732v.b(bArr != null);
        AbstractC1732v.b(1 == ((bArr.length & 1) ^ 1));
        int i5 = 0;
        while (i5 < bArr.length) {
            AbstractC1732v.b(i5 == 0 || bArr[i5] != null);
            int i10 = i5 + 1;
            AbstractC1732v.b(bArr[i10] != null);
            int length = bArr[i10].length;
            AbstractC1732v.b(length == 32 || length == 64);
            i5 += 2;
        }
        this.f46940a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return Arrays.deepEquals(this.f46940a, ((T) obj).f46940a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f46940a) {
            iHashCode ^= Arrays.hashCode(new Object[]{bArr});
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        byte[][] bArr = this.f46940a;
        if (bArr != null) {
            int iL02 = AbstractC1304a.l0(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            AbstractC1304a.m0(iL02, parcel);
        }
        AbstractC1304a.m0(iL0, parcel);
    }
}
