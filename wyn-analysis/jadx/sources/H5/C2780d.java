package h5;

import uc.C4278o;
import uc.InterfaceC4280q;

/* renamed from: h5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2780d extends AbstractC2777a {

    /* renamed from: a, reason: collision with root package name */
    public final C4278o f36148a;

    /* renamed from: b, reason: collision with root package name */
    public final com.dexterous.flutterlocalnotifications.c f36149b;

    public C2780d(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        this.f36148a = c4278o;
        this.f36149b = new com.dexterous.flutterlocalnotifications.c(interfaceC4280q);
    }

    @Override // U8.v0
    public final Object H(String str) {
        return this.f36148a.a(str);
    }

    @Override // h5.AbstractC2777a
    public final InterfaceC2781e t0() {
        return this.f36149b;
    }
}
