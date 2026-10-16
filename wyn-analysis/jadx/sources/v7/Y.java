package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Y extends AbstractC2614a {
    public static final Parcelable.Creator<Y> CREATOR = new U(17);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46946a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f46947b;

    public Y(boolean z2, byte[] bArr) {
        this.f46946a = z2;
        this.f46947b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        return this.f46946a == y10.f46946a && Arrays.equals(this.f46947b, y10.f46947b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46946a), this.f46947b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f46946a ? 1 : 0);
        AbstractC1304a.T(parcel, 2, this.f46947b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
