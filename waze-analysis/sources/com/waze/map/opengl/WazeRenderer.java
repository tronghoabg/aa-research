package com.waze.map.opengl;

import android.view.Surface;
import com.google.android.gms.common.api.internal.bc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class WazeRenderer implements com.waze.bk.h {

    /* renamed from: a, reason: collision with root package name */
    private final ae f29506a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29507b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29508c;

    /* renamed from: d, reason: collision with root package name */
    private final p f29509d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29510e;

    /* renamed from: f, reason: collision with root package name */
    private final List f29511f;

    /* renamed from: g, reason: collision with root package name */
    private final List f29512g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f29513h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f29514i;

    /* renamed from: j, reason: collision with root package name */
    private final List f29515j;

    /* renamed from: k, reason: collision with root package name */
    private final List f29516k;

    public WazeRenderer(ae aeVar, String str, String str2, p pVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aeVar, "hostScreen");
        h.g.b.x.f(str, "description");
        h.g.b.x.f(str2, "nativeTag");
        h.g.b.x.f(pVar, "externalDependencies");
        h.g.b.x.f(eVar, "logger");
        this.f29506a = aeVar;
        this.f29507b = str;
        this.f29508c = str2;
        this.f29509d = pVar;
        this.f29510e = eVar;
        this.f29511f = new ArrayList();
        this.f29512g = new ArrayList();
        this.f29513h = ck.b(null);
        this.f29514i = new AtomicBoolean(false);
        this.f29515j = new ArrayList();
        this.f29516k = new ArrayList();
    }

    static final void e(WazeRenderer wazeRenderer, String str) {
        wazeRenderer.nativeClearCanvas(str);
    }

    static final void j(WazeRenderer wazeRenderer, String str) {
        wazeRenderer.nativeDraw(str);
        List list = wazeRenderer.f29515j;
        synchronized (list) {
            if (!list.isEmpty()) {
                List list2 = wazeRenderer.f29516k;
                synchronized (list2) {
                    list2.addAll(list);
                }
                wazeRenderer.f29515j.clear();
            }
        }
    }

    static final void k(WazeRenderer wazeRenderer, String str) {
        wazeRenderer.nativeDone(str, false);
    }

    static final void m(WazeRenderer wazeRenderer, String str, kotlinx.coroutines.h.a aVar) {
        wazeRenderer.nativeDone(str, true);
        aVar.unlock(null);
    }

    static final void n(WazeRenderer wazeRenderer, kotlinx.coroutines.h.a aVar) {
        wazeRenderer.f29510e.g("onStop() - priority event canceled, will just release mutex");
        aVar.unlock(null);
    }

    private final native void nativeClearCanvas(String str);

    private final native void nativeDone(String str, boolean z);

    private final native void nativeDraw(String str);

    private final native void nativeFinalFlush(String str);

    private final native boolean nativeRender(String str);

    private final native void nativeResize(String str, int i2, int i3);

    private final native String nativeSurfaceCreated(String str, String str2, boolean z, int i2, int i3);

    static final void o(WazeRenderer wazeRenderer, String str, int i2, int i3) {
        wazeRenderer.nativeResize(str, i2, i3);
    }

    static final void p(WazeRenderer wazeRenderer, int i2, int i3, kotlinx.coroutines.h.a aVar) {
        Object objD;
        ae aeVar = ae.f29536b;
        bn bnVar = wazeRenderer.f29513h;
        String str = (String) bnVar.d();
        if (str == null) {
            str = "";
        }
        String strNativeSurfaceCreated = wazeRenderer.nativeSurfaceCreated(wazeRenderer.f29508c, str, wazeRenderer.f29506a == aeVar, i2, i3);
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, strNativeSurfaceCreated));
        if (!h.g.b.x.n(objD, strNativeSurfaceCreated)) {
            aj.z(aj.f(), null, null, new v(wazeRenderer, strNativeSurfaceCreated, (h.c.e) null, 5), 3);
        }
        aVar.unlock(null);
    }

    static final void q(WazeRenderer wazeRenderer, kotlinx.coroutines.h.a aVar) {
        wazeRenderer.f29510e.g("onSurfaceCreated() - priority event canceled, will just release mutex");
        aVar.unlock(null);
    }

    static final void r(WazeRenderer wazeRenderer, Runnable runnable) {
        wazeRenderer.f29512g.remove(runnable);
    }

    static final void s(WazeRenderer wazeRenderer, h.g.a.l lVar) {
        wazeRenderer.f29511f.remove(lVar);
    }

    public final com.waze.shared_infra.s.d a(Runnable runnable) {
        h.g.b.x.f(runnable, "callback");
        this.f29512g.add(runnable);
        if (this.f29513h.d() == null) {
            runnable.run();
        }
        return new u(this, runnable, 3);
    }

    public final com.waze.shared_infra.s.d b(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "callback");
        this.f29511f.add(lVar);
        String str = (String) this.f29513h.d();
        if (str != null) {
            lVar.invoke(str);
        }
        return new u(this, lVar, 2);
    }

    @Override // com.waze.bk.h
    public final void f() {
        Object objD;
        String str;
        bn bnVar = this.f29513h;
        Object objD2 = bnVar.d();
        Objects.toString(objD2);
        this.f29510e.a("will clear, canvasIdState: ".concat(String.valueOf(objD2)));
        do {
            objD = bnVar.d();
            str = (String) objD;
        } while (!bnVar.f(objD, null));
        if (str != null) {
            this.f29509d.b(new ab(this, str, 3), new bc(15));
            aj.z(aj.f(), null, null, new af(this, (h.c.e) null, 0), 3);
        }
    }

    @Override // com.waze.bk.h
    public final void g(int i2, int i3, int i4) {
        String str = (String) this.f29513h.d();
        if (str == null) {
            return;
        }
        this.f29509d.b(new ac(this, str, i2, i3, 1), new bc(15));
    }

    @Override // com.waze.bk.h
    public final void h(Surface surface, int i2, int i3, int i4) {
        h.g.b.x.f(surface, "surface");
        kotlinx.coroutines.h.a aVarD = kotlinx.coroutines.h.i.d();
        this.f29509d.b(new ac(this, i2, i3, aVarD, 0), new ab(this, aVarD, 2));
        aj.t(h.c.k.f48060a, new ag(aVarD, null, 2, null));
    }

    @Override // com.waze.bk.h
    public final void i() {
        bn bnVar = this.f29513h;
        String str = (String) bnVar.d();
        if (str == null) {
            return;
        }
        final String str2 = (String) bnVar.d();
        if (str2 != null) {
            boolean zA = r.f29557a.a();
            p pVar = this.f29509d;
            if (zA) {
                pVar.b(new ab(this, str2, 4), new bc(15));
            } else {
                final kotlinx.coroutines.h.a aVarD = kotlinx.coroutines.h.i.d();
                pVar.b(new Runnable() { // from class: com.waze.map.opengl.ad
                    @Override // java.lang.Runnable
                    public final void run() {
                        WazeRenderer.m(this.f29532a, str2, aVarD);
                    }
                }, new ab(this, aVarD, 1));
                aj.t(h.c.k.f48060a, new ag(aVarD, (h.c.e) null, 0));
            }
        }
        nativeFinalFlush(str);
    }

    @Override // com.waze.bk.h
    public final boolean l() {
        String str;
        if (this.f29514i.get() || (str = (String) this.f29513h.d()) == null) {
            return false;
        }
        this.f29509d.c(new ab(this, str, 0));
        boolean zNativeRender = nativeRender(str);
        if (zNativeRender) {
            List list = this.f29516k;
            synchronized (list) {
                if (list.isEmpty()) {
                    return zNativeRender;
                }
                ArrayList arrayList = new ArrayList(list);
                list.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
        return zNativeRender;
    }

    public final void t() {
        this.f29514i.set(true);
    }

    public final String toString() {
        return "WazeRenderer(" + this.f29507b + ", tag:" + this.f29508c + ")";
    }
}
