package com.waze.jni.protos.places;

import com.waze.jni.protos.places.PlaceFormatTitleSubtitle;
import com.waze.jni.protos.places.PlaceFormatTitleSubtitleKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlaceFormatTitleSubtitleKtKt {
    /* renamed from: -initializeplaceFormatTitleSubtitle, reason: not valid java name */
    public static final PlaceFormatTitleSubtitle m28017initializeplaceFormatTitleSubtitle(l<? super PlaceFormatTitleSubtitleKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PlaceFormatTitleSubtitleKt.Dsl.Companion companion = PlaceFormatTitleSubtitleKt.Dsl.Companion;
        PlaceFormatTitleSubtitle.Builder builderNewBuilder = PlaceFormatTitleSubtitle.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PlaceFormatTitleSubtitleKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PlaceFormatTitleSubtitle copy(PlaceFormatTitleSubtitle placeFormatTitleSubtitle, l<? super PlaceFormatTitleSubtitleKt.Dsl, ab> lVar) {
        x.f(placeFormatTitleSubtitle, "<this>");
        x.f(lVar, "block");
        PlaceFormatTitleSubtitleKt.Dsl.Companion companion = PlaceFormatTitleSubtitleKt.Dsl.Companion;
        PlaceFormatTitleSubtitle.Builder builder = placeFormatTitleSubtitle.toBuilder();
        x.e(builder, "toBuilder(...)");
        PlaceFormatTitleSubtitleKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
