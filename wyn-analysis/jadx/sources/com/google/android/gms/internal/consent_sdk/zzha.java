package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzha extends zzqm implements zzrr {
    private static final zzha zzb;
    private int zzd;
    private String zze = "";

    static {
        zzha zzhaVar = new zzha();
        zzb = zzhaVar;
        zzqm.zzz(zzha.class, zzhaVar);
    }

    private zzha() {
    }

    public static zzgz zza() {
        return (zzgz) zzb.zzp();
    }

    public static /* synthetic */ void zzd(zzha zzhaVar, String str) {
        zzhaVar.zzd |= 1;
        zzhaVar.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzha();
        }
        zzhb zzhbVar = null;
        if (i10 == 4) {
            return new zzgz(zzhbVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
