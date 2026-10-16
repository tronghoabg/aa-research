package d2;

import N1.C;
import N1.C0765n;
import Q1.x;
import V5.w;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.fragment.app.X;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f34073a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (x.f9724a < 26 && x.f9725b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f33992a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new V5.s(new h(), 1));
        }
        if (x.f9724a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f33992a)) {
            return;
        }
        arrayList.add((m) arrayList.remove(0));
    }

    public static String b(C0765n c0765n) {
        Pair pairD;
        if ("audio/eac3-joc".equals(c0765n.f8232n)) {
            return "audio/eac3";
        }
        String str = c0765n.f8232n;
        if ("video/dolby-vision".equals(str) && (pairD = d(c0765n)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return MimeTypes.VIDEO_H265;
            }
            if (iIntValue == 512) {
                return MimeTypes.VIDEO_H264;
            }
            if (iIntValue == 1024) {
                return MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return MimeTypes.VIDEO_H265;
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
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
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
    /* JADX WARN: Removed duplicated region for block: B:162:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(N1.C0765n r34) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.v.d(N1.n):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z2, boolean z10) {
        try {
            r rVar = new r(str, z2, z10);
            HashMap map = f34073a;
            List list = (List) map.get(rVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(rVar, new w(1, z2, z10));
            if (z2 && arrayListF.isEmpty() && x.f9724a <= 23) {
                arrayListF = f(rVar, new X(4));
                if (!arrayListF.isEmpty()) {
                    Q1.k.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) arrayListF.get(0)).f33992a);
                }
            }
            a(str, arrayListF);
            AbstractC3409K abstractC3409KJ = AbstractC3409K.j(arrayListF);
            map.put(rVar, abstractC3409KJ);
            return abstractC3409KJ;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ArrayList f(r rVar, t tVar) throws Exception {
        String strC;
        String str;
        String str2;
        t tVar2 = tVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = rVar.f34070a;
            int iE = tVar2.e();
            boolean zG = tVar2.g();
            int i5 = 0;
            while (i5 < iE) {
                MediaCodecInfo mediaCodecInfoB = tVar2.b(i5);
                int i10 = x.f9724a;
                if (i10 < 29 || !mediaCodecInfoB.isAlias()) {
                    String name = mediaCodecInfoB.getName();
                    if (h(mediaCodecInfoB, name, zG, str3) && (strC = c(mediaCodecInfoB, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strC);
                            boolean zC = tVar2.c("tunneled-playback", strC, capabilitiesForType);
                            boolean zD = tVar2.d("tunneled-playback", capabilitiesForType);
                            boolean z2 = rVar.f34072c;
                            if ((z2 || !zD) && (!z2 || zC)) {
                                boolean zC2 = tVar2.c("secure-playback", strC, capabilitiesForType);
                                boolean zD2 = tVar2.d("secure-playback", capabilitiesForType);
                                boolean z10 = rVar.f34071b;
                                if ((z10 || !zD2) && (!z10 || zC2)) {
                                    boolean zIsHardwareAccelerated = i10 >= 29 ? mediaCodecInfoB.isHardwareAccelerated() : !i(mediaCodecInfoB, str3);
                                    i(mediaCodecInfoB, str3);
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
                                                arrayList.add(m.h(str2 + ".secure", str3, str, capabilitiesForType, z11, true));
                                                break;
                                            } catch (Exception e7) {
                                                e = e7;
                                                if (x.f9724a <= 23 || arrayList.isEmpty()) {
                                                    Q1.k.k("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                Q1.k.k("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i5++;
                                                tVar2 = tVar;
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
                                            arrayList.add(m.h(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false));
                                        } catch (Exception e11) {
                                            e = e11;
                                            str = str;
                                            if (x.f9724a <= 23) {
                                            }
                                            Q1.k.k("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
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
                tVar2 = tVar;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new s("Failed to query underlying media codecs", e13);
        }
    }

    public static e0 g(h hVar, C0765n c0765n, boolean z2, boolean z10) {
        Iterable iterableE;
        String str = c0765n.f8232n;
        hVar.getClass();
        List listE = e(str, z2, z10);
        String strB = b(c0765n);
        if (strB == null) {
            iterableE = e0.f40101e;
        } else {
            hVar.getClass();
            iterableE = e(strB, z2, z10);
        }
        C3406H c3406hI = AbstractC3409K.i();
        c3406hI.d(listE);
        c3406hI.d(iterableE);
        return c3406hI.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z2 && str.endsWith(".secure")) {
            return false;
        }
        int i5 = x.f9724a;
        if (i5 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(x.f9726c))) {
            String str3 = x.f9725b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i5 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (x.f9724a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (C.i(str)) {
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
}
