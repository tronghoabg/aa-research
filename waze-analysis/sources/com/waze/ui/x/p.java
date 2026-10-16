package com.waze.ui.x;

import android.content.Context;
import android.support.v4.app.ar;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.waze.R;
import com.waze.navigate.ah;
import com.waze.sharedui.views.OvalButton;
import com.waze.ui.af.ap;
import com.waze.uid.activities.UidFragmentActivity;
import com.waze.uid.c.as;
import com.waze.uid.c.w;
import com.waze.uid.state_impl.util.InstallParameters;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class p implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f43828a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f43829b;

    public /* synthetic */ p(Object obj, int i2) {
        this.f43829b = i2;
        this.f43828a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v51, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        Object obj2 = null;
        switch (this.f43829b) {
            case 0:
                this.f43828a.invoke(new i(((Boolean) obj).booleanValue()));
                return ab.f48028a;
            case 1:
                return d.f(this.f43828a, ((Boolean) obj).booleanValue());
            case 2:
                this.f43828a.invoke(new h(((Boolean) obj).booleanValue()));
                return ab.f48028a;
            case 3:
                x.f((ModalBottomSheetValue) obj, "it");
                a.a.q(this.f43828a).invoke(new k(j.f43817a));
                return true;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ?? r8 = this.f43828a;
                if (r8 != 0) {
                    r8.invoke(bool);
                }
                return ab.f48028a;
            case 5:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                x.f(layoutCoordinates, "layoutCoordinates");
                this.f43828a.setValue(LayoutCoordinatesKt.boundsInRoot(layoutCoordinates));
                return ab.f48028a;
            case 6:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                x.f(graphicsLayerScope, "$this$graphicsLayer");
                graphicsLayerScope.setAlpha(((Number) this.f43828a.getValue()).floatValue());
                return ab.f48028a;
            case 7:
                com.waze.ui.q.c cVar = (com.waze.ui.q.c) obj;
                x.f(cVar, "it");
                if (x.n(cVar, com.waze.ui.q.a.f43232a)) {
                    this.f43828a.invoke();
                }
                return ab.f48028a;
            case 8:
                com.waze.ui.q.c cVar2 = (com.waze.ui.q.c) obj;
                x.f(cVar2, "it");
                if (x.n(cVar2, com.waze.ui.q.a.f43232a)) {
                    this.f43828a.invoke();
                } else if (!x.n(cVar2, com.waze.ui.q.b.f43233a)) {
                    throw new h.i();
                }
                return ab.f48028a;
            case 9:
                String str = (String) obj;
                int i2 = ap.f41852a;
                x.f(str, "it");
                this.f43828a.invoke(new com.waze.ui.af.j(str));
                return ab.f48028a;
            case 10:
                List list = (List) obj;
                int i3 = ap.f41852a;
                x.f(list, "voices");
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj3 = this.f43828a;
                        Object next = it.next();
                        if (x.n(((com.waze.ui.af.q) next).c(), ((com.waze.ui.af.t) obj3).a())) {
                            obj2 = next;
                        }
                    }
                }
                return (com.waze.ui.af.q) obj2;
            case 11:
                com.waze.ui.af.q qVar = (com.waze.ui.af.q) obj;
                int i4 = ap.f41852a;
                x.f(qVar, "it");
                this.f43828a.invoke(new com.waze.ui.af.h(qVar));
                return ab.f48028a;
            case 12:
                Boolean bool2 = (Boolean) obj;
                Object obj4 = this.f43828a;
                int i5 = UidFragmentActivity.f44064g;
                x.c(obj4);
                x.c(bool2);
                ((View) obj4).setVisibility(true != bool2.booleanValue() ? 8 : 0);
                return ab.f48028a;
            case 13:
                while (true) {
                    UidFragmentActivity uidFragmentActivity = (UidFragmentActivity) this.f43828a;
                    com.waze.tide.s sVarW = uidFragmentActivity.f().w();
                    if (sVarW == null) {
                        return ab.f48028a;
                    }
                    uidFragmentActivity.p(sVarW);
                }
            case 14:
                InstallParameters.Community community = (InstallParameters.Community) obj;
                x.f(community, "community");
                ((UidFragmentActivity) this.f43828a).f().o(new com.waze.uid.state_impl.b.b(community));
                return ab.f48028a;
            case 15:
                return com.waze.uid.c.e.a((com.waze.uid.c.e) this.f43828a, (String) obj);
            case 16:
                String str2 = (String) obj;
                x.f(str2, "newPin");
                this.f43828a.invoke(str2);
                return ab.f48028a;
            case 17:
                Object obj5 = this.f43828a;
                ((OvalButton) ((ar) obj5).requireView().findViewById(R.id.chooseAccountNextButton)).setEnabled(((w) obj5).b().g());
                return ab.f48028a;
            case 18:
                ArrayList arrayList = new ArrayList();
                Object obj6 = this.f43828a;
                w wVar = (w) obj6;
                Iterator it2 = wVar.b().c().iterator();
                while (it2.hasNext()) {
                    int i6 = i + 1;
                    arrayList.add(new com.waze.uid.c.s(R.layout.choose_account_profile_table, (com.waze.uid.f.c) it2.next()));
                    if (i < wVar.b().c().size() - 1) {
                        arrayList.add(new com.waze.uid.c.s(R.layout.choose_account_separator, (com.waze.uid.f.c) null));
                    }
                    i = i6;
                }
                ar arVar = (ar) obj6;
                Context contextRequireContext = arVar.requireContext();
                x.e(contextRequireContext, "requireContext(...)");
                com.waze.uid.c.u uVar = new com.waze.uid.c.u(contextRequireContext, arrayList);
                x.f(uVar, "<set-?>");
                wVar.f44430b = uVar;
                com.waze.uid.c.u uVarA = wVar.a();
                Long l2 = (Long) wVar.b().b().getValue();
                uVarA.b(l2 != null ? l2.longValue() : -1L);
                ListView listView = (ListView) arVar.requireView().findViewById(R.id.chooseAccountListView);
                listView.setAdapter((ListAdapter) wVar.a());
                listView.setOnItemClickListener(new ah(obj6, 2));
                return ab.f48028a;
            case 19:
                return as.a((as) this.f43828a, (String) obj);
            default:
                x.f((KeyboardActionScope) obj, "$this$WazeTextField");
                this.f43828a.invoke();
                return ab.f48028a;
        }
    }
}
