package com.waze.asks;

import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.core.text.HtmlCompat;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import com.waze.google_assistant.SpeechRecognizerActivity;
import com.waze.navigate.ek;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ax implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15550a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15551b;

    public /* synthetic */ ax(Object obj, int i2) {
        this.f15551b = i2;
        this.f15550a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v68, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v70, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        char c2 = 1;
        char c3 = 1;
        switch (this.f15551b) {
            case 0:
                return bj.k((bj) this.f15550a);
            case 1:
                com.google.android.gms.location.i iVarB = ((com.google.android.gms.location.g) obj).b();
                this.f15550a.a(new com.waze.location.h(iVarB != null && iVarB.a()));
                return h.ab.f48028a;
            case 2:
                this.f15550a.a((Boolean) obj);
                return h.ab.f48028a;
            case 3:
                TextView textView = (TextView) obj;
                h.g.b.x.f(textView, "it");
                textView.setText(HtmlCompat.fromHtml((String) this.f15550a, 63));
                return h.ab.f48028a;
            case 4:
                com.waze.shared_infra.r.q qVar = (com.waze.shared_infra.r.q) obj;
                com.waze.at.a.b.b((com.waze.at.a.b) this.f15550a, qVar.b(), qVar.a());
                return h.ab.f48028a;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.f15550a;
                if (zBooleanValue) {
                    ((NavController) obj2).navigate(com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.g(com.waze.main_screen.y.f.f27878d)), (h.g.a.l<? super NavOptionsBuilder, h.ab>) new ax(obj2, 8));
                } else {
                    ((NavController) obj2).popBackStack();
                }
                return h.ab.f48028a;
            case 6:
                com.waze.reports_v2.presentation.a.at atVar = (com.waze.reports_v2.presentation.a.at) obj;
                h.g.b.x.f(atVar, "laterButton");
                ((com.waze.main_screen.be) this.f15550a).g().d(atVar);
                return h.ab.f48028a;
            case 7:
                ek ekVar = (ek) obj;
                h.g.b.x.f(ekVar, "reason");
                com.waze.main_screen.y.f fVarE = com.waze.main_screen.u.b.f.e(ekVar);
                if (fVarE != null) {
                    ((NavController) this.f15550a).navigate(com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.g(fVarE)), (h.g.a.l<? super NavOptionsBuilder, h.ab>) new com.waze.install.c(13));
                }
                return h.ab.f48028a;
            case 8:
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                h.g.b.x.f(navOptionsBuilder, "$this$navigate");
                navOptionsBuilder.popUpTo(((NavController) this.f15550a).getGraph().getId(), new com.waze.install.c(14));
                return h.ab.f48028a;
            case 9:
                ek ekVar2 = (ek) obj;
                h.g.b.x.f(ekVar2, "reason");
                com.waze.main_screen.y.f fVarE2 = com.waze.main_screen.u.b.f.e(ekVar2);
                if (fVarE2 != null) {
                    ((NavController) this.f15550a).navigate(com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.g(fVarE2)), (h.g.a.l<? super NavOptionsBuilder, h.ab>) new com.waze.install.c(12));
                }
                return h.ab.f48028a;
            case 10:
                com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) obj;
                h.g.b.x.f(cVar, "parkingLocation");
                NavController.navigate$default((NavController) this.f15550a, com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.h(cVar)), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return h.ab.f48028a;
            case 11:
                String str = (String) obj;
                h.g.b.x.f(str, "adId");
                NavController.navigate$default((NavController) this.f15550a, com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.a(str)), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return h.ab.f48028a;
            case 12:
                ((NavController) this.f15550a).navigate(com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.e(((Boolean) obj).booleanValue())), (h.g.a.l<? super NavOptionsBuilder, h.ab>) new com.waze.install.c(15));
                return h.ab.f48028a;
            case 13:
                com.waze.sharedrive.g.c cVar2 = (com.waze.sharedrive.g.c) obj;
                if (!(cVar2 instanceof com.waze.sharedrive.g.a) && !(cVar2 instanceof com.waze.sharedrive.g.b) && cVar2 != null) {
                    throw new h.i();
                }
                ((NavController) this.f15550a).popBackStack();
                return h.ab.f48028a;
            case 14:
                ActivityResult activityResult = (ActivityResult) obj;
                h.g.b.x.f(activityResult, "result");
                SpeechRecognizerActivity.s(activityResult.getResultCode(), activityResult.getData(), new com.waze.search.f.c(this.f15550a, c2 == true ? 1 : 0));
                return h.ab.f48028a;
            case 15:
                ((com.waze.main_screen.ab) this.f15550a).m(new com.waze.bw.c.d.aj(((Boolean) obj).booleanValue()));
                return h.ab.f48028a;
            case 16:
                NavOptionsBuilder navOptionsBuilder2 = (NavOptionsBuilder) obj;
                h.g.b.x.f(navOptionsBuilder2, "$this$navigate");
                navOptionsBuilder2.popUpTo(((NavController) this.f15550a).getGraph().getId(), new com.waze.location.aa(c3 == true ? 1 : 0));
                return h.ab.f48028a;
            case 17:
                ek ekVar3 = (ek) obj;
                h.g.b.x.f(ekVar3, "reason");
                com.waze.main_screen.y.f fVarE3 = com.waze.main_screen.u.b.f.e(ekVar3);
                if (fVarE3 != null) {
                    Object obj3 = this.f15550a;
                    ((NavController) obj3).navigate(com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.g(fVarE3)), (h.g.a.l<? super NavOptionsBuilder, h.ab>) new ax(obj3, 16));
                }
                return h.ab.f48028a;
            case 18:
                NavOptionsBuilder navOptionsBuilder3 = (NavOptionsBuilder) obj;
                h.g.b.x.f(navOptionsBuilder3, "$this$navigate");
                navOptionsBuilder3.popUpTo(((NavController) this.f15550a).getGraph().getId(), new com.waze.location.aa(3));
                return h.ab.f48028a;
            case 19:
                com.waze.location.q qVar2 = (com.waze.location.q) obj;
                h.g.b.x.f(qVar2, "it");
                ?? r6 = this.f15550a;
                if (r6 != 0) {
                    r6.invoke(qVar2);
                }
                return h.ab.f48028a;
            default:
                com.waze.location.q qVar3 = (com.waze.location.q) obj;
                h.g.b.x.f(qVar3, "it");
                ?? r62 = this.f15550a;
                if (r62 != 0) {
                    r62.invoke(qVar3);
                }
                return h.ab.f48028a;
        }
    }
}
