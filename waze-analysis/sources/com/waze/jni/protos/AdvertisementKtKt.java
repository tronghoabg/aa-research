package com.waze.jni.protos;

import com.waze.jni.protos.Advertisement;
import com.waze.jni.protos.AdvertisementKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AdvertisementKtKt {
    /* renamed from: -initializeadvertisement, reason: not valid java name */
    public static final Advertisement m24915initializeadvertisement(l<? super AdvertisementKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AdvertisementKt.Dsl.Companion companion = AdvertisementKt.Dsl.Companion;
        Advertisement.Builder builderNewBuilder = Advertisement.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AdvertisementKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Advertisement copy(Advertisement advertisement, l<? super AdvertisementKt.Dsl, ab> lVar) {
        x.f(advertisement, "<this>");
        x.f(lVar, "block");
        AdvertisementKt.Dsl.Companion companion = AdvertisementKt.Dsl.Companion;
        Advertisement.Builder builder = advertisement.toBuilder();
        x.e(builder, "toBuilder(...)");
        AdvertisementKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdvilRequest getAdvilRequestOrNull(AdvertisementOrBuilder advertisementOrBuilder) {
        x.f(advertisementOrBuilder, "<this>");
        if (advertisementOrBuilder.hasAdvilRequest()) {
            return advertisementOrBuilder.getAdvilRequest();
        }
        return null;
    }

    public static /* synthetic */ void getAdvilRequestOrNull$annotations(AdvertisementOrBuilder advertisementOrBuilder) {
    }

    public static final VenueData getVenueDataOrNull(AdvertisementOrBuilder advertisementOrBuilder) {
        x.f(advertisementOrBuilder, "<this>");
        if (advertisementOrBuilder.hasVenueData()) {
            return advertisementOrBuilder.getVenueData();
        }
        return null;
    }

    public static /* synthetic */ void getVenueDataOrNull$annotations(AdvertisementOrBuilder advertisementOrBuilder) {
    }
}
