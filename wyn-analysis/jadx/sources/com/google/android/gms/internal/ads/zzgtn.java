package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzgtn {
    private final String zza;
    private final zzgtm zzb;
    private zzgtm zzc;

    public /* synthetic */ zzgtn(String str, byte[] bArr) {
        zzgtm zzgtmVar = new zzgtm();
        this.zzb = zzgtmVar;
        this.zzc = zzgtmVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzgtm zzgtmVar = this.zzb.zzb;
        String str = "";
        while (zzgtmVar != null) {
            Object obj = zzgtmVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzgtmVar = zzgtmVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzgtn zza(Object obj) {
        zzgtm zzgtmVar = new zzgtm();
        this.zzc.zzb = zzgtmVar;
        this.zzc = zzgtmVar;
        zzgtmVar.zza = obj;
        return this;
    }
}
