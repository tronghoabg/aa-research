package com.waze.sdk;

import android.support.v7.widget.cy;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends cy {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f35390c;

    k(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.f35390c = aeVar;
    }

    @Override // android.support.v7.widget.cy
    public final int b(int i2) {
        return this.f35390c.D.a(i2) ? 2 : 1;
    }
}
