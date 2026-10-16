package com.waze.sound;

import androidx.media3.datasource.DataSource;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gt implements DataSource.Factory {

    /* renamed from: a, reason: collision with root package name */
    private final gu f40102a;

    public gt(gu guVar) {
        h.g.b.x.f(guVar, "dataSource");
        this.f40102a = guVar;
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public final DataSource createDataSource() {
        return this.f40102a;
    }
}
