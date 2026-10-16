package g2;

import Va.C1062m8;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.AbstractC3403E;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.C3407I;
import l8.C3410L;
import l8.e0;
import l8.t0;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: g2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2671A {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f35503a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f35504b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f35505c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f35506d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f35507e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f35508f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final String f35509g = new String(new byte[]{10});

    /* renamed from: h, reason: collision with root package name */
    public static final String f35510h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static e0 b(String str) {
        if (str == null) {
            C3407I c3407i = AbstractC3409K.f40056b;
            return e0.f40101e;
        }
        AbstractC3437s.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i5 = Q1.x.f9724a;
        int i10 = 0;
        for (String str2 : str.split(",\\s?", -1)) {
            int iA = a(str2);
            if (iA != 0) {
                Integer numValueOf = Integer.valueOf(iA);
                int i11 = i10 + 1;
                int iF = AbstractC3403E.f(objArrCopyOf.length, i11);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i10] = numValueOf;
                i10 = i11;
            }
        }
        return AbstractC3409K.h(i10, objArrCopyOf);
    }

    public static A2.d c(String str) {
        long j8;
        Matcher matcher = f35506d.matcher(str);
        if (!matcher.matches()) {
            throw N1.D.b(str, null);
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        if (matcher.group(2) != null) {
            try {
                j8 = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e7) {
                throw N1.D.b(str, e7);
            }
        } else {
            j8 = 60000;
        }
        return new A2.d(strGroup, j8, 10);
    }

    public static Y1.t d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            return null;
        }
        int i5 = Q1.x.f9724a;
        String[] strArrSplit = userInfo.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 2);
        return new Y1.t(2, strArrSplit[0], strArrSplit[1]);
    }

    public static C1062m8 e(String str) {
        Matcher matcher = f35507e.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(3);
            strGroup2.getClass();
            String strGroup3 = matcher.group(4);
            return new C1062m8(2, strGroup, strGroup2, strGroup3 != null ? strGroup3 : "");
        }
        Matcher matcher2 = f35508f.matcher(str);
        if (matcher2.matches()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            return new C1062m8(1, strGroup4, "", "");
        }
        throw N1.D.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String encodedAuthority = uri.getEncodedAuthority();
        encodedAuthority.getClass();
        Q1.k.c(encodedAuthority.contains("@"));
        int i5 = Q1.x.f9724a;
        return uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
    }

    public static e0 g(C2672B c2672b) {
        Q1.k.c(c2672b.f35513c.b("CSeq") != null);
        C3406H c3406h = new C3406H(4);
        Object[] objArr = {h(c2672b.f35512b), c2672b.f35511a, "RTSP/1.0"};
        int i5 = Q1.x.f9724a;
        c3406h.a(String.format(Locale.US, "%s %s %s", objArr));
        C3410L c3410l = c2672b.f35513c.f35646a;
        t0 it = c3410l.f40060d.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC3409K abstractC3409KD = c3410l.d(str);
            for (int i10 = 0; i10 < abstractC3409KD.size(); i10++) {
                c3406h.a(String.format(Locale.US, "%s: %s", str, abstractC3409KD.get(i10)));
            }
        }
        c3406h.a("");
        c3406h.a(c2672b.f35514d);
        return c3406h.g();
    }

    public static String h(int i5) {
        switch (i5) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
