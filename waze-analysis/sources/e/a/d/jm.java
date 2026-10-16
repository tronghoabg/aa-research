package e.a.d;

import androidx.webkit.ProxyConfig;
import j$.util.DesugarCollections;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.text.ParseException;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import l.a.lo;
import l.a.mt;
import l.a.mu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jm {
    private jm() {
    }

    static Set a(Map map) {
        Set setS = s(map, "nonFatalStatusCodes");
        if (setS == null) {
            return DesugarCollections.unmodifiableSet(EnumSet.noneOf(e.a.eb.class));
        }
        com.google.d.d.fo.aj(!setS.contains(e.a.eb.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setS;
    }

    static Set b(Map map) {
        Set setS = s(map, "retryableStatusCodes");
        com.google.d.d.fo.aj(setS != null, "%s is required in retry policy", "retryableStatusCodes");
        com.google.d.d.fo.aj(true ^ setS.contains(e.a.eb.OK), "%s must not contain OK", "retryableStatusCodes");
        return setS;
    }

    public static final PasswordAuthentication c(String str, InetAddress inetAddress, int i2) {
        URL url;
        try {
            url = new URL(ProxyConfig.MATCH_HTTPS, str, i2, "");
        } catch (MalformedURLException unused) {
            hn.f47100a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{ProxyConfig.MATCH_HTTPS, str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i2, ProxyConfig.MATCH_HTTPS, "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static en d() {
        return hs.b() ? new hs() : new k();
    }

    public static Boolean e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Double f(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer g(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d2 = (Double) obj;
        int iIntValue = d2.intValue();
        if (iIntValue == d2.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        Objects.toString(d2);
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d2)));
    }

    public static Long h(Map map, String str) throws NumberFormatException, ParseException {
        boolean z;
        int iCharAt;
        String strI = i(map, str);
        if (strI == null) {
            return null;
        }
        try {
            if (strI.isEmpty() || strI.charAt(strI.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(strI), 0);
            }
            if (strI.charAt(0) == '-') {
                strI = strI.substring(1);
                z = true;
            } else {
                z = false;
            }
            String strSubstring = strI.substring(0, strI.length() - 1);
            String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long jG = Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i2 = 0; i2 < 9; i2++) {
                    iCharAt *= 10;
                    if (i2 < strSubstring2.length()) {
                        if (strSubstring2.charAt(i2) < '0' || strSubstring2.charAt(i2) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt += strSubstring2.charAt(i2) - '0';
                    }
                }
            }
            if (jG < 0) {
                throw new ParseException("Invalid duration string: ".concat(String.valueOf(strI)), 0);
            }
            if (z) {
                jG = -jG;
                iCharAt = -iCharAt;
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                try {
                    jG = com.google.d.j.e.g(jG, iCharAt / 1000000000);
                    iCharAt %= 1000000000;
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            if (jG > 0 && iCharAt < 0) {
                iCharAt += 1000000000;
                jG--;
            }
            if (jG < 0 && iCharAt > 0) {
                iCharAt -= 1000000000;
                jG++;
            }
            if (jG < -315576000000L || jG > 315576000000L) {
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jG), Integer.valueOf(iCharAt)));
            }
            long nanos = TimeUnit.SECONDS.toNanos(jG);
            long j2 = iCharAt;
            long j3 = nanos + j2;
            if (!(((nanos ^ j3) >= 0) | ((j2 ^ nanos) < 0))) {
                j3 = ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return Long.valueOf(j3);
        } catch (ParseException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String i(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static List j(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List k(Map map, String str) {
        List listJ = j(map, str);
        if (listJ == null) {
            return null;
        }
        n(listJ);
        return listJ;
    }

    public static List l(Map map, String str) {
        List listJ = j(map, str);
        if (listJ == null) {
            return null;
        }
        for (int i2 = 0; i2 < listJ.size(); i2++) {
            if (!(listJ.get(i2) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listJ.get(i2), Integer.valueOf(i2), listJ));
            }
        }
        return listJ;
    }

    public static Map m(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static void n(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!(list.get(i2) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i2), Integer.valueOf(i2), list));
            }
        }
    }

    public static final void o(mu muVar, mt mtVar) {
        h.g.b.x.f(muVar, "value");
        mtVar.c(muVar);
    }

    public static final /* synthetic */ com.waze.cf.d.c p(lo loVar) {
        h.g.b.x.f(loVar, "builder");
        return new com.waze.cf.d.c(loVar);
    }

    public static final /* synthetic */ com.waze.sharedui.web.as q(l.a.ez ezVar) {
        h.g.b.x.f(ezVar, "builder");
        return new com.waze.sharedui.web.as(ezVar);
    }

    public static final /* synthetic */ com.waze.cf.d.c r(l.a.hu huVar) {
        h.g.b.x.f(huVar, "builder");
        return new com.waze.cf.d.c(huVar);
    }

    private static Set s(Map map, String str) {
        e.a.eb ebVarA;
        List listJ = j(map, str);
        if (listJ == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(e.a.eb.class);
        for (Object obj : listJ) {
            if (obj instanceof Double) {
                Double d2 = (Double) obj;
                int iIntValue = d2.intValue();
                com.google.d.d.fo.aj(((double) iIntValue) == d2.doubleValue(), "Status code %s is not integral", obj);
                ebVarA = e.a.ee.d(iIntValue).a();
                com.google.d.d.fo.aj(ebVarA.a() == d2.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new com.google.d.b.ar("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    e.a.eb ebVar = e.a.eb.OK;
                    ebVarA = (e.a.eb) Enum.valueOf(e.a.eb.class, (String) obj);
                } catch (IllegalArgumentException e2) {
                    throw new com.google.d.b.ar("Status code " + String.valueOf(obj) + " is not valid", e2);
                }
            }
            enumSetNoneOf.add(ebVarA);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    jm(byte[] bArr) {
    }
}
