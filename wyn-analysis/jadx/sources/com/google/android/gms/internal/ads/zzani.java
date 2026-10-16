package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzani extends zzang {
    private zzanh zza;
    private int zzb;
    private boolean zzc;
    private zzhf zzd;
    private zzhd zze;

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zza(boolean z2) {
        super.zza(z2);
        if (z2) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final long zzb(zzeu zzeuVar) {
        if ((zzeuVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        zzanh zzanhVar = this.zza;
        zzanhVar.getClass();
        byte b5 = zzeuVar.zzi()[0];
        zzhf zzhfVar = zzanhVar.zza;
        zzhe[] zzheVarArr = zzanhVar.zzd;
        int i5 = zzheVarArr[(b5 >> 1) & (255 >>> (8 - zzhg.zza(zzheVarArr.length + (-1))))].zza ? zzhfVar.zzf : zzhfVar.zze;
        int i10 = this.zzc ? (this.zzb + i5) / 4 : 0;
        if (zzeuVar.zzj() < zzeuVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzeuVar.zzi(), zzeuVar.zze() + 4);
            zzeuVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzeuVar.zzf(zzeuVar.zze() + 4);
        }
        long j8 = i10;
        byte[] bArrZzi = zzeuVar.zzi();
        bArrZzi[zzeuVar.zze() - 4] = (byte) (j8 & 255);
        bArrZzi[zzeuVar.zze() - 3] = (byte) ((j8 >>> 8) & 255);
        bArrZzi[zzeuVar.zze() - 2] = (byte) ((j8 >>> 16) & 255);
        bArrZzi[zzeuVar.zze() - 1] = (byte) ((j8 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i5;
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean zzc(zzeu zzeuVar, long j8, zzane zzaneVar) throws IOException {
        zzanh zzanhVar;
        int i5;
        int iZzb;
        int i10;
        int i11;
        long jFloor;
        if (this.zza != null) {
            zzaneVar.zza.getClass();
            return false;
        }
        zzhf zzhfVar = this.zzd;
        int i12 = 1;
        if (zzhfVar == null) {
            zzhg.zzc(1, zzeuVar, false);
            int iZzI = zzeuVar.zzI();
            int iZzs = zzeuVar.zzs();
            int iZzI2 = zzeuVar.zzI();
            int iZzC = zzeuVar.zzC();
            int i13 = iZzC <= 0 ? -1 : iZzC;
            int iZzC2 = zzeuVar.zzC();
            int i14 = iZzC2 <= 0 ? -1 : iZzC2;
            int iZzC3 = zzeuVar.zzC();
            int i15 = iZzC3 <= 0 ? -1 : iZzC3;
            int iZzs2 = zzeuVar.zzs();
            this.zzd = new zzhf(iZzI, iZzs, iZzI2, i13, i14, i15, (int) Math.pow(2.0d, iZzs2 & 15), (int) Math.pow(2.0d, (iZzs2 & 240) >> 4), 1 == (zzeuVar.zzs() & 1), Arrays.copyOf(zzeuVar.zzi(), zzeuVar.zze()));
        } else {
            int i16 = 4;
            zzhd zzhdVar = this.zze;
            if (zzhdVar == null) {
                this.zze = zzhg.zzb(zzeuVar, true, true);
            } else {
                byte[] bArr = new byte[zzeuVar.zze()];
                System.arraycopy(zzeuVar.zzi(), 0, bArr, 0, zzeuVar.zze());
                int i17 = zzhfVar.zza;
                int i18 = 5;
                zzhg.zzc(5, zzeuVar, false);
                int iZzs3 = zzeuVar.zzs() + 1;
                zzhc zzhcVar = new zzhc(zzeuVar.zzi());
                zzhcVar.zzc(zzeuVar.zzg() * 8);
                int i19 = 0;
                while (true) {
                    int i20 = 2;
                    int i21 = 16;
                    if (i19 >= iZzs3) {
                        int i22 = i12;
                        int i23 = 6;
                        int iZzb2 = zzhcVar.zzb(6) + i22;
                        for (int i24 = 0; i24 < iZzb2; i24++) {
                            if (zzhcVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzhcVar.zzb(6) + i22;
                        int i25 = 0;
                        while (true) {
                            int i26 = 3;
                            if (i25 < iZzb3) {
                                int iZzb4 = zzhcVar.zzb(i21);
                                if (iZzb4 == 0) {
                                    int i27 = 8;
                                    zzhcVar.zzc(8);
                                    zzhcVar.zzc(16);
                                    zzhcVar.zzc(16);
                                    zzhcVar.zzc(6);
                                    zzhcVar.zzc(8);
                                    int iZzb5 = zzhcVar.zzb(4) + 1;
                                    int i28 = 0;
                                    while (i28 < iZzb5) {
                                        zzhcVar.zzc(i27);
                                        i28++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (iZzb4 != 1) {
                                        StringBuilder sb2 = new StringBuilder(AbstractC0279p0.f(iZzb4, 41));
                                        sb2.append("floor type greater than 1 not decodable: ");
                                        sb2.append(iZzb4);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    int iZzb6 = zzhcVar.zzb(5);
                                    int[] iArr = new int[iZzb6];
                                    int i29 = -1;
                                    for (int i30 = 0; i30 < iZzb6; i30++) {
                                        int iZzb7 = zzhcVar.zzb(4);
                                        iArr[i30] = iZzb7;
                                        if (iZzb7 > i29) {
                                            i29 = iZzb7;
                                        }
                                    }
                                    int i31 = i29 + 1;
                                    int[] iArr2 = new int[i31];
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        iArr2[i32] = zzhcVar.zzb(i26) + 1;
                                        int iZzb8 = zzhcVar.zzb(2);
                                        if (iZzb8 > 0) {
                                            i10 = 8;
                                            zzhcVar.zzc(8);
                                        } else {
                                            i10 = 8;
                                        }
                                        int i33 = i31;
                                        int i34 = 0;
                                        for (int i35 = 1; i34 < (i35 << iZzb8); i35 = 1) {
                                            zzhcVar.zzc(i10);
                                            i34++;
                                            i10 = 8;
                                        }
                                        i32++;
                                        i31 = i33;
                                        i26 = 3;
                                    }
                                    zzhcVar.zzc(2);
                                    int iZzb9 = zzhcVar.zzb(4);
                                    int i36 = 0;
                                    int i37 = 0;
                                    for (int i38 = 0; i38 < iZzb6; i38++) {
                                        i36 += iArr2[iArr[i38]];
                                        while (i37 < i36) {
                                            zzhcVar.zzc(iZzb9);
                                            i37++;
                                        }
                                    }
                                }
                                i25++;
                                i23 = 6;
                                i21 = 16;
                            } else {
                                int i39 = 1;
                                int iZzb10 = zzhcVar.zzb(i23) + 1;
                                int i40 = 0;
                                while (i40 < iZzb10) {
                                    if (zzhcVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzhcVar.zzc(24);
                                    zzhcVar.zzc(24);
                                    zzhcVar.zzc(24);
                                    int iZzb11 = zzhcVar.zzb(i23) + i39;
                                    int i41 = 8;
                                    zzhcVar.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i42 = 0; i42 < iZzb11; i42++) {
                                        iArr3[i42] = ((zzhcVar.zza() ? zzhcVar.zzb(5) : 0) * 8) + zzhcVar.zzb(3);
                                    }
                                    int i43 = 0;
                                    while (i43 < iZzb11) {
                                        int i44 = 0;
                                        while (i44 < i41) {
                                            if ((iArr3[i43] & (1 << i44)) != 0) {
                                                zzhcVar.zzc(i41);
                                            }
                                            i44++;
                                            i41 = 8;
                                        }
                                        i43++;
                                        i41 = 8;
                                    }
                                    i40++;
                                    i23 = 6;
                                    i39 = 1;
                                }
                                int iZzb12 = zzhcVar.zzb(i23) + 1;
                                for (int i45 = 0; i45 < iZzb12; i45++) {
                                    int iZzb13 = zzhcVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        StringBuilder sb3 = new StringBuilder(AbstractC0279p0.f(iZzb13, 41));
                                        sb3.append("mapping type other than 0 not supported: ");
                                        sb3.append(iZzb13);
                                        zzeh.zze("VorbisUtil", sb3.toString());
                                    } else {
                                        if (zzhcVar.zza()) {
                                            i5 = 1;
                                            iZzb = zzhcVar.zzb(4) + 1;
                                        } else {
                                            i5 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzhcVar.zza()) {
                                            int iZzb14 = zzhcVar.zzb(8) + i5;
                                            for (int i46 = 0; i46 < iZzb14; i46++) {
                                                int i47 = i17 - 1;
                                                zzhcVar.zzc(zzhg.zza(i47));
                                                zzhcVar.zzc(zzhg.zza(i47));
                                            }
                                        }
                                        if (zzhcVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i48 = 0; i48 < i17; i48++) {
                                                zzhcVar.zzc(4);
                                            }
                                        }
                                        for (int i49 = 0; i49 < iZzb; i49++) {
                                            zzhcVar.zzc(8);
                                            zzhcVar.zzc(8);
                                            zzhcVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzhcVar.zzb(6);
                                int i50 = iZzb15 + 1;
                                zzhe[] zzheVarArr = new zzhe[i50];
                                for (int i51 = 0; i51 < i50; i51++) {
                                    zzheVarArr[i51] = new zzhe(zzhcVar.zza(), zzhcVar.zzb(16), zzhcVar.zzb(16), zzhcVar.zzb(8));
                                }
                                if (!zzhcVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzanhVar = new zzanh(zzhfVar, zzhdVar, bArr, zzheVarArr, zzhg.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzhcVar.zzb(24) != 5653314) {
                            int iZzd = zzhcVar.zzd();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(iZzd);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        int iZzb16 = zzhcVar.zzb(16);
                        int iZzb17 = zzhcVar.zzb(24);
                        if (zzhcVar.zza()) {
                            zzhcVar.zzc(i18);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzhcVar.zzb(zzhg.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzhcVar.zza();
                            for (int i52 = 0; i52 < iZzb17; i52++) {
                                if (!zZza) {
                                    zzhcVar.zzc(i18);
                                } else if (zzhcVar.zza()) {
                                    zzhcVar.zzc(i18);
                                }
                            }
                        }
                        int i53 = i16;
                        int iZzb19 = zzhcVar.zzb(i53);
                        if (iZzb19 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iZzb19);
                            throw zzat.zzb(sb5.toString(), null);
                        }
                        if (iZzb19 != i12) {
                            if (iZzb19 != 2) {
                                i11 = i12;
                            }
                            i19++;
                            i12 = i11;
                            i16 = 4;
                            i18 = 5;
                        } else {
                            i20 = iZzb19;
                        }
                        zzhcVar.zzc(32);
                        zzhcVar.zzc(32);
                        int iZzb20 = zzhcVar.zzb(i53) + i12;
                        zzhcVar.zzc(i12);
                        if (i20 != i12) {
                            i11 = i12;
                            jFloor = iZzb16 * iZzb17;
                        } else if (iZzb16 != 0) {
                            i11 = i12;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16));
                        } else {
                            i11 = i12;
                            jFloor = 0;
                        }
                        zzhcVar.zzc((int) (jFloor * iZzb20));
                        i19++;
                        i12 = i11;
                        i16 = 4;
                        i18 = 5;
                    }
                }
            }
        }
        zzanhVar = null;
        this.zza = zzanhVar;
        if (zzanhVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzhf zzhfVar2 = zzanhVar.zza;
        arrayList.add(zzhfVar2.zzg);
        arrayList.add(zzanhVar.zzc);
        zzap zzapVarZzb = zzaho.zzb(zzgwt.zzr(zzanhVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzn("audio/ogg");
        zztVar.zzo("audio/vorbis");
        zztVar.zzi(zzhfVar2.zzd);
        zztVar.zzj(zzhfVar2.zzc);
        zztVar.zzG(zzhfVar2.zza);
        zztVar.zzI(zzhfVar2.zzb);
        zztVar.zzr(arrayList);
        zztVar.zzl(zzapVarZzb);
        zzaneVar.zza = zztVar.zzP();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzj(long j8) {
        super.zzj(j8);
        this.zzc = j8 != 0;
        zzhf zzhfVar = this.zzd;
        this.zzb = zzhfVar != null ? zzhfVar.zze : 0;
    }
}
