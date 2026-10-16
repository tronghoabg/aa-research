package com.google.android.apps.gmm.xf;

/* JADX INFO: loaded from: classes2.dex */
public class ClientParametersDataSource implements com.google.android.apps.gmm.xf.DataSource {
    private final defpackage.qdf a;
    private volatile defpackage.pmv b;

    public ClientParametersDataSource(j$.util.Optional optional) {
        this.a = (defpackage.qdf) optional.orElse(null);
    }

    @Override // com.google.android.apps.gmm.xf.DataSource
    public final j$.util.Optional<java.lang.Boolean> getBoolValue(java.lang.String str) {
        return j$.util.Optional.empty();
    }

    @Override // com.google.android.apps.gmm.xf.DataSource
    public final j$.util.Optional<java.lang.Double> getF64Value(java.lang.String str) {
        return j$.util.Optional.empty();
    }

    @Override // com.google.android.apps.gmm.xf.DataSource
    public final j$.util.Optional<java.lang.Long> getI64Value(java.lang.String str) {
        return j$.util.Optional.empty();
    }

    @Override // com.google.android.apps.gmm.xf.DataSource
    public final java.lang.String getName() {
        return "CLIENT_PARAMETERS";
    }
}
