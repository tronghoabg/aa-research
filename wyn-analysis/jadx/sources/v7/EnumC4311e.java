package v7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4311e implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC4311e> CREATOR = new U(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f46958a;

    EnumC4311e(String str) {
        this.f46958a = str;
    }

    public static EnumC4311e c(String str) throws C4310d {
        for (EnumC4311e enumC4311e : values()) {
            if (str.equals(enumC4311e.f46958a)) {
                return enumC4311e;
            }
        }
        throw new C4310d(AbstractC0279p0.l("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f46958a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f46958a);
    }
}
