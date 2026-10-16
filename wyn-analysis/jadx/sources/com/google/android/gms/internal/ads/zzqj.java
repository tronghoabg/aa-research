package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.List;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzqj {
    public static final zzqj zza;
    static final zzgww zzb;
    private static final zzgwt zzc;
    private static final zzgwt zzd;
    private static final zzgwt zze;
    private final SparseArray zzf = new SparseArray();
    private final int zzg;
    private final zzgwt zzh;
    private final zzgwt zzi;

    static {
        zzgwt zzgwtVarZzj = zzgwt.zzj(12);
        zzc = zzgwtVarZzj;
        zzgwt zzgwtVarZzi = zzgwt.zzi();
        zzd = zzgwtVarZzi;
        zza = new zzqj(zzgwt.zzj(zzqi.zza), zzgwtVarZzj, zzgwtVarZzi);
        zze = zzgwt.zzl(2, 5, 6);
        zzgwv zzgwvVar = new zzgwv();
        zzgwvVar.zza(5, 6);
        zzgwvVar.zza(17, 6);
        zzgwvVar.zza(7, 6);
        zzgwvVar.zza(30, 10);
        zzgwvVar.zza(18, 6);
        zzgwvVar.zza(6, 8);
        zzgwvVar.zza(8, 8);
        zzgwvVar.zza(14, 8);
        zzb = zzgwvVar.zzc();
    }

    private zzqj(List list, List list2, List list3) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzqi zzqiVar = (zzqi) list.get(i5);
            this.zzf.put(zzqiVar.zzb, zzqiVar);
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.zzf.size(); i10++) {
            iMax = Math.max(iMax, ((zzqi) this.zzf.valueAt(i10)).zzc);
        }
        this.zzg = iMax;
        this.zzh = zzgwt.zzq(list2);
        this.zzi = zzgwt.zzq(list3);
    }

    public static zzqj zza(Context context, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzqj zzb(android.content.Context r8, android.content.Intent r9, com.google.android.gms.internal.ads.zzd r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzb(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.zzd, android.media.AudioDeviceInfo, java.util.List):com.google.android.gms.internal.ads.zzqj");
    }

    public static Uri zzc() {
        if (zzg()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zzg() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzgwt zzh(int[] iArr, int i5) {
        int i10 = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            zzgwqVar.zzf(new zzqi(i11, i5));
        }
        return zzgwqVar.zzi();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzqj) {
                zzqj zzqjVar = (zzqj) obj;
                SparseArray sparseArray = this.zzf;
                SparseArray sparseArray2 = zzqjVar.zzf;
                String str = zzfm.zza;
                if (Build.VERSION.SDK_INT < 31) {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        for (int i5 = 0; i5 < size; i5++) {
                            if (!Objects.equals(sparseArray.valueAt(i5), sparseArray2.get(sparseArray.keyAt(i5)))) {
                                break;
                            }
                        }
                        if (this.zzg == zzqjVar.zzg) {
                        }
                    }
                } else if (sparseArray.contentEquals(sparseArray2)) {
                    if (this.zzg == zzqjVar.zzg || !Objects.equals(this.zzh, zzqjVar.zzh) || !Objects.equals(this.zzi, zzqjVar.zzi)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfm.zza;
        int i5 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzf;
        if (i5 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return Objects.hashCode(this.zzi) + ((Objects.hashCode(this.zzh) + (((this.zzg * 31) + iContentHashCode) * 31)) * 31);
    }

    public final String toString() {
        zzgwt zzgwtVar = this.zzi;
        zzgwt zzgwtVar2 = this.zzh;
        String string = this.zzf.toString();
        String strValueOf = String.valueOf(zzgwtVar2);
        String strValueOf2 = String.valueOf(zzgwtVar);
        int i5 = this.zzg;
        int length = String.valueOf(i5).length();
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 28 + strValueOf.length() + 26 + strValueOf2.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i5);
        sb2.append(", audioProfiles=");
        sb2.append(string);
        AbstractC3256n.p(sb2, ", speakerLayoutChannelMasks=", strValueOf, ", spatializerChannelMasks=", strValueOf2);
        sb2.append("]");
        return sb2.toString();
    }

    public final zzgwt zzd() {
        return this.zzh;
    }

    public final zzgwt zze() {
        return this.zzi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r1
  0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair zzf(com.google.android.gms.internal.ads.zzv r10, com.google.android.gms.internal.ads.zzd r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzp
            r0.getClass()
            java.lang.String r1 = r10.zzk
            int r1 = com.google.android.gms.internal.ads.zzas.zzg(r0, r1)
            com.google.android.gms.internal.ads.zzgww r2 = com.google.android.gms.internal.ads.zzqj.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L19
            goto Lc7
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            r5 = 18
            if (r1 != r5) goto L2c
            android.util.SparseArray r1 = r9.zzf
            boolean r1 = com.google.android.gms.internal.ads.zzfm.zza(r1, r5)
            if (r1 != 0) goto L2b
            r1 = r4
            goto L47
        L2b:
            r1 = r5
        L2c:
            if (r1 != r3) goto L3a
            android.util.SparseArray r1 = r9.zzf
            boolean r1 = com.google.android.gms.internal.ads.zzfm.zza(r1, r3)
            if (r1 == 0) goto L38
            r1 = r3
            goto L3a
        L38:
            r1 = r2
            goto L47
        L3a:
            r6 = 30
            if (r1 != r6) goto L47
            android.util.SparseArray r7 = r9.zzf
            boolean r6 = com.google.android.gms.internal.ads.zzfm.zza(r7, r6)
            if (r6 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r6 = r9.zzf
            boolean r7 = com.google.android.gms.internal.ads.zzfm.zza(r6, r1)
            if (r7 == 0) goto Lc7
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.ads.zzqi r6 = (com.google.android.gms.internal.ads.zzqi) r6
            r6.getClass()
            int r7 = r10.zzH
            r8 = -1
            if (r7 == r8) goto L7b
            if (r1 != r5) goto L60
            goto L7b
        L60:
            java.lang.String r11 = "audio/vnd.dts.uhd;profile=p2"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L73
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r11 >= r0) goto L73
            r11 = 10
            if (r7 > r11) goto Lc7
            goto L79
        L73:
            boolean r11 = r6.zzb(r7, r10)
            if (r11 == 0) goto Lc7
        L79:
            r11 = r7
            goto L86
        L7b:
            int r0 = r10.zzJ
            if (r0 != r8) goto L82
            r0 = 48000(0xbb80, float:6.7262E-41)
        L82:
            int r11 = r6.zza(r0, r11)
        L86:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r0 > r5) goto L9a
            if (r11 != r2) goto L8f
            goto L9b
        L8f:
            r2 = 3
            if (r11 == r2) goto L98
            r2 = 4
            if (r11 == r2) goto L98
            r2 = 5
            if (r11 != r2) goto L9a
        L98:
            r3 = r4
            goto L9b
        L9a:
            r3 = r11
        L9b:
            r11 = 26
            if (r0 > r11) goto Lad
            java.lang.String r11 = "fugu"
            java.lang.String r0 = android.os.Build.DEVICE
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto Lad
            r11 = 1
            if (r3 != r11) goto Lad
            r3 = 2
        Lad:
            int r10 = r10.zzI
            if (r10 == r8) goto Lb4
            if (r7 != r3) goto Lb4
            goto Lb8
        Lb4:
            int r10 = com.google.android.gms.internal.ads.zzfm.zzG(r3)
        Lb8:
            if (r10 == 0) goto Lc7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        Lc7:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzf(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzd):android.util.Pair");
    }
}
