package kc;

import A7.AbstractC0279p0;
import E5.C0461l;
import K8.H;
import ac.C1346a;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import androidx.lifecycle.AbstractC1451o;
import ba.C1521a;
import g2.C2690k;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.B;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import lc.C3458b;
import lc.InterfaceC3457a;
import ld.AbstractC3459a;
import oc.C3665d;
import q.C3828o;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import tc.C4155a;
import uc.C4281r;
import uc.InterfaceC4283t;
import uc.InterfaceC4284u;
import uc.InterfaceC4285v;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Object f39462a;

    /* renamed from: b, reason: collision with root package name */
    public C3458b f39463b;

    /* renamed from: c, reason: collision with root package name */
    public r f39464c;

    /* renamed from: d, reason: collision with root package name */
    public N2.j f39465d;

    /* renamed from: e, reason: collision with root package name */
    public d f39466e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39467f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39468g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f39470i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f39471j;
    public final c k = new c(this, 0);

    /* renamed from: h, reason: collision with root package name */
    public boolean f39469h = false;

    public f(e eVar) {
        this.f39462a = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kc.e] */
    public final void a(C0461l c0461l) {
        String strN = this.f39462a.n();
        if (strN == null || strN.isEmpty()) {
            strN = (String) ((M.y) ((C3665d) b7.k.z().f19396b).f41476d).f7228c;
        }
        mc.a aVar = new mc.a(strN, this.f39462a.s());
        String strL = this.f39462a.l();
        if (strL == null && (strL = d(this.f39462a.getActivity().getIntent())) == null) {
            strL = "/";
        }
        c0461l.f3455e = aVar;
        c0461l.f3456f = strL;
        c0461l.f3457g = this.f39462a.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kc.e] */
    public final void b() {
        if (!this.f39462a.z()) {
            this.f39462a.k();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f39462a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final void c() {
        if (this.f39462a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kc.e] */
    public final String d(Intent intent) {
        Uri data;
        if (!this.f39462a.t() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e(int i5, int i10, Intent intent) {
        c();
        if (this.f39463b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Objects.toString(intent);
        H h10 = this.f39463b.f40254d;
        if (!h10.n()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return;
        }
        AbstractC3459a.b("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            s1 s1Var = (s1) h10.f6588g;
            s1Var.getClass();
            Iterator it = new HashSet((HashSet) s1Var.f43899d).iterator();
            while (true) {
                boolean z2 = false;
                while (it.hasNext()) {
                    if (((InterfaceC4283t) it.next()).onActivityResult(i5, i10, intent) || z2) {
                        z2 = true;
                    }
                }
                Trace.endSection();
                return;
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kc.e] */
    public final void f() {
        c();
        if (this.f39463b == null) {
            String strH = this.f39462a.h();
            if (strH != null) {
                C3458b c3458b = (C3458b) E4.y.a().f3001a.get(strH);
                this.f39463b = c3458b;
                this.f39467f = true;
                if (c3458b == null) {
                    throw new IllegalStateException(AbstractC0279p0.l("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", strH, "'"));
                }
            } else {
                ?? r02 = this.f39462a;
                r02.getContext();
                C3458b c3458bA = r02.a();
                this.f39463b = c3458bA;
                if (c3458bA != null) {
                    this.f39467f = true;
                } else {
                    String strX = this.f39462a.x();
                    if (strX != null) {
                        if (lc.e.f40275b == null) {
                            synchronized (lc.e.class) {
                                try {
                                    if (lc.e.f40275b == null) {
                                        lc.e.f40275b = new lc.e(0);
                                    }
                                } finally {
                                }
                            }
                        }
                        lc.d dVar = (lc.d) lc.e.f40275b.f40276a.get(strX);
                        if (dVar == null) {
                            throw new IllegalStateException(AbstractC0279p0.l("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", strX, "'"));
                        }
                        C0461l c0461l = new C0461l(this.f39462a.getContext());
                        a(c0461l);
                        this.f39463b = dVar.a(c0461l);
                        this.f39467f = false;
                    } else {
                        lc.d dVar2 = new lc.d(this.f39462a.getContext(), this.f39462a.o().z());
                        C0461l c0461l2 = new C0461l(this.f39462a.getContext());
                        c0461l2.f3452b = false;
                        c0461l2.f3453c = this.f39462a.i();
                        a(c0461l2);
                        this.f39463b = dVar2.a(c0461l2);
                        this.f39467f = false;
                    }
                }
            }
        }
        if (this.f39462a.y()) {
            H h10 = this.f39463b.f40254d;
            AbstractC1451o lifecycle = this.f39462a.getLifecycle();
            h10.getClass();
            AbstractC3459a.b("FlutterEngineConnectionRegistry#attachToActivity");
            try {
                f fVar = (f) h10.f6587f;
                if (fVar != null) {
                    fVar.b();
                }
                h10.l();
                h10.f6587f = this;
                Activity activity = this.f39462a.getActivity();
                if (activity == null) {
                    throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
                }
                h10.f(activity, lifecycle);
                Trace.endSection();
            } finally {
                try {
                    Trace.endSection();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        ?? r03 = this.f39462a;
        this.f39465d = r03.m(r03.getActivity(), this.f39463b);
        this.f39462a.b(this.f39463b);
        this.f39470i = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kc.e] */
    public final r g(int i5, boolean z2) {
        c();
        if (this.f39462a.p() == 1) {
            n nVar = new n(this.f39462a.getContext(), this.f39462a.q() == 2);
            this.f39462a.getClass();
            this.f39464c = new r(this.f39462a.getContext(), nVar);
        } else {
            p pVar = new p(this.f39462a.getContext());
            pVar.setOpaque(this.f39462a.q() == 1);
            this.f39462a.getClass();
            this.f39464c = new r(this.f39462a.getContext(), pVar);
        }
        this.f39464c.f39519f.add(this.k);
        this.f39462a.getClass();
        this.f39464c.a(this.f39463b);
        this.f39464c.setId(i5);
        if (z2) {
            r rVar = this.f39464c;
            if (this.f39462a.p() != 1) {
                throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
            }
            if (this.f39466e != null) {
                rVar.getViewTreeObserver().removeOnPreDrawListener(this.f39466e);
            }
            this.f39466e = new d(this, rVar);
            rVar.getViewTreeObserver().addOnPreDrawListener(this.f39466e);
        }
        return this.f39464c;
    }

    public final void h() {
        c();
        if (this.f39466e != null) {
            this.f39464c.getViewTreeObserver().removeOnPreDrawListener(this.f39466e);
            this.f39466e = null;
        }
        r rVar = this.f39464c;
        if (rVar != null) {
            rVar.b();
            r rVar2 = this.f39464c;
            rVar2.f39519f.remove(this.k);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kc.e] */
    public final void i() {
        if (this.f39470i) {
            c();
            this.f39462a.c(this.f39463b);
            if (this.f39462a.y()) {
                if (this.f39462a.getActivity().isChangingConfigurations()) {
                    H h10 = this.f39463b.f40254d;
                    if (h10.n()) {
                        AbstractC3459a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                        try {
                            h10.f6582a = true;
                            Iterator it = ((HashMap) h10.f6586e).values().iterator();
                            while (it.hasNext()) {
                                ((InterfaceC3964a) it.next()).onDetachedFromActivityForConfigChanges();
                            }
                            h10.j();
                            Trace.endSection();
                        } finally {
                        }
                    } else {
                        Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                    }
                } else {
                    this.f39463b.f40254d.i();
                }
            }
            N2.j jVar = this.f39465d;
            if (jVar != null) {
                ((C1521a) jVar.f8381d).f19415c = null;
                this.f39465d = null;
            }
            this.f39462a.getClass();
            C3458b c3458b = this.f39463b;
            if (c3458b != null) {
                C2690k c2690k = c3458b.f40257g;
                c2690k.f(1, c2690k.f35615a);
            }
            if (this.f39462a.z()) {
                C3458b c3458b2 = this.f39463b;
                Iterator it2 = c3458b2.f40269t.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC3457a) it2.next()).b();
                }
                H h11 = c3458b2.f40254d;
                h11.l();
                HashMap map = (HashMap) h11.f6583b;
                Iterator it3 = new HashSet(map.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    InterfaceC3885b interfaceC3885b = (InterfaceC3885b) map.get(cls);
                    if (interfaceC3885b != null) {
                        AbstractC3459a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (interfaceC3885b instanceof InterfaceC3964a) {
                                if (h11.n()) {
                                    ((InterfaceC3964a) interfaceC3885b).onDetachedFromActivity();
                                }
                                ((HashMap) h11.f6586e).remove(cls);
                            }
                            interfaceC3885b.onDetachedFromEngine((C3884a) h11.f6585d);
                            map.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                map.clear();
                while (true) {
                    io.flutter.plugin.platform.q qVar = c3458b2.f40267r;
                    SparseArray sparseArray = qVar.k;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    qVar.f37153v.e(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.p pVar = c3458b2.f40268s;
                    SparseArray sparseArray2 = pVar.f37125i;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    pVar.f37131p.e(sparseArray2.keyAt(0));
                }
                ((FlutterJNI) c3458b2.f40253c.f40524c).setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = c3458b2.f40251a;
                flutterJNI.removeEngineLifecycleListener(c3458b2.f40271v);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                b7.k.z().getClass();
                C3458b.f40250x.remove(Long.valueOf(c3458b2.f40270u));
                if (this.f39462a.h() != null) {
                    E4.y.a().b(this.f39462a.h(), null);
                }
                this.f39463b = null;
            }
            this.f39470i = false;
        }
    }

    public final void j(Intent intent) {
        c();
        C3458b c3458b = this.f39463b;
        if (c3458b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        H h10 = c3458b.f40254d;
        if (h10.n()) {
            AbstractC3459a.b("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                Iterator it = ((HashSet) ((s1) h10.f6588g).f43900e).iterator();
                while (it.hasNext()) {
                    ((InterfaceC4284u) it.next()).onNewIntent(intent);
                }
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
        String strD = d(intent);
        if (strD == null || strD.isEmpty()) {
            return;
        }
        C1346a c1346a = this.f39463b.f40259i;
        c1346a.getClass();
        HashMap map = new HashMap();
        map.put("location", strD);
        ((C4281r) c1346a.f17489b).a("pushRouteInformation", map, null);
    }

    public final void k() {
        c();
        if (this.f39463b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        N2.j jVar = this.f39465d;
        if (jVar != null) {
            jVar.q();
        }
        this.f39463b.f40267r.m();
    }

    public final void l(int i5, String[] strArr, int[] iArr) {
        c();
        if (this.f39463b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Arrays.toString(strArr);
        Arrays.toString(iArr);
        H h10 = this.f39463b.f40254d;
        if (!h10.n()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return;
        }
        AbstractC3459a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            Iterator it = ((HashSet) ((s1) h10.f6588g).f43898c).iterator();
            while (true) {
                boolean z2 = false;
                while (it.hasNext()) {
                    if (((InterfaceC4285v) it.next()).onRequestPermissionsResult(i5, strArr, iArr) || z2) {
                        z2 = true;
                    }
                }
                Trace.endSection();
                return;
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kc.e] */
    public final void m(Bundle bundle) {
        byte[] byteArray;
        c();
        if (bundle != null) {
            bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
        } else {
            byteArray = null;
        }
        if (this.f39462a.i()) {
            C3828o c3828o = this.f39463b.k;
            c3828o.f43847d = true;
            tc.g gVar = (tc.g) c3828o.f43845b;
            if (gVar != null) {
                gVar.a(C3828o.d(byteArray));
                c3828o.f43845b = null;
                c3828o.f43849f = byteArray;
            } else if (c3828o.f43848e) {
                ((C4281r) c3828o.f43844a).a("push", C3828o.d(byteArray), new tc.g(0, c3828o, byteArray));
            } else {
                c3828o.f43849f = byteArray;
            }
        }
        if (this.f39462a.y()) {
            H h10 = this.f39463b.f40254d;
            if (!h10.n()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
                return;
            }
            AbstractC3459a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                Iterator it = ((HashSet) ((s1) h10.f6588g).f43902g).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kc.e] */
    public final void n(Bundle bundle) {
        c();
        if (this.f39462a.i()) {
            bundle.putByteArray("framework", (byte[]) this.f39463b.k.f43849f);
        }
        if (this.f39462a.y()) {
            Bundle bundle2 = new Bundle();
            H h10 = this.f39463b.f40254d;
            if (h10.n()) {
                AbstractC3459a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((s1) h10.f6588g).f43902g).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
        }
        if (this.f39462a.h() == null || this.f39462a.z()) {
            return;
        }
        bundle.putBoolean("enableOnBackInvokedCallbackState", this.f39462a.v());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kc.e] */
    public final void o() {
        c();
        if (this.f39462a.h() == null && !this.f39463b.f40253c.f40523b) {
            String strL = this.f39462a.l();
            if (strL == null && (strL = d(this.f39462a.getActivity().getIntent())) == null) {
                strL = "/";
            }
            String strA = this.f39462a.A();
            this.f39462a.s();
            ((C4281r) this.f39463b.f40259i.f17489b).a("setInitialRoute", strL, null);
            String strN = this.f39462a.n();
            if (strN == null || strN.isEmpty()) {
                strN = (String) ((M.y) ((C3665d) b7.k.z().f19396b).f41476d).f7228c;
            }
            this.f39463b.f40253c.d(strA == null ? new mc.a(strN, this.f39462a.s()) : new mc.a(strN, strA, this.f39462a.s()), this.f39462a.f());
        }
        Integer num = this.f39471j;
        if (num != null) {
            this.f39464c.setVisibility(num.intValue());
        }
    }

    public final void p() {
        c();
        this.f39462a.getClass();
        C3458b c3458b = this.f39463b;
        if (c3458b != null) {
            C2690k c2690k = c3458b.f40257g;
            c2690k.f(5, c2690k.f35615a);
        }
        this.f39471j = Integer.valueOf(this.f39464c.getVisibility());
        this.f39464c.setVisibility(8);
        C3458b c3458b2 = this.f39463b;
        if (c3458b2 != null) {
            c3458b2.f40252b.e(40);
        }
    }

    public final void q(int i5) {
        c();
        C3458b c3458b = this.f39463b;
        if (c3458b != null) {
            if (this.f39469h && i5 >= 10) {
                FlutterJNI flutterJNI = (FlutterJNI) c3458b.f40253c.f40524c;
                if (flutterJNI.isAttached()) {
                    flutterJNI.notifyLowMemoryWarning();
                }
                C4155a c4155a = this.f39463b.f40265p;
                c4155a.getClass();
                HashMap map = new HashMap(1);
                map.put("type", "memoryPressure");
                c4155a.f45973a.m(map, null);
            }
            this.f39463b.f40252b.e(i5);
            io.flutter.plugin.platform.q qVar = this.f39463b.f40267r;
            if (i5 < 40) {
                qVar.getClass();
                return;
            }
            Iterator it = qVar.f37141i.values().iterator();
            while (it.hasNext()) {
                ((B) it.next()).f37087h.setSurface(null);
            }
        }
    }

    public final void r() {
        c();
        C3458b c3458b = this.f39463b;
        if (c3458b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        H h10 = c3458b.f40254d;
        if (!h10.n()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        AbstractC3459a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            Iterator it = ((HashSet) ((s1) h10.f6588g).f43901f).iterator();
            if (!it.hasNext()) {
                Trace.endSection();
            } else {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void s(boolean z2) {
        c();
        this.f39462a.getClass();
        C3458b c3458b = this.f39463b;
        if (c3458b != null) {
            C2690k c2690k = c3458b.f40257g;
            if (z2) {
                c2690k.f(c2690k.f35616b, true);
            } else {
                c2690k.f(c2690k.f35616b, false);
            }
        }
    }
}
