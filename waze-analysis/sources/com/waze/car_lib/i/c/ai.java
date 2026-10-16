package com.waze.car_lib.i.c;

import com.waze.R;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.b.g f20082a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20083b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f20084c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f20085d;

    public ai(com.waze.an.b.g gVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(gVar, "insightPolicy");
        h.g.b.x.f(aVar, "stringProvider");
        this.f20082a = gVar;
        this.f20083b = aVar;
        bn bnVarB = ck.b(null);
        this.f20084c = bnVarB;
        this.f20085d = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    public static final /* synthetic */ String d(ai aiVar, com.waze.an.a.n nVar) {
        h.o.a aVarC = nVar.c();
        if (aVarC != null) {
            return h.o.a.n(com.waze.settings.h.c.e(aVarC.w())) + " " + aiVar.f20083b.c(R.string.MIN, new Object[0]);
        }
        com.waze.sharedui.utils.c cVar = new com.waze.sharedui.utils.c(nVar.a(), true);
        return cVar.a() + " " + cVar.c(aiVar.f20083b);
    }

    @Override // com.waze.car_lib.i.c.h
    public final Object a(kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        Object objD = aj.d(new ah(kVar, this, (h.c.e) null, 0), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    @Override // com.waze.car_lib.i.c.h
    public final ch b() {
        return this.f20085d;
    }
}
