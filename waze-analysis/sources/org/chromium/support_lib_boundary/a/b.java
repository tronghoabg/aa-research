package org.chromium.support_lib_boundary.a;

import android.content.ComponentCallbacks;
import android.support.v4.app.av;
import android.support.v4.app.az;
import android.support.v4.app.bv;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static Object b(InvocationHandler invocationHandler) {
        return ((a) invocationHandler).a();
    }

    public static InvocationHandler c(Object obj) {
        return new a(obj);
    }

    public static final org.a.d.k.b d(ComponentCallbacks componentCallbacks) {
        x.f(componentCallbacks, "<this>");
        return componentCallbacks instanceof org.a.a.b.a ? ((org.a.a.b.a) componentCallbacks).l() : componentCallbacks instanceof org.a.d.a.b ? ((org.a.d.a.b) componentCallbacks).l() : componentCallbacks instanceof org.a.d.a.a ? ((org.a.d.a.a) componentCallbacks).getKoin().a().c() : org.a.d.b.a.a().a().c();
    }

    public static final void e(av avVar, org.a.d.k.b bVar) {
        x.f(avVar, "<this>");
        if (bVar != null) {
            avVar.bv().aC(new org.a.b.a.a.a(bVar));
            return;
        }
        bv bvVarBv = avVar.bv();
        org.a.d.k.b bVarD = d(avVar);
        int i2 = ar.f48106a;
        bvVarBv.aC((az) bVarD.a(new m(az.class), null, null));
    }

    public static final CreationExtras f(ViewModelStoreOwner viewModelStoreOwner) {
        x.f(viewModelStoreOwner, "viewModelStoreOwner");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(19932612, 0, -1, "org.koin.androidx.compose.defaultExtras (ViewModelInternals.kt:41)");
        }
        CreationExtras.Empty defaultViewModelCreationExtras = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultViewModelCreationExtras;
    }
}
