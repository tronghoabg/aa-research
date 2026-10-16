package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: v7.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4328w extends AbstractC2614a {
    public static final Parcelable.Creator<C4328w> CREATOR = new C2555b(24);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47002a;

    public C4328w(boolean z2) {
        this.f47002a = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4328w) {
            return this.f47002a == ((C4328w) obj).f47002a;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47002a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f47002a ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
