package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d extends AbstractC2614a {
    public static final Parcelable.Creator<d> CREATOR = new T6.f(18);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16138a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16140c;

    public d(byte[] bArr, String str, boolean z2) {
        if (z2) {
            AbstractC1732v.i(bArr);
            AbstractC1732v.i(str);
        }
        this.f16138a = z2;
        this.f16139b = bArr;
        this.f16140c = str;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16138a == dVar.f16138a && Arrays.equals(this.f16139b, dVar.f16139b) && ((str = this.f16140c) == (str2 = dVar.f16140c) || (str != null && str.equals(str2)));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16139b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f16138a), this.f16140c}) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f16138a ? 1 : 0);
        AbstractC1304a.T(parcel, 2, this.f16139b, false);
        AbstractC1304a.a0(parcel, 3, this.f16140c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
