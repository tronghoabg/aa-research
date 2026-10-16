package com.waze.car_lib.i.b;

import android.content.Context;
import com.waze.map.canvas.MainCanvasDelegatorImpl;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19983a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.c.h f19984b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f19985c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f19986d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f19987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(com.waze.car_lib.i.c.h hVar, o oVar, Context context, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar) {
        super(2, eVar);
        this.f19984b = hVar;
        this.f19985c = oVar;
        this.f19986d = context;
        this.f19987e = mainCanvasDelegatorImpl;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f19984b, this.f19985c, this.f19986d, this.f19987e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19983a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ch chVarB = this.f19984b.b();
            o oVar = this.f19985c;
            this.f19983a = 1;
            if (ai.q(chVarB, oVar.f20014c.a(), new aa(oVar, this.f19986d, (h.c.e) null, 1)).collect(new g(this.f19987e, 1), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
