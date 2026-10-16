package com.google.gson.internal.bind;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import la.InterfaceC3449A;
import qa.C3883a;

/* loaded from: classes4.dex */
public abstract class Y {

    /* renamed from: A, reason: collision with root package name */
    public static final InterfaceC3449A f27417A;

    /* renamed from: B, reason: collision with root package name */
    public static final InterfaceC3449A f27418B;

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3449A f27419a = new TypeAdapters$29(Class.class, new F().a());

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3449A f27420b = new TypeAdapters$29(BitSet.class, new O().a());

    /* renamed from: c, reason: collision with root package name */
    public static final S f27421c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC3449A f27422d;

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC3449A f27423e;

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC3449A f27424f;

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC3449A f27425g;

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC3449A f27426h;

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC3449A f27427i;

    /* renamed from: j, reason: collision with root package name */
    public static final InterfaceC3449A f27428j;
    public static final C1776w k;

    /* renamed from: l, reason: collision with root package name */
    public static final InterfaceC3449A f27429l;

    /* renamed from: m, reason: collision with root package name */
    public static final B f27430m;

    /* renamed from: n, reason: collision with root package name */
    public static final C f27431n;

    /* renamed from: o, reason: collision with root package name */
    public static final D f27432o;

    /* renamed from: p, reason: collision with root package name */
    public static final InterfaceC3449A f27433p;

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC3449A f27434q;

    /* renamed from: r, reason: collision with root package name */
    public static final InterfaceC3449A f27435r;

    /* renamed from: s, reason: collision with root package name */
    public static final InterfaceC3449A f27436s;

    /* renamed from: t, reason: collision with root package name */
    public static final InterfaceC3449A f27437t;

    /* renamed from: u, reason: collision with root package name */
    public static final InterfaceC3449A f27438u;

    /* renamed from: v, reason: collision with root package name */
    public static final InterfaceC3449A f27439v;

    /* renamed from: w, reason: collision with root package name */
    public static final InterfaceC3449A f27440w;

    /* renamed from: x, reason: collision with root package name */
    public static final InterfaceC3449A f27441x;

    /* renamed from: y, reason: collision with root package name */
    public static final InterfaceC3449A f27442y;

    /* renamed from: z, reason: collision with root package name */
    public static final C1760f f27443z;

    static {
        Q q4 = new Q();
        f27421c = new S();
        f27422d = new TypeAdapters$30(Boolean.TYPE, Boolean.class, q4);
        f27423e = new TypeAdapters$30(Byte.TYPE, Byte.class, new T());
        f27424f = new TypeAdapters$30(Short.TYPE, Short.class, new U());
        f27425g = new TypeAdapters$30(Integer.TYPE, Integer.class, new V());
        f27426h = new TypeAdapters$29(AtomicInteger.class, new W().a());
        f27427i = new TypeAdapters$29(AtomicBoolean.class, new X().a());
        f27428j = new TypeAdapters$29(AtomicIntegerArray.class, new C1775v().a());
        k = new C1776w();
        new C1777x();
        new C1778y();
        f27429l = new TypeAdapters$30(Character.TYPE, Character.class, new z());
        A a5 = new A();
        f27430m = new B();
        f27431n = new C();
        f27432o = new D();
        f27433p = new TypeAdapters$29(String.class, a5);
        f27434q = new TypeAdapters$29(StringBuilder.class, new E());
        f27435r = new TypeAdapters$29(StringBuffer.class, new G());
        f27436s = new TypeAdapters$29(URL.class, new H());
        f27437t = new TypeAdapters$29(URI.class, new I());
        f27438u = new TypeAdapters$32(InetAddress.class, new J());
        f27439v = new TypeAdapters$29(UUID.class, new K());
        f27440w = new TypeAdapters$29(Currency.class, new L().a());
        final M m10 = new M();
        f27441x = new InterfaceC3449A() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // la.InterfaceC3449A
            public final la.z create(la.l lVar, C3883a c3883a) {
                Class cls = c3883a.f44183a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return m10;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + m10 + "]";
            }
        };
        f27442y = new TypeAdapters$29(Locale.class, new N());
        C1760f c1760f = C1760f.f27455a;
        f27443z = c1760f;
        f27417A = new TypeAdapters$32(la.o.class, c1760f);
        f27418B = C1759e.f27451d;
    }

    public static InterfaceC3449A a(Class cls, Class cls2, la.z zVar) {
        return new TypeAdapters$30(cls, cls2, zVar);
    }

    public static InterfaceC3449A b(Class cls, la.z zVar) {
        return new TypeAdapters$29(cls, zVar);
    }

    public static InterfaceC3449A c(final C3883a c3883a, final la.z zVar) {
        return new InterfaceC3449A() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            @Override // la.InterfaceC3449A
            public final la.z create(la.l lVar, C3883a c3883a2) {
                if (c3883a2.equals(c3883a)) {
                    return zVar;
                }
                return null;
            }
        };
    }
}
