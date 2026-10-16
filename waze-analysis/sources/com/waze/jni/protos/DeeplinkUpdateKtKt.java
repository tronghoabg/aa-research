package com.waze.jni.protos;

import com.waze.jni.protos.DeeplinkUpdate;
import com.waze.jni.protos.DeeplinkUpdateKt;
import com.waze.jni.protos.Position;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DeeplinkUpdateKtKt {
    /* renamed from: -initializedeeplinkUpdate, reason: not valid java name */
    public static final DeeplinkUpdate m25045initializedeeplinkUpdate(l<? super DeeplinkUpdateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DeeplinkUpdateKt.Dsl.Companion companion = DeeplinkUpdateKt.Dsl.Companion;
        DeeplinkUpdate.Builder builderNewBuilder = DeeplinkUpdate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DeeplinkUpdateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DeeplinkUpdate.LocationSharing copy(DeeplinkUpdate.LocationSharing locationSharing, l<? super DeeplinkUpdateKt.LocationSharingKt.Dsl, ab> lVar) {
        x.f(locationSharing, "<this>");
        x.f(lVar, "block");
        DeeplinkUpdateKt.LocationSharingKt.Dsl.Companion companion = DeeplinkUpdateKt.LocationSharingKt.Dsl.Companion;
        DeeplinkUpdate.LocationSharing.Builder builder = locationSharing.toBuilder();
        x.e(builder, "toBuilder(...)");
        DeeplinkUpdateKt.LocationSharingKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DeeplinkUpdate.LocationSharing getLocationSharingOrNull(DeeplinkUpdateOrBuilder deeplinkUpdateOrBuilder) {
        x.f(deeplinkUpdateOrBuilder, "<this>");
        if (deeplinkUpdateOrBuilder.hasLocationSharing()) {
            return deeplinkUpdateOrBuilder.getLocationSharing();
        }
        return null;
    }

    public static /* synthetic */ void getLocationSharingOrNull$annotations(DeeplinkUpdateOrBuilder deeplinkUpdateOrBuilder) {
    }

    public static final Position.IntPosition getPositionOrNull(DeeplinkUpdate.LocationSharingOrBuilder locationSharingOrBuilder) {
        x.f(locationSharingOrBuilder, "<this>");
        if (locationSharingOrBuilder.hasPosition()) {
            return locationSharingOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(DeeplinkUpdate.LocationSharingOrBuilder locationSharingOrBuilder) {
    }

    public static final DeeplinkUpdate copy(DeeplinkUpdate deeplinkUpdate, l<? super DeeplinkUpdateKt.Dsl, ab> lVar) {
        x.f(deeplinkUpdate, "<this>");
        x.f(lVar, "block");
        DeeplinkUpdateKt.Dsl.Companion companion = DeeplinkUpdateKt.Dsl.Companion;
        DeeplinkUpdate.Builder builder = deeplinkUpdate.toBuilder();
        x.e(builder, "toBuilder(...)");
        DeeplinkUpdateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
