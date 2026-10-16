package w7;

import A7.AbstractC0279p0;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* renamed from: w7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4375c extends AbstractC2614a {
    public static final Parcelable.Creator<C4375c> CREATOR = new C4381i(1);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC4373a f47374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47375b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47376c;

    static {
        new C4375c("unavailable");
        new C4375c("unused");
    }

    public C4375c(int i5, String str, String str2) {
        try {
            this.f47374a = V(i5);
            this.f47375b = str;
            this.f47376c = str2;
        } catch (C4374b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static EnumC4373a V(int i5) throws C4374b {
        for (EnumC4373a enumC4373a : EnumC4373a.values()) {
            if (i5 == enumC4373a.f47373a) {
                return enumC4373a;
            }
        }
        throw new C4374b(AbstractC0279p0.i(i5, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4375c)) {
            return false;
        }
        C4375c c4375c = (C4375c) obj;
        EnumC4373a enumC4373a = c4375c.f47374a;
        EnumC4373a enumC4373a2 = this.f47374a;
        if (!enumC4373a2.equals(enumC4373a)) {
            return false;
        }
        int iOrdinal = enumC4373a2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f47375b.equals(c4375c.f47375b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f47376c.equals(c4375c.f47376c);
    }

    public final int hashCode() {
        int i5;
        int iHashCode;
        EnumC4373a enumC4373a = this.f47374a;
        int iHashCode2 = enumC4373a.hashCode() + 31;
        int iOrdinal = enumC4373a.ordinal();
        if (iOrdinal == 1) {
            i5 = iHashCode2 * 31;
            iHashCode = this.f47375b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i5 = iHashCode2 * 31;
            iHashCode = this.f47376c.hashCode();
        }
        return iHashCode + i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.f47374a.f47373a;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 3, this.f47375b, false);
        AbstractC1304a.a0(parcel, 4, this.f47376c, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public C4375c(String str) {
        this.f47375b = str;
        this.f47374a = EnumC4373a.STRING;
        this.f47376c = null;
    }
}
