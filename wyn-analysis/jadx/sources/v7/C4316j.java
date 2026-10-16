package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* renamed from: v7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4316j extends AbstractC4318l {
    public static final Parcelable.Creator<C4316j> CREATOR = new U(19);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f46979a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f46980b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f46981c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f46982d;

    public C4316j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        AbstractC1732v.i(bArr);
        this.f46979a = bArr;
        AbstractC1732v.i(bArr2);
        this.f46980b = bArr2;
        AbstractC1732v.i(bArr3);
        this.f46981c = bArr3;
        AbstractC1732v.i(strArr);
        this.f46982d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4316j)) {
            return false;
        }
        C4316j c4316j = (C4316j) obj;
        return Arrays.equals(this.f46979a, c4316j.f46979a) && Arrays.equals(this.f46980b, c4316j.f46980b) && Arrays.equals(this.f46981c, c4316j.f46981c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f46979a)), Integer.valueOf(Arrays.hashCode(this.f46980b)), Integer.valueOf(Arrays.hashCode(this.f46981c))});
    }

    public final String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.f46979a;
        zzamVarZza.zzb("keyHandle", zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.f46980b;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.f46981c;
        zzamVarZza.zzb("attestationObject", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzamVarZza.zzb("transports", Arrays.toString(this.f46982d));
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.T(parcel, 2, this.f46979a, false);
        AbstractC1304a.T(parcel, 3, this.f46980b, false);
        AbstractC1304a.T(parcel, 4, this.f46981c, false);
        AbstractC1304a.b0(parcel, 5, this.f46982d, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
