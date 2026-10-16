package com.waze.ak;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f14107e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f14106d = new k(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f14105c = new k(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f14104b = new k(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f14103a = new k(0);

    private k(int i2) {
        this.f14107e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f14107e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? af.a(i2) != null : y.a(i2) != null : a.a(i2) != null : l.a(i2) != null;
    }
}
