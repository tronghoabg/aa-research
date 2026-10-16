package b2;

import M2.r;
import N1.AbstractC0756e;
import N1.C0760i;
import N1.C0761j;
import N1.D;
import Q1.x;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o implements o2.o {

    /* renamed from: a, reason: collision with root package name */
    public final l f19283a;

    /* renamed from: b, reason: collision with root package name */
    public final i f19284b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f19260c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f19261d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f19262e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f19263f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f19264g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f19265h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f19266i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f19267j = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f19268l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f19269m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f19270n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f19271o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f19272p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f19273q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f19274r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f19275s = a("CAN-SKIP-DATERANGES");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f19276t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f19277u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f19278v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f19279w = a("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f19280x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f19281y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f19282z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f19233A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f19234B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f19235C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f19236D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f19237E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f19238F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f19239G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f19240H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f19241I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f19242J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f19243K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f19244M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f19245N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f19246O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f19247P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f19248Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f19249R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f19250S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f19251T = a("AUTOSELECT");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f19252U = a("DEFAULT");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f19253V = a("FORCED");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f19254W = a("INDEPENDENT");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f19255X = a("GAP");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f19256Y = a("PRECISE");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f19257Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f19258a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f19259b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f19283a = lVar;
        this.f19284b = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C0761j b(String str, C0760i[] c0760iArr) {
        C0760i[] c0760iArr2 = new C0760i[c0760iArr.length];
        for (int i5 = 0; i5 < c0760iArr.length; i5++) {
            C0760i c0760i = c0760iArr[i5];
            c0760iArr2[i5] = new C0760i(c0760i.f8160b, c0760i.f8161c, c0760i.f8162d, null);
        }
        return new C0761j(str, true, c0760iArr2);
    }

    public static C0760i c(String str, String str2, HashMap map) throws D {
        String strI = i(str, f19242J, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f19243K;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new C0760i(AbstractC0756e.f8147d, null, "video/mp4", Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0756e.f8147d;
            int i5 = x.f9724a;
            return new C0760i(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid2 = AbstractC0756e.f8148e;
        return new C0760i(uuid2, null, "video/mp4", r.a(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b2.i d(b2.l r110, b2.i r111, Dd.c r112, java.lang.String r113) throws java.lang.NumberFormatException, b2.n, N1.D {
        /*
            Method dump skipped, instructions count: 2209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.o.d(b2.l, b2.i, Dd.c, java.lang.String):b2.i");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b2.l e(Dd.c r37, java.lang.String r38) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.o.e(Dd.c, java.lang.String):b2.l");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) throws D {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw D.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = f19259b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004f A[SYNTHETIC] */
    @Override // o2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(android.net.Uri r7, S1.j r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.o.t(android.net.Uri, S1.j):java.lang.Object");
    }
}
