package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Arrays;

/* renamed from: v7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4315i extends AbstractC4318l {
    public static final Parcelable.Creator<C4315i> CREATOR = new U(18);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f46974a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f46975b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f46976c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f46977d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f46978e;

    public C4315i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        AbstractC1732v.i(bArr);
        this.f46974a = bArr;
        AbstractC1732v.i(bArr2);
        this.f46975b = bArr2;
        AbstractC1732v.i(bArr3);
        this.f46976c = bArr3;
        AbstractC1732v.i(bArr4);
        this.f46977d = bArr4;
        this.f46978e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4315i)) {
            return false;
        }
        C4315i c4315i = (C4315i) obj;
        return Arrays.equals(this.f46974a, c4315i.f46974a) && Arrays.equals(this.f46975b, c4315i.f46975b) && Arrays.equals(this.f46976c, c4315i.f46976c) && Arrays.equals(this.f46977d, c4315i.f46977d) && Arrays.equals(this.f46978e, c4315i.f46978e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f46974a)), Integer.valueOf(Arrays.hashCode(this.f46975b)), Integer.valueOf(Arrays.hashCode(this.f46976c)), Integer.valueOf(Arrays.hashCode(this.f46977d)), Integer.valueOf(Arrays.hashCode(this.f46978e))});
    }

    public final String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.f46974a;
        zzamVarZza.zzb("keyHandle", zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.f46975b;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.f46976c;
        zzamVarZza.zzb("authenticatorData", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzchVarZzf4 = zzch.zzf();
        byte[] bArr4 = this.f46977d;
        zzamVarZza.zzb(InAppPurchaseMetaData.KEY_SIGNATURE, zzchVarZzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f46978e;
        if (bArr5 != null) {
            zzamVarZza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.T(parcel, 2, this.f46974a, false);
        AbstractC1304a.T(parcel, 3, this.f46975b, false);
        AbstractC1304a.T(parcel, 4, this.f46976c, false);
        AbstractC1304a.T(parcel, 5, this.f46977d, false);
        AbstractC1304a.T(parcel, 6, this.f46978e, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
