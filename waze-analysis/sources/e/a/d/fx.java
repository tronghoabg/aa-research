package e.a.d;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fx extends e.a.bz {

    /* renamed from: a, reason: collision with root package name */
    static final long f46963a;

    /* renamed from: b, reason: collision with root package name */
    static final long f46964b;

    /* renamed from: c, reason: collision with root package name */
    static final Pattern f46965c;
    private static final Logger s = Logger.getLogger(fx.class.getName());
    private static final gr t;
    private static final e.a.ag u;
    private static final e.a.t v;
    private static final Method w;

    /* renamed from: d, reason: collision with root package name */
    final gr f46966d;

    /* renamed from: e, reason: collision with root package name */
    final gr f46967e;

    /* renamed from: f, reason: collision with root package name */
    e.a.di f46968f;

    /* renamed from: g, reason: collision with root package name */
    final List f46969g;

    /* renamed from: h, reason: collision with root package name */
    final String f46970h;

    /* renamed from: i, reason: collision with root package name */
    IdentityHashMap f46971i;

    /* renamed from: j, reason: collision with root package name */
    final String f46972j;

    /* renamed from: k, reason: collision with root package name */
    final e.a.ag f46973k;

    /* renamed from: l, reason: collision with root package name */
    final e.a.t f46974l;
    long m;
    int n;
    boolean o;
    final e.a.au p;
    Map q;
    final List r;
    private final List x;
    private final fr y;
    private final fq z;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f46963a = 1800000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f46964b = 1000L;
        t = jr.c(dh.m);
        u = e.a.ag.b();
        v = e.a.t.b();
        f46965c = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        Method declaredMethod = null;
        try {
            Class<?> cls = Class.forName("e.a.c.a");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e2) {
            s.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            s.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
        }
        w = declaredMethod;
    }

    public fx(SocketAddress socketAddress, String str, fr frVar) {
        gr grVar = t;
        this.f46966d = grVar;
        this.f46967e = grVar;
        this.x = new ArrayList();
        this.f46968f = e.a.di.b();
        this.f46969g = new ArrayList();
        this.f46972j = "pick_first";
        this.f46973k = u;
        this.f46974l = v;
        this.m = f46963a;
        this.n = 5;
        this.o = true;
        this.p = e.a.au.a();
        this.r = new ArrayList();
        this.f46970h = k(socketAddress);
        this.y = frVar;
        e.a.di diVar = new e.a.di();
        diVar.f(new ft(socketAddress, str));
        this.f46968f = diVar;
        this.z = new fv();
        e.a.dt.n();
    }

    static String k(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", DomExceptionUtils.SEPARATOR + socketAddress.toString(), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    static fw l(String str, e.a.di diVar) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        e.a.de deVarA = uri != null ? diVar.a(uri.getScheme()) : null;
        String str2 = "";
        if (deVarA == null && !f46965c.matcher(str).matches()) {
            try {
                URI uri2 = new URI(diVar.c(), "", DomExceptionUtils.SEPARATOR + str, null);
                uri = uri2;
                deVarA = diVar.a(uri2.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (deVarA != null) {
            return new fw(new ke(uri), deVarA);
        }
        if (sb.length() > 0) {
            str2 = " (" + sb.toString() + ")";
        }
        throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
    }

    static fw m(String str, e.a.di diVar) throws CharacterCodingException, URISyntaxException {
        e.a.ep epVarA;
        StringBuilder sb = new StringBuilder();
        try {
            int i2 = e.a.ep.f47453k;
            try {
                epVarA = e.a.ep.b(str);
            } catch (IllegalArgumentException e2) {
                throw new URISyntaxException(str, e2.getMessage());
            }
        } catch (URISyntaxException e3) {
            sb.append(e3.getMessage());
            epVarA = null;
        }
        e.a.de deVarA = epVarA != null ? diVar.a(epVarA.d()) : null;
        String str2 = "";
        if (deVarA == null && !f46965c.matcher(str).matches()) {
            String strC = diVar.c();
            e.a.eo eoVarA = e.a.ep.a();
            eoVarA.s(strC);
            eoVarA.i("");
            eoVarA.j(DomExceptionUtils.SEPARATOR.concat(String.valueOf(str)));
            epVarA = eoVarA.a();
            deVarA = diVar.a(epVarA.d());
        }
        if (deVarA != null) {
            return new fw(new kd(epVarA), deVarA);
        }
        if (sb.length() > 0) {
            str2 = " (" + sb.toString() + ")";
        }
        throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
    }

    private static List n(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(o((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(n((List) obj));
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

    private static Map o(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            com.google.d.b.an.q(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, o((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, n((List) value));
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

    @Override // e.a.bz
    public final e.a.bx a() {
        e.a.l lVar;
        am amVarB = this.y.b();
        boolean zK = e.a.dt.k();
        String str = this.f46970h;
        fw fwVarM = zK ? m(str, this.f46968f) : l(str, this.f46968f);
        Collection collectionB = amVarB.b();
        if (collectionB != null && !collectionB.containsAll(fwVarM.f46962b.e())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", fwVarM.f46962b.c(), fwVarM.f46961a));
        }
        kf kfVar = fwVarM.f46961a;
        e.a.de deVar = fwVarM.f46962b;
        jr jrVarC = jr.c(dh.m);
        com.google.d.b.aj ajVar = dh.o;
        kfVar.toString();
        List list = this.x;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            e.a.l lVar2 = null;
            if (!it.hasNext()) {
                e.a.dt.m();
                Method method = w;
                if (method != null) {
                    try {
                        lVar = (e.a.l) method.invoke(null, true, true, false, true);
                    } catch (IllegalAccessException e2) {
                        s.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                    } catch (InvocationTargetException e3) {
                        s.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
                    }
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    arrayList.add(0, lVar);
                }
                try {
                    lVar2 = (e.a.l) Class.forName("e.a.c.b").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e4) {
                    s.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
                } catch (IllegalAccessException e5) {
                    s.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                } catch (NoSuchMethodException e6) {
                    s.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                } catch (InvocationTargetException e7) {
                    s.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e7);
                }
                if (lVar2 != null) {
                    arrayList.add(0, lVar2);
                }
                return new fz(new fp(this, amVarB, kfVar, deVar, jrVarC, ajVar, arrayList, jy.f47262a));
            }
            e.a.l lVar3 = (e.a.l) it.next();
            if (lVar3 instanceof fu) {
                e.a.by byVar = ((fu) lVar3).f46960a;
                throw null;
            }
            arrayList.add(lVar3);
        }
    }

    public final gr b() {
        return this.f46967e;
    }

    @Override // e.a.bz
    public final /* bridge */ /* synthetic */ void c(Map map) {
        this.q = o(map);
    }

    @Override // e.a.bz
    public final /* bridge */ /* synthetic */ void d() {
        this.o = true;
    }

    @Override // e.a.bz
    public final /* bridge */ /* synthetic */ void e(TimeUnit timeUnit) {
        com.google.d.b.an.p(true, "idle timeout is %s, but must be positive", 60L);
        if (timeUnit.toDays(60L) >= 30) {
            this.m = -1L;
        } else {
            this.m = Math.max(timeUnit.toMillis(60L), f46964b);
        }
    }

    @Override // e.a.bz
    public final /* bridge */ /* synthetic */ void f() {
        this.n = 5;
    }

    @Override // e.a.bz
    public final /* synthetic */ void g(e.a.cw cwVar, Object obj) {
        IdentityHashMap identityHashMap = this.f46971i;
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            this.f46971i = identityHashMap;
        }
        com.google.d.b.an.C(obj, "value");
        identityHashMap.put(cwVar, obj);
    }

    public fx(String str, fr frVar, fq fqVar) {
        gr grVar = t;
        this.f46966d = grVar;
        this.f46967e = grVar;
        this.x = new ArrayList();
        this.f46968f = e.a.di.b();
        this.f46969g = new ArrayList();
        this.f46972j = "pick_first";
        this.f46973k = u;
        this.f46974l = v;
        this.m = f46963a;
        this.n = 5;
        this.o = true;
        this.p = e.a.au.a();
        this.r = new ArrayList();
        com.google.d.b.an.C(str, TypedValues.AttributesType.S_TARGET);
        this.f46970h = str;
        this.y = frVar;
        this.z = fqVar;
        this.f46968f = e.a.di.b();
        e.a.dt.n();
    }
}
