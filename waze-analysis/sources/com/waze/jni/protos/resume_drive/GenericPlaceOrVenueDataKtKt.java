package com.waze.jni.protos.resume_drive;

import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.resume_drive.GenericPlaceOrVenueData;
import com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlaceOrVenueDataKtKt {
    /* renamed from: -initializegenericPlaceOrVenueData, reason: not valid java name */
    public static final GenericPlaceOrVenueData m28157initializegenericPlaceOrVenueData(l<? super GenericPlaceOrVenueDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GenericPlaceOrVenueDataKt.Dsl.Companion companion = GenericPlaceOrVenueDataKt.Dsl.Companion;
        GenericPlaceOrVenueData.Builder builderNewBuilder = GenericPlaceOrVenueData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GenericPlaceOrVenueDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GenericPlaceOrVenueData copy(GenericPlaceOrVenueData genericPlaceOrVenueData, l<? super GenericPlaceOrVenueDataKt.Dsl, ab> lVar) {
        x.f(genericPlaceOrVenueData, "<this>");
        x.f(lVar, "block");
        GenericPlaceOrVenueDataKt.Dsl.Companion companion = GenericPlaceOrVenueDataKt.Dsl.Companion;
        GenericPlaceOrVenueData.Builder builder = genericPlaceOrVenueData.toBuilder();
        x.e(builder, "toBuilder(...)");
        GenericPlaceOrVenueDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GenericPlace getPlaceOrNull(GenericPlaceOrVenueDataOrBuilder genericPlaceOrVenueDataOrBuilder) {
        x.f(genericPlaceOrVenueDataOrBuilder, "<this>");
        if (genericPlaceOrVenueDataOrBuilder.hasPlace()) {
            return genericPlaceOrVenueDataOrBuilder.getPlace();
        }
        return null;
    }

    public static /* synthetic */ void getPlaceOrNull$annotations(GenericPlaceOrVenueDataOrBuilder genericPlaceOrVenueDataOrBuilder) {
    }

    public static final VenueData getVenueOrNull(GenericPlaceOrVenueDataOrBuilder genericPlaceOrVenueDataOrBuilder) {
        x.f(genericPlaceOrVenueDataOrBuilder, "<this>");
        if (genericPlaceOrVenueDataOrBuilder.hasVenue()) {
            return genericPlaceOrVenueDataOrBuilder.getVenue();
        }
        return null;
    }

    public static /* synthetic */ void getVenueOrNull$annotations(GenericPlaceOrVenueDataOrBuilder genericPlaceOrVenueDataOrBuilder) {
    }
}
