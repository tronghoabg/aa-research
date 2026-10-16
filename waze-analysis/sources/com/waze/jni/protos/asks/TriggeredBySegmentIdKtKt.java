package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.TriggeredBySegmentId;
import com.waze.jni.protos.asks.TriggeredBySegmentIdKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TriggeredBySegmentIdKtKt {
    /* renamed from: -initializetriggeredBySegmentId, reason: not valid java name */
    public static final TriggeredBySegmentId m26014initializetriggeredBySegmentId(l<? super TriggeredBySegmentIdKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TriggeredBySegmentIdKt.Dsl.Companion companion = TriggeredBySegmentIdKt.Dsl.Companion;
        TriggeredBySegmentId.Builder builderNewBuilder = TriggeredBySegmentId.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TriggeredBySegmentIdKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TriggeredBySegmentId copy(TriggeredBySegmentId triggeredBySegmentId, l<? super TriggeredBySegmentIdKt.Dsl, ab> lVar) {
        x.f(triggeredBySegmentId, "<this>");
        x.f(lVar, "block");
        TriggeredBySegmentIdKt.Dsl.Companion companion = TriggeredBySegmentIdKt.Dsl.Companion;
        TriggeredBySegmentId.Builder builder = triggeredBySegmentId.toBuilder();
        x.e(builder, "toBuilder(...)");
        TriggeredBySegmentIdKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
