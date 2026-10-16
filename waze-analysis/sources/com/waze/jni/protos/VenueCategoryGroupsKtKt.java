package com.waze.jni.protos;

import com.waze.jni.protos.VenueCategoryGroups;
import com.waze.jni.protos.VenueCategoryGroupsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueCategoryGroupsKtKt {
    /* renamed from: -initializevenueCategoryGroups, reason: not valid java name */
    public static final VenueCategoryGroups m25596initializevenueCategoryGroups(l<? super VenueCategoryGroupsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VenueCategoryGroupsKt.Dsl.Companion companion = VenueCategoryGroupsKt.Dsl.Companion;
        VenueCategoryGroups.Builder builderNewBuilder = VenueCategoryGroups.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VenueCategoryGroupsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VenueCategoryGroups copy(VenueCategoryGroups venueCategoryGroups, l<? super VenueCategoryGroupsKt.Dsl, ab> lVar) {
        x.f(venueCategoryGroups, "<this>");
        x.f(lVar, "block");
        VenueCategoryGroupsKt.Dsl.Companion companion = VenueCategoryGroupsKt.Dsl.Companion;
        VenueCategoryGroups.Builder builder = venueCategoryGroups.toBuilder();
        x.e(builder, "toBuilder(...)");
        VenueCategoryGroupsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
