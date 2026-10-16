package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
public final class zzhb extends zzcs implements zzed {
    private static final zzhb zzb;
    private int zzd;
    private int zze;

    static {
        zzhb zzhbVar = new zzhb();
        zzb = zzhbVar;
        zzcs.zzt(zzhb.class, zzhbVar);
    }

    private zzhb() {
    }

    public static /* synthetic */ void zzA(zzhb zzhbVar, int i5) {
        zzhbVar.zze = i5 - 1;
        zzhbVar.zzd |= 1;
    }

    public static zzgz zzy() {
        return (zzgz) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzcs.zzq(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzha.zza});
        }
        if (i10 == 3) {
            return new zzhb();
        }
        zzgy zzgyVar = null;
        if (i10 == 4) {
            return new zzgz(zzgyVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
