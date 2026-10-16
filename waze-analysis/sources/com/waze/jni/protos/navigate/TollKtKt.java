package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.Toll;
import com.waze.jni.protos.navigate.TollKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TollKtKt {
    /* renamed from: -initializetoll, reason: not valid java name */
    public static final Toll m27748initializetoll(l<? super TollKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TollKt.Dsl.Companion companion = TollKt.Dsl.Companion;
        Toll.Builder builderNewBuilder = Toll.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TollKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.Disabled copy(Toll.Disabled disabled, l<? super TollKt.DisabledKt.Dsl, ab> lVar) {
        x.f(disabled, "<this>");
        x.f(lVar, "block");
        TollKt.DisabledKt.Dsl.Companion companion = TollKt.DisabledKt.Dsl.Companion;
        Toll.Disabled.Builder builder = disabled.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.DisabledKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.Disabled getDisabledOrNull(TollOrBuilder tollOrBuilder) {
        x.f(tollOrBuilder, "<this>");
        if (tollOrBuilder.hasDisabled()) {
            return tollOrBuilder.getDisabled();
        }
        return null;
    }

    public static /* synthetic */ void getDisabledOrNull$annotations(TollOrBuilder tollOrBuilder) {
    }

    public static final Toll.DynamicPrice getDynamicPriceOrNull(TollOrBuilder tollOrBuilder) {
        x.f(tollOrBuilder, "<this>");
        if (tollOrBuilder.hasDynamicPrice()) {
            return tollOrBuilder.getDynamicPrice();
        }
        return null;
    }

    public static /* synthetic */ void getDynamicPriceOrNull$annotations(TollOrBuilder tollOrBuilder) {
    }

    public static final Toll.FixedPrice getFixedPriceOrNull(Toll.MissingPass.PriceInfoOrBuilder priceInfoOrBuilder) {
        x.f(priceInfoOrBuilder, "<this>");
        if (priceInfoOrBuilder.hasFixedPrice()) {
            return priceInfoOrBuilder.getFixedPrice();
        }
        return null;
    }

    public static /* synthetic */ void getFixedPriceOrNull$annotations(Toll.MissingPass.PriceInfoOrBuilder priceInfoOrBuilder) {
    }

    public static final Toll.MissingPass getMissingPassOrNull(TollOrBuilder tollOrBuilder) {
        x.f(tollOrBuilder, "<this>");
        if (tollOrBuilder.hasMissingPass()) {
            return tollOrBuilder.getMissingPass();
        }
        return null;
    }

    public static /* synthetic */ void getMissingPassOrNull$annotations(TollOrBuilder tollOrBuilder) {
    }

    public static final Toll.NoPrice getNoPriceOrNull(TollOrBuilder tollOrBuilder) {
        x.f(tollOrBuilder, "<this>");
        if (tollOrBuilder.hasNoPrice()) {
            return tollOrBuilder.getNoPrice();
        }
        return null;
    }

    public static /* synthetic */ void getNoPriceOrNull$annotations(TollOrBuilder tollOrBuilder) {
    }

    public static final Toll.PriceChangeAtTime getPriceChangedAtTimeOrNull(TollOrBuilder tollOrBuilder) {
        x.f(tollOrBuilder, "<this>");
        if (tollOrBuilder.hasPriceChangedAtTime()) {
            return tollOrBuilder.getPriceChangedAtTime();
        }
        return null;
    }

    public static /* synthetic */ void getPriceChangedAtTimeOrNull$annotations(TollOrBuilder tollOrBuilder) {
    }

    public static final Toll.PriceChangingByTime getPriceChangedByTimeOrNull(TollOrBuilder tollOrBuilder) {
        x.f(tollOrBuilder, "<this>");
        if (tollOrBuilder.hasPriceChangedByTime()) {
            return tollOrBuilder.getPriceChangedByTime();
        }
        return null;
    }

    public static /* synthetic */ void getPriceChangedByTimeOrNull$annotations(TollOrBuilder tollOrBuilder) {
    }

    public static final Toll.MissingPass.PriceInfo getPriceInfoOrNull(Toll.MissingPassOrBuilder missingPassOrBuilder) {
        x.f(missingPassOrBuilder, "<this>");
        if (missingPassOrBuilder.hasPriceInfo()) {
            return missingPassOrBuilder.getPriceInfo();
        }
        return null;
    }

    public static /* synthetic */ void getPriceInfoOrNull$annotations(Toll.MissingPassOrBuilder missingPassOrBuilder) {
    }

    public static final Toll.WithPass getWithPassOrNull(TollOrBuilder tollOrBuilder) {
        x.f(tollOrBuilder, "<this>");
        if (tollOrBuilder.hasWithPass()) {
            return tollOrBuilder.getWithPass();
        }
        return null;
    }

    public static /* synthetic */ void getWithPassOrNull$annotations(TollOrBuilder tollOrBuilder) {
    }

    public static /* synthetic */ void getFixedPriceOrNull$annotations(Toll.PriceChangeAtTimeOrBuilder priceChangeAtTimeOrBuilder) {
    }

    public static /* synthetic */ void getFixedPriceOrNull$annotations(Toll.WithPassOrBuilder withPassOrBuilder) {
    }

    public static /* synthetic */ void getFixedPriceOrNull$annotations(TollOrBuilder tollOrBuilder) {
    }

    public static final Toll.FixedPrice getFixedPriceOrNull(Toll.PriceChangeAtTimeOrBuilder priceChangeAtTimeOrBuilder) {
        x.f(priceChangeAtTimeOrBuilder, "<this>");
        if (priceChangeAtTimeOrBuilder.hasFixedPrice()) {
            return priceChangeAtTimeOrBuilder.getFixedPrice();
        }
        return null;
    }

    public static final Toll.FixedPrice getFixedPriceOrNull(Toll.WithPassOrBuilder withPassOrBuilder) {
        x.f(withPassOrBuilder, "<this>");
        if (withPassOrBuilder.hasFixedPrice()) {
            return withPassOrBuilder.getFixedPrice();
        }
        return null;
    }

    public static final Toll.FixedPrice getFixedPriceOrNull(TollOrBuilder tollOrBuilder) {
        x.f(tollOrBuilder, "<this>");
        if (tollOrBuilder.hasFixedPrice()) {
            return tollOrBuilder.getFixedPrice();
        }
        return null;
    }

    public static final Toll.DynamicPrice copy(Toll.DynamicPrice dynamicPrice, l<? super TollKt.DynamicPriceKt.Dsl, ab> lVar) {
        x.f(dynamicPrice, "<this>");
        x.f(lVar, "block");
        TollKt.DynamicPriceKt.Dsl.Companion companion = TollKt.DynamicPriceKt.Dsl.Companion;
        Toll.DynamicPrice.Builder builder = dynamicPrice.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.DynamicPriceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.FixedPrice copy(Toll.FixedPrice fixedPrice, l<? super TollKt.FixedPriceKt.Dsl, ab> lVar) {
        x.f(fixedPrice, "<this>");
        x.f(lVar, "block");
        TollKt.FixedPriceKt.Dsl.Companion companion = TollKt.FixedPriceKt.Dsl.Companion;
        Toll.FixedPrice.Builder builder = fixedPrice.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.FixedPriceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.MissingPass.PriceInfo copy(Toll.MissingPass.PriceInfo priceInfo, l<? super TollKt.MissingPassKt.PriceInfoKt.Dsl, ab> lVar) {
        x.f(priceInfo, "<this>");
        x.f(lVar, "block");
        TollKt.MissingPassKt.PriceInfoKt.Dsl.Companion companion = TollKt.MissingPassKt.PriceInfoKt.Dsl.Companion;
        Toll.MissingPass.PriceInfo.Builder builder = priceInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.MissingPassKt.PriceInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.MissingPass copy(Toll.MissingPass missingPass, l<? super TollKt.MissingPassKt.Dsl, ab> lVar) {
        x.f(missingPass, "<this>");
        x.f(lVar, "block");
        TollKt.MissingPassKt.Dsl.Companion companion = TollKt.MissingPassKt.Dsl.Companion;
        Toll.MissingPass.Builder builder = missingPass.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.MissingPassKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.NoPrice copy(Toll.NoPrice noPrice, l<? super TollKt.NoPriceKt.Dsl, ab> lVar) {
        x.f(noPrice, "<this>");
        x.f(lVar, "block");
        TollKt.NoPriceKt.Dsl.Companion companion = TollKt.NoPriceKt.Dsl.Companion;
        Toll.NoPrice.Builder builder = noPrice.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.NoPriceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.PriceChangeAtTime copy(Toll.PriceChangeAtTime priceChangeAtTime, l<? super TollKt.PriceChangeAtTimeKt.Dsl, ab> lVar) {
        x.f(priceChangeAtTime, "<this>");
        x.f(lVar, "block");
        TollKt.PriceChangeAtTimeKt.Dsl.Companion companion = TollKt.PriceChangeAtTimeKt.Dsl.Companion;
        Toll.PriceChangeAtTime.Builder builder = priceChangeAtTime.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.PriceChangeAtTimeKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.PriceChangingByTime copy(Toll.PriceChangingByTime priceChangingByTime, l<? super TollKt.PriceChangingByTimeKt.Dsl, ab> lVar) {
        x.f(priceChangingByTime, "<this>");
        x.f(lVar, "block");
        TollKt.PriceChangingByTimeKt.Dsl.Companion companion = TollKt.PriceChangingByTimeKt.Dsl.Companion;
        Toll.PriceChangingByTime.Builder builder = priceChangingByTime.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.PriceChangingByTimeKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll.WithPass copy(Toll.WithPass withPass, l<? super TollKt.WithPassKt.Dsl, ab> lVar) {
        x.f(withPass, "<this>");
        x.f(lVar, "block");
        TollKt.WithPassKt.Dsl.Companion companion = TollKt.WithPassKt.Dsl.Companion;
        Toll.WithPass.Builder builder = withPass.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.WithPassKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Toll copy(Toll toll, l<? super TollKt.Dsl, ab> lVar) {
        x.f(toll, "<this>");
        x.f(lVar, "block");
        TollKt.Dsl.Companion companion = TollKt.Dsl.Companion;
        Toll.Builder builder = toll.toBuilder();
        x.e(builder, "toBuilder(...)");
        TollKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
