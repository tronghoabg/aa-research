package com.waze.map.isolated;

import android.graphics.Bitmap;
import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.map.MapWidgets;
import com.waze.map.em;
import com.waze.map.en;
import com.waze.map.eo;
import com.waze.map.ep;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f29269a;

    /* renamed from: b, reason: collision with root package name */
    Object f29270b;

    /* renamed from: c, reason: collision with root package name */
    Object f29271c;

    /* renamed from: d, reason: collision with root package name */
    Object f29272d;

    /* renamed from: e, reason: collision with root package name */
    Object f29273e;

    /* renamed from: f, reason: collision with root package name */
    Object f29274f;

    /* renamed from: g, reason: collision with root package name */
    Object f29275g;

    /* renamed from: h, reason: collision with root package name */
    int f29276h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ WazeMapWidgetNativeRenderer f29277i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ com.waze.map.ac f29278j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ com.waze.bk.a.c f29279k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer, com.waze.map.ac acVar, com.waze.bk.a.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f29277i = wazeMapWidgetNativeRenderer;
        this.f29278j = acVar;
        this.f29279k = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new y(this.f29277i, this.f29278j, this.f29279k, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer;
        String strI;
        MapWidgets.Builder builderNewBuilder;
        com.waze.map.canvas.m mVarC;
        String str;
        MapWidgets.Builder builder;
        MapWidgets.Pill.Builder builder2;
        MapWidgets.Builder builder3;
        MapWidgets.Pill.Type type;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f29276h == 0) {
            e.b.c.b(obj);
            wazeMapWidgetNativeRenderer = this.f29277i;
            com.waze.map.ac acVar = this.f29278j;
            com.waze.bk.a.c cVar = this.f29279k;
            strI = acVar.i();
            builderNewBuilder = MapWidgets.newBuilder();
            builderNewBuilder.setShowLoadingIndicator(cVar.a());
            builderNewBuilder.setShowSpeedometer(cVar.b());
            mVarC = cVar.c();
            if (mVarC != null) {
                MapWidgets.Pill.Builder builderNewBuilder2 = MapWidgets.Pill.newBuilder();
                Bitmap bitmapF = mVarC.f();
                this.f29269a = builderNewBuilder;
                this.f29270b = wazeMapWidgetNativeRenderer;
                this.f29271c = mVarC;
                this.f29272d = builderNewBuilder2;
                this.f29273e = builderNewBuilder;
                this.f29274f = wazeMapWidgetNativeRenderer;
                this.f29275g = strI;
                this.f29276h = 1;
                Object objV = aj.v(wazeMapWidgetNativeRenderer.f29204f, new x(wazeMapWidgetNativeRenderer, bitmapF, null), this);
                if (objV == aVar) {
                    return aVar;
                }
                str = strI;
                obj = objV;
                builder = builderNewBuilder;
                builder2 = builderNewBuilder2;
                builder3 = builder;
            }
            byte[] byteArray = builderNewBuilder.build().toByteArray();
            h.g.b.x.e(byteArray, "toByteArray(...)");
            wazeMapWidgetNativeRenderer.nativeRender(strI, byteArray);
            return h.ab.f48028a;
        }
        str = (String) this.f29275g;
        wazeMapWidgetNativeRenderer = (WazeMapWidgetNativeRenderer) this.f29274f;
        builder3 = (MapWidgets.Builder) this.f29273e;
        builder2 = (MapWidgets.Pill.Builder) this.f29272d;
        mVarC = (com.waze.map.canvas.m) this.f29271c;
        builder = (MapWidgets.Builder) this.f29269a;
        e.b.c.b(obj);
        builder2.setImage((NativeBitmap) obj);
        if (mVarC instanceof em) {
            type = MapWidgets.Pill.Type.PILL_TYPE_AVG_SPEED_CAM;
        } else if (mVarC instanceof eo) {
            type = MapWidgets.Pill.Type.PILL_TYPE_CURRENT_STREET;
        } else {
            if (!(mVarC instanceof ep) && !(mVarC instanceof en)) {
                throw new h.i();
            }
            type = MapWidgets.Pill.Type.PILL_TYPE_TRAFFIC_METER;
        }
        builder2.setType(type);
        builder3.setActivePill(builder2);
        builderNewBuilder = builder;
        strI = str;
        byte[] byteArray2 = builderNewBuilder.build().toByteArray();
        h.g.b.x.e(byteArray2, "toByteArray(...)");
        wazeMapWidgetNativeRenderer.nativeRender(strI, byteArray2);
        return h.ab.f48028a;
    }
}
