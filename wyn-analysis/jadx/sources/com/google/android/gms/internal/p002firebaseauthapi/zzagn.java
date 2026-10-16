package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzagn {
    public static long zza(String str) {
        zzagq zzagqVarZzb = zzb(str);
        return zzagqVarZzb.zza().longValue() - zzagqVarZzb.zzb().longValue();
    }

    private static zzagq zzb(String str) {
        AbstractC1732v.f(str);
        List<String> listZza = zzx.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(v.f("Invalid idToken ", str));
        }
        String str2 = listZza.get(1);
        try {
            return zzagq.zza(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("Unable to decode token", e7);
        }
    }
}
