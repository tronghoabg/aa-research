package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.internal.consent_sdk.a;

/* loaded from: classes3.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d3, boolean z2) {
        super(zzczVar, str, d3, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbW = a.w("Invalid double value for ", this.zzc, ": ");
            sbW.append((String) obj);
            Log.e("PhenotypeFlag", sbW.toString());
            return null;
        }
    }
}
