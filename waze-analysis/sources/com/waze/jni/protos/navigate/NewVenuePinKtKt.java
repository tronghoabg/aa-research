package com.waze.jni.protos.navigate;

import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.navigate.NewVenuePin;
import com.waze.jni.protos.navigate.NewVenuePinKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NewVenuePinKtKt {
    /* renamed from: -initializenewVenuePin, reason: not valid java name */
    public static final NewVenuePin m27417initializenewVenuePin(l<? super NewVenuePinKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NewVenuePinKt.Dsl.Companion companion = NewVenuePinKt.Dsl.Companion;
        NewVenuePin.Builder builderNewBuilder = NewVenuePin.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NewVenuePinKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NewVenuePin copy(NewVenuePin newVenuePin, l<? super NewVenuePinKt.Dsl, ab> lVar) {
        x.f(newVenuePin, "<this>");
        x.f(lVar, "block");
        NewVenuePinKt.Dsl.Companion companion = NewVenuePinKt.Dsl.Companion;
        NewVenuePin.Builder builder = newVenuePin.toBuilder();
        x.e(builder, "toBuilder(...)");
        NewVenuePinKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VenueData getVenueOrNull(NewVenuePinOrBuilder newVenuePinOrBuilder) {
        x.f(newVenuePinOrBuilder, "<this>");
        if (newVenuePinOrBuilder.hasVenue()) {
            return newVenuePinOrBuilder.getVenue();
        }
        return null;
    }

    public static /* synthetic */ void getVenueOrNull$annotations(NewVenuePinOrBuilder newVenuePinOrBuilder) {
    }
}
