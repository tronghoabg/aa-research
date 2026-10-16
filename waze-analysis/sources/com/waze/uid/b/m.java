package com.waze.uid.b;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.MutableLiveData;
import com.waze.uid.c.bb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class m implements h {

    /* renamed from: a, reason: collision with root package name */
    private com.waze.uid.e.d f44161a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.uid.e.f f44162b;

    /* renamed from: c, reason: collision with root package name */
    private final List f44163c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedList f44164d;

    /* renamed from: e, reason: collision with root package name */
    private h f44165e;

    /* renamed from: f, reason: collision with root package name */
    private i f44166f;

    public m(com.waze.uid.e.d dVar) {
        h.g.b.x.f(dVar, "model");
        this.f44161a = dVar;
        this.f44163c = new ArrayList();
        this.f44164d = new LinkedList();
        this.f44166f = new i(null, 7);
    }

    public static final com.waze.uid.d.q t() {
        return com.waze.uid.d.q.f44463a.a();
    }

    public final i a() {
        return this.f44166f;
    }

    public final com.waze.uid.e.d b() {
        return this.f44161a;
    }

    protected abstract com.waze.uid.e.f c();

    protected final com.waze.uid.e.f d() {
        return this.f44162b;
    }

    protected abstract Class e();

    public void f() {
        throw null;
    }

    public void g() {
        throw null;
    }

    public final void h(com.waze.uid.e.f fVar) {
        Objects.toString(fVar);
        com.waze.shared_infra.i.h.b("UidEventsController", "entering state ".concat(fVar.toString()));
        this.f44165e = fVar;
    }

    public void i() {
        this.f44162b = null;
        this.f44165e = null;
        this.f44161a.reset();
        k(new i(null, 7));
    }

    public final void j(com.waze.uid.e.d dVar) {
        h.g.b.x.f(dVar, "<set-?>");
        this.f44161a = dVar;
    }

    public final void k(i iVar) {
        h.g.b.x.f(iVar, "value");
        com.waze.shared_infra.i.h.b("UidEventsController", "changing state " + this.f44166f + " -> " + iVar);
        this.f44166f = iVar;
        for (ac acVar : this.f44163c) {
            h.g.b.x.f(iVar, "state");
            acVar.f44140a.i(iVar);
        }
    }

    public final void l(int i2) {
        h.g.a.l lVar = new h.g.a.l() { // from class: com.waze.uid.b.j
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Context context = (Context) obj;
                h.g.b.x.f(context, "context");
                return new Intent(context, (Class<?>) this.f44159a.e()).addFlags(536870912);
            }
        };
        com.waze.app_nav.hub.f fVar = i2 != 0 ? new com.waze.app_nav.hub.f(new l(lVar), i2) : new com.waze.app_nav.hub.g("EventsController", new l(lVar));
        fVar.toString();
        com.waze.shared_infra.i.h.b("UidEventsController", "starting activity, entry=".concat(fVar.toString()));
        com.waze.uid.d.q.f44463a.a().f44467e.c().a().c(fVar);
    }

    public final void m() {
        if (this.f44162b == null) {
            com.waze.uid.e.f fVarC = c();
            this.f44162b = fVarC;
            if (fVarC != null) {
                com.waze.uid.e.e eVar = com.waze.uid.e.e.f44481a;
                if (fVarC.h(eVar)) {
                    fVarC.f(eVar);
                }
            }
        }
    }

    public final boolean n() {
        return !this.f44164d.isEmpty();
    }

    @Override // com.waze.uid.b.h
    public void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof a) {
            f();
        }
        h hVar = this.f44165e;
        Objects.toString(hVar);
        com.waze.shared_infra.i.h.i("UidEventsController", "delegating event to state: ".concat(String.valueOf(hVar)));
        h hVar2 = this.f44165e;
        if (hVar2 != null) {
            hVar2.o(sVar);
        }
    }

    public final boolean p() {
        return this.f44162b != null;
    }

    public final bb q() {
        return this.f44166f.f();
    }

    public final void r(ac acVar) {
        h.g.b.x.f(acVar, "listener");
        this.f44163c.add(acVar);
    }

    public final void s(ac acVar) {
        h.g.b.x.f(acVar, "listener");
        this.f44163c.remove(acVar);
    }

    protected final void u() {
        this.f44162b = null;
    }

    public final com.waze.tide.s v() {
        LinkedList linkedList = this.f44164d;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (com.waze.tide.s) linkedList.remove();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        this.f44164d.add(sVar);
        Iterator it = this.f44163c.iterator();
        while (it.hasNext()) {
            MutableLiveData mutableLiveDataM = ((ac) it.next()).f44140a.m();
            Integer num = (Integer) mutableLiveDataM.getValue();
            mutableLiveDataM.setValue(Integer.valueOf(num != null ? num.intValue() + 1 : 0));
        }
    }
}
