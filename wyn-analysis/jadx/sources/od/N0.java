package od;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.C3531C;
import md.C3542j;
import md.C3544l;
import md.C3551t;

/* loaded from: classes5.dex */
public final class N0 extends AbstractC3556y {

    /* renamed from: E, reason: collision with root package name */
    public static final Method f41713E;

    /* renamed from: a, reason: collision with root package name */
    public final a2.v f41716a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.v f41717b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f41718c;

    /* renamed from: d, reason: collision with root package name */
    public final md.g0 f41719d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f41720e;

    /* renamed from: f, reason: collision with root package name */
    public final String f41721f;

    /* renamed from: g, reason: collision with root package name */
    public final String f41722g;

    /* renamed from: h, reason: collision with root package name */
    public final C3551t f41723h;

    /* renamed from: i, reason: collision with root package name */
    public final C3544l f41724i;

    /* renamed from: j, reason: collision with root package name */
    public final long f41725j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f41726l;

    /* renamed from: m, reason: collision with root package name */
    public final long f41727m;

    /* renamed from: n, reason: collision with root package name */
    public final long f41728n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f41729o;

    /* renamed from: p, reason: collision with root package name */
    public final C3531C f41730p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f41731q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f41732r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f41733s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f41734t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f41735u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f41736v;

    /* renamed from: w, reason: collision with root package name */
    public final a2.v f41737w;

    /* renamed from: x, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f41738x;

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f41714y = Logger.getLogger(N0.class.getName());

    /* renamed from: z, reason: collision with root package name */
    public static final long f41715z = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: A, reason: collision with root package name */
    public static final long f41709A = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: B, reason: collision with root package name */
    public static final a2.v f41710B = new a2.v(AbstractC3669a0.f41899p, 17);

    /* renamed from: C, reason: collision with root package name */
    public static final C3551t f41711C = C3551t.f40724d;

    /* renamed from: D, reason: collision with root package name */
    public static final C3544l f41712D = C3544l.f40688b;

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e7) {
            f41714y.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            declaredMethod = null;
            f41713E = declaredMethod;
        } catch (NoSuchMethodException e10) {
            f41714y.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            declaredMethod = null;
            f41713E = declaredMethod;
        }
        f41713E = declaredMethod;
    }

    public N0(String str, a2.v vVar, com.google.android.gms.ads.nativead.l lVar) {
        md.g0 g0Var;
        a2.v vVar2 = f41710B;
        this.f41716a = vVar2;
        this.f41717b = vVar2;
        this.f41718c = new ArrayList();
        Logger logger = md.g0.f40642d;
        synchronized (md.g0.class) {
            try {
                if (md.g0.f40643e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z2 = P.f41770a;
                        arrayList.add(P.class);
                    } catch (ClassNotFoundException e7) {
                        md.g0.f40642d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e7);
                    }
                    List<md.f0> listF = AbstractC3537e.f(md.f0.class, DesugarCollections.unmodifiableList(arrayList), md.f0.class.getClassLoader(), new C3542j(9));
                    if (listF.isEmpty()) {
                        md.g0.f40642d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    md.g0.f40643e = new md.g0();
                    for (md.f0 f0Var : listF) {
                        md.g0.f40642d.fine("Service loader found " + f0Var);
                        md.g0.f40643e.a(f0Var);
                    }
                    md.g0.f40643e.c();
                }
                g0Var = md.g0.f40643e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f41719d = g0Var;
        this.f41720e = new ArrayList();
        this.f41722g = "pick_first";
        this.f41723h = f41711C;
        this.f41724i = f41712D;
        this.f41725j = f41715z;
        this.k = 5;
        this.f41726l = 5;
        this.f41727m = 16777216L;
        this.f41728n = 1048576L;
        this.f41729o = true;
        this.f41730p = C3531C.f40567e;
        this.f41731q = true;
        this.f41732r = true;
        this.f41733s = true;
        this.f41734t = true;
        this.f41735u = true;
        this.f41736v = true;
        Fe.e.t(str, "target");
        this.f41721f = str;
        this.f41737w = vVar;
        this.f41738x = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    @Override // md.AbstractC3556y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final md.S a() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: od.N0.a():md.S");
    }
}
