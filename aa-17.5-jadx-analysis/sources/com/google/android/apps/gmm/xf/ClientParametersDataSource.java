package com.google.android.apps.gmm.xf;

import defpackage.plz;
import defpackage.qch;
import j$.util.Optional;

/* loaded from: classes2.dex */
public class ClientParametersDataSource implements DataSource {
    private final qch a;
    private volatile plz b;

    public ClientParametersDataSource(Optional optional) {
        this.a = (qch) optional.orElse(null);
    }

    @Override // com.google.android.apps.gmm.xf.DataSource
    public final Optional<Boolean> getBoolValue(String str) {
        return Optional.empty();
    }

    @Override // com.google.android.apps.gmm.xf.DataSource
    public final Optional<Double> getF64Value(String str) {
        return Optional.empty();
    }

    @Override // com.google.android.apps.gmm.xf.DataSource
    public final Optional<Long> getI64Value(String str) {
        return Optional.empty();
    }

    @Override // com.google.android.apps.gmm.xf.DataSource
    public final String getName() {
        return "CLIENT_PARAMETERS";
    }
}
