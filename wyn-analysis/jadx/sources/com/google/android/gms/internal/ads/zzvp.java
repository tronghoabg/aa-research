package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzvp {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public zzvp(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z2;
        this.zze = z12;
        this.zzf = z14;
        this.zzh = z15;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzvp zza(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            com.google.android.gms.internal.ads.zzvp r0 = new com.google.android.gms.internal.ads.zzvp
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r1
            goto L11
        L10:
            r8 = r2
        L11:
            if (r15 == 0) goto L1d
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L1d
            r9 = r1
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r20 != 0) goto L2a
            if (r15 == 0) goto L2c
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L2c
        L2a:
            r10 = r1
            goto L2d
        L2c:
            r10 = r2
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L67
            if (r15 == 0) goto L67
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L67
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "LENOVO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L73
        L67:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r2
            r2 = r13
            goto L7e
        L73:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r1
            r1 = r12
        L7e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvp.zza(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzvp");
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzp) || str.equals(zzwi.zzg(zzvVar));
    }

    private final boolean zzk(Context context, zzv zzvVar, boolean z2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        zzdq zzdqVarZzf = zzdr.zzf(zzvVar);
        String str = zzvVar.zzp;
        char c10 = 65535;
        if (str != null && str.equals("video/mv-hevc")) {
            String strZzh = zzas.zzh(this.zzc);
            if (strZzh.equals("video/mv-hevc")) {
                return true;
            }
            if (strZzh.equals(MimeTypes.VIDEO_H265)) {
                int i5 = zzwi.zza;
                String strZzk = zzgr.zzk(zzvVar.zzs);
                if (strZzk == null) {
                    zzdqVarZzf = null;
                } else {
                    String strTrim = strZzk.trim();
                    String str2 = zzfm.zza;
                    zzdqVarZzf = zzdr.zzg(strZzk, strTrim.split("\\.", -1), zzvVar.zzF);
                }
            }
        }
        if (zzdqVarZzf == null) {
            return true;
        }
        if (!zzdqVarZzf.zzc()) {
            return false;
        }
        int iZza = zzdqVarZzf.zza();
        int iZzb = zzdqVarZzf.zzb();
        int i10 = 8;
        if ("video/dolby-vision".equals(str)) {
            String str3 = this.zzb;
            int iHashCode = str3.hashCode();
            if (iHashCode != -1662735862) {
                if (iHashCode != -1662541442) {
                    if (iHashCode == 1331836730 && str3.equals(MimeTypes.VIDEO_H264)) {
                        c10 = 0;
                    }
                } else if (str3.equals(MimeTypes.VIDEO_H265)) {
                    c10 = 1;
                }
            } else if (str3.equals(MimeTypes.VIDEO_AV1)) {
                c10 = 2;
            }
            if (c10 == 0) {
                iZzb = 0;
                iZza = 8;
            } else if (c10 == 1 || c10 == 2) {
                iZzb = 0;
                iZza = 2;
            }
        }
        if (!this.zzi && !this.zzb.equals("audio/ac4") && iZza != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzb();
        String str4 = this.zzb;
        if (str4.equals("audio/ac4") && codecProfileLevelArrZzb.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            int i11 = (codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null || audioCapabilities.getMaxInputChannelCount() <= 18) ? 8 : 16;
            codecProfileLevelArrZzb = zzfm.zzS(context) ? new MediaCodecInfo.CodecProfileLevel[]{zzwi.zzf(1026, i11)} : new MediaCodecInfo.CodecProfileLevel[]{zzwi.zzf(257, i11), zzwi.zzf(513, i11), zzwi.zzf(514, i11), zzwi.zzf(1026, i11), zzwi.zzf(1028, i11)};
        }
        if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str4) && codecProfileLevelArrZzb.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            int iIntValue = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue >= 180000000) {
                i10 = Segment.SHARE_MINIMUM;
            } else if (iIntValue >= 120000000) {
                i10 = 512;
            } else if (iIntValue >= 60000000) {
                i10 = 256;
            } else if (iIntValue >= 30000000) {
                i10 = 128;
            } else if (iIntValue >= 18000000) {
                i10 = 64;
            } else if (iIntValue >= 12000000) {
                i10 = 32;
            } else if (iIntValue >= 7200000) {
                i10 = 16;
            } else if (iIntValue < 3600000) {
                i10 = iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
            }
            codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzwi.zzf(1, i10)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrZzb) {
            if (codecProfileLevel.profile == iZza && (codecProfileLevel.level >= iZzb || !z2)) {
                if (MimeTypes.VIDEO_H265.equals(str4) && iZza == 2) {
                    String str5 = Build.DEVICE;
                    if ("sailfish".equals(str5) || "marlin".equals(str5)) {
                    }
                }
                return true;
            }
        }
        String str6 = zzvVar.zzk;
        String str7 = this.zzc;
        zzm(AbstractC3256n.h(new StringBuilder(str7.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, ", ", str7));
        return false;
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzp, "audio/flac") && zzvVar.zzK == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfm.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 14 + 2 + length + 3 + length2 + 1);
        AbstractC3256n.p(sb2, "NoSupport [", str, "] [", str4);
        AbstractC3256n.p(sb2, ", ", str3, "] [", str2);
        sb2.append("]");
        zzeh.zza("MediaCodecInfo", sb2.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i10, double d3) {
        Range<Double> achievableFrameRatesFor;
        Point pointZzo = zzo(videoCapabilities, i5, i10);
        int i11 = pointZzo.x;
        int i12 = pointZzo.y;
        if (d3 == -1.0d || d3 < 1.0d) {
            return videoCapabilities.isSizeSupported(i11, i12);
        }
        double dFloor = Math.floor(d3);
        if (videoCapabilities.areSizeAndRateSupported(i11, i12, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i11, i12)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfm.zza;
        return new Point((((i5 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(Context context, zzv zzvVar) {
        int i5;
        if (!zzj(zzvVar) || !zzk(context, zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i10 = zzvVar.zzw;
            if (i10 <= 0 || (i5 = zzvVar.zzx) <= 0) {
                return true;
            }
            return zzg(i10, i5, zzvVar.zzA);
        }
        int i11 = zzvVar.zzJ;
        if (i11 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i11)) {
                zzm(N0.a.d(i11, "sampleRate.support, ", new StringBuilder(String.valueOf(i11).length() + 20)));
                return false;
            }
        }
        int i12 = zzvVar.zzH;
        if (i12 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                int i13 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                StringBuilder sb2 = new StringBuilder(AbstractC0279p0.g(String.valueOf(maxInputChannelCount).length() + str.length() + 32 + 4, 1, String.valueOf(i13)));
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i13);
                sb2.append("]");
                zzeh.zzc("MediaCodecInfo", sb2.toString());
                maxInputChannelCount = i13;
            }
            if (maxInputChannelCount < i12) {
                zzm(N0.a.d(i12, "channelCount.support, ", new StringBuilder(String.valueOf(i12).length() + 22)));
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(Context context, zzv zzvVar) {
        return zzj(zzvVar) && zzk(context, zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        zzdq zzdqVarZzf = zzdr.zzf(zzvVar);
        return zzdqVarZzf != null && zzdqVarZzf.zzc() && zzdqVarZzf.zza() == 42;
    }

    public final zzje zzf(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i5;
        String str = zzvVar.zzp;
        String str2 = zzvVar2.zzp;
        int i10 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzB != zzvVar2.zzB) {
                i10 |= Segment.SHARE_MINIMUM;
            }
            boolean z2 = (zzvVar.zzw == zzvVar2.zzw && zzvVar.zzx == zzvVar2.zzx) ? false : true;
            if (!this.zze && z2) {
                i10 |= 512;
            }
            zzi zziVar = zzvVar.zzF;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzF)) && !Objects.equals(zziVar, zzvVar2.zzF)) {
                i10 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i10 |= 2;
            }
            int i11 = zzvVar.zzy;
            if (i11 != -1 && (i5 = zzvVar.zzz) != -1 && i11 == zzvVar2.zzy && i5 == zzvVar2.zzz && z2) {
                i10 |= 2;
            }
            if (i10 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairZze = zzdr.zze(zzvVar);
                Pair pairZze2 = zzdr.zze(zzvVar2);
                if (pairZze == null || pairZze2 == null || !((Integer) pairZze.first).equals(pairZze2.first)) {
                    i10 = 2;
                }
            }
            if (i10 == 0) {
                return new zzje(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.zzH != zzvVar4.zzH) {
                i10 |= 4096;
            }
            if (zzvVar3.zzJ != zzvVar4.zzJ) {
                i10 |= Segment.SIZE;
            }
            if (zzvVar3.zzK != zzvVar4.zzK) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i10 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairZze3 = zzdr.zze(zzvVar3);
                    Pair pairZze4 = zzdr.zze(zzvVar4);
                    if (pairZze3 != null && pairZze4 != null) {
                        int iIntValue = ((Integer) pairZze3.first).intValue();
                        int iIntValue2 = ((Integer) pairZze4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new zzje(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairZze3.equals(pairZze4)) {
                            return new zzje(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                    }
                }
            }
            if (i10 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zzje(this.zza, zzvVar3, zzvVar4, 3, 0);
                }
            }
            if (!zzvVar3.zzd(zzvVar4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzje(this.zza, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzje(this.zza, zzvVar3, zzvVar4, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzg(int r11, int r12, double r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvp.zzg(int, int, double):boolean");
    }

    public final float zzh(int i5, int i10) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f10 = this.zzl;
        if (f10 != -3.4028235E38f && this.zzj == i5 && this.zzk == i10) {
            return f10;
        }
        float f11 = 1024.0f;
        if (!zzg(i5, i10, 1024.0d)) {
            float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                boolean zZzg = zzg(i5, i10, f14);
                if (true == zZzg) {
                    f12 = f14;
                }
                if (true != zZzg) {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.zzl = f11;
        this.zzj = i5;
        this.zzk = i10;
        return f11;
    }

    public final Point zzi(int i5, int i10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i5, i10);
    }
}
