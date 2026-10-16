package com.waze.bg.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f16313c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f16312b = new m(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f16311a = new m(0);

    private m(int i2) {
        this.f16313c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f16313c != 0 ? h.a(i2) != null : n.a(i2) != null;
    }
}
