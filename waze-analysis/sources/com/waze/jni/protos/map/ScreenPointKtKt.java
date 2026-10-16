package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ScreenPoint;
import com.waze.jni.protos.map.ScreenPointKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ScreenPointKtKt {
    /* renamed from: -initializescreenPoint, reason: not valid java name */
    public static final ScreenPoint m27001initializescreenPoint(l<? super ScreenPointKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ScreenPointKt.Dsl.Companion companion = ScreenPointKt.Dsl.Companion;
        ScreenPoint.Builder builderNewBuilder = ScreenPoint.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ScreenPointKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ScreenPoint copy(ScreenPoint screenPoint, l<? super ScreenPointKt.Dsl, ab> lVar) {
        x.f(screenPoint, "<this>");
        x.f(lVar, "block");
        ScreenPointKt.Dsl.Companion companion = ScreenPointKt.Dsl.Companion;
        ScreenPoint.Builder builder = screenPoint.toBuilder();
        x.e(builder, "toBuilder(...)");
        ScreenPointKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
