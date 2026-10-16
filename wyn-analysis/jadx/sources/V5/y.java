package V5;

import E5.T;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import l8.AbstractC3409K;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f13150a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f13151b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f13152c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (u6.v.f46721a < 26 && u6.v.f46722b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f13061a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new s(new r(1), 0));
        }
        int i5 = u6.v.f46721a;
        if (i5 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).f13061a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new s(new r(2), 0));
            }
        }
        if (i5 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f13061a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }

    public static String b(T t10) {
        Pair pairD;
        if ("audio/eac3-joc".equals(t10.f3238l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(t10.f3238l) || (pairD = d(t10)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (iIntValue == 512) {
            return MimeTypes.VIDEO_H264;
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(E5.T r32) {
        /*
            Method dump skipped, instructions count: 2342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.y.d(E5.T):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z2, boolean z10) {
        try {
            t tVar = new t(str, z2, z10);
            HashMap map = f13151b;
            List list = (List) map.get(tVar);
            if (list != null) {
                return list;
            }
            int i5 = u6.v.f46721a;
            ArrayList arrayListF = f(tVar, i5 >= 21 ? new w(0, z2, z10) : new Xd.c(27));
            if (z2 && arrayListF.isEmpty() && 21 <= i5 && i5 <= 23) {
                arrayListF = f(tVar, new Xd.c(27));
                if (!arrayListF.isEmpty()) {
                    AbstractC4256a.E("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) arrayListF.get(0)).f13061a);
                }
            }
            a(str, arrayListF);
            AbstractC3409K abstractC3409KJ = AbstractC3409K.j(arrayListF);
            map.put(tVar, abstractC3409KJ);
            return abstractC3409KJ;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ArrayList f(t tVar, v vVar) throws Exception {
        String strC;
        String str;
        String str2;
        v vVar2 = vVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = tVar.f13144a;
            int iE = vVar2.e();
            boolean zG = vVar2.g();
            int i5 = 0;
            while (i5 < iE) {
                MediaCodecInfo mediaCodecInfoB = vVar2.b(i5);
                int i10 = u6.v.f46721a;
                if (i10 < 29 || !mediaCodecInfoB.isAlias()) {
                    String name = mediaCodecInfoB.getName();
                    if (g(mediaCodecInfoB, name, zG, str3) && (strC = c(mediaCodecInfoB, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strC);
                            boolean zC = vVar2.c("tunneled-playback", strC, capabilitiesForType);
                            boolean zD = vVar2.d("tunneled-playback", capabilitiesForType);
                            boolean z2 = tVar.f13146c;
                            if ((z2 || !zD) && (!z2 || zC)) {
                                boolean zC2 = vVar2.c("secure-playback", strC, capabilitiesForType);
                                boolean zD2 = vVar2.d("secure-playback", capabilitiesForType);
                                boolean z10 = tVar.f13145b;
                                if ((z10 || !zD2) && (!z10 || zC2)) {
                                    boolean zIsHardwareAccelerated = i10 >= 29 ? mediaCodecInfoB.isHardwareAccelerated() : !h(mediaCodecInfoB, str3);
                                    h(mediaCodecInfoB, str3);
                                    if (i10 >= 29) {
                                        mediaCodecInfoB.isVendor();
                                    } else {
                                        String strO = A6.h.O(mediaCodecInfoB.getName());
                                        if (!strO.startsWith("omx.google.") && !strO.startsWith("c2.android.")) {
                                            strO.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zG && z10 == zC2) && (zG || z10)) {
                                        str2 = name;
                                        boolean z11 = zIsHardwareAccelerated;
                                        if (!zG && zC2) {
                                            str = strC;
                                            try {
                                                arrayList.add(n.g(str2 + ".secure", str3, str, capabilitiesForType, z11, true));
                                                break;
                                            } catch (Exception e7) {
                                                e = e7;
                                                if (u6.v.f46721a <= 23 || arrayList.isEmpty()) {
                                                    AbstractC4256a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                AbstractC4256a.o("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i5++;
                                                vVar2 = vVar;
                                            }
                                        }
                                    } else {
                                        str = strC;
                                        try {
                                            str2 = name;
                                        } catch (Exception e10) {
                                            e = e10;
                                            str2 = name;
                                        }
                                        try {
                                            arrayList.add(n.g(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false));
                                        } catch (Exception e11) {
                                            e = e11;
                                            str = str;
                                            if (u6.v.f46721a <= 23) {
                                            }
                                            AbstractC4256a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str = strC;
                            str2 = name;
                        }
                    }
                }
                i5++;
                vVar2 = vVar;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new u("Failed to query underlying media codecs", e13);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z2 && str.endsWith(".secure")) {
            return false;
        }
        int i5 = u6.v.f46721a;
        if (i5 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i5 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = u6.v.f46722b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(u6.v.f46723c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i5 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = u6.v.f46722b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i5 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = u6.v.f46722b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i5 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(u6.v.f46723c))) {
            String str6 = u6.v.f46722b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i5 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(u6.v.f46723c)) {
            String str7 = u6.v.f46722b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i5 <= 19 && u6.v.f46722b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i5 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (u6.v.f46721a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (u6.k.g(str)) {
            return true;
        }
        String strO = A6.h.O(mediaCodecInfo.getName());
        if (strO.startsWith("arc.")) {
            return false;
        }
        if (strO.startsWith("omx.google.") || strO.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strO.startsWith("omx.sec.") && strO.contains(".sw.")) || strO.equals("omx.qcom.video.decoder.hevcswvdec") || strO.startsWith("c2.android.") || strO.startsWith("c2.google.")) {
            return true;
        }
        return (strO.startsWith("omx.") || strO.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i5;
        if (f13152c == -1) {
            int iMax = 0;
            List listE = e(MimeTypes.VIDEO_H264, false, false);
            n nVar = listE.isEmpty() ? null : (n) listE.get(0);
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f13064d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i10 = codecProfileLevelArr[iMax].level;
                    if (i10 != 1 && i10 != 2) {
                        switch (i10) {
                            case 8:
                            case 16:
                            case 32:
                                i5 = 101376;
                                break;
                            case 64:
                                i5 = 202752;
                                break;
                            case 128:
                            case 256:
                                i5 = 414720;
                                break;
                            case 512:
                                i5 = 921600;
                                break;
                            case Segment.SHARE_MINIMUM /* 1024 */:
                                i5 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i5 = 2097152;
                                break;
                            case Segment.SIZE /* 8192 */:
                                i5 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i5 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i5 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i5 = 35651584;
                                break;
                            default:
                                i5 = -1;
                                break;
                        }
                    } else {
                        i5 = 25344;
                    }
                    iMax2 = Math.max(i5, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, u6.v.f46721a >= 21 ? 345600 : 172800);
            }
            f13152c = iMax;
        }
        return f13152c;
    }
}
