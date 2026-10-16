package com.waze.car_lib.o;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.Ref;
import com.airbnb.lottie.LottieAnimationView;
import com.waze.R;
import com.waze.jni.protos.search.CategoryProductResult;
import com.waze.jni.protos.search.CategoryProductsResult;
import com.waze.reports_v2.presentation.ap;
import com.waze.search.aq;
import com.waze.search.as;
import com.waze.search.at;
import com.waze.search.ax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ab implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20456a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20457b;

    public /* synthetic */ ab(Object obj, int i2) {
        this.f20457b = i2;
        this.f20456a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r10v67, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v72, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v74, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        com.waze.av.c.c cVar;
        switch (this.f20457b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                com.waze.settings.tree.d.d dVar = (com.waze.settings.tree.d.d) this.f20456a;
                dVar.d((com.waze.settings.tree.d.g) dVar.H().get(iIntValue), new ad(dVar));
                break;
            case 1:
                this.f20456a.a((com.waze.sharedui.e.c) obj);
                break;
            case 2:
                this.f20456a.a((com.waze.sharedui.e.c) obj);
                break;
            case 3:
                com.waze.search.v2.o oVar = (com.waze.search.v2.o) obj;
                h.g.b.x.f(oVar, "it");
                ((com.waze.reports_v2.a.a.a.b) this.f20456a).k(oVar.c());
                break;
            case 4:
                ap.s((ap) this.f20456a, (Runnable) obj);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                Context context = (Context) obj;
                h.g.b.x.f(context, "context");
                LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
                lottieAnimationView.k(R.raw.lottie_anim_points_with_text);
                ((com.waze.reports_v2.presentation.a.k) this.f20456a).c(lottieAnimationView);
                break;
            case 9:
                Context context2 = (Context) obj;
                h.g.b.x.f(context2, "it");
                ap apVar = new ap(context2);
                ((Ref) this.f20456a).setValue(apVar);
                apVar.n();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                i.b.n.a.o oVar2 = (i.b.n.a.o) obj;
                h.g.b.x.f(oVar2, "$this$add");
                Object obj2 = this.f20456a;
                i.b.n.a.aa aaVarNewBuilder = i.b.n.a.ab.newBuilder();
                aaVarNewBuilder.a((String) obj2);
                oVar2.l(aaVarNewBuilder.build());
                break;
            case 13:
                i.b.n.a.o oVar3 = (i.b.n.a.o) obj;
                h.g.b.x.f(oVar3, "$this$add");
                Object obj3 = this.f20456a;
                i.b.n.a.m mVarNewBuilder = i.b.n.a.n.newBuilder();
                mVarNewBuilder.a(((as) obj3).p());
                oVar3.a(mVarNewBuilder.build());
                break;
            case 14:
                i.b.n.a.o oVar4 = (i.b.n.a.o) obj;
                h.g.b.x.f(oVar4, "$this$add");
                Object obj4 = this.f20456a;
                i.b.n.a.y yVarNewBuilder = i.b.n.a.z.newBuilder();
                yVarNewBuilder.a(((at) obj4).p());
                oVar4.j(yVarNewBuilder.build());
                break;
            case 15:
                i.b.n.a.o oVar5 = (i.b.n.a.o) obj;
                h.g.b.x.f(oVar5, "$this$add");
                Object obj5 = this.f20456a;
                i.b.n.a.r rVarNewBuilder = i.b.n.a.s.newBuilder();
                rVarNewBuilder.a(((aq) obj5).p());
                oVar5.d(rVarNewBuilder.build());
                break;
            case 16:
                i.b.n.a.o oVar6 = (i.b.n.a.o) obj;
                h.g.b.x.f(oVar6, "$this$add");
                Object obj6 = this.f20456a;
                i.b.n.a.t tVarNewBuilder = i.b.n.a.u.newBuilder();
                tVarNewBuilder.a(((com.waze.search.ap) obj6).p());
                oVar6.e(tVarNewBuilder.build());
                break;
            case 17:
                i.b.n.a.o oVar7 = (i.b.n.a.o) obj;
                h.g.b.x.f(oVar7, "$this$add");
                Object obj7 = this.f20456a;
                i.b.n.a.w wVarNewBuilder = i.b.n.a.x.newBuilder();
                wVarNewBuilder.a(((ax) obj7).p());
                oVar7.i(wVarNewBuilder.build());
                break;
            case 18:
                LazyListScope lazyListScope = (LazyListScope) obj;
                h.g.b.x.f(lazyListScope, "$this$LazyColumn");
                com.waze.search.a.a aVar = new com.waze.search.a.a(3);
                ?? r10 = this.f20456a;
                lazyListScope.items(r10.size(), new com.waze.search.a.g(aVar, r10), new com.waze.search.a.h(r10), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new com.waze.search.a.i(r10)));
                break;
            case 19:
                com.waze.search.d.a.a.a aVar2 = (com.waze.search.d.a.a.a) obj;
                h.g.b.x.f(aVar2, "it");
                this.f20456a.invoke(aVar2);
                break;
            default:
                CategoryProductsResult defaultInstance = (CategoryProductsResult) obj;
                if (defaultInstance == null) {
                    defaultInstance = CategoryProductsResult.getDefaultInstance();
                }
                List<CategoryProductResult> productList = defaultInstance.getProductList();
                h.g.b.x.e(productList, "getProductList(...)");
                ArrayList arrayList = new ArrayList();
                for (CategoryProductResult categoryProductResult : productList) {
                    h.g.b.x.c(categoryProductResult);
                    h.g.b.x.f(categoryProductResult, "<this>");
                    if (categoryProductResult.hasId() && categoryProductResult.hasLabel()) {
                        String id = categoryProductResult.getId();
                        h.g.b.x.e(id, "getId(...)");
                        String label = categoryProductResult.getLabel();
                        h.g.b.x.e(label, "getLabel(...)");
                        String type = categoryProductResult.getType();
                        h.g.b.x.e(type, "getType(...)");
                        String priceFormat = categoryProductResult.getPriceFormat();
                        h.g.b.x.e(priceFormat, "getPriceFormat(...)");
                        cVar = new com.waze.av.c.c(id, label, priceFormat, type, categoryProductResult.hasIcon() ? categoryProductResult.getIcon() : null);
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
                this.f20456a.invoke(arrayList);
                break;
        }
        return h.ab.f48028a;
    }
}
