package com.waze.jni.protos;

import com.waze.jni.protos.AdvilRequest;
import com.waze.jni.protos.AdvilRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AdvilRequestKtKt {
    /* renamed from: -initializeadvilRequest, reason: not valid java name */
    public static final AdvilRequest m24923initializeadvilRequest(l<? super AdvilRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AdvilRequestKt.Dsl.Companion companion = AdvilRequestKt.Dsl.Companion;
        AdvilRequest.Builder builderNewBuilder = AdvilRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AdvilRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdvilRequest copy(AdvilRequest advilRequest, l<? super AdvilRequestKt.Dsl, ab> lVar) {
        x.f(advilRequest, "<this>");
        x.f(lVar, "block");
        AdvilRequestKt.Dsl.Companion companion = AdvilRequestKt.Dsl.Companion;
        AdvilRequest.Builder builder = advilRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        AdvilRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
