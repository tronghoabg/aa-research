package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.w1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1846w1 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1846w1 f27770c = new C1846w1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27772b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C1784b1 f27771a = new C1784b1(0);

    public final D1 a(Class cls) {
        D1 d1B;
        Class cls2;
        Internal.checkNotNull(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f27772b;
        D1 d12 = (D1) concurrentHashMap.get(cls);
        if (d12 != null) {
            return d12;
        }
        C1784b1 c1784b1 = this.f27771a;
        c1784b1.getClass();
        Class cls3 = E1.f27550a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = E1.f27550a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        InterfaceC1799g1 interfaceC1799g1A = ((InterfaceC1802h1) c1784b1.f27650a).a(cls);
        if (interfaceC1799g1A.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                d1B = new C1814l1(E1.f27552c, AbstractC1816m0.f27722a, interfaceC1799g1A.b());
            } else {
                X1 x12 = E1.f27551b;
                AbstractC1807j0 abstractC1807j0 = AbstractC1816m0.f27723b;
                if (abstractC1807j0 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                d1B = new C1814l1(x12, abstractC1807j0, interfaceC1799g1A.b());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            d1B = Z0.f27641a[interfaceC1799g1A.getSyntax().ordinal()] != 1 ? C1811k1.B(interfaceC1799g1A, AbstractC1826p1.f27731b, W0.f27633b, E1.f27552c, AbstractC1816m0.f27722a, AbstractC1796f1.f27675b) : C1811k1.B(interfaceC1799g1A, AbstractC1826p1.f27731b, W0.f27633b, E1.f27552c, null, AbstractC1796f1.f27675b);
        } else if (Z0.f27641a[interfaceC1799g1A.getSyntax().ordinal()] != 1) {
            C1823o1 c1823o1 = AbstractC1826p1.f27730a;
            U0 u02 = W0.f27632a;
            X1 x13 = E1.f27551b;
            AbstractC1807j0 abstractC1807j02 = AbstractC1816m0.f27723b;
            if (abstractC1807j02 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            d1B = C1811k1.B(interfaceC1799g1A, c1823o1, u02, x13, abstractC1807j02, AbstractC1796f1.f27674a);
        } else {
            d1B = C1811k1.B(interfaceC1799g1A, AbstractC1826p1.f27730a, W0.f27632a, E1.f27551b, null, AbstractC1796f1.f27674a);
        }
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(d1B, "schema");
        D1 d13 = (D1) concurrentHashMap.putIfAbsent(cls, d1B);
        return d13 != null ? d13 : d1B;
    }

    public final D1 b(Object obj) {
        return a(obj.getClass());
    }
}
