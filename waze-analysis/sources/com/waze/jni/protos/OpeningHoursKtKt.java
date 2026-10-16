package com.waze.jni.protos;

import com.waze.jni.protos.OpeningHours;
import com.waze.jni.protos.OpeningHoursKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class OpeningHoursKtKt {
    /* renamed from: -initializeopeningHours, reason: not valid java name */
    public static final OpeningHours m25412initializeopeningHours(l<? super OpeningHoursKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        OpeningHoursKt.Dsl.Companion companion = OpeningHoursKt.Dsl.Companion;
        OpeningHours.Builder builderNewBuilder = OpeningHours.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        OpeningHoursKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final OpeningHours copy(OpeningHours openingHours, l<? super OpeningHoursKt.Dsl, ab> lVar) {
        x.f(openingHours, "<this>");
        x.f(lVar, "block");
        OpeningHoursKt.Dsl.Companion companion = OpeningHoursKt.Dsl.Companion;
        OpeningHours.Builder builder = openingHours.toBuilder();
        x.e(builder, "toBuilder(...)");
        OpeningHoursKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
