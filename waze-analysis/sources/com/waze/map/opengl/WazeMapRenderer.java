package com.waze.map.opengl;

import android.view.Surface;
import com.waze.jni.protos.map.WazeMapInitialization;
import com.waze.map.dr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeMapRenderer implements com.waze.bk.h {

    /* renamed from: a, reason: collision with root package name */
    private final dr f29500a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f29501b;

    /* renamed from: c, reason: collision with root package name */
    private final List f29502c;

    /* renamed from: d, reason: collision with root package name */
    private final List f29503d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f29504e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f29505f;

    public /* synthetic */ WazeMapRenderer(dr drVar) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeMapRenderer");
        h.g.b.x.e(eVarD, "create(...)");
        kotlinx.coroutines.af afVarF = aj.f();
        h.g.b.x.f(eVarD, "logger");
        h.g.b.x.f(afVarF, "eventScope");
        this.f29500a = drVar;
        this.f29501b = afVarF;
        this.f29502c = new ArrayList();
        this.f29503d = new ArrayList();
        this.f29504e = ck.b(null);
        this.f29505f = new AtomicBoolean(false);
    }

    static final void j(WazeMapRenderer wazeMapRenderer, Runnable runnable) {
        aj.z(wazeMapRenderer.f29501b, null, null, new v(wazeMapRenderer, runnable, (h.c.e) null, 2, (byte[]) null), 3);
    }

    static final void k(WazeMapRenderer wazeMapRenderer, h.g.a.l lVar) {
        aj.z(wazeMapRenderer.f29501b, null, null, new v(wazeMapRenderer, lVar, (h.c.e) null, 4, (byte[]) null), 3);
    }

    private final native void nativeClear(String str);

    private final native void nativeDetach(String str);

    private final native boolean nativeRender(String str);

    private final native void nativeResize(String str, int i2, int i3, int i4);

    private final native String nativeSurfaceCreated(Object obj, String str, int i2, int i3, int i4, int i5);

    public final com.waze.shared_infra.s.d a(Runnable runnable) {
        h.g.b.x.f(runnable, "callback");
        aj.z(this.f29501b, null, null, new v(this, runnable, (h.c.e) null, 0), 3);
        return new u(this, runnable, 1);
    }

    public final com.waze.shared_infra.s.d b(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "callback");
        aj.z(this.f29501b, null, null, new v(this, lVar, (h.c.e) null, 3), 3);
        return new u(this, lVar, 0);
    }

    @Override // com.waze.bk.h
    public final void f() {
        bn bnVar;
        Object objD;
        String str;
        do {
            bnVar = this.f29504e;
            objD = bnVar.d();
            str = (String) objD;
        } while (!bnVar.f(objD, null));
        if (str != null) {
            nativeClear(str);
            aj.z(this.f29501b, null, null, new af(this, (h.c.e) null, 1), 3);
        }
    }

    @Override // com.waze.bk.h
    public final void g(int i2, int i3, int i4) {
        nativeResize((String) this.f29504e.d(), i2, i3, i4);
    }

    @Override // com.waze.bk.h
    public final void h(Surface surface, int i2, int i3, int i4) {
        int number;
        Object objD;
        h.g.b.x.f(surface, "surface");
        bn bnVar = this.f29504e;
        String str = (String) bnVar.d();
        dr drVar = this.f29500a;
        if (drVar == null) {
            number = WazeMapInitialization.MapUsageType.TYPE_UNKNOWN.getNumber();
        } else {
            int iOrdinal = drVar.ordinal();
            if (iOrdinal == 0) {
                number = WazeMapInitialization.MapUsageType.TYPE_MAIN_FOR_MOBILE.getNumber();
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                number = WazeMapInitialization.MapUsageType.TYPE_MAIN_FOR_INCAR.getNumber();
            }
        }
        String strNativeSurfaceCreated = nativeSurfaceCreated(surface, str, number, i2, i3, i4);
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, strNativeSurfaceCreated));
        if (h.g.b.x.n(objD, strNativeSurfaceCreated)) {
            return;
        }
        aj.z(this.f29501b, null, null, new v(this, strNativeSurfaceCreated, (h.c.e) null, 1), 3);
    }

    @Override // com.waze.bk.h
    public final void i() {
        String str = (String) this.f29504e.d();
        if (str != null) {
            nativeDetach(str);
        }
    }

    @Override // com.waze.bk.h
    public final boolean l() {
        if (this.f29505f.get()) {
            return false;
        }
        return nativeRender((String) this.f29504e.d());
    }
}
