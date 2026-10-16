package com.google.android.apps.gmm.xf;

/* JADX INFO: loaded from: classes2.dex */
public interface DataSource {
    j$.util.Optional<java.lang.Boolean> getBoolValue(java.lang.String str);

    j$.util.Optional<java.lang.Double> getF64Value(java.lang.String str);

    j$.util.Optional<java.lang.Long> getI64Value(java.lang.String str);

    java.lang.String getName();
}
