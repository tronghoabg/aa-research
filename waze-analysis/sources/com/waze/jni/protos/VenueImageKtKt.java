package com.waze.jni.protos;

import com.waze.jni.protos.VenueImage;
import com.waze.jni.protos.VenueImageKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueImageKtKt {
    /* renamed from: -initializevenueImage, reason: not valid java name */
    public static final VenueImage m25721initializevenueImage(l<? super VenueImageKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VenueImageKt.Dsl.Companion companion = VenueImageKt.Dsl.Companion;
        VenueImage.Builder builderNewBuilder = VenueImage.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VenueImageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VenueImage copy(VenueImage venueImage, l<? super VenueImageKt.Dsl, ab> lVar) {
        x.f(venueImage, "<this>");
        x.f(lVar, "block");
        VenueImageKt.Dsl.Companion companion = VenueImageKt.Dsl.Companion;
        VenueImage.Builder builder = venueImage.toBuilder();
        x.e(builder, "toBuilder(...)");
        VenueImageKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Reporter getReporterOrNull(VenueImageOrBuilder venueImageOrBuilder) {
        x.f(venueImageOrBuilder, "<this>");
        if (venueImageOrBuilder.hasReporter()) {
            return venueImageOrBuilder.getReporter();
        }
        return null;
    }

    public static /* synthetic */ void getReporterOrNull$annotations(VenueImageOrBuilder venueImageOrBuilder) {
    }
}
