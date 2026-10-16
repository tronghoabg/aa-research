package com.airbnb.lottie.b;

import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.core.view.ViewCompat;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.waze.R;
import com.waze.av;
import com.waze.c.e.bk;
import com.waze.config.ConfigValues;
import com.waze.design_components.cta_bar.CallToActionBar;
import com.waze.dx;
import com.waze.em;
import com.waze.eo;
import com.waze.ep;
import com.waze.eq;
import com.waze.ix;
import com.waze.jni.protos.VenueCategoryGroups;
import com.waze.ni;
import com.waze.sharedui.web.as;
import com.waze.strings.DisplayStrings;
import h.g.b.ar;
import i.b.l.il;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2070a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f2071b;

    public /* synthetic */ q(Object obj, int i2) {
        this.f2071b = i2;
        this.f2070a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r0v83, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        int i2 = 1;
        int i3 = 0;
        switch (this.f2071b) {
            case 0:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                h.g.b.x.f(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) this.f2070a, 0, 0, 0.0f, 4, null);
                return h.ab.f48028a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                h.g.b.x.f(entry, "entry");
                return Boolean.valueOf(h.a.i.ax((Iterable) this.f2070a, ViewCompat.getTransitionName((View) entry.getValue())));
            case 2:
                h.g.b.x.f((com.airbnb.lottie.h.b) obj, "it");
                return this.f2070a;
            case 3:
                NavGraphBuilder navGraphBuilder = (NavGraphBuilder) obj;
                h.g.b.x.f(navGraphBuilder, "$this$NavHost");
                List listD = h.a.i.d(NamedNavArgumentKt.navArgument("isProjected", new com.google.firebase.sessions.x(4)));
                Object obj2 = this.f2070a;
                NavGraphBuilderKt.composable$default(navGraphBuilder, "forceUpgrade/{isProjected}", listD, (List) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, ComposableLambdaKt.composableLambdaInstance(-226063404, true, new dx(obj2, 2)), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, ix.d(em.f23661a), h.a.i.h(), (List) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, ComposableLambdaKt.composableLambdaInstance(-1224240277, true, new dx(obj2, i2)), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, (Object) null);
                String strD = ix.d(ep.f23664a);
                List listH = h.a.i.h();
                int i4 = av.f15779a;
                NavGraphBuilderKt.composable$default(navGraphBuilder, strD, listH, (List) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, av.b(), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, ix.d(eq.f23665a), h.a.i.h(), (List) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, ComposableLambdaKt.composableLambdaInstance(-871380870, true, new dx(obj2, i3)), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, ix.d(eo.f23663a), h.a.i.h(), (List) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, (h.g.a.l) null, av.a(), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, (Object) null);
                return h.ab.f48028a;
            case 4:
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                h.g.b.x.f(navOptionsBuilder, "$this$navigate");
                navOptionsBuilder.popUpTo(((NavController) this.f2070a).getGraph().getId(), new com.google.firebase.sessions.x(5));
                navOptionsBuilder.setLaunchSingleTop(true);
                return h.ab.f48028a;
            case 5:
                this.f2070a.a((String) obj);
                return h.ab.f48028a;
            case 6:
                this.f2070a.a((VenueCategoryGroups) obj);
                return h.ab.f48028a;
            case 7:
                long jLongValue = ((Long) obj).longValue();
                org.a.d.a.a aVar = (org.a.d.a.a) this.f2070a;
                if (aVar instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) aVar).l();
                    int i5 = ar.f48106a;
                    mVar = new h.g.b.m(com.waze.crash.c.class);
                } else {
                    bVarC = aVar.getKoin().a().c();
                    int i6 = ar.f48106a;
                    mVar = new h.g.b.m(com.waze.crash.c.class);
                }
                ((com.waze.crash.c) bVarC.a(mVar, null, null)).l(jLongValue);
                return h.ab.f48028a;
            case 8:
                return ni.e((org.a.d.g.a) this.f2070a, (e.a.dx) obj);
            case 9:
                as.c((as) ((com.waze.settings.q) this.f2070a).f37449a, (il) obj);
                return h.ab.f48028a;
            case 10:
                ((TextView) ((android.support.v4.app.ar) this.f2070a).requireView().findViewById(R.id.dateOfBirthCta)).setText((String) obj);
                return h.ab.f48028a;
            case 11:
                Integer num = (Integer) obj;
                android.support.v4.app.ar arVar = (android.support.v4.app.ar) this.f2070a;
                TextView textView = (TextView) arVar.requireView().findViewById(R.id.dateOfBirthAlertText);
                if (num == null) {
                    textView.setVisibility(8);
                    return h.ab.f48028a;
                }
                TextView textView2 = (TextView) arVar.requireView().findViewById(R.id.dateOfBirthCta);
                View viewFindViewById = arVar.requireView().findViewById(R.id.dateOfBirthError);
                textView.setVisibility(0);
                if (com.waze.trip_overview.views.l.c(num.intValue())) {
                    h.g.b.x.c(viewFindViewById);
                    h.g.b.x.c(textView2);
                    h.g.b.x.c(textView);
                    num.intValue();
                    viewFindViewById.setVisibility(8);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    textView.setText(com.waze.shared_infra.o.b.a().c(R.string.U16_REQUEST_AGE_SCREEN_MESSAGE_VALID_AGE_PD, num));
                    textView.setTextColor(arVar.requireContext().getColor(R.color.content_default));
                } else {
                    h.g.b.x.c(viewFindViewById);
                    h.g.b.x.c(textView2);
                    h.g.b.x.c(textView);
                    int iIntValue = num.intValue();
                    viewFindViewById.setVisibility(0);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_outline_alerts_24px, 0);
                    Long lB = ConfigValues.CONFIG_VALUE_U16_MAXIMUM_VALID_AGE.b();
                    textView.setText(((long) iIntValue) > lB.longValue() ? com.waze.shared_infra.o.b.a().c(R.string.U16_REQUEST_AGE_SCREEN_WARNING_ABOVE_REAL_AGE_PD, lB) : com.waze.shared_infra.o.b.a().c(R.string.U16_REQUEST_AGE_SCREEN_WARNING_UNDER_ALLOWED_AGE_PD, num));
                    textView.setTextColor(arVar.requireContext().getColor(R.color.alarming_variant));
                }
                return h.ab.f48028a;
            case 12:
                Boolean bool = (Boolean) obj;
                h.g.b.x.c(bool);
                ((CallToActionBar) this.f2070a).e(bool.booleanValue());
                return h.ab.f48028a;
            case 13:
                com.waze.shared_infra.q.i iVar = (com.waze.shared_infra.q.i) obj;
                h.g.b.x.f(iVar, "birthdate");
                ((com.waze.a.e) this.f2070a).c(new com.waze.a.a.h(iVar));
                return h.ab.f48028a;
            case 14:
                com.waze.calendar.b bVar = (com.waze.calendar.b) obj;
                h.g.b.x.f(bVar, "it");
                boolean z = bVar instanceof com.waze.a.x;
                Object obj3 = this.f2070a;
                if (z) {
                    com.waze.uid.stats.s sVarC = com.waze.uid.d.q.f44463a.a().c();
                    com.waze.uid.stats.c cVar = com.waze.uid.stats.c.f44728b;
                    com.waze.uid.stats.b bVarB = ((com.waze.a.e) obj3).b();
                    com.waze.a.x xVar = (com.waze.a.x) bVar;
                    com.waze.shared_infra.q.i iVarA = xVar.a();
                    Long lValueOf = iVarA != null ? Long.valueOf(iVarA.b()) : null;
                    com.waze.shared_infra.q.i iVarA2 = xVar.a();
                    if (iVarA2 == null) {
                        int i7 = com.waze.shared_infra.q.i.f37938a;
                        iVarA2 = com.waze.settings.h.c.d();
                    }
                    com.waze.ui.w.ai.p(sVarC, bVarB, cVar, lValueOf, Boolean.valueOf(com.waze.trip_overview.views.l.c(com.waze.trip_overview.views.l.b(iVarA2))), 4);
                } else if (bVar instanceof com.waze.a.s) {
                    com.waze.ui.w.ai.o(com.waze.uid.d.q.f44463a.a().c(), ((com.waze.a.e) obj3).b(), com.waze.uid.stats.c.f44728b, com.waze.a.af.a((com.waze.a.s) bVar), bVar instanceof com.waze.a.r ? Long.valueOf(((com.waze.a.r) bVar).a().b()) : null, 8);
                } else if (bVar instanceof com.waze.a.m) {
                    com.waze.ui.w.ai.r(com.waze.uid.d.q.f44463a.a().c(), Long.valueOf(((com.waze.a.m) bVar).a().b()), ((com.waze.a.e) obj3).b(), com.waze.uid.stats.c.f44728b, 8);
                } else if (bVar instanceof com.waze.a.l) {
                    com.waze.ui.w.ai.q(com.waze.uid.d.q.f44463a.a().c(), com.waze.a.af.b((com.waze.a.l) bVar), ((com.waze.a.e) obj3).b(), com.waze.uid.stats.c.f44728b, 17);
                }
                return h.ab.f48028a;
            case 15:
                ActivityResult activityResult = (ActivityResult) obj;
                h.g.b.x.f(activityResult, "result");
                if (activityResult.getResultCode() != 0) {
                    this.f2070a.invoke();
                }
                return h.ab.f48028a;
            case 16:
                com.waze.shared_infra.q.i iVar2 = (com.waze.shared_infra.q.i) obj;
                h.g.b.x.f(iVar2, "birthdate");
                ((com.waze.a.e) this.f2070a).c(new com.waze.a.a.h(iVar2));
                return h.ab.f48028a;
            case 17:
                ((com.waze.c.e.k) this.f2070a).e();
                return h.ab.f48028a;
            case 18:
                Rect rect = (Rect) obj;
                h.g.b.x.f(rect, "it");
                ((bk) this.f2070a).m(rect);
                return h.ab.f48028a;
            case 19:
                String str = (String) obj;
                h.g.b.x.f(str, "it");
                ((bk) this.f2070a).r(str);
                return h.ab.f48028a;
            default:
                return com.waze.c.e.a.t.l((com.waze.c.e.a.t) this.f2070a, (com.waze.modules.c.ar) obj);
        }
    }
}
