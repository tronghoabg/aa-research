package com.waze.jni.protos.map;

import com.waze.jni.protos.map.TouchPoint;
import com.waze.jni.protos.map.TouchPointKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TouchPointKtKt {
    /* renamed from: -initializetouchPoint, reason: not valid java name */
    public static final TouchPoint m27017initializetouchPoint(l<? super TouchPointKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TouchPointKt.Dsl.Companion companion = TouchPointKt.Dsl.Companion;
        TouchPoint.Builder builderNewBuilder = TouchPoint.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TouchPointKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TouchPoint copy(TouchPoint touchPoint, l<? super TouchPointKt.Dsl, ab> lVar) {
        x.f(touchPoint, "<this>");
        x.f(lVar, "block");
        TouchPointKt.Dsl.Companion companion = TouchPointKt.Dsl.Companion;
        TouchPoint.Builder builder = touchPoint.toBuilder();
        x.e(builder, "toBuilder(...)");
        TouchPointKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
