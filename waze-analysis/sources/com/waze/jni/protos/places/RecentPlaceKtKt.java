package com.waze.jni.protos.places;

import com.waze.jni.protos.places.RecentPlace;
import com.waze.jni.protos.places.RecentPlaceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RecentPlaceKtKt {
    /* renamed from: -initializerecentPlace, reason: not valid java name */
    public static final RecentPlace m28044initializerecentPlace(l<? super RecentPlaceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RecentPlaceKt.Dsl.Companion companion = RecentPlaceKt.Dsl.Companion;
        RecentPlace.Builder builderNewBuilder = RecentPlace.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RecentPlaceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RecentPlace copy(RecentPlace recentPlace, l<? super RecentPlaceKt.Dsl, ab> lVar) {
        x.f(recentPlace, "<this>");
        x.f(lVar, "block");
        RecentPlaceKt.Dsl.Companion companion = RecentPlaceKt.Dsl.Companion;
        RecentPlace.Builder builder = recentPlace.toBuilder();
        x.e(builder, "toBuilder(...)");
        RecentPlaceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
