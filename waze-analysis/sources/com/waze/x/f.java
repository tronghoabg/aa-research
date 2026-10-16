package com.waze.x;

import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;
import l.a.fq;
import l.a.fr;
import l.a.pq;
import l.a.ps;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f45542a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(String str, h.c.e eVar) {
        super(2, eVar);
        this.f45542a = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f45542a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ax axVarA = ax.f40550a.a();
        pq pqVarNewBuilder = ps.newBuilder();
        fq fqVarNewBuilder = fr.newBuilder();
        fqVarNewBuilder.a(this.f45542a);
        pqVarNewBuilder.b(fqVarNewBuilder.build());
        ps psVarBuild = pqVarNewBuilder.build();
        x.e(psVarBuild, "build(...)");
        o.l(axVarA, psVarBuild);
        return ab.f48028a;
    }
}
