package com.waze.jni.protos;

import com.waze.jni.protos.GetCurrencyStringRequest;
import com.waze.jni.protos.GetCurrencyStringRequestKt;
import com.waze.jni.protos.common.Price;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GetCurrencyStringRequestKtKt {
    /* renamed from: -initializegetCurrencyStringRequest, reason: not valid java name */
    public static final GetCurrencyStringRequest m25155initializegetCurrencyStringRequest(l<? super GetCurrencyStringRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GetCurrencyStringRequestKt.Dsl.Companion companion = GetCurrencyStringRequestKt.Dsl.Companion;
        GetCurrencyStringRequest.Builder builderNewBuilder = GetCurrencyStringRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GetCurrencyStringRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GetCurrencyStringRequest copy(GetCurrencyStringRequest getCurrencyStringRequest, l<? super GetCurrencyStringRequestKt.Dsl, ab> lVar) {
        x.f(getCurrencyStringRequest, "<this>");
        x.f(lVar, "block");
        GetCurrencyStringRequestKt.Dsl.Companion companion = GetCurrencyStringRequestKt.Dsl.Companion;
        GetCurrencyStringRequest.Builder builder = getCurrencyStringRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        GetCurrencyStringRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Price getPriceOrNull(GetCurrencyStringRequestOrBuilder getCurrencyStringRequestOrBuilder) {
        x.f(getCurrencyStringRequestOrBuilder, "<this>");
        if (getCurrencyStringRequestOrBuilder.hasPrice()) {
            return getCurrencyStringRequestOrBuilder.getPrice();
        }
        return null;
    }

    public static /* synthetic */ void getPriceOrNull$annotations(GetCurrencyStringRequestOrBuilder getCurrencyStringRequestOrBuilder) {
    }
}
