package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;

/* renamed from: v7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4317k extends AbstractC4318l {
    public static final Parcelable.Creator<C4317k> CREATOR = new U(20);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC4326u f46983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46985c;

    public C4317k(int i5, String str, int i10) {
        try {
            this.f46983a = EnumC4326u.c(i5);
            this.f46984b = str;
            this.f46985c = i10;
        } catch (C4325t e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4317k)) {
            return false;
        }
        C4317k c4317k = (C4317k) obj;
        return AbstractC1732v.m(this.f46983a, c4317k.f46983a) && AbstractC1732v.m(this.f46984b, c4317k.f46984b) && AbstractC1732v.m(Integer.valueOf(this.f46985c), Integer.valueOf(c4317k.f46985c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46983a, this.f46984b, Integer.valueOf(this.f46985c)});
    }

    public final String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzamVarZza.zza("errorCode", this.f46983a.f47000a);
        String str = this.f46984b;
        if (str != null) {
            zzamVarZza.zzb("errorMessage", str);
        }
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.f46983a.f47000a;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 3, this.f46984b, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f46985c);
        AbstractC1304a.m0(iL0, parcel);
    }
}
