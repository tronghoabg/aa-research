package com.waze.jni.protos;

import com.waze.jni.protos.GetCurrencyStringResponse;
import com.waze.jni.protos.GetCurrencyStringResponseKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GetCurrencyStringResponseKtKt {
    /* renamed from: -initializegetCurrencyStringResponse, reason: not valid java name */
    public static final GetCurrencyStringResponse m25162initializegetCurrencyStringResponse(l<? super GetCurrencyStringResponseKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GetCurrencyStringResponseKt.Dsl.Companion companion = GetCurrencyStringResponseKt.Dsl.Companion;
        GetCurrencyStringResponse.Builder builderNewBuilder = GetCurrencyStringResponse.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GetCurrencyStringResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GetCurrencyStringResponse copy(GetCurrencyStringResponse getCurrencyStringResponse, l<? super GetCurrencyStringResponseKt.Dsl, ab> lVar) {
        x.f(getCurrencyStringResponse, "<this>");
        x.f(lVar, "block");
        GetCurrencyStringResponseKt.Dsl.Companion companion = GetCurrencyStringResponseKt.Dsl.Companion;
        GetCurrencyStringResponse.Builder builder = getCurrencyStringResponse.toBuilder();
        x.e(builder, "toBuilder(...)");
        GetCurrencyStringResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
