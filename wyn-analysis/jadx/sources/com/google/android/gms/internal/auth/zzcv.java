package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.internal.consent_sdk.a;

/* loaded from: classes3.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l10, boolean z2) {
        super(zzczVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbW = a.w("Invalid long value for ", this.zzc, ": ");
            sbW.append((String) obj);
            Log.e("PhenotypeFlag", sbW.toString());
            return null;
        }
    }
}
