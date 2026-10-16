package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class e extends AbstractC2614a {
    public static final Parcelable.Creator<e> CREATOR = new T6.f(19);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16141a;

    public e(boolean z2) {
        this.f16141a = z2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && this.f16141a == ((e) obj).f16141a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f16141a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f16141a ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
