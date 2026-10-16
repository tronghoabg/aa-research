package v7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public enum J implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<J> CREATOR = new U(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f46929a;

    J(String str) {
        this.f46929a = str;
    }

    public static J c(String str) throws K {
        for (J j8 : values()) {
            if (str.equals(j8.f46929a)) {
                return j8;
            }
        }
        throw new K(AbstractC0279p0.l("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f46929a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f46929a);
    }
}
