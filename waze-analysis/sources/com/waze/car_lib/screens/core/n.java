package com.waze.car_lib.screens.core;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import com.waze.web.r;
import h.ab;
import h.g.b.ar;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class n<T extends Template> extends ScreenPresentable implements org.a.a.b.a, org.a.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final org.a.d.k.b f21968a;

    /* renamed from: b, reason: collision with root package name */
    private final l f21969b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21970c;

    /* renamed from: d, reason: collision with root package name */
    private Template f21971d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.l.d f21972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CarContext carContext, String str, com.waze.car_lib.l.d dVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        super(carContext, str, null, 4, null);
        x.f(carContext, "carContext");
        x.f(str, "screenName");
        this.f21972e = dVar;
        x.f(this, "<this>");
        org.a.d.k.b bVarB = r.k().b(this);
        getLifecycle().addObserver(new j(bVarB));
        this.f21968a = bVarB;
        n<T> nVar = this;
        if (nVar instanceof org.a.d.a.b) {
            bVarC = nVar.l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(l.class);
        } else {
            bVarC = nVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(l.class);
        }
        this.f21969b = (l) bVarC.a(mVar, null, null);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeScreen");
        x.e(eVarD, "create(...)");
        this.f21970c = eVarD;
        if (dVar != null) {
            dVar.d().invoke();
            addBackPressedCallback(new com.waze.app_nav.a.a(dVar, 12));
        }
    }

    static final ab o(n nVar, h.g.a.a aVar) {
        nVar.f21969b.a(new com.waze.app_nav.a.a(aVar, 13));
        return ab.f48028a;
    }

    protected abstract Template a();

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return this.f21968a;
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final l n() {
        return this.f21969b;
    }

    @Override // androidx.car.app.Screen
    public final T onGetTemplate() {
        getTemplateCalled();
        T t = (T) this.f21971d;
        return t == null ? (T) a() : t;
    }

    protected final h.g.a.a p(final h.g.a.a aVar) {
        x.f(aVar, "cb");
        return new h.g.a.a() { // from class: com.waze.car_lib.screens.core.m
            @Override // h.g.a.a
            public final Object invoke() {
                return n.o(this.f21966a, aVar);
            }
        };
    }

    public final void q(Template template) {
        Object objA;
        x.f(template, "newTemplate");
        this.f21971d = template;
        try {
            n<T> nVar = this;
            invalidate();
            objA = ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            com.waze.shared_infra.i.e eVar = this.f21970c;
            Objects.toString(thC);
            eVar.g("Couldn't invalidate WazeScreen: ".concat(thC.toString()));
        }
    }

    public /* synthetic */ n(CarContext carContext, String str) {
        this(carContext, str, null);
    }
}
