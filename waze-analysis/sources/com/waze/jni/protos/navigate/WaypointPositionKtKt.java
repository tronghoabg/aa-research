package com.waze.jni.protos.navigate;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.WaypointPosition;
import com.waze.jni.protos.navigate.WaypointPositionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WaypointPositionKtKt {
    /* renamed from: -initializewaypointPosition, reason: not valid java name */
    public static final WaypointPosition m27804initializewaypointPosition(l<? super WaypointPositionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        WaypointPositionKt.Dsl.Companion companion = WaypointPositionKt.Dsl.Companion;
        WaypointPosition.Builder builderNewBuilder = WaypointPosition.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        WaypointPositionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WaypointPosition copy(WaypointPosition waypointPosition, l<? super WaypointPositionKt.Dsl, ab> lVar) {
        x.f(waypointPosition, "<this>");
        x.f(lVar, "block");
        WaypointPositionKt.Dsl.Companion companion = WaypointPositionKt.Dsl.Companion;
        WaypointPosition.Builder builder = waypointPosition.toBuilder();
        x.e(builder, "toBuilder(...)");
        WaypointPositionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getPositionOrNull(WaypointPositionOrBuilder waypointPositionOrBuilder) {
        x.f(waypointPositionOrBuilder, "<this>");
        if (waypointPositionOrBuilder.hasPosition()) {
            return waypointPositionOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(WaypointPositionOrBuilder waypointPositionOrBuilder) {
    }
}
