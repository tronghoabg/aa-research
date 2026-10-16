package com.google.android.apps.gmm.xf;

import j$.util.Optional;

/* loaded from: classes2.dex */
public interface DataSource {
    Optional<Boolean> getBoolValue(String str);

    Optional<Double> getF64Value(String str);

    Optional<Long> getI64Value(String str);

    String getName();
}
