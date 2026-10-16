package com.waze.jni.protos;

import com.waze.jni.protos.NavigationSegment;
import com.waze.jni.protos.NavigationSegmentKt;
import com.waze.jni.protos.Position;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationSegmentKtKt {
    /* renamed from: -initializenavigationSegment, reason: not valid java name */
    public static final NavigationSegment m25381initializenavigationSegment(l<? super NavigationSegmentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationSegmentKt.Dsl.Companion companion = NavigationSegmentKt.Dsl.Companion;
        NavigationSegment.Builder builderNewBuilder = NavigationSegment.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationSegmentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationSegment copy(NavigationSegment navigationSegment, l<? super NavigationSegmentKt.Dsl, ab> lVar) {
        x.f(navigationSegment, "<this>");
        x.f(lVar, "block");
        NavigationSegmentKt.Dsl.Companion companion = NavigationSegmentKt.Dsl.Companion;
        NavigationSegment.Builder builder = navigationSegment.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationSegmentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getFromCoordinateOrNull(NavigationSegmentOrBuilder navigationSegmentOrBuilder) {
        x.f(navigationSegmentOrBuilder, "<this>");
        if (navigationSegmentOrBuilder.hasFromCoordinate()) {
            return navigationSegmentOrBuilder.getFromCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getFromCoordinateOrNull$annotations(NavigationSegmentOrBuilder navigationSegmentOrBuilder) {
    }

    public static final Position.IntPosition getToCoordinateOrNull(NavigationSegmentOrBuilder navigationSegmentOrBuilder) {
        x.f(navigationSegmentOrBuilder, "<this>");
        if (navigationSegmentOrBuilder.hasToCoordinate()) {
            return navigationSegmentOrBuilder.getToCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getToCoordinateOrNull$annotations(NavigationSegmentOrBuilder navigationSegmentOrBuilder) {
    }
}
