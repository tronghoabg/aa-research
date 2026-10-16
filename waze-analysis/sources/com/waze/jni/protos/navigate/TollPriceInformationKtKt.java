package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.TollPriceInformation;
import com.waze.jni.protos.navigate.TollPriceInformationKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TollPriceInformationKtKt {
    /* renamed from: -initializetollPriceInformation, reason: not valid java name */
    public static final TollPriceInformation m27775initializetollPriceInformation(l<? super TollPriceInformationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TollPriceInformationKt.Dsl.Companion companion = TollPriceInformationKt.Dsl.Companion;
        TollPriceInformation.Builder builderNewBuilder = TollPriceInformation.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TollPriceInformationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TollPriceInformation copy(TollPriceInformation tollPriceInformation, l<? super TollPriceInformationKt.Dsl, ab> lVar) {
        x.f(tollPriceInformation, "<this>");
        x.f(lVar, "block");
        TollPriceInformationKt.Dsl.Companion companion = TollPriceInformationKt.Dsl.Companion;
        TollPriceInformation.Builder builder = tollPriceInformation.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollPriceInformationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
