package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class adwb extends adlo {
    private static final adwt C;
    private static final adjt D;
    private static final adjf E;
    public static final Logger a = Logger.getLogger(adwb.class.getName());
    static final long b;
    public static final long c;
    static final Pattern d;
    public static final Method e;
    public final advw A;
    final adqs B = new adqs();
    public adwt f;
    public final adwt g;
    public final List h;
    public admt i;
    final List j;
    public final String k;
    public IdentityHashMap l;
    final String m;
    final adjt n;
    final adjf o;
    public long p;
    public boolean q;
    final adkj r;
    public Map s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    final List y;
    public final advx z;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = 1800000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        c = 1000L;
        C = new adzs(adue.o, 0);
        D = adjt.b;
        E = adjf.a;
        d = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        Method declaredMethod = null;
        try {
            Class<?> cls = Class.forName("adqt");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
        }
        e = declaredMethod;
    }

    public adwb(SocketAddress socketAddress, String str, advx advxVar) {
        adwt adwtVar = C;
        this.f = adwtVar;
        this.g = adwtVar;
        this.h = new ArrayList();
        this.i = admt.b();
        this.j = new ArrayList();
        this.m = "pick_first";
        this.n = D;
        this.o = E;
        this.p = b;
        this.q = true;
        this.r = adkj.b;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = new ArrayList();
        this.k = b(socketAddress);
        this.z = advxVar;
        admt admtVar = new admt();
        admtVar.e(new advz(socketAddress, str));
        this.i = admtVar;
        this.A = new aear();
        adqs.v();
    }

    static String b(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", a.bY(socketAddress, "/"), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Map c(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            woy.S(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, c((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, f((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Number) {
                linkedHashMap.put(str, Double.valueOf(((Number) value).doubleValue()));
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + String.valueOf(entry) + "' is of type '" + String.valueOf(value.getClass()) + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static aebg d(String str, admt admtVar) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        adms admsVarA = uri != null ? admtVar.a(uri.getScheme()) : null;
        if (admsVarA == null && !d.matcher(str).matches()) {
            try {
                URI uri2 = new URI(admtVar.c(), "", a.bz(str, "/"), null);
                uri = uri2;
                admsVarA = admtVar.a(uri2.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (admsVarA == null) {
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? a.bW(sb, " (", ")") : ""));
        }
        return new aebg(new aeae(uri), admsVarA, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aebg e(java.lang.String r18, defpackage.admt r19) throws java.nio.charset.CharacterCodingException, java.net.URISyntaxException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adwb.e(java.lang.String, admt):aebg");
    }

    private static List f(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(c((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(f((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Number) {
                arrayList.add(Double.valueOf(((Number) obj).doubleValue()));
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj.toString() + "' is of type '" + String.valueOf(obj.getClass()) + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // defpackage.adlo
    public final adlm a() {
        throw null;
    }

    public adwb(String str, advx advxVar, advw advwVar) {
        adwt adwtVar = C;
        this.f = adwtVar;
        this.g = adwtVar;
        this.h = new ArrayList();
        this.i = admt.b();
        this.j = new ArrayList();
        this.m = "pick_first";
        this.n = D;
        this.o = E;
        this.p = b;
        this.q = true;
        this.r = adkj.b;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = new ArrayList();
        str.getClass();
        this.k = str;
        this.z = advxVar;
        this.A = advwVar;
        this.i = admt.b();
        adqs.v();
    }
}
