package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzrs extends zzks implements zzly {
    private static final zzrs zzb;
    private int zzd;
    private int zze;
    private zzkz zzf = zzks.zzz();

    static {
        zzrs zzrsVar = new zzrs();
        zzb = zzrsVar;
        zzks.zzF(zzrs.class, zzrsVar);
        zzjk zzjkVarZzg = zzjk.zzg();
        zznm zznmVar = zznm.zzi;
        zzks.zzr(zzjkVarZzg, "", null, null, 490775251, zznmVar, String.class);
        zzks.zzr(zzjk.zzg(), "", null, null, 490775252, zznmVar, String.class);
    }

    private zzrs() {
    }

    public final int zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zzd", "zze", "zzf", zzrr.class});
        }
        if (i10 == 3) {
            return new zzrs();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzrp(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzj() {
        return this.zzf;
    }

    public final int zzk() {
        int i5;
        switch (this.zzd) {
            case 0:
                i5 = 2;
                break;
            case 1:
                i5 = 3;
                break;
            case 2:
                i5 = 4;
                break;
            case 3:
                i5 = 5;
                break;
            case 4:
                i5 = 6;
                break;
            case 5:
                i5 = 7;
                break;
            case 6:
                i5 = 8;
                break;
            case 7:
                i5 = 9;
                break;
            case 8:
                i5 = 10;
                break;
            case 9:
                i5 = 11;
                break;
            case 10:
                i5 = 12;
                break;
            case 11:
                i5 = 13;
                break;
            case 12:
                i5 = 14;
                break;
            case 13:
                i5 = 15;
                break;
            case 14:
                i5 = 16;
                break;
            case 15:
                i5 = 17;
                break;
            case 16:
                i5 = 18;
                break;
            case 17:
                i5 = 19;
                break;
            case 18:
                i5 = 20;
                break;
            case 19:
                i5 = 21;
                break;
            case 20:
                i5 = 22;
                break;
            case 21:
                i5 = 23;
                break;
            case 22:
                i5 = 24;
                break;
            case 23:
                i5 = 25;
                break;
            case 24:
                i5 = 26;
                break;
            case 25:
                i5 = 27;
                break;
            case 26:
                i5 = 28;
                break;
            case 27:
                i5 = 29;
                break;
            case 28:
                i5 = 30;
                break;
            case 29:
                i5 = 31;
                break;
            case 30:
                i5 = 32;
                break;
            case 31:
                i5 = 33;
                break;
            case 32:
                i5 = 34;
                break;
            case 33:
                i5 = 35;
                break;
            case 34:
                i5 = 36;
                break;
            case 35:
                i5 = 37;
                break;
            case 36:
                i5 = 38;
                break;
            case 37:
                i5 = 39;
                break;
            case 38:
                i5 = 40;
                break;
            case 39:
                i5 = 41;
                break;
            case 40:
                i5 = 42;
                break;
            case 41:
                i5 = 43;
                break;
            default:
                i5 = 0;
                break;
        }
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }
}
