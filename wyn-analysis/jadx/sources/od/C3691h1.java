package od;

import ba.C1521a;
import g5.RunnableC2707d;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.C3407I;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.C3534b;
import md.C3546n;
import md.C3552u;
import md.EnumC3545m;

/* renamed from: od.h1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3691h1 extends md.O {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f41972o = Logger.getLogger(C3691h1.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3556y f41973f;

    /* renamed from: h, reason: collision with root package name */
    public C3702l0 f41975h;
    public C1521a k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC3545m f41978l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC3545m f41979m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f41980n;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f41974g = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f41976i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41977j = true;

    public C3691h1(AbstractC3556y abstractC3556y) {
        boolean z2 = false;
        EnumC3545m enumC3545m = EnumC3545m.f40695d;
        this.f41978l = enumC3545m;
        this.f41979m = enumC3545m;
        Logger logger = AbstractC3669a0.f41885a;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!Fe.c.D(property) && Boolean.parseBoolean(property)) {
            z2 = true;
        }
        this.f41980n = z2;
        this.f41973f = abstractC3556y;
    }

    @Override // md.O
    public final md.k0 a(md.L l10) {
        List list;
        EnumC3545m enumC3545m;
        if (this.f41978l == EnumC3545m.f40696e) {
            return md.k0.f40680l.h("Already shut down");
        }
        List list2 = l10.f40588a;
        boolean zIsEmpty = list2.isEmpty();
        C3534b c3534b = l10.f40589b;
        if (zIsEmpty) {
            md.k0 k0VarH = md.k0.f40682n.h("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + c3534b);
            c(k0VarH);
            return k0VarH;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((C3552u) it.next()) == null) {
                md.k0 k0VarH2 = md.k0.f40682n.h("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + c3534b);
                c(k0VarH2);
                return k0VarH2;
            }
        }
        this.f41977j = true;
        C3406H c3406hI = AbstractC3409K.i();
        c3406hI.d(list2);
        l8.e0 e0VarG = c3406hI.g();
        C3702l0 c3702l0 = this.f41975h;
        EnumC3545m enumC3545m2 = EnumC3545m.f40693b;
        if (c3702l0 == null) {
            C3702l0 c3702l02 = new C3702l0();
            c3702l02.f42004a = e0VarG != null ? e0VarG : Collections.EMPTY_LIST;
            this.f41975h = c3702l02;
        } else if (this.f41978l == enumC3545m2) {
            SocketAddress socketAddressA = c3702l0.a();
            C3702l0 c3702l03 = this.f41975h;
            if (e0VarG != null) {
                list = e0VarG;
            } else {
                c3702l03.getClass();
                list = Collections.EMPTY_LIST;
            }
            c3702l03.f42004a = list;
            c3702l03.f42005b = 0;
            c3702l03.f42006c = 0;
            if (this.f41975h.e(socketAddressA)) {
                return md.k0.f40674e;
            }
            C3702l0 c3702l04 = this.f41975h;
            c3702l04.f42005b = 0;
            c3702l04.f42006c = 0;
        } else {
            c3702l0.f42004a = e0VarG != null ? e0VarG : Collections.EMPTY_LIST;
            c3702l0.f42005b = 0;
            c3702l0.f42006c = 0;
        }
        HashMap map = this.f41974g;
        HashSet hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        C3407I c3407iListIterator = e0VarG.listIterator(0);
        while (c3407iListIterator.hasNext()) {
            hashSet2.addAll(((C3552u) c3407iListIterator.next()).f40728a);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it2.next();
            if (!hashSet2.contains(socketAddress)) {
                ((C3688g1) map.remove(socketAddress)).f41961a.p();
            }
        }
        int size = hashSet.size();
        EnumC3545m enumC3545m3 = EnumC3545m.f40692a;
        if (size == 0 || (enumC3545m = this.f41978l) == enumC3545m3 || enumC3545m == enumC3545m2) {
            this.f41978l = enumC3545m3;
            i(enumC3545m3, new C3682e1(md.K.f40583e));
            g();
            e();
        } else {
            EnumC3545m enumC3545m4 = EnumC3545m.f40695d;
            if (enumC3545m == enumC3545m4) {
                i(enumC3545m4, new C3685f1(this, this));
            } else if (enumC3545m == EnumC3545m.f40694c) {
                g();
                e();
            }
        }
        return md.k0.f40674e;
    }

    @Override // md.O
    public final void c(md.k0 k0Var) {
        HashMap map = this.f41974g;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C3688g1) it.next()).f41961a.p();
        }
        map.clear();
        i(EnumC3545m.f40694c, new C3682e1(md.K.a(k0Var)));
    }

    @Override // md.O
    public final void e() {
        AbstractC3537e abstractC3537e;
        C3702l0 c3702l0 = this.f41975h;
        if (c3702l0 == null || !c3702l0.c() || this.f41978l == EnumC3545m.f40696e) {
            return;
        }
        SocketAddress socketAddressA = this.f41975h.a();
        HashMap map = this.f41974g;
        boolean zContainsKey = map.containsKey(socketAddressA);
        Logger logger = f41972o;
        if (zContainsKey) {
            abstractC3537e = ((C3688g1) map.get(socketAddressA)).f41961a;
        } else {
            C3679d1 c3679d1 = new C3679d1(this);
            md.J jL = Dd.c.L();
            jL.x(AbstractC3437s.n(new C3552u(socketAddressA)));
            jL.i(c3679d1);
            final AbstractC3537e abstractC3537eB = this.f41973f.b(jL.j());
            if (abstractC3537eB == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressA);
                throw new IllegalStateException("Can't create subchannel");
            }
            C3688g1 c3688g1 = new C3688g1(abstractC3537eB, c3679d1);
            c3679d1.f41941b = c3688g1;
            map.put(socketAddressA, c3688g1);
            if (abstractC3537eB.c().f40613a.get(md.O.f40593d) == null) {
                c3679d1.f41940a = C3546n.a(EnumC3545m.f40693b);
            }
            abstractC3537eB.q(new md.N() { // from class: od.c1
                @Override // md.N
                public final void a(C3546n c3546n) {
                    AbstractC3537e abstractC3537e2;
                    C3691h1 c3691h1 = this.f41930a;
                    c3691h1.getClass();
                    EnumC3545m enumC3545m = c3546n.f40701a;
                    HashMap map2 = c3691h1.f41974g;
                    AbstractC3537e abstractC3537e3 = abstractC3537eB;
                    C3688g1 c3688g12 = (C3688g1) map2.get((SocketAddress) abstractC3537e3.a().f40728a.get(0));
                    if (c3688g12 == null || (abstractC3537e2 = c3688g12.f41961a) != abstractC3537e3 || enumC3545m == EnumC3545m.f40696e) {
                        return;
                    }
                    EnumC3545m enumC3545m2 = EnumC3545m.f40695d;
                    AbstractC3556y abstractC3556y = c3691h1.f41973f;
                    if (enumC3545m == enumC3545m2) {
                        abstractC3556y.i();
                    }
                    C3688g1.a(c3688g12, enumC3545m);
                    EnumC3545m enumC3545m3 = c3691h1.f41978l;
                    EnumC3545m enumC3545m4 = EnumC3545m.f40694c;
                    EnumC3545m enumC3545m5 = EnumC3545m.f40692a;
                    if (enumC3545m3 == enumC3545m4 || c3691h1.f41979m == enumC3545m4) {
                        if (enumC3545m == enumC3545m5) {
                            return;
                        }
                        if (enumC3545m == enumC3545m2) {
                            c3691h1.e();
                            return;
                        }
                    }
                    int iOrdinal = enumC3545m.ordinal();
                    if (iOrdinal == 0) {
                        c3691h1.f41978l = enumC3545m5;
                        c3691h1.i(enumC3545m5, new C3682e1(md.K.f40583e));
                        return;
                    }
                    if (iOrdinal == 1) {
                        c3691h1.g();
                        for (C3688g1 c3688g13 : map2.values()) {
                            if (!c3688g13.f41961a.equals(abstractC3537e2)) {
                                c3688g13.f41961a.p();
                            }
                        }
                        map2.clear();
                        EnumC3545m enumC3545m6 = EnumC3545m.f40693b;
                        C3688g1.a(c3688g12, enumC3545m6);
                        map2.put((SocketAddress) abstractC3537e2.a().f40728a.get(0), c3688g12);
                        c3691h1.f41975h.e((SocketAddress) abstractC3537e3.a().f40728a.get(0));
                        c3691h1.f41978l = enumC3545m6;
                        c3691h1.j(c3688g12);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:" + enumC3545m);
                        }
                        C3702l0 c3702l02 = c3691h1.f41975h;
                        c3702l02.f42005b = 0;
                        c3702l02.f42006c = 0;
                        c3691h1.f41978l = enumC3545m2;
                        c3691h1.i(enumC3545m2, new C3685f1(c3691h1, c3691h1));
                        return;
                    }
                    if (c3691h1.f41975h.c() && ((C3688g1) map2.get(c3691h1.f41975h.a())).f41961a == abstractC3537e3 && c3691h1.f41975h.b()) {
                        c3691h1.g();
                        c3691h1.e();
                    }
                    C3702l0 c3702l03 = c3691h1.f41975h;
                    if (c3702l03 == null || c3702l03.c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = c3691h1.f41975h.f42004a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((C3688g1) it.next()).f41964d) {
                            return;
                        }
                    }
                    c3691h1.f41978l = enumC3545m4;
                    c3691h1.i(enumC3545m4, new C3682e1(md.K.a(c3546n.f40702b)));
                    int i5 = c3691h1.f41976i + 1;
                    c3691h1.f41976i = i5;
                    List list2 = c3691h1.f41975h.f42004a;
                    if (i5 >= (list2 != null ? list2.size() : 0) || c3691h1.f41977j) {
                        c3691h1.f41977j = false;
                        c3691h1.f41976i = 0;
                        abstractC3556y.i();
                    }
                }
            });
            abstractC3537e = abstractC3537eB;
        }
        int iOrdinal = ((C3688g1) map.get(socketAddressA)).f41962b.ordinal();
        if (iOrdinal == 0) {
            if (this.f41980n) {
                h();
                return;
            } else {
                abstractC3537e.o();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.f41975h.b();
            e();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            abstractC3537e.o();
            C3688g1.a((C3688g1) map.get(socketAddressA), EnumC3545m.f40692a);
            h();
        }
    }

    @Override // md.O
    public final void f() {
        Level level = Level.FINE;
        HashMap map = this.f41974g;
        f41972o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        EnumC3545m enumC3545m = EnumC3545m.f40696e;
        this.f41978l = enumC3545m;
        this.f41979m = enumC3545m;
        g();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C3688g1) it.next()).f41961a.p();
        }
        map.clear();
    }

    public final void g() {
        C1521a c1521a = this.k;
        if (c1521a != null) {
            c1521a.j();
            this.k = null;
        }
    }

    public final void h() {
        if (this.f41980n) {
            C1521a c1521a = this.k;
            if (c1521a != null) {
                N6.w wVar = (N6.w) c1521a.f19414b;
                if (!wVar.f8559c && !wVar.f8558b) {
                    return;
                }
            }
            AbstractC3556y abstractC3556y = this.f41973f;
            this.k = abstractC3556y.g().d(new RunnableC2707d(this, 11), 250L, TimeUnit.MILLISECONDS, abstractC3556y.e());
        }
    }

    public final void i(EnumC3545m enumC3545m, md.M m10) {
        if (enumC3545m == this.f41979m && (enumC3545m == EnumC3545m.f40695d || enumC3545m == EnumC3545m.f40692a)) {
            return;
        }
        this.f41979m = enumC3545m;
        this.f41973f.l(enumC3545m, m10);
    }

    public final void j(C3688g1 c3688g1) {
        EnumC3545m enumC3545m = c3688g1.f41962b;
        EnumC3545m enumC3545m2 = EnumC3545m.f40693b;
        if (enumC3545m != enumC3545m2) {
            return;
        }
        C3546n c3546n = c3688g1.f41963c.f41940a;
        EnumC3545m enumC3545m3 = c3546n.f40701a;
        if (enumC3545m3 == enumC3545m2) {
            i(enumC3545m2, new C3743z0(md.K.b(c3688g1.f41961a, null)));
            return;
        }
        EnumC3545m enumC3545m4 = EnumC3545m.f40694c;
        if (enumC3545m3 == enumC3545m4) {
            i(enumC3545m4, new C3682e1(md.K.a(c3546n.f40702b)));
        } else if (this.f41979m != enumC3545m4) {
            i(enumC3545m3, new C3682e1(md.K.f40583e));
        }
    }
}
