package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3592d;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442f implements InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18668a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18669b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18670c;

    public C1442f(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC1455t interfaceC1455t) {
        AbstractC3340k.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f18669b = defaultLifecycleObserver;
        this.f18670c = interfaceC1455t;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f18668a) {
            case 0:
                int i5 = AbstractC1441e.f18666a[enumC1449m.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f18669b;
                switch (i5) {
                    case 1:
                        defaultLifecycleObserver.onCreate(interfaceC1457v);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(interfaceC1457v);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(interfaceC1457v);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(interfaceC1457v);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(interfaceC1457v);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(interfaceC1457v);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC1455t interfaceC1455t = (InterfaceC1455t) this.f18670c;
                if (interfaceC1455t != null) {
                    interfaceC1455t.onStateChanged(interfaceC1457v, enumC1449m);
                    return;
                }
                return;
            case 1:
                if (enumC1449m == EnumC1449m.ON_START) {
                    ((AbstractC1451o) this.f18669b).c(this);
                    ((C3592d) this.f18670c).d();
                    return;
                }
                return;
            default:
                HashMap map = ((C1438b) this.f18670c).f18655a;
                List list = (List) map.get(enumC1449m);
                InterfaceC1456u interfaceC1456u = (InterfaceC1456u) this.f18669b;
                C1438b.a(list, interfaceC1457v, enumC1449m, interfaceC1456u);
                C1438b.a((List) map.get(EnumC1449m.ON_ANY), interfaceC1457v, enumC1449m, interfaceC1456u);
                return;
        }
    }

    public C1442f(InterfaceC1456u interfaceC1456u) {
        this.f18669b = interfaceC1456u;
        C1440d c1440d = C1440d.f18663c;
        Class<?> cls = interfaceC1456u.getClass();
        C1438b c1438b = (C1438b) c1440d.f18664a.get(cls);
        this.f18670c = c1438b == null ? c1440d.a(cls, null) : c1438b;
    }

    public C1442f(AbstractC1451o abstractC1451o, C3592d c3592d) {
        this.f18669b = abstractC1451o;
        this.f18670c = c3592d;
    }
}
