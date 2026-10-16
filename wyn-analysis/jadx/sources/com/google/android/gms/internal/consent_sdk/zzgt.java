package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzgt extends zzqm implements zzrr {
    private static final zzgt zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzgt zzgtVar = new zzgt();
        zzb = zzgtVar;
        zzqm.zzz(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public static zzgs zza() {
        return (zzgs) zzb.zzp();
    }

    public static /* synthetic */ void zzd(zzgt zzgtVar, String str) {
        str.getClass();
        zzgtVar.zzd |= 1;
        zzgtVar.zze = str;
    }

    public static /* synthetic */ void zze(zzgt zzgtVar, String str) {
        str.getClass();
        zzgtVar.zzd |= 2;
        zzgtVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzgt();
        }
        zzhb zzhbVar = null;
        if (i10 == 4) {
            return new zzgs(zzhbVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
