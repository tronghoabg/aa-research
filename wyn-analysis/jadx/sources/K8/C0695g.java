package K8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.InterfaceC2616c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: K8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0695g implements InterfaceC2616c {
    public static final Parcelable.Creator<C0695g> CREATOR = new C0691c(3);

    /* renamed from: a, reason: collision with root package name */
    public final long f6643a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6644b;

    public C0695g(long j8, long j10) {
        this.f6643a = j8;
        this.f6644b = j10;
    }

    public static C0695g c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C0695g(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 8);
        parcel.writeLong(this.f6643a);
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(this.f6644b);
        AbstractC1304a.m0(iL0, parcel);
    }
}
