package com.waze.nightmode;

import com.waze.ak;
import com.waze.al;
import com.waze.am;
import com.waze.an;
import com.waze.cf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32516a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f32517b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f32518c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ae f32519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ae aeVar, h.c.e eVar) {
        super(4, eVar);
        this.f32519d = aeVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        z zVar = new z(this.f32519d, (h.c.e) obj4);
        zVar.f32516a = (x) obj;
        zVar.f32517b = (cf) obj2;
        zVar.f32518c = (a) obj3;
        return zVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        boolean zF;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        x xVar = (x) this.f32516a;
        cf cfVar = (cf) this.f32517b;
        a aVar2 = (a) this.f32518c;
        if (cfVar instanceof ak) {
            zF = xVar.c();
        } else if (cfVar instanceof am) {
            a aVar3 = a.f32437a;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                zF = xVar.c();
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                zF = ae.f(xVar);
            }
        } else {
            if (!(cfVar instanceof al) && !(cfVar instanceof an)) {
                throw new h.i();
            }
            zF = ae.f(xVar);
        }
        return Boolean.valueOf(zF);
    }
}
