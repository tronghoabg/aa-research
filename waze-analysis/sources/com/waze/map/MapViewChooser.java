package com.waze.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewKt;
import androidx.lifecycle.Lifecycle;
import com.waze.map.opengl.WazeRenderer;
import com.waze.ni;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapViewChooser extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final ni f27898a = new ni(3);

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f27899b = h.g.a(new com.waze.main_screen.c.g.a(19));

    /* renamed from: c, reason: collision with root package name */
    private final dz f27900c;

    /* renamed from: d, reason: collision with root package name */
    private Lifecycle f27901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapViewChooser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.g.b.x.f(context, "context");
        dy dxVar = ni.d() ? new dx(new gf(context, attributeSet)) : new dy(new dw(context, attributeSet));
        this.f27900c = dxVar;
        addView(dxVar.a());
    }

    public final dq a() {
        dz dzVar = this.f27900c;
        if (dzVar instanceof dy) {
            dq dqVarB = ((dy) dzVar).b().b();
            h.g.b.x.e(dqVarB, "getTouchNotifier(...)");
            return dqVarB;
        }
        if (dzVar instanceof dx) {
            return ((dx) dzVar).b().m();
        }
        throw new h.i();
    }

    public final kotlinx.coroutines.b.ch c() {
        dz dzVar = this.f27900c;
        if (dzVar instanceof dy) {
            kotlinx.coroutines.b.ch chVarC = ((dy) dzVar).b().c();
            h.g.b.x.e(chVarC, "getCanvasState(...)");
            return chVarC;
        }
        if (dzVar instanceof dx) {
            return ((dx) dzVar).b().c();
        }
        throw new h.i();
    }

    public final void d(Lifecycle lifecycle) {
        h.g.b.x.f(lifecycle, "lifecycle");
        if (h.g.b.x.n(lifecycle, this.f27901d)) {
            return;
        }
        Lifecycle lifecycle2 = this.f27901d;
        if (lifecycle2 != null) {
            Iterator it = h.m.k.k(ViewKt.getAllViews(this), ea.f28814b).iterator();
            while (it.hasNext()) {
                lifecycle2.removeObserver(((com.waze.shared_infra.s.a) it.next()).a());
            }
        }
        this.f27901d = lifecycle;
        Iterator it2 = h.m.k.k(ViewKt.getAllViews(this), ea.f28813a).iterator();
        while (it2.hasNext()) {
            lifecycle.addObserver(((com.waze.shared_infra.s.a) it2.next()).a());
        }
    }

    public final void e(String str) {
        dz dzVar = this.f27900c;
        if (dzVar instanceof dy) {
            ((dy) dzVar).b().g(str);
        } else {
            if (!(dzVar instanceof dx)) {
                throw new h.i();
            }
            gf gfVarB = ((dx) dzVar).b();
            if (str == null) {
                str = "";
            }
            gfVarB.j(str);
        }
    }

    public final void f(Runnable runnable) {
        h.g.b.x.f(runnable, "callback");
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(runnable);
        dz dzVar = this.f27900c;
        if (dzVar instanceof dy) {
            h.g.b.x.e(((dy) dzVar).b().j(lVar), "registerCanvasCallback(...)");
        } else {
            if (!(dzVar instanceof dx)) {
                throw new h.i();
            }
            ((dx) dzVar).b().l(lVar);
        }
    }

    public final void g() {
        dz dzVar = this.f27900c;
        if (dzVar instanceof dy) {
            ((dy) dzVar).b().h();
        } else {
            if (!(dzVar instanceof dx)) {
                throw new h.i();
            }
            ((dx) dzVar).b().q(true);
        }
    }

    public final void h() {
        dz dzVar = this.f27900c;
        if (dzVar instanceof dy) {
            ((dy) dzVar).b().i();
        } else {
            if (!(dzVar instanceof dx)) {
                throw new h.i();
            }
            WazeRenderer wazeRendererB = ((dx) dzVar).b().b();
            if (wazeRendererB != null) {
                wazeRendererB.t();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        Lifecycle lifecycle;
        if (view == 0 || (lifecycle = this.f27901d) == null || !(view instanceof com.waze.shared_infra.s.a)) {
            return;
        }
        lifecycle.addObserver(((com.waze.shared_infra.s.a) view).a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        Lifecycle lifecycle;
        if (view == 0 || (lifecycle = this.f27901d) == null || !(view instanceof com.waze.shared_infra.s.a)) {
            return;
        }
        lifecycle.removeObserver(((com.waze.shared_infra.s.a) view).a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapViewChooser(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        h.g.b.x.f(context, "context");
    }

    public /* synthetic */ MapViewChooser(Context context, AttributeSet attributeSet, int i2, h.g.b.o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
