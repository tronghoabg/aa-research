package com.waze.bg.e;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f16742c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f16741b = new g(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f16740a = new g(0);

    private g(int i2) {
        this.f16742c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f16742c != 0 ? a.a(i2) != null : h.a(i2) != null;
    }
}
