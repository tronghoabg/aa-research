package com.google.firebase.perf.metrics;

import com.google.firebase.perf.f.ah;
import com.google.firebase.perf.f.al;
import com.google.firebase.perf.f.ao;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h {
    static final ao a(Trace trace) {
        al alVarNewBuilder = ao.newBuilder();
        alVarNewBuilder.k(trace.d());
        alVarNewBuilder.i(trace.b().d());
        alVarNewBuilder.j(trace.b().c(trace.a()));
        for (d dVar : trace.g().values()) {
            alVarNewBuilder.g(dVar.b(), dVar.a());
        }
        List listF = trace.f();
        if (!listF.isEmpty()) {
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                alVarNewBuilder.d(a((Trace) it.next()));
            }
        }
        alVarNewBuilder.f(trace.getAttributes());
        ah[] ahVarArrG = com.google.firebase.perf.session.b.g(trace.e());
        if (ahVarArrG != null) {
            alVarNewBuilder.a(Arrays.asList(ahVarArrG));
        }
        return alVarNewBuilder.build();
    }
}
