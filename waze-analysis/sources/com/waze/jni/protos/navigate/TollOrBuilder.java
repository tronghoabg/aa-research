package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.waze.jni.protos.navigate.Toll;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface TollOrBuilder extends fj {
    Toll.Disabled getDisabled();

    Toll.DynamicPrice getDynamicPrice();

    Toll.FixedPrice getFixedPrice();

    Toll.MissingPass getMissingPass();

    Toll.NoPrice getNoPrice();

    Toll.PriceChangeAtTime getPriceChangedAtTime();

    Toll.PriceChangingByTime getPriceChangedByTime();

    Toll.TypeCase getTypeCase();

    Toll.WithPass getWithPass();

    boolean hasDisabled();

    boolean hasDynamicPrice();

    boolean hasFixedPrice();

    boolean hasMissingPass();

    boolean hasNoPrice();

    boolean hasPriceChangedAtTime();

    boolean hasPriceChangedByTime();

    boolean hasWithPass();
}
