package com.waze.map;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleObserver;
import com.waze.R;
import com.waze.ig;
import com.waze.map.opengl.WazeRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gf extends com.waze.map.isolated.v {

    /* renamed from: a, reason: collision with root package name */
    private com.waze.map.isolated.c f29142a;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.opengl.l f29143c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f29144d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f29145e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f29146f;

    /* renamed from: g, reason: collision with root package name */
    private final DefaultLifecycleObserver f29147g;

    /* renamed from: h, reason: collision with root package name */
    private String f29148h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f29149i;

    /* renamed from: j, reason: collision with root package name */
    private WazeRenderer f29150j;

    /* renamed from: k, reason: collision with root package name */
    private final List f29151k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, new ec());
        h.g.b.x.f(context, "context");
        this.f29143c = new com.waze.map.opengl.l();
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(dn.f28759a);
        this.f29144d = bnVarB;
        this.f29145e = bnVarB;
        this.f29146f = h.g.b(h.h.f48130a, new df(this, 1));
        this.f29147g = new ge(this);
        this.f29148h = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MapView);
        h.g.b.x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(1);
        j(string != null ? string : "");
        typedArrayObtainStyledAttributes.recycle();
        this.f29149i = h.g.a(new com.waze.car_lib.b.m((Object) this, 16));
        this.f29151k = new ArrayList();
    }

    public static /* synthetic */ void d(gf gfVar) {
        gfVar.f29144d.e(dn.f28759a);
        for (com.google.firebase.messaging.l lVar : h.a.i.ao(gfVar.f29151k)) {
        }
    }

    public static final /* synthetic */ void e(gf gfVar, String str) {
        ((com.waze.map.f.f) gfVar.f29146f.getValue()).c();
        org.a.d.k.b bVarC = org.a.b.b.d.e().a().c();
        int i2 = h.g.b.ar.f48106a;
        gfVar.f29142a = ((com.waze.map.isolated.b) bVarC.a(new h.g.b.m(com.waze.map.isolated.b.class), null, null)).a(str);
        gfVar.f29144d.e(new Cdo(new ab(str)));
        Iterator it = h.a.i.ao(gfVar.f29151k).iterator();
        while (it.hasNext()) {
            ((com.google.firebase.messaging.l) it.next()).c();
        }
    }

    @Override // com.waze.shared_infra.s.a
    public final /* synthetic */ LifecycleObserver a() {
        return this.f29147g;
    }

    public final WazeRenderer b() {
        return this.f29150j;
    }

    public final kotlinx.coroutines.b.ch c() {
        return this.f29145e;
    }

    @Override // com.waze.map.isolated.v
    public final void h(MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "motionEvent");
        this.f29143c.a();
        com.waze.map.isolated.c cVar = this.f29142a;
        if (cVar != null) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            h.g.b.x.e(motionEventObtain, "obtain(...)");
            cVar.onTouchEvent(motionEventObtain);
        }
    }

    @Override // com.waze.map.isolated.v
    public final void i() {
        super.i();
        WazeRenderer wazeRenderer = this.f29150j;
        if (wazeRenderer != null) {
            wazeRenderer.f();
        }
        this.f29150j = null;
    }

    public final void j(String str) {
        h.g.b.x.f(str, "value");
        if (h.g.b.x.n(this.f29148h, str)) {
            return;
        }
        this.f29148h = str;
        if (u()) {
            t();
            WazeRenderer wazeRenderer = this.f29150j;
            if (wazeRenderer != null) {
                wazeRenderer.f();
            }
            this.f29150j = null;
            r();
        }
    }

    @Override // com.waze.map.isolated.v
    public final void k() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.k.b bVarC2;
        h.g.b.m mVar2;
        if (this.f29148h.length() == 0) {
            return;
        }
        gf gfVar = this;
        boolean z = gfVar instanceof org.a.d.a.b;
        if (z) {
            bVarC = ((org.a.d.a.b) gfVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.bk.g.class);
        } else {
            bVarC = gfVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.bk.g.class);
        }
        com.waze.bk.e eVarA = ((com.waze.bk.g) bVarC.a(mVar, null, null)).a();
        WazeRenderer wazeRenderer = this.f29150j;
        if (wazeRenderer == null) {
            com.waze.map.opengl.ae aeVar = com.waze.map.opengl.ae.f29535a;
            String str = this.f29148h;
            if (z) {
                bVarC2 = ((org.a.d.a.b) gfVar).l();
                mVar2 = new h.g.b.m(com.waze.map.opengl.p.class);
            } else {
                bVarC2 = gfVar.getKoin().a().c();
                mVar2 = new h.g.b.m(com.waze.map.opengl.p.class);
            }
            com.waze.map.opengl.p pVar = (com.waze.map.opengl.p) bVarC2.a(mVar2, null, null);
            com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeRenderer");
            h.g.b.x.e(eVarD, "create(...)");
            WazeRenderer wazeRenderer2 = new WazeRenderer(aeVar, "mobileApp", str, pVar, eVarD);
            wazeRenderer2.b(new gd(this, 0));
            wazeRenderer2.a(new ig(this, 17));
            wazeRenderer = wazeRenderer2;
        }
        this.f29150j = wazeRenderer;
        s(eVarA, new com.waze.map.opengl.x(com.waze.map.opengl.f.f29545a, this.f29143c, wazeRenderer, eVarA.i() ? ((com.waze.map.opengl.d) this.f29149i.getValue()).a() : null, true));
    }

    public final void l(com.google.firebase.messaging.l lVar) {
        h.g.b.x.f(lVar, "callback");
        if (((com.waze.an.a.a.bd) this.f29144d.d()) instanceof Cdo) {
            lVar.c();
        }
        this.f29151k.add(lVar);
    }
}
