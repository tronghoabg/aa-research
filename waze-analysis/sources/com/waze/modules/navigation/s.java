package com.waze.modules.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.waze.R;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class s implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f30471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30473c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f30477g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f30478h;

    public /* synthetic */ s(com.waze.ui.a.u uVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar2, h.g.a.a aVar3, h.g.a.a aVar4, int i2) {
        this.f30478h = i2;
        this.f30477g = uVar;
        this.f30476f = lVar;
        this.f30472b = aVar;
        this.f30473c = aVar2;
        this.f30474d = lVar2;
        this.f30471a = aVar3;
        this.f30475e = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v3, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f30478h;
        if (i2 != 0) {
            if (i2 != 1) {
                int iIntValue = ((Integer) obj2).intValue();
                ?? r12 = this.f30475e;
                ?? r11 = this.f30471a;
                ?? r10 = this.f30474d;
                ?? r9 = this.f30473c;
                return com.waze.ui.a.l.b((com.waze.ui.a.u) this.f30477g, this.f30476f, this.f30472b, r9, r10, r11, r12, (Composer) obj, iIntValue);
            }
            Composer composer = (Composer) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            int i3 = iIntValue2 & 3;
            int i4 = iIntValue2 & 1;
            int i5 = com.waze.z.a.c.q.f45886a;
            if (composer.shouldExecute(i3 != 2, i4)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(462068529, iIntValue2, -1, "com.waze.design_components_compose.components.dialog.WazeDialog.<anonymous> (WazeDialog.kt:146)");
                }
                ?? r7 = this.f30474d;
                Object obj3 = this.f30471a;
                h.g.a.p pVar = (h.g.a.p) obj3;
                com.waze.z.a.c.q.f((String) this.f30476f, (com.waze.z.a.c.c) this.f30472b, this.f30477g, (com.waze.z.a.c.h) this.f30475e, (com.waze.z.a.c.f) this.f30473c, pVar, r7, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        if (composer2.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-147930140, iIntValue3, -1, "com.waze.modules.navigation.NavigationServicePopups.showWaypointOrNewDrivePopup.<anonymous>.<anonymous>.<anonymous> (NavigationServicePopups.kt:108)");
            }
            Object obj4 = this.f30477g;
            final ?? r122 = this.f30476f;
            final ?? r102 = this.f30475e;
            final ?? r92 = this.f30474d;
            Object obj5 = this.f30473c;
            Object obj6 = this.f30472b;
            Object obj7 = this.f30471a;
            String strB = com.waze.ui.r.a.c.c.b(R.string.STOP_POINT_QUESTION_ADD_TITLE, composer2, 0);
            final com.waze.z.a.c.d dVar = (com.waze.z.a.c.d) obj6;
            final com.waze.z.a.c.d dVar2 = (com.waze.z.a.c.d) obj5;
            com.waze.z.a.c.a aVar = new com.waze.z.a.c.a(dVar, dVar2);
            boolean zChangedInstance = composer2.changedInstance(obj5) | composer2.changedInstance(obj6) | composer2.changedInstance(r92) | composer2.changed((Object) r102) | composer2.changed((Object) r122) | composer2.changedInstance(obj4);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                final com.waze.app_nav.hub.b.e eVar = (com.waze.app_nav.hub.b.e) obj4;
                com.waze.z.a.c.g gVar = new com.waze.z.a.c.g() { // from class: com.waze.modules.navigation.u
                    @Override // h.g.a.p
                    public final Object invoke(Object obj8, Object obj9) {
                        com.waze.z.a.c.d dVar3 = (com.waze.z.a.c.d) obj9;
                        h.g.b.x.f((com.waze.z.a.c.c) obj8, "<unused var>");
                        h.g.b.x.f(dVar3, "cta");
                        boolean zN = h.g.b.x.n(dVar3, dVar);
                        CompletableDeferred completableDeferred = r92;
                        if (zN) {
                            completableDeferred.a(r102.invoke(false));
                        } else if (h.g.b.x.n(dVar3, dVar2)) {
                            completableDeferred.a(r122.invoke(false));
                        }
                        eVar.b(false);
                        return h.ab.f48028a;
                    }
                };
                composer2.updateRememberedValue(gVar);
                objRememberedValue = gVar;
            }
            if (obj7 == null) {
                obj7 = "";
            }
            com.waze.z.a.c.q.j(strB, (String) obj7, aVar, null, (com.waze.z.a.c.g) objRememberedValue, composer2, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ s(String str, com.waze.z.a.c.c cVar, Modifier modifier, com.waze.z.a.c.h hVar, com.waze.z.a.c.f fVar, com.waze.z.a.c.g gVar, h.g.a.p pVar, int i2) {
        this.f30478h = i2;
        this.f30476f = str;
        this.f30472b = cVar;
        this.f30477g = modifier;
        this.f30475e = hVar;
        this.f30473c = fVar;
        this.f30471a = gVar;
        this.f30474d = pVar;
    }

    public /* synthetic */ s(String str, com.waze.z.a.c.d dVar, com.waze.z.a.c.d dVar2, CompletableDeferred completableDeferred, h.g.a.l lVar, h.g.a.l lVar2, com.waze.app_nav.hub.b.e eVar, int i2) {
        this.f30478h = i2;
        this.f30471a = str;
        this.f30472b = dVar;
        this.f30473c = dVar2;
        this.f30474d = completableDeferred;
        this.f30475e = lVar;
        this.f30476f = lVar2;
        this.f30477g = eVar;
    }
}
