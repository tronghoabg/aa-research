package com.waze.asks;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSize;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.waze.car_lib.r.bl;
import com.waze.car_lib.r.cq;
import com.waze.dx;
import com.waze.jni.protos.asks.WazeAsksTrigger;
import com.waze.main_screen.p.bs;
import com.waze.navigate.NavResultData;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.bk;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ak implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15506b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15507c;

    public /* synthetic */ ak(Object obj, Object obj2, int i2) {
        this.f15507c = i2;
        this.f15505a = obj;
        this.f15506b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) throws IOException {
        Object objD;
        com.waze.car_lib.screens.b.q qVarI;
        boolean z = false;
        switch (this.f15507c) {
            case 0:
                return WazeAsksNativeManager.loadQuestionByTrigger$lambda$1((WazeAsksNativeManager) this.f15505a, (WazeAsksTrigger) this.f15506b, (com.waze.ap.b.l) obj);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.f15505a;
                com.waze.settings.tree.c.f.c((com.waze.settings.tree.d.s) this.f15506b, zBooleanValue, obj2 != null ? ((com.waze.settings.tree.f) obj2).r() : null, null);
                return h.ab.f48028a;
            case 2:
                ((Boolean) obj).booleanValue();
                return bl.h((bl) this.f15505a, (com.waze.settings.f.b.a) this.f15506b);
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                ?? r2 = this.f15506b;
                if (((com.waze.modules.c.ar) h.a.i.S(r2, iIntValue)) != null) {
                    com.waze.car_lib.r.d.x xVar = (com.waze.car_lib.r.d.x) this.f15505a;
                    bn bnVar = xVar.v;
                    do {
                        objD = bnVar.d();
                        qVarI = (cq) objD;
                        if (qVarI instanceof com.waze.car_lib.screens.b.q) {
                            xVar.V((com.waze.modules.c.ar) r2.get(iIntValue), bk.f41094b);
                            xVar.S();
                            qVarI = com.waze.car_lib.screens.b.q.i((com.waze.car_lib.screens.b.q) qVarI, iIntValue, false, 247);
                        }
                    } while (!bnVar.f(objD, qVarI));
                }
                return h.ab.f48028a;
            case 4:
                com.waze.t.c.o oVar = (com.waze.t.c.o) obj;
                h.g.b.x.f(oVar, NotificationCompat.CATEGORY_STATUS);
                com.waze.t.c.o oVar2 = com.waze.t.c.o.f40868a;
                int iOrdinal = oVar.ordinal();
                Object obj3 = this.f15505a;
                if (iOrdinal == 0) {
                    ((com.waze.t.c.k) obj3).c();
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    ((com.waze.t.c.k) obj3).b();
                }
                ?? r0 = this.f15506b;
                ((com.waze.t.c.k) obj3).d(false);
                r0.invoke(oVar);
                return h.ab.f48028a;
            case 5:
                String str = (String) obj;
                h.g.b.x.f(str, "it");
                File file = new File(String.valueOf(str).concat("/voices"));
                String str2 = (String) this.f15506b;
                h.f.s.e(file, new File(str2));
                new File(str2 + ((com.waze.copilot.data.ag) this.f15505a).b().a()).createNewFile();
                return h.ab.f48028a;
            case 6:
                return com.waze.copilot.presentation.n.c((com.waze.copilot.presentation.s) this.f15506b, (com.waze.copilot.presentation.n) this.f15505a, (DisposableEffectScope) obj);
            case 7:
                return com.waze.copilot.presentation.n.g((com.waze.copilot.presentation.n) this.f15505a, (String) this.f15506b, (Context) obj);
            case 8:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj4 = this.f15505a;
                if (obj4 instanceof com.waze.z.a.d.ak) {
                    com.waze.z.a.d.ak akVar = (com.waze.z.a.d.ak) obj4;
                    if (akVar.a() != com.waze.z.a.d.aj.f45920a && akVar.a() != null) {
                        z = true;
                    }
                }
                if (zBooleanValue2 && z) {
                    this.f15506b.invoke();
                }
                return h.ab.f48028a;
            case 9:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ((bs) this.f15506b).B();
                NavController.navigate$default((NavController) this.f15505a, com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.b(zBooleanValue3)), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return h.ab.f48028a;
            case 10:
                com.waze.reports_v2.presentation.a.au auVar = (com.waze.reports_v2.presentation.a.au) obj;
                h.g.b.x.f(auVar, "menu");
                ((com.waze.main_screen.be) this.f15506b).l(auVar);
                NavController.navigate$default((NavController) this.f15505a, com.waze.main_screen.u.b.f.f(com.waze.main_screen.y.c.f27872a), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return h.ab.f48028a;
            case 11:
                com.waze.reports_v2.presentation.a.au auVar2 = (com.waze.reports_v2.presentation.a.au) obj;
                h.g.b.x.f(auVar2, "menu");
                ((com.waze.main_screen.be) this.f15506b).l(auVar2);
                NavController.navigate$default((NavController) this.f15505a, com.waze.main_screen.u.b.f.f(com.waze.main_screen.y.c.f27872a), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return h.ab.f48028a;
            case 12:
                NavGraphBuilder navGraphBuilder = (NavGraphBuilder) obj;
                h.g.b.x.f(navGraphBuilder, "$this$NavHost");
                Object obj5 = this.f15505a;
                NavGraphBuilderKt.composable$default(navGraphBuilder, "preDrive/{preDriveTriggerReason}", h.a.i.h(), (List) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, ComposableLambdaKt.composableLambdaInstance(-1429696783, true, new com.waze.main_screen.l(this.f15506b, obj5, 3)), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "midDrive/{resumeDrive}", h.a.i.d(NamedNavArgumentKt.navArgument("resumeDrive", new com.waze.location.aa(2))), (List) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, ComposableLambdaKt.composableLambdaInstance(-1914071256, true, new dx(obj5, 7)), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, (Object) null);
                return h.ab.f48028a;
            case 13:
                return com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.o.k((com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.o) this.f15505a, (NavResultData) this.f15506b, (String) obj);
            case 14:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                h.g.b.x.f(layoutCoordinates, "it");
                this.f15505a.setValue(Offset.m7969boximpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates)));
                this.f15506b.setValue(IntSize.m11331boximpl(layoutCoordinates.mo9743getSizeYbymL2g()));
                return h.ab.f48028a;
            case 15:
                com.waze.main_screen.g.f fVar = (com.waze.main_screen.g.f) obj;
                h.g.b.x.f(fVar, "view");
                fVar.setOnClickListener(new com.waze.feedback.b(this.f15505a, 15));
                fVar.d();
                com.waze.map.b.ah ahVar = (com.waze.map.b.ah) this.f15506b;
                com.waze.map.b.ag agVarB = ahVar.b();
                com.waze.map.b.ag agVar = com.waze.map.b.ag.f27996a;
                int iOrdinal2 = agVarB.ordinal();
                if (iOrdinal2 == 0) {
                    z = true;
                } else if (iOrdinal2 != 1) {
                    throw new h.i();
                }
                fVar.b(z);
                fVar.c(ahVar.a(), ahVar.c());
                return h.ab.f48028a;
            case 16:
                ((com.waze.ui.p.g) this.f15506b).b(com.waze.map.main.aa.h((com.waze.map.main.aa) this.f15505a, 0, 0, 0, 0, 0, ((Number) ((Animatable) obj).getValue()).intValue(), 0, 95));
                return h.ab.f48028a;
            case 17:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                h.g.b.x.f(layoutCoordinates2, "it");
                ((com.waze.main_screen.p.bf) this.f15505a).h().C(LayoutCoordinatesKt.boundsInRoot(layoutCoordinates2));
                this.f15506b.invoke(LayoutCoordinatesKt.boundsInRoot(layoutCoordinates2));
                return h.ab.f48028a;
            case 18:
                com.waze.location.q qVar = (com.waze.location.q) obj;
                h.g.b.x.f(qVar, "entry");
                if (qVar instanceof com.waze.main_screen.c.p) {
                    ((com.waze.main_screen.p.bf) this.f15505a).H();
                } else if (qVar instanceof com.waze.main_screen.c.o) {
                    this.f15506b.invoke();
                }
                return h.ab.f48028a;
            case 19:
                return com.waze.main_screen.p.a.b.a.ab.p(this.f15505a, this.f15506b, (com.waze.main_screen.bottom_bars.a.b) obj);
            default:
                com.waze.location.q qVar2 = (com.waze.location.q) obj;
                int i2 = com.waze.main_screen.t.al.f27484a;
                h.g.b.x.f(qVar2, "entry");
                if (qVar2 instanceof com.waze.main_screen.c.p) {
                    this.f15505a.invoke();
                } else if (qVar2 instanceof com.waze.main_screen.c.o) {
                    this.f15506b.invoke();
                }
                return h.ab.f48028a;
        }
    }

    public /* synthetic */ ak(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f15507c = i2;
        this.f15506b = obj;
        this.f15505a = obj2;
    }
}
