package com.waze.jni.protos.places;

import com.waze.jni.protos.places.GenericPlaces;
import com.waze.jni.protos.places.GenericPlacesKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlacesKtKt {
    /* renamed from: -initializegenericPlaces, reason: not valid java name */
    public static final GenericPlaces m27977initializegenericPlaces(l<? super GenericPlacesKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GenericPlacesKt.Dsl.Companion companion = GenericPlacesKt.Dsl.Companion;
        GenericPlaces.Builder builderNewBuilder = GenericPlaces.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GenericPlacesKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GenericPlaces copy(GenericPlaces genericPlaces, l<? super GenericPlacesKt.Dsl, ab> lVar) {
        x.f(genericPlaces, "<this>");
        x.f(lVar, "block");
        GenericPlacesKt.Dsl.Companion companion = GenericPlacesKt.Dsl.Companion;
        GenericPlaces.Builder builder = genericPlaces.toBuilder();
        x.e(builder, "toBuilder(...)");
        GenericPlacesKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
