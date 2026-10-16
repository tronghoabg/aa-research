package r7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class h extends zza {
    public final InterfaceC3876a R(BinderC3877b binderC3877b, String str, int i5) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC3877b);
        parcelZza.writeString(str);
        parcelZza.writeInt(i5);
        return AbstractC0279p0.t(zzB(2, parcelZza));
    }

    public final InterfaceC3876a S(BinderC3877b binderC3877b, String str, int i5) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC3877b);
        parcelZza.writeString(str);
        parcelZza.writeInt(i5);
        return AbstractC0279p0.t(zzB(4, parcelZza));
    }

    public final InterfaceC3876a T(BinderC3877b binderC3877b, String str, int i5, BinderC3877b binderC3877b2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, binderC3877b);
        parcelZza.writeString(str);
        parcelZza.writeInt(i5);
        zzc.zze(parcelZza, binderC3877b2);
        return AbstractC0279p0.t(zzB(8, parcelZza));
    }
}
