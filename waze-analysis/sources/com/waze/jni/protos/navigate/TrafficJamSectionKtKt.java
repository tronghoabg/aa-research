package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.TrafficJamSection;
import com.waze.jni.protos.navigate.TrafficJamSectionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TrafficJamSectionKtKt {
    /* renamed from: -initializetrafficJamSection, reason: not valid java name */
    public static final TrafficJamSection m27787initializetrafficJamSection(l<? super TrafficJamSectionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TrafficJamSectionKt.Dsl.Companion companion = TrafficJamSectionKt.Dsl.Companion;
        TrafficJamSection.Builder builderNewBuilder = TrafficJamSection.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TrafficJamSectionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TrafficJamSection copy(TrafficJamSection trafficJamSection, l<? super TrafficJamSectionKt.Dsl, ab> lVar) {
        x.f(trafficJamSection, "<this>");
        x.f(lVar, "block");
        TrafficJamSectionKt.Dsl.Companion companion = TrafficJamSectionKt.Dsl.Companion;
        TrafficJamSection.Builder builder = trafficJamSection.toBuilder();
        x.e(builder, "toBuilder(...)");
        TrafficJamSectionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
