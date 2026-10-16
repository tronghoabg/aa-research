package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzop extends zzks implements zzly {
    private static final zzop zzb;
    private int zzd;
    private Object zzf;
    private int zzg;
    private long zzl;
    private zzka zzm;
    private int zzn;
    private zzod zzo;
    private zzpb zzp;
    private zzmz zzr;
    private zzka zzs;
    private int zzu;
    private int zze = 0;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private zzkx zzt = zzks.zzw();

    static {
        zzop zzopVar = new zzop();
        zzb = zzopVar;
        zzks.zzF(zzop.class, zzopVar);
    }

    private zzop() {
    }

    public static zzop zzJ(byte[] bArr) throws zzlc {
        return (zzop) zzks.zzv(zzb, bArr);
    }

    public static /* synthetic */ void zzO(zzop zzopVar, zzod zzodVar) {
        zzopVar.zzo = zzodVar;
        zzopVar.zzd |= 2;
    }

    public static /* synthetic */ void zzP(zzop zzopVar, zzpb zzpbVar) {
        zzpbVar.getClass();
        zzopVar.zzp = zzpbVar;
        zzopVar.zzd |= 4;
    }

    public static /* synthetic */ void zzR(zzop zzopVar, int i5) {
        zzkx zzkxVar = zzopVar.zzt;
        if (!zzkxVar.zzc()) {
            zzopVar.zzt = zzks.zzx(zzkxVar);
        }
        zzopVar.zzt.zzh(0);
    }

    public static /* synthetic */ void zzS(zzop zzopVar, int i5) {
        zzopVar.zzd |= 32;
        zzopVar.zzu = i5;
    }

    public static /* synthetic */ void zzT(zzop zzopVar, String str) {
        str.getClass();
        zzopVar.zzh = str;
    }

    public static /* synthetic */ void zzU(zzop zzopVar, String str) {
        str.getClass();
        zzopVar.zzi = str;
    }

    public static zzoo zzi() {
        return (zzoo) zzb.zzp();
    }

    public static zzop zzk() {
        return zzb;
    }

    public final String zzK() {
        return this.zzi;
    }

    public final String zzL() {
        return this.zzj;
    }

    public final boolean zzV() {
        return (this.zzd & 2) != 0;
    }

    public final int zzW() {
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
            default:
                i5 = 0;
                break;
        }
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    public final int zzX() {
        int i5 = this.zzn;
        int i10 = i5 != 0 ? i5 != 1 ? i5 != 2 ? 0 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Deprecated
    public final long zzf() {
        return this.zzl;
    }

    public final zzod zzg() {
        zzod zzodVar = this.zzo;
        return zzodVar == null ? zzod.zzj() : zzodVar;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0010\u0001\u0001\u0001\u0012\u0010\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005", new Object[]{"zzf", "zze", "zzd", "zzg", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", zznw.class, "zzt", "zzu"});
        }
        if (i10 == 3) {
            return new zzop();
        }
        zzon zzonVar = null;
        if (i10 == 4) {
            return new zzoo(zzonVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
