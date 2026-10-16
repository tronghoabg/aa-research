package v7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;

/* renamed from: v7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4309c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC4309c> CREATOR = new C2555b(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f46955a;

    EnumC4309c(String str) {
        this.f46955a = str;
    }

    public static EnumC4309c c(String str) {
        for (EnumC4309c enumC4309c : values()) {
            if (str.equals(enumC4309c.f46955a)) {
                return enumC4309c;
            }
        }
        throw new C4308b(AbstractC0279p0.l("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f46955a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f46955a);
    }
}
