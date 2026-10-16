package com.waze.authentication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import com.waze.map.canvas.MainCanvasDelegatorImpl;
import com.waze.navigate.AddressItem;
import com.waze.navigate.cs;
import com.waze.navigate.location_preview.bu;
import com.waze.reports.bm;
import com.waze.search.h.ce;
import com.waze.search.v2.SearchV2Activity;
import com.waze.search.v2.cu;
import com.waze.search.v2.df;
import com.waze.search.v2.gb;
import com.waze.ui.m.cb;
import java.util.List;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class as implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15740b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15741c;

    public /* synthetic */ as(Object obj, Object obj2, int i2) {
        this.f15741c = i2;
        this.f15739a = obj;
        this.f15740b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v31, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [androidx.compose.ui.focus.FocusManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v37, types: [com.waze.app_nav.hub.b.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v44, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v46, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v50, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v52, types: [com.waze.search.c.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v54, types: [com.waze.search.c.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v30, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.f15741c) {
            case 0:
                return aw.e((aw) this.f15739a, this.f15740b, (com.google.android.gms.auth.a.f) obj);
            case 1:
                com.waze.map.main.aa aaVar = (com.waze.map.main.aa) this.f15740b;
                int iF = aaVar.f();
                int iA = aaVar.a();
                int iD = aaVar.d();
                int iE = aaVar.e();
                MainCanvasDelegatorImpl mainCanvasDelegatorImpl = (MainCanvasDelegatorImpl) this.f15739a;
                mainCanvasDelegatorImpl.nativeUpdateMarginsPixels(iF, iA, iD, iE);
                mainCanvasDelegatorImpl.nativeUpdateUserLocationInsets(aaVar.b());
                return h.ab.f48028a;
            case 2:
                String str = (String) obj;
                h.g.b.x.f(str, "it");
                com.waze.map.b.ag agVar = com.waze.map.b.ag.f27996a;
                int iOrdinal = ((com.waze.map.b.ag) this.f15740b).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    z = false;
                }
                ((MainCanvasDelegatorImpl) this.f15739a).nativeSetCompassFixed(str, z);
                return h.ab.f48028a;
            case 3:
                Context context = (Context) obj;
                h.g.b.x.f(context, "it");
                bu buVar = (bu) this.f15740b;
                cs csVar = new cs(gb.j(buVar.a(), 0, null, false, 15));
                csVar.e(true);
                csVar.j();
                csVar.m(buVar.b());
                csVar.h(((com.waze.navigate.location_preview.ay) this.f15739a).i());
                csVar.i();
                csVar.k(buVar.d());
                Intent intentA = csVar.a(context);
                h.g.b.x.e(intentA, "build(...)");
                return intentA;
            case 4:
                return ((com.waze.network.f.w) this.f15739a).f32359e.c((okhttp3.al) obj, (com.waze.network.f.af) this.f15740b);
            case 5:
                h.g.b.x.f((DisposableEffectScope) obj, "$this$DisposableEffect");
                com.waze.ab.v vVar = new com.waze.ab.v((Context) this.f15739a, (String) this.f15740b, R.drawable.bigblue_v_icon, true);
                vVar.show();
                return new com.waze.parking.p(vVar);
            case 6:
                return bm.a((bm) this.f15739a, (com.waze.reports_v2.b.at) this.f15740b, (com.waze.reports_v2.c.d) obj);
            case 7:
                List list = (List) obj;
                h.g.b.x.f(list, "list");
                com.waze.reports_v2.c.an anVar = (com.waze.reports_v2.c.an) this.f15740b;
                ch chVarC = anVar.c();
                com.waze.reports_v2.a.a.a.a aVar = (com.waze.reports_v2.a.a.a.a) list.get(0);
                return new com.waze.reports_v2.a.a.a.b(chVarC, (com.waze.reports_v2.a.a.a.c) this.f15739a, aVar != null ? new com.waze.reports_v2.a.a.a.a(aVar.b(), aVar.a()) : null, anVar.f());
            case 8:
                h.g.b.x.f((ActivityResult) obj, "it");
                ((com.waze.reports_v2.a.a.a.b) this.f15740b).h(com.waze.ad.a.j.u((Context) this.f15739a));
                return h.ab.f48028a;
            case 9:
                return com.waze.reports_v2.presentation.a.an.l(this.f15740b, this.f15739a, (ActivityResult) obj);
            case 10:
                com.waze.search.ai.l(this.f15740b, this.f15739a, (MotionEvent) obj);
                return false;
            case 11:
                h.g.b.x.f((DisposableEffectScope) obj, "$this$DisposableEffect");
                h.g.b.aq aqVar = new h.g.b.aq();
                if (((ce) this.f15740b).f()) {
                    aqVar.f48105a = com.waze.sharedui.api.i.a(this.f15739a, "loading", R.string.PLEASE_WAIT___);
                }
                return new com.waze.search.f.n(aqVar);
            case 12:
                Rect rect = (Rect) obj;
                int i2 = SearchV2Activity.f36131f;
                androidx.compose.ui.geometry.Rect composeRect = rect != null ? RectHelper_androidKt.toComposeRect(rect) : null;
                ?? r8 = this.f15739a;
                Object obj2 = this.f15740b;
                r8.setValue(composeRect);
                ((com.waze.ui.p.i) obj2).f(composeRect);
                return h.ab.f48028a;
            case 13:
                int i3 = cu.f36302a;
                this.f15740b.invoke(Dp.m11162boximpl(this.f15739a.mo2124toDpu2uoSUM((int) (((IntSize) obj).m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
                return h.ab.f48028a;
            case 14:
                cb cbVar = (cb) obj;
                int i4 = cu.f36302a;
                h.g.b.x.f(cbVar, "it");
                this.f15739a.invoke(new com.waze.search.v2.am(cbVar, this.f15740b));
                return h.ab.f48028a;
            case 15:
                cb cbVar2 = (cb) obj;
                int i5 = cu.f36302a;
                h.g.b.x.f(cbVar2, "it");
                this.f15739a.invoke(new com.waze.search.v2.am(cbVar2, this.f15740b));
                return h.ab.f48028a;
            case 16:
                cb cbVar3 = (cb) obj;
                int i6 = cu.f36302a;
                h.g.b.x.f(cbVar3, "it");
                this.f15739a.invoke(new com.waze.search.v2.am(cbVar3, this.f15740b));
                return h.ab.f48028a;
            case 17:
                int i7 = df.f36355a;
                h.g.b.x.f((String) obj, "it");
                this.f15740b.invoke(this.f15739a);
                return h.ab.f48028a;
            case 18:
                com.waze.search.e.p pVar = (com.waze.search.e.p) obj;
                h.g.b.x.f(pVar, "it");
                this.f15740b.a((com.waze.av.b.n) this.f15739a, pVar);
                return h.ab.f48028a;
            case 19:
                com.waze.search.e.p pVar2 = (com.waze.search.e.p) obj;
                h.g.b.x.f(pVar2, "it");
                this.f15740b.a((com.waze.av.b.n) this.f15739a, pVar2);
                return h.ab.f48028a;
            default:
                return com.waze.bt.f.b((com.waze.bt.f) this.f15739a, this.f15740b, (AddressItem[]) obj);
        }
    }

    public /* synthetic */ as(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f15741c = i2;
        this.f15740b = obj;
        this.f15739a = obj2;
    }
}
