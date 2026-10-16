package com.waze.car_lib.i.b;

import com.waze.map.b.ed;
import com.waze.map.cj;
import com.waze.map.dr;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final cj f19960a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.v f19961b;

    public ae(cj cjVar, com.waze.map.v vVar) {
        h.g.b.x.f(cjVar, "presenterBuilder");
        h.g.b.x.f(vVar, "renderThread");
        this.f19960a = cjVar;
        this.f19961b = vVar;
    }

    public final ah a(ed edVar) {
        h.g.b.x.f(edVar, "controller");
        return b(ck.b(edVar), null);
    }

    public final ah b(ch chVar, dr drVar) {
        h.g.b.x.f(chVar, "controllers");
        return new ah(chVar, drVar, this.f19960a, this.f19961b);
    }
}
