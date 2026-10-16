package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.a;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzcy extends zzdc {
    final /* synthetic */ zzhy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z2, zzhy zzhyVar) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhs.zzp(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder sbW = a.w("Invalid byte[] value for ", this.zzc, ": ");
            sbW.append((String) obj);
            Log.e("PhenotypeFlag", sbW.toString());
            return null;
        }
    }
}
