package Y3;

import Hf.InterfaceC0603m;
import ef.C2515C;
import ef.InterfaceC2521e;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.C3330a;
import kotlin.jvm.internal.InterfaceC3335f;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0603m, InterfaceC3335f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f16642a;

    public i(n nVar) {
        this.f16642a = nVar;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        this.f16642a.i((g) obj);
        C2515C c2515c = C2515C.f34653a;
        kf.a aVar = kf.a.f39711a;
        return c2515c;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0603m) && (obj instanceof InterfaceC3335f)) {
            return getFunctionDelegate().equals(((InterfaceC3335f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3335f
    public final InterfaceC2521e getFunctionDelegate() {
        return new C3330a(2, this.f16642a, n.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
