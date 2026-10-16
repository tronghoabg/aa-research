package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.internal.consent_sdk.a;

/* loaded from: classes3.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z2) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbW = a.w("Invalid boolean value for ", this.zzc, ": ");
        sbW.append((String) obj);
        Log.e("PhenotypeFlag", sbW.toString());
        return null;
    }
}
