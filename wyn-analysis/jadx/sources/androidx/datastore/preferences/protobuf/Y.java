package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f18175c = new Y();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f18177b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final J f18176a = new J();

    public final InterfaceC1385b0 a(Class cls) {
        InterfaceC1385b0 interfaceC1385b0W;
        Class cls2;
        AbstractC1407y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f18177b;
        InterfaceC1385b0 interfaceC1385b0 = (InterfaceC1385b0) concurrentHashMap.get(cls);
        if (interfaceC1385b0 != null) {
            return interfaceC1385b0;
        }
        J j8 = this.f18176a;
        j8.getClass();
        Class cls3 = c0.f18188a;
        if (!AbstractC1404v.class.isAssignableFrom(cls) && (cls2 = c0.f18188a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C1383a0 c1383a0A = ((I) j8.f18144a).a(cls);
        if ((c1383a0A.f18184d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC1404v.class.isAssignableFrom(cls);
            AbstractC1404v abstractC1404v = c1383a0A.f18181a;
            if (zIsAssignableFrom) {
                interfaceC1385b0W = new T(c0.f18191d, AbstractC1398o.f18246a, abstractC1404v);
            } else {
                k0 k0Var = c0.f18189b;
                C1397n c1397n = AbstractC1398o.f18247b;
                if (c1397n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC1385b0W = new T(k0Var, c1397n, abstractC1404v);
            }
        } else if (AbstractC1404v.class.isAssignableFrom(cls)) {
            interfaceC1385b0W = (c1383a0A.f18184d & 1) == 1 ? S.w(c1383a0A, V.f18174b, G.f18141b, c0.f18191d, AbstractC1398o.f18246a, O.f18152b) : S.w(c1383a0A, V.f18174b, G.f18141b, c0.f18191d, null, O.f18152b);
        } else if ((c1383a0A.f18184d & 1) == 1) {
            U u10 = V.f18173a;
            E e7 = G.f18140a;
            k0 k0Var2 = c0.f18189b;
            C1397n c1397n2 = AbstractC1398o.f18247b;
            if (c1397n2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC1385b0W = S.w(c1383a0A, u10, e7, k0Var2, c1397n2, O.f18151a);
        } else {
            interfaceC1385b0W = S.w(c1383a0A, V.f18173a, G.f18140a, c0.f18190c, null, O.f18151a);
        }
        InterfaceC1385b0 interfaceC1385b02 = (InterfaceC1385b0) concurrentHashMap.putIfAbsent(cls, interfaceC1385b0W);
        return interfaceC1385b02 != null ? interfaceC1385b02 : interfaceC1385b0W;
    }
}
