package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Q extends AbstractC2614a {
    public static final Parcelable.Creator<Q> CREATOR = new C2555b(23);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46938a;

    public Q(boolean z2) {
        this.f46938a = Boolean.valueOf(z2).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && this.f46938a == ((Q) obj).f46938a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46938a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f46938a ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
