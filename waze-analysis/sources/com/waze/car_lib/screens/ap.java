package com.waze.car_lib.screens;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.car.app.CarContext;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.car.app.suggestion.SuggestionManager;
import androidx.car.app.suggestion.model.Suggestion;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import com.waze.car_lib.p.dh;
import com.waze.gw.AaStartStateTimeoutObserver;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ap extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final PlaceListNavigationTemplate f21778a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f21779b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bw.a.b.b f21780c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.r.bk f21781d;

    /* renamed from: e, reason: collision with root package name */
    public final com.waze.car_lib.f.ax f21782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(com.waze.car_lib.f.ax axVar, CarContext carContext) {
        super(carContext, "MapScreen");
        h.g.b.x.f(axVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        this.f21782e = axVar;
        this.f21778a = dh.C();
        this.f21779b = h.g.b(h.h.f48130a, new n((org.a.d.a.a) this, 9));
        this.f21780c = new com.waze.bw.a.b.b(new am(this, 0));
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.bk bkVarA = ((com.waze.car_lib.r.bl) bVarL.a(new h.g.b.m(com.waze.car_lib.r.bl.class), null, null)).a(axVar);
        this.f21781d = bkVarA;
        s(bkVarA, bkVarA.e(), axVar, new c(bkVarA, 20, (char[]) null, (byte[]) null), new an((Object) bkVarA, 1, (byte[]) null));
        ap apVar = this;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(apVar);
        Lifecycle lifecycle = getLifecycle();
        h.g.b.x.e(lifecycle, "<get-lifecycle>(...)");
        bkVarA.t(lifecycleScope, lifecycle, carContext);
        bkVarA.a().observe(apVar, new g((h.g.a.l) new al(this, axVar, 0), 8, (char[][]) null));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.waze.INTENT_ACTION_START_STATE_HOME");
        intentFilter.addAction("com.waze.INTENT_ACTION_START_STATE_WORK");
        getLifecycle().addObserver(new ao(this, intentFilter));
        getLifecycle().addObserver(new AaStartStateTimeoutObserver(this));
    }

    static final h.ab c(ap apVar, com.waze.car_lib.f.ax axVar, com.waze.car_lib.p.ao aoVar) {
        Object objA;
        h.g.b.x.c(aoVar);
        com.waze.car_lib.r.bk bkVar = apVar.f21781d;
        apVar.s(bkVar, aoVar, axVar, new an(bkVar, 0), new an((Object) bkVar, 2, (byte[]) null));
        com.waze.bw.a.c.r rVarB = aoVar.b();
        SuggestionManager suggestionManager = (SuggestionManager) apVar.getCarContext().getCarService(SuggestionManager.class);
        if (rVarB != null) {
            try {
                suggestionManager.updateSuggestions((rVarB.g() && rVarB.i()) ? h.a.i.i(apVar.k(apVar.r().c(R.string.HOME, new Object[0]), com.waze.design_components.b.d.f23304e, "com.waze.INTENT_ACTION_START_STATE_HOME"), apVar.k(apVar.r().c(R.string.WORK, new Object[0]), com.waze.design_components.b.d.f23309j, "com.waze.INTENT_ACTION_START_STATE_WORK")) : (!rVarB.g() || rVarB.i()) ? (rVarB.g() || !rVarB.i()) ? h.a.i.h() : h.a.i.d(apVar.k(apVar.r().c(R.string.WORK, new Object[0]), com.waze.design_components.b.d.f23309j, "com.waze.INTENT_ACTION_START_STATE_WORK")) : h.a.i.d(apVar.k(apVar.r().c(R.string.HOME, new Object[0]), com.waze.design_components.b.d.f23304e, "com.waze.INTENT_ACTION_START_STATE_HOME")));
                objA = h.ab.f48028a;
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            Throwable thC = h.m.c(objA);
            if (thC != null) {
                com.waze.shared_infra.i.h.e("MapScreen failed to update suggestions", thC);
            }
        }
        return h.ab.f48028a;
    }

    static final h.ab d(ap apVar, com.waze.bw.a.b.a aVar) {
        h.g.b.x.f(aVar, "it");
        com.waze.bw.a.b.a aVar2 = com.waze.bw.a.b.a.f17566a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            apVar.f21781d.x().o(com.waze.bw.a.b.f.f17574a);
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            apVar.f21781d.x().o(com.waze.bw.a.b.j.f17578a);
        }
        return h.ab.f48028a;
    }

    static final h.ab e(ap apVar, com.waze.car_lib.f.ax axVar) {
        apVar.n().a(new com.waze.alerters.b.f(axVar, 5));
        return h.ab.f48028a;
    }

    static final h.ab f(ap apVar, com.waze.car_lib.r.bk bkVar) {
        apVar.n().a(new an(bkVar, 5, (boolean[]) null));
        return h.ab.f48028a;
    }

    static final h.ab g(ap apVar, com.waze.car_lib.r.bk bkVar) {
        apVar.n().a(new an(bkVar, 6, (float[]) null));
        return h.ab.f48028a;
    }

    static final h.ab h(ap apVar, com.waze.car_lib.r.bk bkVar) {
        apVar.n().a(new an((Object) bkVar, 7, (byte[][]) null));
        return h.ab.f48028a;
    }

    static final h.ab i(ap apVar, com.waze.car_lib.f.ax axVar) {
        apVar.n().a(new com.waze.alerters.b.f(axVar, 6));
        return h.ab.f48028a;
    }

    static final h.ab j(ap apVar, com.waze.car_lib.r.bk bkVar) {
        apVar.n().a(new an((Object) bkVar, 3, (short[]) null));
        return h.ab.f48028a;
    }

    private final Suggestion k(String str, com.waze.design_components.b.d dVar, String str2) {
        int color = ContextCompat.getColor(getCarContext(), R.color.always_white);
        CarIcon.Builder builder = new CarIcon.Builder(IconCompat.createWithResource(getCarContext(), dVar.b()));
        builder.setTint(CarColor.createCustom(color, color));
        CarIcon carIconBuild = builder.build();
        Suggestion.Builder builder2 = new Suggestion.Builder();
        builder2.setIdentifier(str2);
        builder2.setIcon(carIconBuild);
        builder2.setTitle(str);
        builder2.setSubtitle("");
        builder2.setAction(PendingIntent.getBroadcast(getCarContext(), 1, new Intent(str2), 67108864));
        Suggestion suggestionBuild = builder2.build();
        h.g.b.x.e(suggestionBuild, "build(...)");
        return suggestionBuild;
    }

    private final com.waze.shared_infra.o.a r() {
        return (com.waze.shared_infra.o.a) this.f21779b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(com.waze.car_lib.r.bk r29, com.waze.car_lib.p.ao r30, com.waze.car_lib.f.ax r31, h.g.a.a r32, h.g.a.a r33) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.screens.ap.s(com.waze.car_lib.r.bk, com.waze.car_lib.p.ao, com.waze.car_lib.f.ax, h.g.a.a, h.g.a.a):void");
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21778a;
    }
}
