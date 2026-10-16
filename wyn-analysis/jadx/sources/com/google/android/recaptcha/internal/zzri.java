package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzri extends zzks implements zzly {
    private static final zzri zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzqv zzi;
    private int zzj;
    private zzqq zzk;

    static {
        zzri zzriVar = new zzri();
        zzb = zzriVar;
        zzks.zzF(zzri.class, zzriVar);
    }

    private zzri() {
    }

    public static /* synthetic */ void zzK(zzri zzriVar, int i5) {
        if (i5 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzriVar.zze = i5 - 2;
    }

    public static /* synthetic */ void zzL(zzri zzriVar, int i5) {
        if (i5 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzriVar.zzg = i5 - 2;
    }

    public static zzrh zzf() {
        return (zzrh) zzb.zzp();
    }

    public final int zzJ() {
        int i5;
        switch (this.zze) {
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
            default:
                i5 = 0;
                break;
        }
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzri();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzrh(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzk() {
        int i5;
        switch (this.zzg) {
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
            case 42:
                i5 = 44;
                break;
            case 43:
                i5 = 45;
                break;
            case 44:
                i5 = 46;
                break;
            case 45:
                i5 = 47;
                break;
            case 46:
                i5 = 48;
                break;
            case 47:
                i5 = 49;
                break;
            case 48:
                i5 = 50;
                break;
            case 49:
                i5 = 51;
                break;
            case 50:
                i5 = 52;
                break;
            case 51:
                i5 = 53;
                break;
            case 52:
                i5 = 54;
                break;
            case 53:
                i5 = 55;
                break;
            case 54:
                i5 = 56;
                break;
            case 55:
                i5 = 57;
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
