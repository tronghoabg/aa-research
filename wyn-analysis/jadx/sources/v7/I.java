package v7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public enum I implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<I> CREATOR = new U(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f46927a;

    I(String str) {
        this.f46927a = str;
    }

    public static I c(String str) {
        for (I i5 : values()) {
            if (str.equals(i5.f46927a)) {
                return i5;
            }
        }
        throw new H(AbstractC0279p0.l("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f46927a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f46927a);
    }
}
