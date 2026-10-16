package com.google.firebase.perf.a;

import android.support.a.i;
import android.support.v4.app.ar;
import com.google.firebase.perf.e.j;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends i {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10266a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f10267b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.d.f f10268c;

    /* renamed from: d, reason: collision with root package name */
    private final c f10269d;

    /* renamed from: e, reason: collision with root package name */
    private final f f10270e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.perf.b f10271f;

    public e(com.google.firebase.perf.b bVar, com.google.firebase.perf.d.f fVar, c cVar, f fVar2) {
        this.f10271f = bVar;
        this.f10268c = fVar;
        this.f10269d = cVar;
        this.f10270e = fVar2;
    }

    @Override // android.support.a.i
    public final void b(ar arVar) {
        com.google.firebase.perf.c.a aVar = f10266a;
        aVar.c("FragmentMonitor %s.onFragmentPaused ", arVar.getClass().getSimpleName());
        WeakHashMap weakHashMap = this.f10267b;
        if (!weakHashMap.containsKey(arVar)) {
            aVar.j("FragmentMonitor: missed a fragment trace from %s", arVar.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(arVar);
        weakHashMap.remove(arVar);
        com.google.firebase.perf.e.f fVarB = this.f10270e.b(arVar);
        if (!fVarB.e()) {
            aVar.j("onFragmentPaused: recorder failed to trace %s", arVar.getClass().getSimpleName());
        } else {
            j.a(trace, (com.google.firebase.perf.metrics.e) fVarB.d());
            trace.stop();
        }
    }

    @Override // android.support.a.i
    public final void c(ar arVar) {
        f10266a.c("FragmentMonitor %s.onFragmentResumed", arVar.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(String.valueOf(arVar.getClass().getSimpleName())), this.f10268c, this.f10269d);
        trace.start();
        trace.putAttribute("Parent_fragment", arVar.getParentFragment() == null ? "No parent" : arVar.getParentFragment().getClass().getSimpleName());
        if (arVar.getActivity() != null) {
            trace.putAttribute("Hosting_activity", arVar.getActivity().getClass().getSimpleName());
        }
        this.f10267b.put(arVar, trace);
        this.f10270e.d(arVar);
    }
}
