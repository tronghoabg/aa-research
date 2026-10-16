package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.map.MapPopupNativeInfo;
import com.waze.jni.protos.map.MapPopupNativeInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapPopupNativeInfoKtKt {
    /* renamed from: -initializemapPopupNativeInfo, reason: not valid java name */
    public static final MapPopupNativeInfo m26830initializemapPopupNativeInfo(l<? super MapPopupNativeInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapPopupNativeInfoKt.Dsl.Companion companion = MapPopupNativeInfoKt.Dsl.Companion;
        MapPopupNativeInfo.Builder builderNewBuilder = MapPopupNativeInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapPopupNativeInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapPopupNativeInfo.DetailsPopupInfo copy(MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo, l<? super MapPopupNativeInfoKt.DetailsPopupInfoKt.Dsl, ab> lVar) {
        x.f(detailsPopupInfo, "<this>");
        x.f(lVar, "block");
        MapPopupNativeInfoKt.DetailsPopupInfoKt.Dsl.Companion companion = MapPopupNativeInfoKt.DetailsPopupInfoKt.Dsl.Companion;
        MapPopupNativeInfo.DetailsPopupInfo.Builder builder = detailsPopupInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapPopupNativeInfoKt.DetailsPopupInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getCoordinateOrNull(MapPopupNativeInfo.DetailsPopupInfoOrBuilder detailsPopupInfoOrBuilder) {
        x.f(detailsPopupInfoOrBuilder, "<this>");
        if (detailsPopupInfoOrBuilder.hasCoordinate()) {
            return detailsPopupInfoOrBuilder.getCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getCoordinateOrNull$annotations(MapPopupNativeInfo.DetailsPopupInfoOrBuilder detailsPopupInfoOrBuilder) {
    }

    public static final MapPopupNativeInfo.DetailsPopupInfo getDetailsPopupInfoOrNull(MapPopupNativeInfoOrBuilder mapPopupNativeInfoOrBuilder) {
        x.f(mapPopupNativeInfoOrBuilder, "<this>");
        if (mapPopupNativeInfoOrBuilder.hasDetailsPopupInfo()) {
            return mapPopupNativeInfoOrBuilder.getDetailsPopupInfo();
        }
        return null;
    }

    public static /* synthetic */ void getDetailsPopupInfoOrNull$annotations(MapPopupNativeInfoOrBuilder mapPopupNativeInfoOrBuilder) {
    }

    public static final VenueData getVenueOrNull(MapPopupNativeInfo.DetailsPopupInfoOrBuilder detailsPopupInfoOrBuilder) {
        x.f(detailsPopupInfoOrBuilder, "<this>");
        if (detailsPopupInfoOrBuilder.hasVenue()) {
            return detailsPopupInfoOrBuilder.getVenue();
        }
        return null;
    }

    public static /* synthetic */ void getVenueOrNull$annotations(MapPopupNativeInfo.DetailsPopupInfoOrBuilder detailsPopupInfoOrBuilder) {
    }

    public static final VenueData getVenueOriginalOrNull(MapPopupNativeInfo.DetailsPopupInfoOrBuilder detailsPopupInfoOrBuilder) {
        x.f(detailsPopupInfoOrBuilder, "<this>");
        if (detailsPopupInfoOrBuilder.hasVenueOriginal()) {
            return detailsPopupInfoOrBuilder.getVenueOriginal();
        }
        return null;
    }

    public static /* synthetic */ void getVenueOriginalOrNull$annotations(MapPopupNativeInfo.DetailsPopupInfoOrBuilder detailsPopupInfoOrBuilder) {
    }

    public static final MapPopupNativeInfo.WazerPopupInfo getWazerPopupInfoOrNull(MapPopupNativeInfoOrBuilder mapPopupNativeInfoOrBuilder) {
        x.f(mapPopupNativeInfoOrBuilder, "<this>");
        if (mapPopupNativeInfoOrBuilder.hasWazerPopupInfo()) {
            return mapPopupNativeInfoOrBuilder.getWazerPopupInfo();
        }
        return null;
    }

    public static /* synthetic */ void getWazerPopupInfoOrNull$annotations(MapPopupNativeInfoOrBuilder mapPopupNativeInfoOrBuilder) {
    }

    public static /* synthetic */ void getCoordinateOrNull$annotations(MapPopupNativeInfo.WazerPopupInfoOrBuilder wazerPopupInfoOrBuilder) {
    }

    public static final Position.IntPosition getCoordinateOrNull(MapPopupNativeInfo.WazerPopupInfoOrBuilder wazerPopupInfoOrBuilder) {
        x.f(wazerPopupInfoOrBuilder, "<this>");
        if (wazerPopupInfoOrBuilder.hasCoordinate()) {
            return wazerPopupInfoOrBuilder.getCoordinate();
        }
        return null;
    }

    public static final MapPopupNativeInfo.WazerPopupInfo copy(MapPopupNativeInfo.WazerPopupInfo wazerPopupInfo, l<? super MapPopupNativeInfoKt.WazerPopupInfoKt.Dsl, ab> lVar) {
        x.f(wazerPopupInfo, "<this>");
        x.f(lVar, "block");
        MapPopupNativeInfoKt.WazerPopupInfoKt.Dsl.Companion companion = MapPopupNativeInfoKt.WazerPopupInfoKt.Dsl.Companion;
        MapPopupNativeInfo.WazerPopupInfo.Builder builder = wazerPopupInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapPopupNativeInfoKt.WazerPopupInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapPopupNativeInfo copy(MapPopupNativeInfo mapPopupNativeInfo, l<? super MapPopupNativeInfoKt.Dsl, ab> lVar) {
        x.f(mapPopupNativeInfo, "<this>");
        x.f(lVar, "block");
        MapPopupNativeInfoKt.Dsl.Companion companion = MapPopupNativeInfoKt.Dsl.Companion;
        MapPopupNativeInfo.Builder builder = mapPopupNativeInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapPopupNativeInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
