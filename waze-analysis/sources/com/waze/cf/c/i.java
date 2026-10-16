package com.waze.cf.c;

import com.waze.jj;
import com.waze.jl;
import com.waze.ka;
import h.ab;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f22208a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22209b;

    i(l lVar, int i2) {
        this.f22209b = i2;
        this.f22208a = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f22209b;
        if (i2 == 0) {
            jj jjVar = (jj) obj;
            l lVar = this.f22208a;
            com.waze.shared_infra.i.e eVar2 = lVar.f22223i;
            Objects.toString(jjVar);
            eVar2.a("collected loader: ".concat(String.valueOf(jjVar)));
            l.p(lVar, jjVar);
            return ab.f48028a;
        }
        if (i2 != 1) {
            this.f22208a.w((jl) obj);
            return ab.f48028a;
        }
        ka kaVar = (ka) obj;
        if (kaVar != null) {
            l lVar2 = this.f22208a;
            com.waze.shared_infra.i.e eVar3 = lVar2.f22223i;
            Objects.toString(kaVar);
            eVar3.a("collected popup: ".concat(kaVar.toString()));
            l.r(lVar2, kaVar);
        }
        return ab.f48028a;
    }
}
