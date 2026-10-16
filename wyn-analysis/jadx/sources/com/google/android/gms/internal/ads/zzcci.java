package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzcci extends AbstractC2614a {
    public static final Parcelable.Creator<zzcci> CREATOR = new zzccj();
    public final String zza;
    public final int zzb;

    public zzcci(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    public static zzcci zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcci(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcci)) {
            return false;
        }
        zzcci zzcciVar = (zzcci) obj;
        return AbstractC1732v.m(this.zza, zzcciVar.zza) && AbstractC1732v.m(Integer.valueOf(this.zzb), Integer.valueOf(zzcciVar.zzb));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, str, false);
        int i10 = this.zzb;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i10);
        AbstractC1304a.m0(iL0, parcel);
    }
}
