package d7;

import A7.AbstractC0279p0;
import Y2.B;
import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b extends AbstractC2614a {

    /* renamed from: a, reason: collision with root package name */
    public final int f34114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34115b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f34116c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34117d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f34118e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f34113f = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new C1559a(23);

    public b(int i5, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f34114a = i5;
        this.f34115b = i10;
        this.f34116c = pendingIntent;
        this.f34117d = str;
        this.f34118e = num;
    }

    public static String W(int i5) {
        if (i5 == 99) {
            return "UNFINISHED";
        }
        if (i5 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i5) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i5) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return AbstractC0279p0.o(new StringBuilder(String.valueOf(i5).length() + 20), "UNKNOWN_ERROR_CODE(", i5, ")");
                }
        }
    }

    public final boolean V() {
        return this.f34115b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f34115b == bVar.f34115b && AbstractC1732v.m(this.f34116c, bVar.f34116c) && AbstractC1732v.m(this.f34117d, bVar.f34117d) && AbstractC1732v.m(this.f34118e, bVar.f34118e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f34115b), this.f34116c, this.f34117d, this.f34118e});
    }

    public final String toString() {
        B b5 = new B(this);
        b5.g(W(this.f34115b), "statusCode");
        b5.g(this.f34116c, "resolution");
        b5.g(this.f34117d, PglCryptUtils.KEY_MESSAGE);
        b5.g(this.f34118e, "clientMethodKey");
        return b5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f34114a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f34115b);
        AbstractC1304a.Z(parcel, 3, this.f34116c, i5, false);
        AbstractC1304a.a0(parcel, 4, this.f34117d, false);
        AbstractC1304a.X(parcel, 5, this.f34118e);
        AbstractC1304a.m0(iL0, parcel);
    }

    public b(int i5, String str, PendingIntent pendingIntent) {
        this(1, i5, pendingIntent, str, null);
    }
}
