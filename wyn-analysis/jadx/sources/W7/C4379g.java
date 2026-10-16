package w7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: w7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4379g extends AbstractC2614a {
    public static final Parcelable.Creator<C4379g> CREATOR = new C4381i(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f47384a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4378f f47385b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f47386c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47387d;

    public C4379g(String str, String str2, int i5, byte[] bArr) {
        this.f47384a = i5;
        try {
            this.f47385b = EnumC4378f.c(str);
            this.f47386c = bArr;
            this.f47387d = str2;
        } catch (C4377e e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4379g)) {
            return false;
        }
        C4379g c4379g = (C4379g) obj;
        if (!Arrays.equals(this.f47386c, c4379g.f47386c) || this.f47385b != c4379g.f47385b) {
            return false;
        }
        String str = c4379g.f47387d;
        String str2 = this.f47387d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f47386c) + 31) * 31) + this.f47385b.hashCode();
        String str = this.f47387d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f47384a);
        AbstractC1304a.a0(parcel, 2, this.f47385b.f47383a, false);
        AbstractC1304a.T(parcel, 3, this.f47386c, false);
        AbstractC1304a.a0(parcel, 4, this.f47387d, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
