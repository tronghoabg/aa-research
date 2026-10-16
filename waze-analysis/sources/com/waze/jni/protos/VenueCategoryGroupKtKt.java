package com.waze.jni.protos;

import com.waze.jni.protos.VenueCategoryGroup;
import com.waze.jni.protos.VenueCategoryGroupKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueCategoryGroupKtKt {
    /* renamed from: -initializevenueCategoryGroup, reason: not valid java name */
    public static final VenueCategoryGroup m25588initializevenueCategoryGroup(l<? super VenueCategoryGroupKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VenueCategoryGroupKt.Dsl.Companion companion = VenueCategoryGroupKt.Dsl.Companion;
        VenueCategoryGroup.Builder builderNewBuilder = VenueCategoryGroup.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VenueCategoryGroupKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VenueCategoryGroup copy(VenueCategoryGroup venueCategoryGroup, l<? super VenueCategoryGroupKt.Dsl, ab> lVar) {
        x.f(venueCategoryGroup, "<this>");
        x.f(lVar, "block");
        VenueCategoryGroupKt.Dsl.Companion companion = VenueCategoryGroupKt.Dsl.Companion;
        VenueCategoryGroup.Builder builder = venueCategoryGroup.toBuilder();
        x.e(builder, "toBuilder(...)");
        VenueCategoryGroupKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
