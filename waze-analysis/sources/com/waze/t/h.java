package com.waze.t;

import com.waze.copilot.data.ag;
import h.g.b.x;
import java.io.Closeable;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements Closeable, com.waze.t.a.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.a.c f40891a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f40892b;

    /* renamed from: c, reason: collision with root package name */
    private final af f40893c;

    /* renamed from: d, reason: collision with root package name */
    private String f40894d;

    public h(com.waze.sound.a.c cVar, ab abVar) {
        ag agVarA;
        x.f(cVar, "voiceRepository");
        x.f(abVar, "coroutineDispatcher");
        this.f40891a = cVar;
        this.f40892b = abVar;
        af afVarE = aj.e(abVar);
        this.f40893c = afVarE;
        com.waze.sound.a.b bVarC = cVar.c();
        this.f40894d = (bVarC == null || (agVarA = bVarC.a()) == null) ? null : agVarA.h();
        aj.z(afVarE, null, null, new j(this, (h.c.e) null, 1), 3);
    }

    @Override // com.waze.t.a.j
    public final /* synthetic */ Object b() {
        return this.f40894d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f40893c, null);
    }
}
