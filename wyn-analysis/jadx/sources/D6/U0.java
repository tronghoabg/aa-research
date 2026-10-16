package D6;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* loaded from: classes3.dex */
public final class U0 extends zzbem implements S {
    @Override // D6.S
    public final void x(o1 o1Var) {
        if (H6.f.q(o1Var) != null) {
            throw null;
        }
    }

    @Override // D6.S
    public final void z(o1 o1Var) {
        if (H6.f.q(o1Var) != null) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 == 1) {
            o1 o1Var = (o1) zzben.zzb(parcel, o1.CREATOR);
            zzben.zzh(parcel);
            z(o1Var);
        } else {
            if (i5 != 2) {
                return false;
            }
            o1 o1Var2 = (o1) zzben.zzb(parcel, o1.CREATOR);
            zzben.zzh(parcel);
            x(o1Var2);
        }
        parcel2.writeNoException();
        return true;
    }
}
