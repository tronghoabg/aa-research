package com.waze.o.b.b.a;

import com.waze.av.b.m;
import com.waze.modules.c.dk;
import com.waze.modules.navigation.ag;
import com.waze.modules.navigation.ah;
import com.waze.modules.navigation.ai;
import com.waze.modules.navigation.ao;
import com.waze.modules.navigation.aq;
import com.waze.modules.navigation.as;
import com.waze.modules.navigation.br;
import com.waze.o.c.c.a.o;
import com.waze.o.c.c.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    private final ag f32716a;

    public j(ag agVar) {
        x.f(agVar, "startNavigationController");
        this.f32716a = agVar;
    }

    @Override // com.waze.o.c.c.a.p
    public final Object a(com.waze.av.a.p pVar, dk dkVar) {
        ah ahVar = ah.o;
        ai aiVar = new ai(new m(pVar));
        ai aiVar2 = aiVar;
        this.f32716a.a(new br(new ao(ahVar, aiVar2, null, false, null, as.f30318b, false, new aq(dkVar), 88)));
        return o.f32840a;
    }
}
