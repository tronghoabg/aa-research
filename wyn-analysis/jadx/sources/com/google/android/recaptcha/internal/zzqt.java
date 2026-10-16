package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzqt extends zzks implements zzly {
    private static final zzqt zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzqt zzqtVar = new zzqt();
        zzb = zzqtVar;
        zzks.zzF(zzqt.class, zzqtVar);
    }

    private zzqt() {
    }

    public static /* synthetic */ void zzM(zzqt zzqtVar, String str) {
        str.getClass();
        zzqtVar.zzd = str;
    }

    public static /* synthetic */ void zzN(zzqt zzqtVar, String str) {
        str.getClass();
        zzqtVar.zzh = str;
    }

    public static /* synthetic */ void zzO(zzqt zzqtVar, String str) {
        str.getClass();
        zzqtVar.zzi = str;
    }

    public static /* synthetic */ void zzQ(zzqt zzqtVar, String str) {
        str.getClass();
        zzqtVar.zze = str;
    }

    public static zzqs zzf() {
        return (zzqs) zzb.zzp();
    }

    public final String zzJ() {
        return this.zzf;
    }

    public final String zzK() {
        return this.zzh;
    }

    public final String zzL() {
        return this.zzd;
    }

    public final int zzS() {
        int i5 = this.zzg;
        int i10 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new zzqt();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzqs(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zze;
    }
}
