package androidx.lifecycle;

import A7.AbstractC0279p0;
import Hf.k0;
import Hf.x0;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3589a;
import r.C3894a;
import s.C3981a;
import s.C3983c;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459x extends AbstractC1451o {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18690b;

    /* renamed from: c, reason: collision with root package name */
    public C3981a f18691c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC1450n f18692d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f18693e;

    /* renamed from: f, reason: collision with root package name */
    public int f18694f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18695g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18696h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f18697i;

    /* renamed from: j, reason: collision with root package name */
    public final x0 f18698j;

    public C1459x(InterfaceC1457v provider) {
        AbstractC3340k.e(provider, "provider");
        this.f18690b = true;
        this.f18691c = new C3981a();
        EnumC1450n enumC1450n = EnumC1450n.f18677b;
        this.f18692d = enumC1450n;
        this.f18697i = new ArrayList();
        this.f18693e = new WeakReference(provider);
        this.f18698j = k0.c(enumC1450n);
    }

    @Override // androidx.lifecycle.AbstractC1451o
    public final void a(InterfaceC1456u observer) {
        InterfaceC1455t c1442f;
        Object obj;
        InterfaceC1457v interfaceC1457v;
        ArrayList arrayList = this.f18697i;
        int i5 = 1;
        AbstractC3340k.e(observer, "observer");
        e("addObserver");
        EnumC1450n enumC1450n = this.f18692d;
        EnumC1450n enumC1450n2 = EnumC1450n.f18676a;
        if (enumC1450n != enumC1450n2) {
            enumC1450n2 = EnumC1450n.f18677b;
        }
        C1458w c1458w = new C1458w();
        HashMap map = AbstractC1461z.f18700a;
        boolean z2 = observer instanceof InterfaceC1455t;
        boolean z10 = observer instanceof DefaultLifecycleObserver;
        if (z2 && z10) {
            c1442f = new C1442f((DefaultLifecycleObserver) observer, (InterfaceC1455t) observer);
        } else if (z10) {
            c1442f = new C1442f((DefaultLifecycleObserver) observer, (InterfaceC1455t) null);
        } else if (z2) {
            c1442f = (InterfaceC1455t) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (AbstractC1461z.b(cls) == 2) {
                Object obj2 = AbstractC1461z.f18701b.get(cls);
                AbstractC3340k.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC1461z.a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC1444h[] interfaceC1444hArr = new InterfaceC1444h[size];
                if (size > 0) {
                    AbstractC1461z.a((Constructor) list.get(0), observer);
                    throw null;
                }
                c1442f = new C3589a(interfaceC1444hArr, i5);
            } else {
                c1442f = new C1442f(observer);
            }
        }
        c1458w.f18689b = c1442f;
        c1458w.f18688a = enumC1450n2;
        C3981a c3981a = this.f18691c;
        C3983c c3983cA = c3981a.a(observer);
        if (c3983cA != null) {
            obj = c3983cA.f44815b;
        } else {
            HashMap map2 = c3981a.f44810e;
            C3983c c3983c = new C3983c(observer, c1458w);
            c3981a.f44824d++;
            C3983c c3983c2 = c3981a.f44822b;
            if (c3983c2 == null) {
                c3981a.f44821a = c3983c;
                c3981a.f44822b = c3983c;
            } else {
                c3983c2.f44816c = c3983c;
                c3983c.f44817d = c3983c2;
                c3981a.f44822b = c3983c;
            }
            map2.put(observer, c3983c);
            obj = null;
        }
        if (((C1458w) obj) == null && (interfaceC1457v = (InterfaceC1457v) this.f18693e.get()) != null) {
            boolean z11 = this.f18694f != 0 || this.f18695g;
            EnumC1450n enumC1450nD = d(observer);
            this.f18694f++;
            while (c1458w.f18688a.compareTo(enumC1450nD) < 0 && this.f18691c.f44810e.containsKey(observer)) {
                arrayList.add(c1458w.f18688a);
                C1447k c1447k = EnumC1449m.Companion;
                EnumC1450n state = c1458w.f18688a;
                c1447k.getClass();
                AbstractC3340k.e(state, "state");
                int iOrdinal = state.ordinal();
                EnumC1449m enumC1449m = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC1449m.ON_RESUME : EnumC1449m.ON_START : EnumC1449m.ON_CREATE;
                if (enumC1449m == null) {
                    throw new IllegalStateException("no event up from " + c1458w.f18688a);
                }
                c1458w.a(interfaceC1457v, enumC1449m);
                arrayList.remove(arrayList.size() - 1);
                enumC1450nD = d(observer);
            }
            if (!z11) {
                i();
            }
            this.f18694f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1451o
    public final EnumC1450n b() {
        return this.f18692d;
    }

    @Override // androidx.lifecycle.AbstractC1451o
    public final void c(InterfaceC1456u observer) {
        AbstractC3340k.e(observer, "observer");
        e("removeObserver");
        this.f18691c.b(observer);
    }

    public final EnumC1450n d(InterfaceC1456u interfaceC1456u) {
        C1458w c1458w;
        HashMap map = this.f18691c.f44810e;
        C3983c c3983c = map.containsKey(interfaceC1456u) ? ((C3983c) map.get(interfaceC1456u)).f44817d : null;
        EnumC1450n enumC1450n = (c3983c == null || (c1458w = (C1458w) c3983c.f44815b) == null) ? null : c1458w.f18688a;
        ArrayList arrayList = this.f18697i;
        EnumC1450n enumC1450n2 = arrayList.isEmpty() ? null : (EnumC1450n) AbstractC3256n.e(arrayList, 1);
        EnumC1450n state1 = this.f18692d;
        AbstractC3340k.e(state1, "state1");
        if (enumC1450n == null || enumC1450n.compareTo(state1) >= 0) {
            enumC1450n = state1;
        }
        return (enumC1450n2 == null || enumC1450n2.compareTo(enumC1450n) >= 0) ? enumC1450n : enumC1450n2;
    }

    public final void e(String str) {
        if (this.f18690b) {
            C3894a.h0().f44285a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0279p0.l("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(EnumC1449m event) {
        AbstractC3340k.e(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(EnumC1450n enumC1450n) {
        EnumC1450n enumC1450n2 = this.f18692d;
        if (enumC1450n2 == enumC1450n) {
            return;
        }
        EnumC1450n enumC1450n3 = EnumC1450n.f18677b;
        EnumC1450n enumC1450n4 = EnumC1450n.f18676a;
        if (enumC1450n2 == enumC1450n3 && enumC1450n == enumC1450n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC1450n + ", but was " + this.f18692d + " in component " + this.f18693e.get()).toString());
        }
        this.f18692d = enumC1450n;
        if (this.f18695g || this.f18694f != 0) {
            this.f18696h = true;
            return;
        }
        this.f18695g = true;
        i();
        this.f18695g = false;
        if (this.f18692d == enumC1450n4) {
            this.f18691c = new C3981a();
        }
    }

    public final void h() {
        EnumC1450n enumC1450n = EnumC1450n.f18678c;
        e("setCurrentState");
        g(enumC1450n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.f18696h = false;
        r8.f18698j.j(r8.f18692d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1459x.i():void");
    }
}
