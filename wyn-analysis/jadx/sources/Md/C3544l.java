package md;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: md.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3544l {

    /* renamed from: b, reason: collision with root package name */
    public static final C3544l f40688b = new C3544l(new C3542j(2), C3542j.f40651b);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f40689a = new ConcurrentHashMap();

    public C3544l(InterfaceC3543k... interfaceC3543kArr) {
        for (InterfaceC3543k interfaceC3543k : interfaceC3543kArr) {
            this.f40689a.put(interfaceC3543k.e(), interfaceC3543k);
        }
    }
}
