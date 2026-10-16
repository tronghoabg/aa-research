package N1;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f8025a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f8026b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        D9.n nVarF;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (nVarF = f(str2)) != null && (iA = nVarF.a()) != 0 && iA != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrU = Q1.x.U(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrU) {
                if (str2.equals(d(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        D9.n nVarF;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (nVarF = f(str2)) == null) {
                    return 0;
                }
                return nVarF.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        D9.n nVarF;
        String strE = null;
        if (str != null) {
            String strO = A6.h.O(str.trim());
            if (strO.startsWith("avc1") || strO.startsWith("avc3")) {
                return MimeTypes.VIDEO_H264;
            }
            if (strO.startsWith("hev1") || strO.startsWith("hvc1")) {
                return MimeTypes.VIDEO_H265;
            }
            if (strO.startsWith("dvav") || strO.startsWith("dva1") || strO.startsWith("dvhe") || strO.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strO.startsWith("av01")) {
                return MimeTypes.VIDEO_AV1;
            }
            if (strO.startsWith("vp9") || strO.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strO.startsWith("vp8") || strO.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strO.startsWith("mp4a")) {
                if (strO.startsWith("mp4a.") && (nVarF = f(strO)) != null) {
                    strE = e(nVarF.f2592b);
                }
                return strE == null ? "audio/mp4a-latm" : strE;
            }
            if (strO.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strO.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strO.startsWith("ac-3") || strO.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strO.startsWith("ec-3") || strO.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strO.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strO.startsWith("ac-4") || strO.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strO.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strO.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strO.startsWith("dtsh") || strO.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strO.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strO.startsWith("opus")) {
                return "audio/opus";
            }
            if (strO.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strO.startsWith("flac")) {
                return "audio/flac";
            }
            if (strO.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strO.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strO.contains("cea708")) {
                return "application/cea-708";
            }
            if (strO.contains("eia608") || strO.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f8025a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static String e(int i5) {
        if (i5 == 32) {
            return "video/mp4v-es";
        }
        if (i5 == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i5 == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i5 == 64) {
            return "audio/mp4a-latm";
        }
        if (i5 == 163) {
            return "video/wvc1";
        }
        if (i5 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i5 == 221) {
            return "audio/vorbis";
        }
        if (i5 == 165) {
            return "audio/ac3";
        }
        if (i5 == 166) {
            return "audio/eac3";
        }
        switch (i5) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i5) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static D9.n f(String str) {
        Matcher matcher = f8026b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new D9.n(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 4);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if (j(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f8025a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static boolean i(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(g(str));
    }

    public static boolean j(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean k(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return MimeTypes.BASE_TYPE_VIDEO.equals(g(str));
    }

    public static String m(String str) {
        String strO;
        if (str == null) {
            return null;
        }
        strO = A6.h.O(str);
        strO.getClass();
        switch (strO) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strO;
        }
    }
}
