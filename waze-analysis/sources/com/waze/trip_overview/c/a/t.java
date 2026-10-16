package com.waze.trip_overview.c.a;

import android.view.View;
import com.waze.map.b.dz;
import com.waze.sharedrive.g.ap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41258a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f41259b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f41260c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f41261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(View view, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41261d = i2;
        this.f41259b = view;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f41261d;
        Object obj2 = this.f41259b;
        if (i2 != 0) {
            t tVar = new t((View) obj2, eVar, 1);
            tVar.f41260c = obj;
            return tVar;
        }
        t tVar2 = new t((ab) obj2, eVar, 0);
        tVar2.f41260c = obj;
        return tVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f41261d != 0 ? ((t) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((t) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f41261d == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f41258a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ab abVar = (ab) this.f41259b;
                this.f41258a = 1;
                if (abVar.h().f().collect(new s(abVar), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f41258a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            final kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f41260c;
            Object obj2 = this.f41259b;
            final View view = (View) obj2;
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.waze.trip_overview.c.a.o
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    kotlinx.coroutines.a.ab.e(adVar, new dz(com.waze.ad.a.j.b(view)));
                }
            };
            view.addOnLayoutChangeListener(onLayoutChangeListener);
            this.f41258a = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new ap(obj2, onLayoutChangeListener, 20), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(ab abVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41261d = i2;
        this.f41259b = abVar;
    }
}
