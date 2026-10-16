package io.ktor.utils.io;

import Ef.C0502n;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: io.ktor.utils.io.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2871d implements InterfaceC2872e {

    /* renamed from: b, reason: collision with root package name */
    public final C0502n f37390b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f37391c;

    public C2871d(C0502n c0502n) {
        this.f37390b = c0502n;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int iHashCode = c0502n.hashCode();
        tg.b.t(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC3340k.d(string, "toString(...)");
        Throwable th = new Throwable("ReadTask 0x".concat(string));
        Fe.b.R(th);
        this.f37391c = th;
    }

    @Override // io.ktor.utils.io.InterfaceC2872e
    public final void a(Throwable th) {
        Object objZ;
        InterfaceC3103c interfaceC3103cC = c();
        if (th != null) {
            objZ = Fe.e.z(th);
        } else {
            InterfaceC2874g.f37394a.getClass();
            objZ = C2515C.f34653a;
        }
        ((C0502n) interfaceC3103cC).resumeWith(objZ);
    }

    @Override // io.ktor.utils.io.InterfaceC2872e
    public final Throwable b() {
        return this.f37391c;
    }

    public final InterfaceC3103c c() {
        return this.f37390b;
    }

    @Override // io.ktor.utils.io.InterfaceC2872e
    public final void resume() {
        InterfaceC3103c interfaceC3103cC = c();
        InterfaceC2874g.f37394a.getClass();
        ((C0502n) interfaceC3103cC).resumeWith(C2515C.f34653a);
    }
}
