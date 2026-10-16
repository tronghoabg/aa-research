package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class P extends AbstractC2614a {
    public static final Parcelable.Creator<P> CREATOR = new C2555b(22);

    /* renamed from: a, reason: collision with root package name */
    public final long f46937a;

    public P(long j8) {
        this.f46937a = Long.valueOf(j8).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof P) && this.f46937a == ((P) obj).f46937a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f46937a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 8);
        parcel.writeLong(this.f46937a);
        AbstractC1304a.m0(iL0, parcel);
    }
}
