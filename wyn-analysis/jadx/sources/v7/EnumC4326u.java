package v7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: v7.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4326u implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED_ERR(9),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_STATE_ERR(11),
    /* JADX INFO: Fake field, exist only in values array */
    SECURITY_ERR(18),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERR(19),
    /* JADX INFO: Fake field, exist only in values array */
    ABORT_ERR(20),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT_ERR(23),
    /* JADX INFO: Fake field, exist only in values array */
    ENCODING_ERR(27),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERR(28),
    /* JADX INFO: Fake field, exist only in values array */
    CONSTRAINT_ERR(29),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_ERR(30),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ALLOWED_ERR(35),
    /* JADX INFO: Fake field, exist only in values array */
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC4326u> CREATOR = new U(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f47000a;

    EnumC4326u(int i5) {
        this.f47000a = i5;
    }

    public static EnumC4326u c(int i5) throws C4325t {
        for (EnumC4326u enumC4326u : values()) {
            if (i5 == enumC4326u.f47000a) {
                return enumC4326u;
            }
        }
        Locale locale = Locale.US;
        throw new C4325t(AbstractC0279p0.i(i5, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f47000a);
    }
}
