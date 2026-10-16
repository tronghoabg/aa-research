package com.waze.car_lib.i.b;

import android.content.Context;
import com.waze.map.cj;
import com.waze.map.cv;
import com.waze.map.dr;
import com.waze.map.opengl.WazeMapRenderer;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah implements r {

    /* renamed from: a, reason: collision with root package name */
    private final ch f19967a;

    /* renamed from: b, reason: collision with root package name */
    private final dr f19968b;

    /* renamed from: c, reason: collision with root package name */
    private final cj f19969c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.v f19970d;

    /* renamed from: e, reason: collision with root package name */
    private final q f19971e;

    public ah(ch chVar, dr drVar, cj cjVar, com.waze.map.v vVar) {
        h.g.b.x.f(chVar, "controllers");
        h.g.b.x.f(cjVar, "presenterBuilder");
        h.g.b.x.f(vVar, "renderThread");
        this.f19967a = chVar;
        this.f19968b = drVar;
        this.f19969c = cjVar;
        this.f19970d = vVar;
        this.f19971e = new q(new WazeMapRenderer(drVar));
    }

    static final void d(ah ahVar) {
        ahVar.f19971e.a().f();
    }

    static final h.ab e(List list, com.waze.car_lib.i.a.a aVar, ah ahVar, com.waze.map.h hVar) {
        list.clear();
        aVar.f(ahVar.f19971e);
        hVar.b();
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.i.b.r
    public final void a() {
        this.f19970d.a().execute(new Runnable() { // from class: com.waze.car_lib.i.b.ad
            @Override // java.lang.Runnable
            public final void run() {
                ah.d(this.f19959a);
            }
        });
    }

    @Override // com.waze.car_lib.i.b.r
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ch c(Context context, kotlinx.coroutines.af afVar, com.waze.car_lib.i.a.a aVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(aVar, "presentableController");
        ch chVarE = aVar.e(this.f19971e);
        com.waze.map.h hVar = new com.waze.map.h(aVar.b());
        aj.z(afVar, null, null, new l(this, this.f19969c.a(cv.f28708b, afVar, chVarE, ai.G(false), new ag(aVar, null, 0), new com.waze.b.g(new WeakReference(context), 13), hVar), aVar.d(), (h.c.e) null, 3), 3);
        com.waze.ad.c.b.a(afVar, new ac(h.a.i.l(context), aVar, this, hVar, 0));
        return chVarE;
    }
}
