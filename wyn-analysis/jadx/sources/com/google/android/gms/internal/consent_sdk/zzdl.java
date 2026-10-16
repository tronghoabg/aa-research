package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
final class zzdl extends zzdn {
    public zzdl(zzdo zzdoVar, CharSequence charSequence, zzdh zzdhVar) {
        super(zzdoVar, charSequence);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    public final int zzc(int i5) {
        return i5 + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    public final int zzd(int i5) {
        CharSequence charSequence = ((zzdn) this).zza;
        int length = charSequence.length();
        zzdj.zzb(i5, length, "index");
        while (i5 < length) {
            if (charSequence.charAt(i5) == ',') {
                return i5;
            }
            i5++;
        }
        return -1;
    }
}
