package J9;

import android.app.Application;
import df.InterfaceC2432a;
import java.util.concurrent.atomic.AtomicBoolean;
import l9.InterfaceC3448d;

/* renamed from: J9.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0648g implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5930a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5931b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2432a f5932c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2432a f5933d;

    public /* synthetic */ C0648g(Object obj, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, int i5) {
        this.f5930a = i5;
        this.f5931b = obj;
        this.f5932c = interfaceC2432a;
        this.f5933d = interfaceC2432a2;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f5930a) {
            case 0:
                return new C0647f((I) ((InterfaceC2432a) this.f5931b).get(), (Application) this.f5932c.get(), (M9.a) ((L9.g) this.f5933d).get());
            case 1:
                He.m mVar = (He.m) ((InterfaceC2432a) this.f5931b).get();
                return new X(mVar, (He.m) this.f5933d.get());
            default:
                Y y10 = (Y) ((L9.b) this.f5932c).get();
                InterfaceC3448d interfaceC3448d = (InterfaceC3448d) ((K9.a) this.f5933d).get();
                Dd.c cVar = (Dd.c) this.f5931b;
                C0650i c0650i = new C0650i();
                c0650i.f5936a = y10;
                c0650i.f5937b = new AtomicBoolean(((s8.g) cVar.f2642b).k());
                L8.n nVar = (L8.n) interfaceC3448d;
                nVar.c(nVar.f7022c, new C0649h(c0650i, 0));
                return c0650i;
        }
    }
}
