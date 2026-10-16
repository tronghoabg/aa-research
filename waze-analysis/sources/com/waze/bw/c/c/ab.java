package com.waze.bw.c.c;

import com.waze.bw.c.d.bt;
import com.waze.bw.c.d.bu;
import com.waze.bw.c.d.bw;
import com.waze.bw.c.d.bx;
import com.waze.bw.c.d.by;
import com.waze.bw.c.d.bz;
import com.waze.bw.c.d.ca;
import com.waze.bw.c.d.cb;
import com.waze.bw.c.d.cd;
import com.waze.network.b.ay;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f17771a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f17772b;

    ab(am amVar, int i2) {
        this.f17772b = i2;
        this.f17771a = amVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        bu buVar;
        Object objD2;
        int i2 = 3;
        switch (this.f17772b) {
            case 0:
                am.z(this.f17771a, new com.waze.sound.e.i((com.waze.av.b.aa) obj, 4));
                return h.ab.f48028a;
            case 1:
                am.z(this.f17771a, new com.waze.sound.e.i((com.waze.av.b.aa) obj, i2));
                return h.ab.f48028a;
            case 2:
                List list = (List) obj;
                am amVar = this.f17771a;
                am.z(amVar, new com.waze.bw.a.b.l(list, amVar.E(list), 1));
                return h.ab.f48028a;
            case 3:
                am.z(this.f17771a, new com.waze.map.g.e(((Boolean) obj).booleanValue(), 2));
                return h.ab.f48028a;
            case 4:
                am.z(this.f17771a, new com.waze.map.g.e(((Boolean) obj).booleanValue(), i2));
                return h.ab.f48028a;
            case 5:
                am.z(this.f17771a, new com.waze.sound.e.i((ay) obj, 5));
                return h.ab.f48028a;
            case 6:
                am amVar2 = this.f17771a;
                am.z(amVar2, new com.waze.sound.e.i(amVar2.F((List) obj), 6));
                return h.ab.f48028a;
            case 7:
                com.waze.resume_drive.a aVar = (com.waze.resume_drive.a) obj;
                bn bnVar = this.f17771a.x;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, com.waze.bw.c.d.l.h((com.waze.bw.c.d.l) objD, null, null, h.g.b.x.n(aVar, com.waze.bn.e.f17151a), null, null, null, 123)));
                return h.ab.f48028a;
            case 8:
                com.waze.br.c.n nVar = (com.waze.br.c.n) obj;
                if (nVar == null || h.g.b.x.n(nVar, com.waze.br.c.i.f17396a)) {
                    buVar = new bu(bt.f18001c);
                } else if (h.g.b.x.n(nVar, com.waze.br.c.h.f17395a)) {
                    buVar = new cd(bx.f18005a);
                } else if (h.g.b.x.n(nVar, com.waze.br.c.j.f17397a)) {
                    buVar = new cd(by.f18006a);
                } else if (nVar instanceof com.waze.br.c.k) {
                    buVar = new cd(bz.f18007a);
                } else if (nVar instanceof com.waze.br.c.l) {
                    buVar = new cd(ca.f18010a);
                } else if (h.g.b.x.n(nVar, com.waze.br.c.m.f17400a)) {
                    buVar = new cd(cb.f18011a);
                } else if (nVar instanceof com.waze.br.c.f) {
                    buVar = new cd(new bw(((com.waze.br.c.f) nVar).a()));
                } else {
                    if (!(nVar instanceof com.waze.br.c.g)) {
                        throw new h.i();
                    }
                    buVar = new cd(bx.f18005a);
                }
                am.z(this.f17771a, new com.waze.sound.e.i(buVar, 7));
                return h.ab.f48028a;
            case 9:
                h.k kVar = (h.k) obj;
                boolean zBooleanValue = ((Boolean) kVar.a()).booleanValue();
                List list2 = (List) kVar.b();
                if (zBooleanValue) {
                    am amVar3 = this.f17771a;
                    kotlinx.coroutines.aj.z(amVar3.t, null, null, new af(amVar3, list2, null), 3);
                }
                return h.ab.f48028a;
            case 10:
                am.z(this.f17771a, new com.waze.sound.e.i((List) obj, 8));
                return h.ab.f48028a;
            case 11:
                am.z(this.f17771a, new com.waze.sound.e.i((com.waze.z.a.d.ap) obj, 9));
                return h.ab.f48028a;
            default:
                com.waze.resume_drive.a aVar2 = (com.waze.resume_drive.a) obj;
                bn bnVar2 = this.f17771a.x;
                do {
                    objD2 = bnVar2.d();
                } while (!bnVar2.f(objD2, com.waze.bw.c.d.l.h((com.waze.bw.c.d.l) objD2, null, null, h.g.b.x.n(aVar2, com.waze.bn.e.f17151a), null, null, null, 123)));
                return h.ab.f48028a;
        }
    }
}
