package com.google.android.gms.internal.ads;

import android.util.LongSparseArray;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzakm implements zzaga {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private boolean zzE;
    private zzakg zzF;
    private zzakl zzG;
    private boolean zzH;
    private int zzI;
    private long zzJ;
    private final SparseArray zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private boolean zzR;
    private long zzS;
    private long zzT;
    private long zzU;
    private boolean zzV;
    private int zzW;
    private long zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int[] zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private int zzaf;
    private boolean zzag;
    private long zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private boolean zzal;
    private boolean zzam;
    private boolean zzan;
    private int zzao;
    private byte zzap;
    private boolean zzaq;
    private zzagd zzar;
    private final zzake zzas;
    private final zzako zzh;
    private final SparseArray zzi;
    private final LongSparseArray zzj;
    private final boolean zzk;
    private final boolean zzl;
    private final zzanq zzm;
    private final zzeu zzn;
    private final zzeu zzo;
    private final zzeu zzp;
    private final zzeu zzq;
    private final zzeu zzr;
    private final zzeu zzs;
    private final zzeu zzt;
    private final zzeu zzu;
    private final zzeu zzv;
    private final zzeu zzw;
    private ByteBuffer zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzfm.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        N0.a.p(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        N0.a.p(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = DesugarCollections.unmodifiableMap(map);
    }

    @Deprecated
    public zzakm() {
        this(new zzake(), 2, zzanq.zza);
    }

    private final long zzA(long j8) throws zzat {
        long j10 = this.zzA;
        if (j10 != -9223372036854775807L) {
            return zzfm.zzw(j8, j10, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzB(int[] iArr, int i5) {
        if (iArr == null) {
            return new int[i5];
        }
        int length = iArr.length;
        return length >= i5 ? iArr : new int[Math.max(length + length, i5)];
    }

    private final void zzC() {
        if (!this.zzE) {
            return;
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i5 >= sparseArray.size()) {
                zzagd zzagdVar = this.zzar;
                zzagdVar.getClass();
                zzagdVar.zzv();
                this.zzE = false;
                return;
            }
            if (((zzakl) sparseArray.valueAt(i5)).zzW) {
                return;
            } else {
                i5++;
            }
        }
    }

    private final void zzq(int i5) throws zzat {
        if (this.zzF != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 35);
        sb2.append("Element ");
        sb2.append(i5);
        sb2.append(" must be in an EditionEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    private final void zzr(int i5) throws zzat {
        if (this.zzG != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 32);
        sb2.append("Element ");
        sb2.append(i5);
        sb2.append(" must be in a TrackEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    private final void zzs(int i5) throws zzat {
        if (this.zzL) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 26);
        sb2.append("Element ");
        sb2.append(i5);
        sb2.append(" must be in a Cues");
        throw zzat.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzt(com.google.android.gms.internal.ads.zzakl r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakm.zzt(com.google.android.gms.internal.ads.zzakl, long, int, int, int):void");
    }

    private final void zzu(zzagb zzagbVar, int i5) throws IOException {
        zzeu zzeuVar = this.zzp;
        if (zzeuVar.zze() >= i5) {
            return;
        }
        if (zzeuVar.zzj() < i5) {
            int iZzj = zzeuVar.zzj();
            zzeuVar.zzc(Math.max(iZzj + iZzj, i5));
        }
        zzagbVar.zzc(zzeuVar.zzi(), zzeuVar.zze(), i5 - zzeuVar.zze());
        zzeuVar.zzf(i5);
    }

    private final int zzv(zzagb zzagbVar, zzakl zzaklVar, int i5, boolean z2) throws IOException {
        int i10;
        String str = zzaklVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzx(zzagbVar, zzb, i5);
            int i11 = this.zzaj;
            zzw();
            return i11;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzx(zzagbVar, zzd, i5);
            int i12 = this.zzaj;
            zzw();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzx(zzagbVar, zze, i5);
            int i13 = this.zzaj;
            zzw();
            return i13;
        }
        if (zzaklVar.zzW) {
            zzaklVar.zzaa.getClass();
            zzeu zzeuVar = new zzeu(i5);
            if (zzagbVar.zzh(zzeuVar.zzi(), 0, i5, true)) {
                zzagbVar.zzl();
                if (zzafz.zza(zzeuVar.zzr()) == 1 && zzeuVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzeuVar.zzm(bArr, 0, 10);
                    zzeuVar.zzh(0);
                    int iZzc = zzafz.zzc(bArr);
                    if (zzeuVar.zzd() >= iZzc + 4) {
                        zzeuVar.zzk(iZzc);
                        if (zzafz.zza(zzeuVar.zzB()) == 2) {
                            zzt zztVarZza = zzaklVar.zzaa.zza();
                            zztVarZza.zzo("audio/vnd.dts.hd");
                            zzaklVar.zzaa = zztVarZza.zzP();
                        }
                    }
                }
            }
            zzaklVar.zzZ.zzA(zzaklVar.zzaa);
            zzaklVar.zzW = false;
            zzC();
        }
        zzahm zzahmVar = zzaklVar.zzZ;
        if (!this.zzal) {
            if (zzaklVar.zzi) {
                this.zzae &= -1073741825;
                if (!this.zzam) {
                    zzeu zzeuVar2 = this.zzp;
                    zzagbVar.zzc(zzeuVar2.zzi(), 0, 1);
                    this.zzai++;
                    if ((zzeuVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzap = zzeuVar2.zzi()[0];
                    this.zzam = true;
                }
                byte b5 = this.zzap;
                if ((b5 & 1) == 1) {
                    int i14 = b5 & 2;
                    this.zzae |= 1073741824;
                    if (!this.zzaq) {
                        zzeu zzeuVar3 = this.zzu;
                        zzagbVar.zzc(zzeuVar3.zzi(), 0, 8);
                        this.zzai += 8;
                        this.zzaq = true;
                        zzeu zzeuVar4 = this.zzp;
                        zzeuVar4.zzi()[0] = (byte) ((i14 != 2 ? 0 : 128) | 8);
                        zzeuVar4.zzh(0);
                        zzahmVar.zzd(zzeuVar4, 1, 1);
                        this.zzaj++;
                        zzeuVar3.zzh(0);
                        zzahmVar.zzd(zzeuVar3, 8, 1);
                        this.zzaj += 8;
                    }
                    if (i14 == 2) {
                        if (!this.zzan) {
                            zzeu zzeuVar5 = this.zzp;
                            zzagbVar.zzc(zzeuVar5.zzi(), 0, 1);
                            this.zzai++;
                            zzeuVar5.zzh(0);
                            this.zzao = zzeuVar5.zzs();
                            this.zzan = true;
                        }
                        int i15 = this.zzao * 4;
                        zzeu zzeuVar6 = this.zzp;
                        zzeuVar6.zza(i15);
                        zzagbVar.zzc(zzeuVar6.zzi(), 0, i15);
                        this.zzai += i15;
                        int i16 = (this.zzao >> 1) + 1;
                        int i17 = (i16 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzx;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.zzx = ByteBuffer.allocate(i17);
                        }
                        this.zzx.position(0);
                        this.zzx.putShort((short) i16);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i10 = this.zzao;
                            if (i18 >= i10) {
                                break;
                            }
                            int iZzH = zzeuVar6.zzH();
                            int i20 = iZzH - i19;
                            if (i18 % 2 == 0) {
                                this.zzx.putShort((short) i20);
                            } else {
                                this.zzx.putInt(i20);
                            }
                            i18++;
                            i19 = iZzH;
                        }
                        int i21 = (i5 - this.zzai) - i19;
                        if ((i10 & 1) == 1) {
                            this.zzx.putInt(i21);
                        } else {
                            this.zzx.putShort((short) i21);
                            this.zzx.putInt(0);
                        }
                        zzeu zzeuVar7 = this.zzv;
                        zzeuVar7.zzb(this.zzx.array(), i17);
                        zzahmVar.zzd(zzeuVar7, i17, 1);
                        this.zzaj += i17;
                    }
                }
            } else {
                byte[] bArr2 = zzaklVar.zzj;
                if (bArr2 != null) {
                    this.zzs.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzaklVar.zzc) ? zzaklVar.zzh > 0 : z2) {
                this.zzae |= 268435456;
                this.zzw.zza(0);
                int iZze = (this.zzs.zze() + i5) - this.zzai;
                zzeu zzeuVar8 = this.zzp;
                zzeuVar8.zza(4);
                zzeuVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzeuVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzeuVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzeuVar8.zzi()[3] = (byte) (iZze & 255);
                zzahmVar.zzd(zzeuVar8, 4, 2);
                this.zzaj += 4;
            }
            this.zzal = true;
        }
        zzeu zzeuVar9 = this.zzs;
        int iZze2 = zzeuVar9.zze() + i5;
        String str2 = zzaklVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzaklVar.zzV != null) {
                zzgtr.zzi(zzeuVar9.zze() == 0);
                zzaklVar.zzV.zzb(zzagbVar);
            }
            while (true) {
                int i22 = this.zzai;
                if (i22 >= iZze2) {
                    break;
                }
                int iZzz = zzz(zzagbVar, zzahmVar, iZze2 - i22);
                this.zzai += iZzz;
                this.zzaj += iZzz;
            }
        } else {
            zzeu zzeuVar10 = this.zzo;
            byte[] bArrZzi = zzeuVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i23 = zzaklVar.zzab;
            int i24 = 4 - i23;
            while (this.zzai < iZze2) {
                int i25 = this.zzak;
                if (i25 == 0) {
                    int iMin = Math.min(i23, zzeuVar9.zzd());
                    zzagbVar.zzc(bArrZzi, i24 + iMin, i23 - iMin);
                    if (iMin > 0) {
                        zzeuVar9.zzm(bArrZzi, i24, iMin);
                    }
                    this.zzai += i23;
                    zzeuVar10.zzh(0);
                    this.zzak = zzeuVar10.zzH();
                    zzeu zzeuVar11 = this.zzn;
                    zzeuVar11.zzh(0);
                    zzahmVar.zzc(zzeuVar11, 4);
                    this.zzaj += 4;
                } else {
                    int iZzz2 = zzz(zzagbVar, zzahmVar, i25);
                    this.zzai += iZzz2;
                    this.zzaj += iZzz2;
                    this.zzak -= iZzz2;
                }
            }
        }
        if ("A_VORBIS".equals(zzaklVar.zzc)) {
            zzeu zzeuVar12 = this.zzq;
            zzeuVar12.zzh(0);
            zzahmVar.zzc(zzeuVar12, 4);
            this.zzaj += 4;
        }
        int i26 = this.zzaj;
        zzw();
        return i26;
    }

    private final void zzw() {
        this.zzai = 0;
        this.zzaj = 0;
        this.zzak = 0;
        this.zzal = false;
        this.zzam = false;
        this.zzan = false;
        this.zzao = 0;
        this.zzap = (byte) 0;
        this.zzaq = false;
        this.zzs.zza(0);
    }

    private final void zzx(zzagb zzagbVar, byte[] bArr, int i5) throws IOException {
        int length = bArr.length;
        int i10 = length + i5;
        zzeu zzeuVar = this.zzt;
        if (zzeuVar.zzj() < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10 + i5);
            zzeuVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzeuVar.zzi(), 0, length);
        }
        zzagbVar.zzc(zzeuVar.zzi(), length, i5);
        zzeuVar.zzh(0);
        zzeuVar.zzf(i10);
    }

    private static byte[] zzy(long j8, String str, long j10) {
        zzgtr.zza(j8 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i5 = (int) (j8 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i5);
        long j11 = j8 - (i5 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i10);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        String str3 = zzfm.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzz(zzagb zzagbVar, zzahm zzahmVar, int i5) throws IOException {
        zzeu zzeuVar = this.zzs;
        int iZzd = zzeuVar.zzd();
        if (iZzd <= 0) {
            return zzahmVar.zza(zzagbVar, i5, false);
        }
        int iMin = Math.min(i5, iZzd);
        zzahmVar.zzc(zzeuVar, iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        return new zzakn().zza(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        if (this.zzl) {
            zzagdVar = new zzant(zzagdVar, this.zzm);
        }
        this.zzar = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        int i5 = 0;
        this.zzV = false;
        while (!this.zzV) {
            boolean zZzc = this.zzas.zzc(zzagbVar);
            if (zZzc) {
                long jZzn = zzagbVar.zzn();
                if (this.zzR) {
                    this.zzT = jZzn;
                    zzahaVar.zza = this.zzS;
                    this.zzR = false;
                    return 1;
                }
                if (this.zzH) {
                    long j8 = this.zzT;
                    if (j8 != -1) {
                        zzahaVar.zza = j8;
                        this.zzT = -1L;
                        return 1;
                    }
                }
            }
            if (!zZzc) {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i5 >= sparseArray.size()) {
                        return -1;
                    }
                    zzakl zzaklVar = (zzakl) sparseArray.valueAt(i5);
                    zzaklVar.zzb();
                    zzahn zzahnVar = zzaklVar.zzV;
                    if (zzahnVar != null) {
                        zzahnVar.zzd(zzaklVar.zzZ, zzaklVar.zzk);
                    }
                    i5++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzU = -9223372036854775807L;
        int i5 = 0;
        this.zzW = 0;
        this.zzas.zzb();
        this.zzh.zza();
        zzw();
        this.zzL = false;
        this.zzM = -9223372036854775807L;
        this.zzN = -1;
        this.zzO = -1L;
        this.zzP = -1L;
        if (!this.zzH) {
            this.zzK.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i5 >= sparseArray.size()) {
                return;
            }
            zzahn zzahnVar = ((zzakl) sparseArray.valueAt(i5)).zzV;
            if (zzahnVar != null) {
                zzahnVar.zza();
            }
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }

    public final void zzh(int i5, long j8, long j10) throws zzat {
        zzagd zzagdVar = this.zzar;
        zzagdVar.getClass();
        if (i5 == 128) {
            zzq(i5);
            this.zzF.zzh = null;
            zzq(i5);
            this.zzF.zzi = null;
            return;
        }
        if (i5 == 160) {
            this.zzag = false;
            this.zzah = 0L;
            return;
        }
        if (i5 == 174) {
            zzakl zzaklVar = new zzakl();
            this.zzG = zzaklVar;
            zzaklVar.zza = this.zzD;
            return;
        }
        if (i5 == 187) {
            if (this.zzH) {
                return;
            }
            zzs(i5);
            this.zzM = -9223372036854775807L;
            return;
        }
        if (i5 == 19899) {
            this.zzI = -1;
            this.zzJ = -1L;
            return;
        }
        if (i5 == 20533) {
            zzr(i5);
            this.zzG.zzi = true;
            return;
        }
        if (i5 == 408125543) {
            long j11 = this.zzz;
            if (j11 != -1 && j11 != j8) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzz = j8;
            this.zzy = j10;
            return;
        }
        if (i5 == 475249515) {
            if (this.zzH) {
                return;
            }
            this.zzL = true;
            return;
        }
        if (i5 == 524531317) {
            if (this.zzH) {
                return;
            }
            if (this.zzk && this.zzS != -1) {
                this.zzR = true;
                return;
            } else {
                zzagdVar.zzw(new zzahc(this.zzC, 0L));
                this.zzH = true;
                return;
            }
        }
        if (i5 == 182) {
            this.zzF = new zzakg();
            return;
        }
        if (i5 == 183 && !this.zzH) {
            zzs(i5);
            this.zzN = -1;
            this.zzO = -1L;
            this.zzP = -1L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        r26 = -1;
        r24 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0100, code lost:
    
        r40.zzar.zzw(new com.google.android.gms.internal.ads.zzahc(r40.zzC, 0));
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(int r41) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakm.zzi(int):void");
    }

    public final void zzj(int i5, long j8) throws zzat {
        boolean z2;
        if (i5 == 136) {
            z2 = j8 == 1;
            zzr(i5);
            this.zzG.zzY = z2;
            return;
        }
        if (i5 == 137) {
            zzq(i5);
            this.zzF.zze = j8;
            return;
        }
        if (i5 == 145) {
            zzq(i5);
            this.zzF.zzb = j8;
            return;
        }
        if (i5 == 146) {
            zzq(i5);
            this.zzF.zzc = j8;
            return;
        }
        if (i5 == 240) {
            if (this.zzH) {
                return;
            }
            zzs(i5);
            if (this.zzP == -1) {
                this.zzP = j8;
                return;
            }
            return;
        }
        if (i5 == 241) {
            if (this.zzH) {
                return;
            }
            zzs(i5);
            if (this.zzO == -1) {
                this.zzO = j8;
                return;
            }
            return;
        }
        if (i5 == 20529) {
            if (j8 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j8);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i5 == 20530) {
            if (j8 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j8).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j8);
            sb3.append(" not supported");
            throw zzat.zzb(sb3.toString(), null);
        }
        if (i5 == 29636) {
            zzq(i5);
            this.zzF.zza = j8;
            return;
        }
        if (i5 == 29637) {
            zzr(i5);
            this.zzG.zze = j8;
            return;
        }
        switch (i5) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i10 = (int) j8;
                if (i10 == 1) {
                    zzr(i5);
                    this.zzG.zzf = 2;
                    return;
                }
                if (i10 == 2) {
                    zzr(i5);
                    this.zzG.zzf = 1;
                    return;
                } else if (i10 == 17) {
                    zzr(i5);
                    this.zzG.zzf = 3;
                    return;
                } else if (i10 != 33) {
                    zzr(i5);
                    this.zzG.zzf = -1;
                    return;
                } else {
                    zzr(i5);
                    this.zzG.zzf = 5;
                    return;
                }
            case 152:
                z2 = j8 == 1;
                zzq(i5);
                this.zzF.zzd = z2;
                return;
            case 155:
                this.zzY = zzA(j8);
                return;
            case 159:
                zzr(i5);
                this.zzG.zzP = (int) j8;
                return;
            case 176:
                zzr(i5);
                this.zzG.zzn = (int) j8;
                return;
            case 179:
                if (this.zzH) {
                    return;
                }
                zzs(i5);
                this.zzM = zzA(j8);
                return;
            case 186:
                zzr(i5);
                this.zzG.zzo = (int) j8;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzr(i5);
                this.zzG.zzd = (int) j8;
                return;
            case 231:
                this.zzU = zzA(j8);
                return;
            case 238:
                this.zzaf = (int) j8;
                return;
            case 247:
                if (this.zzH) {
                    return;
                }
                zzs(i5);
                this.zzN = (int) j8;
                return;
            case 251:
                this.zzag = true;
                return;
            case 16871:
                zzr(i5);
                this.zzG.zzd((int) j8);
                return;
            case 16980:
                if (j8 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j8).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j8);
                sb4.append(" not supported");
                throw zzat.zzb(sb4.toString(), null);
            case 17029:
                if (j8 < 1 || j8 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j8).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j8);
                    sb5.append(" not supported");
                    throw zzat.zzb(sb5.toString(), null);
                }
                return;
            case 17143:
                if (j8 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j8).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j8);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18401:
                if (j8 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j8).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j8);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 18408:
                if (j8 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j8).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j8);
                sb8.append(" not supported");
                throw zzat.zzb(sb8.toString(), null);
            case 21420:
                this.zzJ = j8 + this.zzz;
                return;
            case 21432:
                int i11 = (int) j8;
                zzr(i5);
                if (i11 == 0) {
                    this.zzG.zzy = 0;
                    return;
                }
                if (i11 == 1) {
                    this.zzG.zzy = 2;
                    return;
                } else if (i11 == 3) {
                    this.zzG.zzy = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.zzG.zzy = 3;
                    return;
                }
            case 21680:
                zzr(i5);
                this.zzG.zzq = (int) j8;
                return;
            case 21682:
                zzr(i5);
                this.zzG.zzs = (int) j8;
                return;
            case 21690:
                zzr(i5);
                this.zzG.zzr = (int) j8;
                return;
            case 21930:
                z2 = j8 == 1;
                zzr(i5);
                this.zzG.zzX = z2;
                return;
            case 21938:
                zzr(i5);
                this.zzG.zzp = (int) j8;
                return;
            case 21998:
                zzr(i5);
                this.zzG.zzh = (int) j8;
                return;
            case 22186:
                zzr(i5);
                this.zzG.zzT = j8;
                return;
            case 22203:
                zzr(i5);
                this.zzG.zzU = j8;
                return;
            case 25188:
                zzr(i5);
                this.zzG.zzQ = (int) j8;
                return;
            case 30114:
                this.zzah = j8;
                return;
            case 30321:
                int i12 = (int) j8;
                zzr(i5);
                if (i12 == 0) {
                    this.zzG.zzt = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzG.zzt = 1;
                    return;
                } else if (i12 == 2) {
                    this.zzG.zzt = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.zzG.zzt = 3;
                    return;
                }
            case 2352003:
                zzr(i5);
                this.zzG.zzg = (int) j8;
                return;
            case 2807729:
                this.zzA = j8;
                return;
            default:
                switch (i5) {
                    case 21945:
                        int i13 = (int) j8;
                        zzr(i5);
                        if (i13 == 1) {
                            this.zzG.zzB = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.zzG.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzr(i5);
                        int iZzc = zzi.zzc((int) j8);
                        if (iZzc != -1) {
                            this.zzG.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i5);
                        int iZzb = zzi.zzb((int) j8);
                        if (iZzb != -1) {
                            this.zzG.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i5);
                        this.zzG.zzC = (int) j8;
                        return;
                    case 21949:
                        zzr(i5);
                        this.zzG.zzD = (int) j8;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzk(int i5, double d3) throws zzat {
        if (i5 == 181) {
            zzr(i5);
            this.zzG.zzS = (int) d3;
            return;
        }
        if (i5 == 17545) {
            this.zzB = (long) d3;
            return;
        }
        switch (i5) {
            case 21969:
                zzr(i5);
                this.zzG.zzE = (float) d3;
                break;
            case 21970:
                zzr(i5);
                this.zzG.zzF = (float) d3;
                break;
            case 21971:
                zzr(i5);
                this.zzG.zzG = (float) d3;
                break;
            case 21972:
                zzr(i5);
                this.zzG.zzH = (float) d3;
                break;
            case 21973:
                zzr(i5);
                this.zzG.zzI = (float) d3;
                break;
            case 21974:
                zzr(i5);
                this.zzG.zzJ = (float) d3;
                break;
            case 21975:
                zzr(i5);
                this.zzG.zzK = (float) d3;
                break;
            case 21976:
                zzr(i5);
                this.zzG.zzL = (float) d3;
                break;
            case 21977:
                zzr(i5);
                this.zzG.zzM = (float) d3;
                break;
            case 21978:
                zzr(i5);
                this.zzG.zzN = (float) d3;
                break;
            default:
                switch (i5) {
                    case 30323:
                        zzr(i5);
                        this.zzG.zzu = (float) d3;
                        break;
                    case 30324:
                        zzr(i5);
                        this.zzG.zzv = (float) d3;
                        break;
                    case 30325:
                        zzr(i5);
                        this.zzG.zzw = (float) d3;
                        break;
                }
        }
    }

    public final void zzl(int i5, String str) throws zzat {
        if (i5 == 133) {
            zzq(i5);
            this.zzF.zzh = str;
            return;
        }
        if (i5 == 134) {
            zzr(i5);
            this.zzG.zzc = str;
            return;
        }
        if (i5 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.zzD = Objects.equals(str, "webm");
                return;
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 22);
            sb2.append("DocType ");
            sb2.append(str);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i5 == 17276) {
            zzq(i5);
            this.zzF.zzi = str;
        } else if (i5 == 21358) {
            zzr(i5);
            this.zzG.zzb = str;
        } else {
            if (i5 != 2274716) {
                return;
            }
            zzr(i5);
            this.zzG.zze(str);
        }
    }

    public final void zzm(int i5, int i10, zzagb zzagbVar) throws IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j8;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = i5;
        int i23 = 2;
        int i24 = 1;
        int i25 = 0;
        if (i22 != 161 && i22 != 163) {
            if (i22 == 165) {
                if (this.zzW != 2) {
                    return;
                }
                zzakl zzaklVar = (zzakl) this.zzi.get(this.zzac);
                if (this.zzaf != 4 || !"V_VP9".equals(zzaklVar.zzc)) {
                    zzagbVar.zzf(i10);
                    return;
                }
                zzeu zzeuVar = this.zzw;
                zzeuVar.zza(i10);
                zzagbVar.zzc(zzeuVar.zzi(), 0, i10);
                return;
            }
            if (i22 == 16877) {
                zzr(i5);
                zzakl zzaklVar2 = this.zzG;
                if (zzaklVar2.zzc() != 1685485123 && zzaklVar2.zzc() != 1685480259) {
                    zzagbVar.zzf(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                zzaklVar2.zzO = bArr;
                zzagbVar.zzc(bArr, 0, i10);
                return;
            }
            if (i22 == 16981) {
                zzr(i5);
                byte[] bArr2 = new byte[i10];
                this.zzG.zzj = bArr2;
                zzagbVar.zzc(bArr2, 0, i10);
                return;
            }
            if (i22 == 18402) {
                byte[] bArr3 = new byte[i10];
                zzagbVar.zzc(bArr3, 0, i10);
                zzr(i5);
                this.zzG.zzk = new zzahl(1, bArr3, 0, 0);
                return;
            }
            if (i22 == 21419) {
                zzeu zzeuVar2 = this.zzr;
                Arrays.fill(zzeuVar2.zzi(), (byte) 0);
                zzagbVar.zzc(zzeuVar2.zzi(), 4 - i10, i10);
                zzeuVar2.zzh(0);
                this.zzI = (int) zzeuVar2.zzz();
                return;
            }
            if (i22 == 25506) {
                zzr(i5);
                byte[] bArr4 = new byte[i10];
                this.zzG.zzl = bArr4;
                zzagbVar.zzc(bArr4, 0, i10);
                return;
            }
            if (i22 != 30322) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i22).length() + 15);
                sb2.append("Unexpected id: ");
                sb2.append(i22);
                throw zzat.zzb(sb2.toString(), null);
            }
            zzr(i5);
            byte[] bArr5 = new byte[i10];
            this.zzG.zzx = bArr5;
            zzagbVar.zzc(bArr5, 0, i10);
            return;
        }
        int i26 = 8;
        if (this.zzW == 0) {
            zzako zzakoVar = this.zzh;
            this.zzac = (int) zzakoVar.zzb(zzagbVar, false, true, 8);
            this.zzad = zzakoVar.zzc();
            this.zzY = -9223372036854775807L;
            this.zzW = 1;
            this.zzp.zza(0);
        }
        zzakl zzaklVar3 = (zzakl) this.zzi.get(this.zzac);
        if (zzaklVar3 == null) {
            zzagbVar.zzf(i10 - this.zzad);
            this.zzW = 0;
            return;
        }
        zzaklVar3.zzb();
        if (this.zzW == 1) {
            zzu(zzagbVar, 3);
            zzeu zzeuVar3 = this.zzp;
            int i27 = (zzeuVar3.zzi()[2] & 6) >> 1;
            if (i27 == 0) {
                this.zzaa = 1;
                int[] iArrZzB = zzB(this.zzab, 1);
                this.zzab = iArrZzB;
                iArrZzB[0] = (i10 - this.zzad) - 3;
            } else {
                zzu(zzagbVar, 4);
                int i28 = (zzeuVar3.zzi()[3] & ForkServer.ERROR) + 1;
                this.zzaa = i28;
                int[] iArrZzB2 = zzB(this.zzab, i28);
                this.zzab = iArrZzB2;
                if (i27 == 2) {
                    int i29 = (i10 - this.zzad) - 4;
                    int i30 = this.zzaa;
                    Arrays.fill(iArrZzB2, 0, i30, i29 / i30);
                } else {
                    if (i27 != 1) {
                        if (i27 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i31 = 0;
                        int i32 = 0;
                        int i33 = 4;
                        while (true) {
                            int i34 = this.zzaa - 1;
                            if (i31 >= i34) {
                                i12 = i23;
                                i13 = i24;
                                i14 = i25;
                                this.zzab[i34] = ((i10 - this.zzad) - i33) - i32;
                                break;
                            }
                            this.zzab[i31] = i25;
                            int i35 = i33 + 1;
                            zzu(zzagbVar, i35);
                            if (zzeuVar3.zzi()[i33] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i36 = i25;
                            while (true) {
                                if (i25 >= i26) {
                                    i15 = i23;
                                    i16 = i24;
                                    i17 = i26;
                                    j8 = 0;
                                    break;
                                }
                                i17 = i26;
                                int i37 = i24 << (7 - i25);
                                if ((zzeuVar3.zzi()[i33] & i37) != 0) {
                                    i35 += i25;
                                    zzu(zzagbVar, i35);
                                    int i38 = i33 + 1;
                                    int i39 = zzeuVar3.zzi()[i33] & ForkServer.ERROR & (~i37);
                                    int i40 = i23;
                                    j8 = i39;
                                    i15 = i40;
                                    int i41 = i38;
                                    while (i41 < i35) {
                                        j8 = (j8 << i17) | (zzeuVar3.zzi()[i41] & ForkServer.ERROR);
                                        i24 = i24;
                                        i41++;
                                        i25 = i25;
                                    }
                                    i16 = i24;
                                    int i42 = i25;
                                    if (i31 > 0) {
                                        j8 -= (1 << ((i42 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i25++;
                                    i26 = i17;
                                }
                            }
                            if (j8 < -2147483648L || j8 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzab;
                            int i43 = (int) j8;
                            if (i31 != 0) {
                                i43 += iArr[i31 - 1];
                            }
                            iArr[i31] = i43;
                            i32 += i43;
                            i31++;
                            i33 = i35;
                            i25 = i36;
                            i23 = i15;
                            i26 = i17;
                            i24 = i16;
                        }
                        throw zzat.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i44 = 0;
                    int i45 = 0;
                    int i46 = 4;
                    while (true) {
                        i18 = this.zzaa - 1;
                        if (i44 >= i18) {
                            break;
                        }
                        this.zzab[i44] = 0;
                        while (true) {
                            i19 = i46 + 1;
                            zzu(zzagbVar, i19);
                            int i47 = zzeuVar3.zzi()[i46] & ForkServer.ERROR;
                            int[] iArr2 = this.zzab;
                            i20 = iArr2[i44] + i47;
                            iArr2[i44] = i20;
                            if (i47 != 255) {
                                break;
                            } else {
                                i46 = i19;
                            }
                        }
                        i45 += i20;
                        i44++;
                        i46 = i19;
                    }
                    this.zzab[i18] = ((i10 - this.zzad) - i46) - i45;
                }
            }
            i12 = 2;
            i13 = 1;
            i14 = 0;
            this.zzX = this.zzU + zzA((zzeuVar3.zzi()[i14] << 8) | (zzeuVar3.zzi()[i13] & ForkServer.ERROR));
            if (zzaklVar3.zzf == i13) {
                i21 = 1;
                this.zzae = i21;
                this.zzW = i12;
                this.zzZ = i14;
                i11 = 163;
            } else {
                if (i22 != 163) {
                    i21 = i14;
                } else if ((zzeuVar3.zzi()[i12] & 128) == 128) {
                    i22 = 163;
                    i21 = 1;
                } else {
                    i21 = i14;
                    i22 = 163;
                }
                this.zzae = i21;
                this.zzW = i12;
                this.zzZ = i14;
                i11 = 163;
            }
        } else {
            i11 = 163;
        }
        if (i22 == i11) {
            while (true) {
                int i48 = this.zzZ;
                if (i48 >= this.zzaa) {
                    this.zzW = 0;
                    return;
                }
                int iZzv = zzv(zzagbVar, zzaklVar3, this.zzab[i48], false);
                zzakl zzaklVar4 = zzaklVar3;
                zzt(zzaklVar4, this.zzX + ((this.zzZ * zzaklVar3.zzg) / 1000), this.zzae, iZzv, 0);
                this.zzZ++;
                zzaklVar3 = zzaklVar4;
            }
        } else {
            while (true) {
                int i49 = this.zzZ;
                if (i49 >= this.zzaa) {
                    return;
                }
                int[] iArr3 = this.zzab;
                iArr3[i49] = zzv(zzagbVar, zzaklVar3, iArr3[i49], true);
                this.zzZ++;
            }
        }
    }

    public zzakm(zzake zzakeVar, int i5, zzanq zzanqVar) {
        this.zzz = -1L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzM = -9223372036854775807L;
        this.zzN = -1;
        this.zzO = -1L;
        this.zzP = -1L;
        this.zzQ = -1;
        this.zzS = -1L;
        this.zzT = -1L;
        this.zzU = -9223372036854775807L;
        this.zzas = zzakeVar;
        zzakeVar.zza(new zzakh(this, null));
        this.zzm = zzanqVar;
        this.zzK = new SparseArray();
        this.zzk = 1 == ((i5 & 1) ^ 1);
        this.zzl = (i5 & 2) == 0;
        this.zzh = new zzako();
        this.zzj = new LongSparseArray();
        this.zzi = new SparseArray();
        this.zzp = new zzeu(4);
        this.zzq = new zzeu(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzr = new zzeu(4);
        this.zzn = new zzeu(zzgr.zza);
        this.zzo = new zzeu(4);
        this.zzs = new zzeu();
        this.zzt = new zzeu();
        this.zzu = new zzeu(8);
        this.zzv = new zzeu();
        this.zzw = new zzeu();
        this.zzab = new int[1];
        this.zzE = true;
    }

    public zzakm(zzanq zzanqVar, int i5) {
        this(new zzake(), 0, zzanqVar);
    }
}
