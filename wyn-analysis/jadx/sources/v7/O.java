package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class O extends AbstractC2614a {
    public static final Parcelable.Creator<O> CREATOR = new U(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f46934a;

    /* renamed from: b, reason: collision with root package name */
    public final short f46935b;

    /* renamed from: c, reason: collision with root package name */
    public final short f46936c;

    public O(int i5, short s10, short s11) {
        this.f46934a = i5;
        this.f46935b = s10;
        this.f46936c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return this.f46934a == o7.f46934a && this.f46935b == o7.f46935b && this.f46936c == o7.f46936c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46934a), Short.valueOf(this.f46935b), Short.valueOf(this.f46936c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f46934a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f46935b);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f46936c);
        AbstractC1304a.m0(iL0, parcel);
    }
}
