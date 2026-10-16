package com.waze.jni.protos.common;

import com.waze.jni.protos.common.Price;
import com.waze.jni.protos.common.PriceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PriceKtKt {
    /* renamed from: -initializeprice, reason: not valid java name */
    public static final Price m26074initializeprice(l<? super PriceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PriceKt.Dsl.Companion companion = PriceKt.Dsl.Companion;
        Price.Builder builderNewBuilder = Price.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PriceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Price copy(Price price, l<? super PriceKt.Dsl, ab> lVar) {
        x.f(price, "<this>");
        x.f(lVar, "block");
        PriceKt.Dsl.Companion companion = PriceKt.Dsl.Companion;
        Price.Builder builder = price.toBuilder();
        x.e(builder, "toBuilder(...)");
        PriceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
