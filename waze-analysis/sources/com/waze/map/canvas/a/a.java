package com.waze.map.canvas.a;

import android.graphics.Rect;
import com.waze.jni.protos.map.RelativeViewPort;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28492a;

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("MapView:GenericCanvas");
        x.e(eVarD, "create(...)");
        this(eVarD);
    }

    public final RelativeViewPort a(Rect rect, Rect rect2) {
        com.waze.shared_infra.i.e eVar = this.f28492a;
        eVar.a("viewport:" + rect2 + ", mapView:" + rect);
        if (rect != null && rect2 != null) {
            if (rect2.width() > 0 && rect2.height() > 0) {
                if (rect.width() <= 0 || rect.height() <= 0) {
                    eVar.b("can't continue, mapView has no size");
                    return null;
                }
                RelativeViewPort.Builder builderNewBuilder = RelativeViewPort.newBuilder();
                x.e(builderNewBuilder, "newBuilder(...)");
                float fWidth = rect.width();
                float fHeight = rect.height();
                int iMax = Math.max(rect.left, rect2.left);
                builderNewBuilder.setWidth((Math.min(rect.right, rect2.right) - iMax) / fWidth);
                builderNewBuilder.setOffsetX((iMax - rect.left) / fWidth);
                int iMax2 = Math.max(rect.top, rect2.top);
                builderNewBuilder.setHeight((Math.min(rect.bottom, rect2.bottom) - iMax2) / fHeight);
                builderNewBuilder.setOffsetY((iMax2 - rect.top) / fHeight);
                if (builderNewBuilder.getWidth() <= 0.0f || builderNewBuilder.getHeight() <= 0.0f) {
                    eVar.b("can't continue, calculated relative-viewport has no size");
                    return null;
                }
                Objects.toString(builderNewBuilder);
                eVar.a("returning ".concat(String.valueOf(builderNewBuilder)));
                return builderNewBuilder.build();
            }
            eVar.b("can't continue, viewport has no size");
        }
        return null;
    }

    public a(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f28492a = eVar;
    }
}
