package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzrm extends zzks implements zzly {
    private static final zzrm zzb;
    private zzkz zzd = zzks.zzz();
    private int zze;

    static {
        zzrm zzrmVar = new zzrm();
        zzb = zzrmVar;
        zzks.zzF(zzrm.class, zzrmVar);
    }

    private zzrm() {
    }

    private final void zzJ() {
        zzkz zzkzVar = this.zzd;
        if (zzkzVar.zzc()) {
            return;
        }
        this.zzd = zzks.zzA(zzkzVar);
    }

    public static zzrj zzf() {
        return (zzrj) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzrm zzrmVar, zzrl zzrlVar) {
        zzrlVar.getClass();
        zzrmVar.zzJ();
        zzrmVar.zzd.add(zzrlVar);
    }

    public static /* synthetic */ void zzj(zzrm zzrmVar, Iterable iterable) {
        zzrmVar.zzJ();
        zzig.zzc(iterable, zzrmVar.zzd);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zzd", zzrl.class, "zze"});
        }
        if (i10 == 3) {
            return new zzrm();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzrj(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
