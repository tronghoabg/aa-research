package com.waze.settings.i.a;

import com.waze.settings.cs;
import com.waze.sound.CustomPromptSet;
import com.waze.ui.af.t;
import com.waze.ui.af.u;
import com.waze.ui.af.v;
import com.waze.ui.af.y;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f37419a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37420b;

    n(Object obj, int i2) {
        this.f37420b = i2;
        this.f37419a = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        u uVarD;
        Object objD2;
        u uVarD2;
        int i2 = this.f37420b;
        if (i2 == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            bn bnVar = ((q) this.f37419a).f37436k;
            do {
                objD = bnVar.d();
                v vVar = (v) objD;
                if (vVar instanceof t) {
                    uVarD = t.f((t) vVar, null, null, null, false, null, zBooleanValue, 31);
                } else {
                    if (!(vVar instanceof u)) {
                        throw new h.i();
                    }
                    uVarD = u.d((u) vVar, null, zBooleanValue, 7);
                }
            } while (!bnVar.f(objD, uVarD));
            return ab.f48028a;
        }
        if (i2 == 1) {
            g gVar = (g) obj;
            if (gVar instanceof a) {
                cs csVarC = m.c((m) this.f37419a);
                if (csVarC != null) {
                    csVarC.b(3);
                }
            } else if (gVar instanceof b) {
                cs csVarC2 = m.c((m) this.f37419a);
                if (csVarC2 != null) {
                    csVarC2.b(0);
                }
            } else if (gVar instanceof c) {
                m.g((m) this.f37419a, false, false, null, null);
            } else if (gVar instanceof d) {
                d dVar = (d) gVar;
                m.g((m) this.f37419a, true, false, dVar.a().d(), dVar.a().c());
            } else if (gVar instanceof e) {
                e eVar2 = (e) gVar;
                m.g((m) this.f37419a, false, true, eVar2.a().d(), eVar2.a().c());
            } else {
                if (!(gVar instanceof f)) {
                    throw new h.i();
                }
                f fVar = (f) gVar;
                m.h((m) this.f37419a, fVar.b(), fVar.a());
            }
            return ab.f48028a;
        }
        List<CustomPromptSet> list = (List) obj;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (CustomPromptSet customPromptSet : list) {
            String uuid = customPromptSet.getUUID();
            x.e(uuid, "getUUID(...)");
            String name = customPromptSet.getName();
            x.e(name, "getName(...)");
            int state = customPromptSet.getState();
            arrayList.add(new y(uuid, name, state != 0 ? state != 1 ? state != 2 ? com.waze.ui.af.c.f41882c : com.waze.ui.af.c.f41882c : com.waze.ui.af.c.f41881b : com.waze.ui.af.c.f41880a, customPromptSet.isOwner(), customPromptSet.isUploaded()));
        }
        q qVar = (q) this.f37419a;
        qVar.o = arrayList;
        bn bnVar2 = qVar.f37436k;
        do {
            objD2 = bnVar2.d();
            v vVar2 = (v) objD2;
            if (vVar2 instanceof t) {
                uVarD2 = t.f((t) vVar2, null, null, qVar.o, false, null, false, 59);
            } else {
                if (!(vVar2 instanceof u)) {
                    throw new h.i();
                }
                u uVar = (u) vVar2;
                uVarD2 = u.d(uVar, qVar.q(uVar.b(), uVar.a()), false, 13);
            }
        } while (!bnVar2.f(objD2, uVarD2));
        return ab.f48028a;
    }
}
