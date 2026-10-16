package com.waze.navigate.location_preview;

import android.content.Context;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.waze.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    private final android.support.v4.app.ar f31650a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.p f31651b;

    /* renamed from: c, reason: collision with root package name */
    private Map f31652c;

    public bk(android.support.v4.app.ar arVar, h.g.a.p pVar) {
        h.g.b.x.f(arVar, "fragment");
        h.g.b.x.f(pVar, "onActivityFinished");
        this.f31650a = arVar;
        this.f31651b = pVar;
    }

    public static /* synthetic */ void a(bk bkVar, com.waze.ui.m.z zVar, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "result");
        bkVar.f31651b.invoke(zVar, activityResult);
    }

    public final void b() {
        h.d.a aVarA = com.waze.ui.m.z.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(aVarA, 10)), 16));
        for (Object obj : aVarA) {
            final com.waze.ui.m.z zVar = (com.waze.ui.m.z) obj;
            linkedHashMap.put(obj, this.f31650a.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.waze.navigate.location_preview.bj
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj2) {
                    bk.a(this.f31648a, zVar, (ActivityResult) obj2);
                }
            }));
        }
        this.f31652c = linkedHashMap;
    }

    public final void c() {
        Map map = this.f31652c;
        if (map == null) {
            h.g.b.x.j("intentLaunchers");
            map = null;
        }
        this.f31652c = h.a.r.j();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((ActivityResultLauncher) it.next()).unregister();
        }
    }

    public final void d(com.waze.reports_v2.c.a aVar) {
        h.g.b.x.f(aVar, "request");
        boolean z = aVar instanceof bx;
        android.support.v4.app.ar arVar = this.f31650a;
        Map map = null;
        if (z) {
            Context context = arVar.getContext();
            if (context != null) {
                Map map2 = this.f31652c;
                if (map2 == null) {
                    h.g.b.x.j("intentLaunchers");
                } else {
                    map = map2;
                }
                bx bxVar = (bx) aVar;
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) map.get(bxVar.c());
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(bxVar.a(context));
                    return;
                }
                return;
            }
            return;
        }
        if (aVar instanceof by) {
            Map map3 = this.f31652c;
            if (map3 == null) {
                h.g.b.x.j("intentLaunchers");
            } else {
                map = map3;
            }
            by byVar = (by) aVar;
            ActivityResultLauncher activityResultLauncher2 = (ActivityResultLauncher) map.get(byVar.a());
            if (activityResultLauncher2 != null) {
                h.g.a.l lVarB = byVar.b();
                android.support.v4.app.av avVarRequireActivity = arVar.requireActivity();
                h.g.b.x.e(avVarRequireActivity, "requireActivity(...)");
                activityResultLauncher2.launch(lVarB.invoke(avVarRequireActivity));
                return;
            }
            return;
        }
        if (h.g.b.x.n(aVar, ca.f31711a)) {
            android.support.v4.app.av activity = arVar.getActivity();
            if (activity != null) {
                com.waze.design_components.d.a(activity, com.waze.shared_infra.o.b.a().c(R.string.REPORT_PLACE_THANK_YOU, new Object[0]), null);
                return;
            }
            return;
        }
        if (aVar instanceof bz) {
            Context context2 = arVar.getContext();
            if (context2 != null) {
                Map map4 = this.f31652c;
                if (map4 == null) {
                    h.g.b.x.j("intentLaunchers");
                } else {
                    map = map4;
                }
                ActivityResultLauncher activityResultLauncher3 = (ActivityResultLauncher) map.get(com.waze.ui.m.z.f43048a);
                if (activityResultLauncher3 != null) {
                    activityResultLauncher3.launch(((bz) aVar).a().a(context2));
                    return;
                }
                return;
            }
            return;
        }
        if (aVar instanceof cb) {
            android.support.v4.app.av activity2 = arVar.getActivity();
            if (activity2 != null) {
                ((cb) aVar).a().invoke(activity2);
                return;
            }
            return;
        }
        if (!(aVar instanceof bw)) {
            throw new h.i();
        }
        android.support.v4.app.av activity3 = arVar.getActivity();
        if (activity3 != null) {
            bw bwVar = (bw) aVar;
            if (bwVar.b() != null) {
                activity3.setResult(bwVar.a(), bwVar.b());
            } else {
                activity3.setResult(bwVar.a());
            }
            if (activity3 instanceof LocationPreviewActivity) {
                ((LocationPreviewActivity) activity3).s(bwVar.d());
            } else {
                Log.e("LocationPreviewUIRequestHandler", "Activity doesn't implement LocationPreviewEventsHandler");
                activity3.finish();
            }
        }
    }
}
