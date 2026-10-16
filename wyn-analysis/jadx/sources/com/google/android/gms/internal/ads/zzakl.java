package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzakl {
    public byte[] zzO;
    public zzahn zzV;
    public boolean zzX;
    public zzahm zzZ;
    public boolean zza;
    public zzv zzaa;
    public int zzab;
    private int zzac;
    public String zzb;
    public String zzc;
    public int zzd;
    public long zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public boolean zzi;
    public byte[] zzj;
    public zzahl zzk;
    public byte[] zzl;
    public zzq zzm;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = -1;
    public int zzs = 0;
    public int zzt = -1;
    public float zzu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float zzv = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float zzw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public byte[] zzx = null;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = -1;
    public int zzS = 8000;
    public long zzT = 0;
    public long zzU = 0;
    public boolean zzW = false;
    public boolean zzY = true;
    private String zzad = "eng";

    private static Pair zzf(zzeu zzeuVar) throws zzat {
        try {
            zzeuVar.zzk(16);
            long jZzA = zzeuVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzeh.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzeuVar.zzg() + 20;
            byte[] bArrZzi = zzeuVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i5 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i5] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i5;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i5;
        int i10;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = 0;
            int i12 = 1;
            while (true) {
                int i13 = bArr[i12];
                i12++;
                i5 = i13 & 255;
                if (i5 != 255) {
                    break;
                }
                i11 += 255;
            }
            int i14 = i11 + i5;
            int i15 = 0;
            while (true) {
                int i16 = bArr[i12];
                i12++;
                i10 = i16 & 255;
                if (i10 != 255) {
                    break;
                }
                i15 += 255;
            }
            int i17 = i15 + i10;
            if (bArr[i12] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i12, bArr2, 0, i14);
            int i18 = i12 + i14;
            if (bArr[i18] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i19 = i18 + i17;
            if (bArr[i19] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i19;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i19, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private final boolean zzh(zzeu zzeuVar) throws zzat {
        try {
            int iZzu = zzeuVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzeuVar.zzh(20);
                int iZzI = zzeuVar.zzI();
                if (zzft.zza(iZzI, this.zzP)) {
                    this.zzR = zzft.zzb(iZzI);
                }
                if (zzeuVar.zzD() == zzakm.zzf.getMostSignificantBits()) {
                    if (zzeuVar.zzD() == zzakm.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzl;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(int r25) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakl.zza(int):void");
    }

    public final /* synthetic */ void zzb() {
        this.zzZ.getClass();
    }

    public final /* synthetic */ int zzc() {
        return this.zzac;
    }

    public final /* synthetic */ void zzd(int i5) {
        this.zzac = i5;
    }

    public final /* synthetic */ void zze(String str) {
        this.zzad = str;
    }
}
