package h4;

import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC1450n;
import androidx.lifecycle.InterfaceC1456u;

/* loaded from: classes.dex */
public final class f extends AbstractC1451o {

    /* renamed from: b, reason: collision with root package name */
    public static final f f36074b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final e f36075c = new e();

    @Override // androidx.lifecycle.AbstractC1451o
    public final void a(InterfaceC1456u interfaceC1456u) {
        if (!(interfaceC1456u instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((interfaceC1456u + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) interfaceC1456u;
        e eVar = f36075c;
        defaultLifecycleObserver.onCreate(eVar);
        defaultLifecycleObserver.onStart(eVar);
        defaultLifecycleObserver.onResume(eVar);
    }

    @Override // androidx.lifecycle.AbstractC1451o
    public final EnumC1450n b() {
        return EnumC1450n.f18680e;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.AbstractC1451o
    public final void c(InterfaceC1456u interfaceC1456u) {
    }
}
