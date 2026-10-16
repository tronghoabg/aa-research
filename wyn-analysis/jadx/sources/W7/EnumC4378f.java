package w7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4378f implements Parcelable {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    V1("U2F_V1"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("U2F_V2");

    public static final Parcelable.Creator<EnumC4378f> CREATOR = new C4381i(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f47383a;

    EnumC4378f(String str) {
        this.f47383a = str;
    }

    public static EnumC4378f c(String str) throws C4377e {
        if (str == null) {
            return UNKNOWN;
        }
        for (EnumC4378f enumC4378f : values()) {
            if (str.equals(enumC4378f.f47383a)) {
                return enumC4378f;
            }
        }
        throw new C4377e(AbstractC0279p0.l("Protocol version ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f47383a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f47383a);
    }
}
