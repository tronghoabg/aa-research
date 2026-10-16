package com.waze.main_screen.d.a;

import com.waze.map.b.ag;
import com.waze.map.b.ah;
import com.waze.map.b.ai;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    private final ai f26317a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.f.f f26318b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f26319c;

    public i(ai aiVar, com.waze.map.f.f fVar) {
        x.f(aiVar, "map");
        x.f(fVar, "mapStatsSender");
        this.f26317a = aiVar;
        this.f26318b = fVar;
        this.f26319c = aiVar.h();
    }

    @Override // com.waze.main_screen.d.a.d
    public final ch a() {
        return this.f26319c;
    }

    @Override // com.waze.main_screen.d.a.d
    public final void b() {
        ag agVarB;
        ag agVar;
        this.f26318b.a();
        ah ahVar = (ah) this.f26319c.d();
        if (ahVar == null || (agVarB = ahVar.b()) == null) {
            return;
        }
        ai aiVar = this.f26317a;
        x.f(agVarB, "<this>");
        int iOrdinal = agVarB.ordinal();
        if (iOrdinal == 0) {
            agVar = ag.f27997b;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            agVar = ag.f27996a;
        }
        aiVar.k(agVar);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
