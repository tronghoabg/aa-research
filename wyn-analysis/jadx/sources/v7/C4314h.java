package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: v7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4314h extends AbstractC2614a {
    public static final Parcelable.Creator<C4314h> CREATOR = new U(15);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46973a;

    public C4314h(boolean z2) {
        this.f46973a = z2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4314h) && this.f46973a == ((C4314h) obj).f46973a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46973a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f46973a ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
