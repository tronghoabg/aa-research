package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b0 extends AbstractC2614a {
    public static final Parcelable.Creator<b0> CREATOR = new U(27);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46953a;

    public b0(boolean z2) {
        this.f46953a = Boolean.valueOf(z2).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && this.f46953a == ((b0) obj).f46953a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46953a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f46953a ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
