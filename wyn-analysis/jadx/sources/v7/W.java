package v7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public enum W implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<W> CREATOR = new U(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f46943a;

    W(String str) {
        this.f46943a = str;
    }

    public static W c(String str) throws V {
        for (W w2 : values()) {
            if (str.equals(w2.f46943a)) {
                return w2;
            }
        }
        throw new V(AbstractC0279p0.l("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f46943a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f46943a);
    }
}
