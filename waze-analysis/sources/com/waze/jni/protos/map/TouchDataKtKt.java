package com.waze.jni.protos.map;

import com.waze.jni.protos.map.TouchData;
import com.waze.jni.protos.map.TouchDataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TouchDataKtKt {
    /* renamed from: -initializetouchData, reason: not valid java name */
    public static final TouchData m27011initializetouchData(l<? super TouchDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TouchDataKt.Dsl.Companion companion = TouchDataKt.Dsl.Companion;
        TouchData.Builder builderNewBuilder = TouchData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TouchDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TouchData copy(TouchData touchData, l<? super TouchDataKt.Dsl, ab> lVar) {
        x.f(touchData, "<this>");
        x.f(lVar, "block");
        TouchDataKt.Dsl.Companion companion = TouchDataKt.Dsl.Companion;
        TouchData.Builder builder = touchData.toBuilder();
        x.e(builder, "toBuilder(...)");
        TouchDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
