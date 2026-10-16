package com.waze.trip_overview.views.trip_details_container;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.waze.modules.c.de;
import com.waze.trip_overview.br;
import com.waze.trip_overview.bs;
import com.waze.trip_overview.dz;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class q extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public p f41586a;

    /* renamed from: b, reason: collision with root package name */
    public g f41587b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f41588c;

    /* renamed from: d, reason: collision with root package name */
    private final List f41589d;

    /* renamed from: e, reason: collision with root package name */
    private com.waze.trip_overview.c.a.d f41590e;

    /* renamed from: f, reason: collision with root package name */
    private com.waze.trip_overview.c.a.d f41591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.f(context, "context");
        this.f41588c = h.g.a(new com.waze.settings.g.a.b(this, 8));
        this.f41589d = new ArrayList();
    }

    public static /* synthetic */ ab l(q qVar) {
        com.waze.trip_overview.c.a.d dVar = qVar.f41591f;
        if (dVar != null) {
            dVar.f();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab m(q qVar, de deVar) {
        x.f(deVar, "vehicleType");
        com.waze.trip_overview.c.a.d dVar = qVar.f41591f;
        if (dVar != null) {
            dVar.d(deVar);
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab n(q qVar) {
        com.waze.trip_overview.c.a.d dVar = qVar.f41591f;
        if (dVar != null) {
            dVar.e();
        }
        return ab.f48028a;
    }

    public abstract kotlinx.coroutines.b.k b();

    public abstract void e();

    public abstract void g();

    public abstract void h(l lVar);

    public final g j() {
        g gVar = this.f41587b;
        if (gVar != null) {
            return gVar;
        }
        x.j("footerAdapter");
        return null;
    }

    public final p k() {
        p pVar = this.f41586a;
        if (pVar != null) {
            return pVar;
        }
        x.j("routesAdapter");
        return null;
    }

    public final void o(bs bsVar) {
        x.f(bsVar, "state");
        ComposeView composeView = (ComposeView) this.f41588c.getValue();
        if (composeView == null) {
            return;
        }
        if (!(bsVar instanceof br)) {
            composeView.setVisibility(8);
        } else {
            composeView.setVisibility(0);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-362094232, true, new com.waze.parking.f(bsVar, this, 12, null)));
        }
    }

    protected final void p(float f2) {
        Iterator it = this.f41589d.iterator();
        while (it.hasNext()) {
            Object obj = ((com.waze.trip_overview.c.a.d) it.next()).f41211a;
            if (f2 == 1.0f) {
                ((com.waze.trip_overview.c.a.ab) obj).h().l(new dz(true));
            } else if (f2 == 0.0f) {
                ((com.waze.trip_overview.c.a.ab) obj).h().l(new dz(false));
            }
        }
    }

    public final void q(g gVar) {
        x.f(gVar, "<set-?>");
        this.f41587b = gVar;
    }

    public final void r(p pVar) {
        x.f(pVar, "<set-?>");
        this.f41586a = pVar;
    }

    public final com.waze.trip_overview.c.a.d s() {
        return this.f41590e;
    }

    public final void t(com.waze.trip_overview.c.a.d dVar) {
        this.f41590e = dVar;
    }

    public final com.waze.trip_overview.c.a.d u() {
        return this.f41591f;
    }

    public final void v(com.waze.trip_overview.c.a.d dVar) {
        this.f41591f = dVar;
    }

    public final void w(com.waze.trip_overview.c.a.d dVar) {
        x.f(dVar, "listener");
        this.f41589d.add(dVar);
    }
}
