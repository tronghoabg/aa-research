package com.waze.an.a.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.waze.search.h.bx;
import h.ab;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14521f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f14522g;

    public /* synthetic */ v(y yVar, com.waze.asks.at atVar, com.waze.asks.f fVar, com.waze.an.a.u uVar, h.g.a.l lVar, h.g.a.l lVar2, int i2) {
        this.f14522g = i2;
        this.f14516a = yVar;
        this.f14517b = atVar;
        this.f14518c = fVar;
        this.f14519d = uVar;
        this.f14520e = lVar;
        this.f14521f = lVar2;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f14522g;
        if (i2 == 0) {
            ?? r5 = this.f14521f;
            ?? r4 = this.f14520e;
            Object obj = this.f14519d;
            Object obj2 = this.f14518c;
            return y.b((y) this.f14516a, (com.waze.asks.at) this.f14517b, (com.waze.asks.f) obj2, (com.waze.an.a.u) obj, r4, r5);
        }
        if (i2 == 1) {
            ?? r52 = this.f14521f;
            ?? r42 = this.f14520e;
            Object obj3 = this.f14519d;
            Object obj4 = this.f14518c;
            return y.c((y) this.f14516a, (com.waze.asks.at) this.f14517b, (com.waze.asks.f) obj4, (com.waze.an.a.u) obj3, r42, r52);
        }
        com.waze.car_lib.i.b.d dVar = new com.waze.car_lib.i.b.d(this.f14518c, this.f14519d, 11);
        Object obj5 = this.f14517b;
        final ?? r2 = this.f14520e;
        final ?? r43 = this.f14521f;
        final Context context = (Context) obj5;
        ((bx) this.f14516a).w(dVar, new h.g.a.l() { // from class: com.waze.search.f.d
            @Override // h.g.a.l
            public final Object invoke(Object obj6) {
                String str = (String) obj6;
                h.g.b.x.f(str, "searchTerm");
                aj.z(r43, null, null, new w(str, r2, context, (h.c.e) null, 0), 3);
                return ab.f48028a;
            }
        });
        return h.ab.f48028a;
    }

    public /* synthetic */ v(bx bxVar, Activity activity, View view, kotlinx.coroutines.af afVar, h.g.a.a aVar, Context context, int i2) {
        this.f14522g = i2;
        this.f14516a = bxVar;
        this.f14518c = activity;
        this.f14519d = view;
        this.f14521f = afVar;
        this.f14520e = aVar;
        this.f14517b = context;
    }
}
