package w7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: w7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4380h extends AbstractC2614a {
    public static final Parcelable.Creator<C4380h> CREATOR = new C4381i(6);

    /* renamed from: a, reason: collision with root package name */
    public final C4376d f47388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47389b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47390c;

    public C4380h(C4376d c4376d, String str, String str2) {
        AbstractC1732v.i(c4376d);
        this.f47388a = c4376d;
        this.f47390c = str;
        this.f47389b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4380h)) {
            return false;
        }
        C4380h c4380h = (C4380h) obj;
        String str = this.f47390c;
        if (str == null) {
            if (c4380h.f47390c != null) {
                return false;
            }
        } else if (!str.equals(c4380h.f47390c)) {
            return false;
        }
        if (!this.f47388a.equals(c4380h.f47388a)) {
            return false;
        }
        String str2 = c4380h.f47389b;
        String str3 = this.f47389b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f47390c;
        int iHashCode = this.f47388a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f47389b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() throws JSONException {
        C4376d c4376d = this.f47388a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(c4376d.f47378b, 11));
            EnumC4378f enumC4378f = c4376d.f47379c;
            if (enumC4378f != EnumC4378f.UNKNOWN) {
                jSONObject.put("version", enumC4378f.f47383a);
            }
            ArrayList arrayList = c4376d.f47380d;
            if (arrayList != null) {
                jSONObject.put("transports", arrayList.toString());
            }
            String str = this.f47390c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f47389b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, this.f47388a, i5, false);
        AbstractC1304a.a0(parcel, 3, this.f47390c, false);
        AbstractC1304a.a0(parcel, 4, this.f47389b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
