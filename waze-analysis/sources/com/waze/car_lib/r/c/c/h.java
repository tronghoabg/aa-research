package com.waze.car_lib.r.c.c;

import com.waze.bw.b.a.j;
import com.waze.car_lib.p.au;
import com.waze.car_lib.p.be;
import com.waze.car_lib.p.bf;
import com.waze.car_lib.screens.bd;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f21164a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f21165b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bd f21166c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bf f21167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, bd bdVar, bf bfVar, h.c.e eVar) {
        super(2, eVar);
        this.f21165b = iVar;
        this.f21166c = bdVar;
        this.f21167d = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f21165b, this.f21166c, this.f21167d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21164a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f21164a = 1;
            obj = i.d(this.f21165b, this.f21166c.a().b().a().d(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.waze.bw.b.a.e eVar = (com.waze.bw.b.a.e) obj;
        if (eVar == null) {
            return ab.f48028a;
        }
        i iVar = this.f21165b;
        String strA = com.waze.sharedui.utils.b.a(iVar.f21171d.a() + h.o.a.m(eVar.a()));
        boolean z = eVar.c() == j.f17698c;
        au auVar = new au(strA, eVar.a(), z);
        bf bfVar = this.f21167d;
        iVar.m.e(bf.i(bfVar, be.d(bfVar.a(), auVar), null, 6));
        iVar.f21176i.c(z);
        return ab.f48028a;
    }
}
