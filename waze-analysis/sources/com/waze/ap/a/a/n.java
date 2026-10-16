package com.waze.ap.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class n implements ei {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f14957d;

    /* renamed from: c, reason: collision with root package name */
    static final ei f14956c = new n(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f14955b = new n(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f14954a = new n(0);

    private n(int i2) {
        this.f14957d = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f14957d;
        return i3 != 0 ? i3 != 1 ? ao.b(i2) != null : d.b(i2) != null : o.b(i2) != null;
    }
}
