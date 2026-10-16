package com.waze;

import com.waze.car_lib.screens.core.ScreenPresentable;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class iv implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24833a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24834b;

    public /* synthetic */ iv(Object obj, int i2) {
        this.f24834b = i2;
        this.f24833a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.waze.j.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.waze.ia, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [com.waze.an.a.b, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        com.waze.an.a.j jVarA;
        aVarB = null;
        aVarB = null;
        h.g.a.a aVarB = null;
        switch (this.f24834b) {
            case 0:
                return iz.GetServerEnviornment$lambda$0(this.f24833a, (String) obj);
            case 1:
                return NativeManager.lambda$UrlHandler$1(this.f24833a, (Boolean) obj);
            case 2:
                com.waze.app_nav.a.v vVarA = ((com.waze.app_nav.a.u) obj).a();
                com.waze.app_nav.a.n nVar = (com.waze.app_nav.a.n) this.f24833a;
                vVarA.a(nVar.a(), nVar.b(), nVar.c());
                return h.ab.f48028a;
            case 3:
                String str = (String) obj;
                Object obj2 = this.f24833a;
                com.waze.app_nav.a.ay ayVar = com.waze.app_nav.a.ay.f15122a;
                h.g.b.x.f(str, "it");
                return Boolean.valueOf(h.g.b.x.n(str, obj2));
            case 4:
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                this.f24833a.invoke("AUTOCOMPLETE_MORE_ITEM_ID");
                return h.ab.f48028a;
            case 5:
                ((com.waze.beacons.a.f) this.f24833a).k(((Boolean) obj).booleanValue());
                return h.ab.f48028a;
            case 6:
                this.f24833a.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return h.ab.f48028a;
            case 7:
                this.f24833a.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return h.ab.f48028a;
            case 8:
                this.f24833a.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return h.ab.f48028a;
            case 9:
                this.f24833a.a((h.ab) obj);
                return h.ab.f48028a;
            case 10:
                return com.waze.car_lib.ai.d((com.waze.car_lib.ai) this.f24833a);
            case 11:
                WeakReference weakReference = (WeakReference) obj;
                h.g.b.x.f(weakReference, "it");
                ScreenPresentable screenPresentable = (ScreenPresentable) weakReference.get();
                return Boolean.valueOf(h.g.b.x.n(screenPresentable != null ? screenPresentable.getUuid() : null, this.f24833a));
            case 12:
                com.waze.car_lib.b.v vVar = (com.waze.car_lib.b.v) obj;
                h.g.b.x.f(vVar, "intentAction");
                boolean z = vVar instanceof com.waze.car_lib.b.t;
                Object obj3 = this.f24833a;
                if (z) {
                    com.waze.an.a.i iVar = (com.waze.an.a.i) h.a.i.S(((com.waze.an.a.k) obj3).e(), ((com.waze.car_lib.b.t) vVar).a());
                    if (iVar != null) {
                        aVarB = iVar.i();
                    }
                } else {
                    if (!(vVar instanceof com.waze.car_lib.b.u)) {
                        throw new h.i();
                    }
                    com.waze.alerters.a.a aVarA = ((com.waze.car_lib.b.u) vVar).a();
                    h hVar = h.f24304a;
                    com.waze.alerters.a.a aVar = com.waze.alerters.a.a.f14132a;
                    AlerterController$Alerter$Type alerterController$Alerter$Type = AlerterController$Alerter$Type.UNSPECIFIED;
                    jk jkVar = jk.f24942a;
                    if (aVarA.ordinal() == 0 && (jVarA = ((com.waze.an.a.k) obj3).a()) != null) {
                        aVarB = jVarA.b();
                    }
                }
                if (aVarB != null) {
                    aVarB.invoke();
                }
                return h.ab.f48028a;
            case 13:
                this.f24833a.c((com.waze.alerters.a.a) obj);
                return h.ab.f48028a;
            case 14:
                ((com.waze.car_lib.f.hk) obj).f().h(((com.waze.car_lib.f.m) this.f24833a).a());
                return h.ab.f48028a;
            case 15:
                com.waze.car_lib.f.a aVar2 = (com.waze.car_lib.f.a) obj;
                h.g.b.x.f(aVar2, "$this$startSubCoordinator");
                com.waze.car_lib.a.n nVar2 = (com.waze.car_lib.a.n) this.f24833a;
                com.waze.car_lib.j.d.b(aVar2, nVar2.p(), com.waze.modules.navigation.ah.f30289e, nVar2.q());
                return h.ab.f48028a;
            case 16:
                ((com.waze.car_lib.f.y) obj).f().d(((com.waze.car_lib.f.bh) this.f24833a).a());
                return h.ab.f48028a;
            case 17:
                ((com.waze.car_lib.a.d) obj).f().c(((com.waze.car_lib.f.bp) this.f24833a).a());
                return h.ab.f48028a;
            case 18:
                ((com.waze.car_lib.f.jk) obj).f().a(((com.waze.car_lib.f.br) this.f24833a).a());
                return h.ab.f48028a;
            case 19:
                com.waze.car_lib.f.z zVarF = ((com.waze.car_lib.f.y) obj).f();
                com.waze.car_lib.f.bi biVar = (com.waze.car_lib.f.bi) this.f24833a;
                zVarF.e(biVar.a(), biVar.b(), com.waze.navigate.location_preview.bb.r);
                return h.ab.f48028a;
            default:
                com.waze.car_lib.f.hi hiVar = (com.waze.car_lib.f.hi) this.f24833a;
                com.waze.car_lib.j.d.b((com.waze.car_lib.f.a) obj, hiVar.a(), com.waze.modules.navigation.ah.v, hiVar.b());
                return h.ab.f48028a;
        }
    }
}
