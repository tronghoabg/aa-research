package com.waze.authentication;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.navigate.NavigationItemList;
import com.waze.main_screen.p.bf;
import com.waze.main_screen.p.bi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class at implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15742a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15743b;

    public /* synthetic */ at(Object obj, int i2) {
        this.f15743b = i2;
        this.f15742a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r7v20, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v54, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v58, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        ArrayList arrayListH;
        List<NavigationItem> navigationItemList;
        switch (this.f15743b) {
            case 0:
                return aw.f((aw) this.f15742a, (Boolean) obj);
            case 1:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                h.g.b.x.f(layoutCoordinates, "it");
                this.f15742a.setValue(Offset.m7969boximpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates)));
                return h.ab.f48028a;
            case 2:
                com.waze.main_screen.g.f fVar = (com.waze.main_screen.g.f) obj;
                h.g.b.x.f(fVar, "view");
                fVar.d();
                com.waze.map.b.ah ahVar = (com.waze.map.b.ah) this.f15742a;
                com.waze.map.b.ag agVarB = ahVar.b();
                com.waze.map.b.ag agVar = com.waze.map.b.ag.f27996a;
                int iOrdinal = agVarB.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    z = false;
                }
                fVar.b(z);
                fVar.e();
                fVar.c(ahVar.a(), ahVar.c());
                return h.ab.f48028a;
            case 3:
                h.g.b.x.f((Density) obj, "$this$offset");
                return (IntOffset) this.f15742a.getValue();
            case 4:
                this.f15742a.setIntValue((int) (((IntSize) obj).m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                return h.ab.f48028a;
            case 5:
                return com.waze.main_screen.i.a.d.b(this.f15742a, (com.waze.main_screen.g.d) obj);
            case 6:
                NavigationItemList navigationItemList2 = (NavigationItemList) obj;
                if (navigationItemList2 == null || (navigationItemList = navigationItemList2.getNavigationItemList()) == null) {
                    arrayListH = h.a.i.h();
                } else {
                    List<NavigationItem> list = navigationItemList;
                    ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
                    for (NavigationItem navigationItem : list) {
                        h.g.b.x.c(navigationItem);
                        arrayList.add(new com.waze.main_screen.l.a.a(navigationItem));
                    }
                    arrayListH = arrayList;
                }
                this.f15742a.a(arrayListH);
                return h.ab.f48028a;
            case 7:
                return com.waze.main_screen.l.b.c.b(this.f15742a, (com.waze.main.navigate.e) obj);
            case 8:
                Context context = (Context) obj;
                h.g.b.x.f(context, "context");
                com.waze.main_screen.bottom_bars.b.a aVar = new com.waze.main_screen.bottom_bars.b.a(context);
                ((Ref) this.f15742a).setValue(aVar);
                return aVar;
            case 9:
                ((com.waze.main_screen.m.p) this.f15742a).d(new com.waze.main_screen.m.h(((Integer) obj).intValue()));
                return h.ab.f48028a;
            case 10:
                ((bf) this.f15742a).v().i(((Float) obj).floatValue());
                return h.ab.f48028a;
            case 11:
                h.g.b.x.f((com.waze.main_screen.c.s) obj, "<unused var>");
                bf bfVar = (bf) this.f15742a;
                return Boolean.valueOf(!bfVar.h().D() && bfVar.I());
            case 12:
                h.g.b.x.f((com.waze.location.q) obj, "<unused var>");
                bf bfVar2 = (bf) this.f15742a;
                return Boolean.valueOf(!bfVar2.h().D() && bfVar2.I());
            case 13:
                return bi.K((com.waze.main_screen.m.p) this.f15742a, (LayoutCoordinates) obj);
            case 14:
                return bi.L((com.waze.main_screen.m.p) this.f15742a, (LayoutCoordinates) obj);
            case 15:
                return bi.M((com.waze.main_screen.m.p) this.f15742a, (LayoutCoordinates) obj);
            case 16:
                return bi.N((com.waze.main_screen.m.p) this.f15742a, (LayoutCoordinates) obj);
            case 17:
                return bi.O((com.waze.main_screen.m.p) this.f15742a, (Rect) obj);
            case 18:
                h.g.b.x.f((DisposableEffectScope) obj, "$this$DisposableEffect");
                return new com.waze.main_screen.p.ap(this.f15742a);
            case 19:
                ((com.waze.sound.e.j) this.f15742a).l((int) (((IntSize) obj).m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                return h.ab.f48028a;
            default:
                com.waze.view.navbar.q qVar = (com.waze.view.navbar.q) obj;
                h.g.b.x.f(qVar, "it");
                qVar.c((String) this.f15742a.getValue());
                qVar.b();
                return h.ab.f48028a;
        }
    }
}
