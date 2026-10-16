package com.google.android.gms.internal.ads;

import Va.M6;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class zzart implements zzaru {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzagd zzc;
    private final zzahm zzd;
    private final zzary zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzeu zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzart(zzagd zzagdVar, zzahm zzahmVar, zzary zzaryVar) throws zzat {
        this.zzc = zzagdVar;
        this.zzd = zzahmVar;
        this.zze = zzaryVar;
        int iMax = Math.max(1, zzaryVar.zzc / 10);
        this.zzi = iMax;
        zzeu zzeuVar = new zzeu(zzaryVar.zzf);
        zzeuVar.zzu();
        int iZzu = zzeuVar.zzu();
        this.zzf = iZzu;
        int i5 = zzaryVar.zzb;
        int i10 = zzaryVar.zzd;
        int iC = M6.C(i10 - (i5 * 4), 8, zzaryVar.zze * i5, 1);
        if (iZzu != iC) {
            throw zzat.zzb(com.google.android.gms.internal.consent_sdk.a.u(iC, iZzu, "Expected frames per block: ", "; got: ", new StringBuilder(String.valueOf(iC).length() + 34 + String.valueOf(iZzu).length())), null);
        }
        String str = zzfm.zza;
        int i11 = ((iMax + iZzu) - 1) / iZzu;
        this.zzg = new byte[i10 * i11];
        this.zzh = new zzeu((iZzu + iZzu) * i5 * i11);
        int i12 = ((zzaryVar.zzc * zzaryVar.zzd) * 8) / iZzu;
        zzt zztVar = new zzt();
        zztVar.zzo("audio/raw");
        zztVar.zzi(i12);
        zztVar.zzj(i12);
        zztVar.zzp((iMax + iMax) * i5);
        zztVar.zzG(zzaryVar.zzb);
        zztVar.zzH(zzft.zzb(zzaryVar.zzg));
        zztVar.zzI(zzaryVar.zzc);
        zztVar.zzJ(2);
        this.zzj = zztVar.zzP();
    }

    private final void zzd(int i5) {
        long jZzw = this.zzl + zzfm.zzw(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZzf = zzf(i5);
        this.zzd.zze(jZzw, 1, iZzf, this.zzm - iZzf, null);
        this.zzn += i5;
        this.zzm -= iZzf;
    }

    private final int zze(int i5) {
        int i10 = this.zze.zzb;
        return i5 / (i10 + i10);
    }

    private final int zzf(int i5) {
        return (i5 + i5) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final void zza(long j8) {
        this.zzk = 0;
        this.zzl = j8;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final void zzb(int i5, long j8) {
        zzasb zzasbVar = new zzasb(this.zze, this.zzf, i5, j8);
        this.zzc.zzw(zzasbVar);
        zzahm zzahmVar = this.zzd;
        zzahmVar.zzA(this.zzj);
        zzahmVar.zzP(zzasbVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:4:0x0022). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzagb r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzart.zzc(com.google.android.gms.internal.ads.zzagb, long):boolean");
    }
}
