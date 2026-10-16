package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzre extends zzks implements zzly {
    private static final zzre zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzre zzreVar = new zzre();
        zzb = zzreVar;
        zzks.zzF(zzre.class, zzreVar);
    }

    private zzre() {
    }

    public static /* synthetic */ void zzJ(zzre zzreVar, zzop zzopVar) {
        zzopVar.getClass();
        zzreVar.zze = zzopVar;
        zzreVar.zzd = 1;
    }

    public static /* synthetic */ void zzK(zzre zzreVar, zzpe zzpeVar) {
        zzpeVar.getClass();
        zzreVar.zze = zzpeVar;
        zzreVar.zzd = 2;
    }

    public static zzrd zzi() {
        return (zzrd) zzb.zzp();
    }

    public static zzre zzk(byte[] bArr) throws zzlc {
        return (zzre) zzks.zzv(zzb, bArr);
    }

    public final int zzL() {
        int i5 = this.zzd;
        if (i5 == 0) {
            return 3;
        }
        int i10 = 1;
        if (i5 != 1) {
            i10 = 2;
            if (i5 != 2) {
                return 0;
            }
        }
        return i10;
    }

    public final zzop zzf() {
        return this.zzd == 1 ? (zzop) this.zze : zzop.zzk();
    }

    public final zzpe zzg() {
        return this.zzd == 2 ? (zzpe) this.zze : zzpe.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzop.class, zzpe.class});
        }
        if (i10 == 3) {
            return new zzre();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzrd(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
