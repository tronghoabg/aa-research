package com.fasterxml.jackson.databind.node;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class DecimalNode$$ExternalSyntheticBackport0 {
    public static /* synthetic */ int m(double d2) {
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
