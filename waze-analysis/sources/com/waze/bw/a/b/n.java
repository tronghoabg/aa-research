package com.waze.bw.a.b;

import com.waze.av.b.aa;
import h.ab;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f17592a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f17593b;

    n(v vVar, int i2) {
        this.f17593b = i2;
        this.f17592a = vVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        int i2 = this.f17593b;
        if (i2 == 0) {
            aa aaVar = (aa) obj;
            bn bnVar = this.f17592a.f17624j;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, com.waze.bw.a.c.r.j((com.waze.bw.a.c.r) objD, false, aaVar != null, false, null, null, false, false, 4091)));
            return ab.f48028a;
        }
        if (i2 == 1) {
            aa aaVar2 = (aa) obj;
            bn bnVar2 = this.f17592a.f17624j;
            do {
                objD2 = bnVar2.d();
            } while (!bnVar2.f(objD2, com.waze.bw.a.c.r.j((com.waze.bw.a.c.r) objD2, aaVar2 != null, false, false, null, null, false, false, 4093)));
            return ab.f48028a;
        }
        if (i2 == 2) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            bn bnVar3 = this.f17592a.f17624j;
            do {
                objD3 = bnVar3.d();
            } while (!bnVar3.f(objD3, com.waze.bw.a.c.r.j((com.waze.bw.a.c.r) objD3, false, false, zBooleanValue, null, null, false, false, 4087)));
            return ab.f48028a;
        }
        if (i2 != 3) {
            List list = (List) obj;
            bn bnVar4 = this.f17592a.f17624j;
            do {
                objD5 = bnVar4.d();
            } while (!bnVar4.f(objD5, com.waze.bw.a.c.r.j((com.waze.bw.a.c.r) objD5, false, false, false, list, null, false, false, 4063)));
            return ab.f48028a;
        }
        List list2 = (List) obj;
        v vVar = this.f17592a;
        bn bnVar5 = vVar.f17624j;
        do {
            objD4 = bnVar5.d();
        } while (!bnVar5.f(objD4, com.waze.bw.a.c.r.j((com.waze.bw.a.c.r) objD4, false, false, false, null, v.j(vVar, list2), false, false, 4031)));
        return ab.f48028a;
    }
}
