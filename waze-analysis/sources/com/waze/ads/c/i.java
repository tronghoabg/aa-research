package com.waze.ads.c;

import com.waze.av.b.n;
import com.waze.modules.navigation.ah;
import com.waze.modules.navigation.ai;
import com.waze.modules.navigation.al;
import com.waze.modules.navigation.ao;
import com.waze.modules.navigation.as;
import com.waze.modules.navigation.at;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f13968a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f13969b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f13970c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ at f13971d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ as f13972e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f13973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(m mVar, n nVar, at atVar, as asVar, h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f13969b = mVar;
        this.f13970c = nVar;
        this.f13971d = atVar;
        this.f13972e = asVar;
        this.f13973f = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f13969b, this.f13970c, this.f13971d, this.f13972e, this.f13973f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f13968a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            m mVar = this.f13969b;
            n nVar = this.f13970c;
            this.f13968a = 1;
            obj = mVar.f13984e.b(new ao(ah.f30289e, new ai(nVar), null, false, this.f13971d, this.f13972e, false, null, 204)).a().c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((al) obj) == al.f30301a) {
            this.f13973f.invoke();
        }
        return ab.f48028a;
    }
}
