package com.waze.sharedrive.e;

import android.content.Context;
import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f38506a;

    /* renamed from: b, reason: collision with root package name */
    int f38507b;

    /* renamed from: c, reason: collision with root package name */
    int f38508c;

    /* renamed from: d, reason: collision with root package name */
    int f38509d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ cr f38510e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f38511f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f38512g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cq(cr crVar, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f38510e = crVar;
        this.f38511f = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cq cqVar = new cq(this.f38510e, this.f38511f, eVar);
        cqVar.f38512g = obj;
        return cqVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        int i2;
        int i3;
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38509d != 0) {
            i3 = this.f38508c;
            i2 = this.f38507b;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f38512g;
            cr crVar = this.f38510e;
            Context context = (Context) crVar.f38516d.get();
            if (context == null) {
                crVar.f38515c.g("Context has been garbage collected, aborting render");
                return null;
            }
            float f2 = context.getResources().getDisplayMetrics().density;
            this.f38512g = afVar;
            this.f38506a = crVar;
            int i4 = (int) (54.0f * f2);
            this.f38507b = i4;
            int i5 = (int) (f2 * 58.0f);
            this.f38508c = i5;
            this.f38509d = 1;
            cq cqVar = this;
            kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.c.a.h.d(cqVar), 1);
            lVar.u();
            crVar.f38514b.inflate(R.layout.live_drive_participant_pin, null, new cp(lVar));
            Object objJ = lVar.j();
            if (objJ == aVar) {
                h.d.b.c(cqVar);
            }
            if (objJ == aVar) {
                return aVar;
            }
            i2 = i4;
            obj = objJ;
            i3 = i5;
        }
        View view = (View) obj;
        this.f38511f.invoke(view);
        try {
            objA = com.waze.ad.a.j.a(view, i2, i3, 1073741824);
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        cr crVar2 = this.f38510e;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            crVar2.f38515c.h("Failed to render view to bitmap: ".concat(String.valueOf(thC.getMessage())), thC);
        }
        if (objA instanceof h.l) {
            return null;
        }
        return objA;
    }
}
