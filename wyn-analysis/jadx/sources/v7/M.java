package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class M extends AbstractC2614a {
    public static final Parcelable.Creator<M> CREATOR = new U(8);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46932a;

    public M(boolean z2) {
        this.f46932a = z2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof M) && this.f46932a == ((M) obj).f46932a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46932a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f46932a ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
