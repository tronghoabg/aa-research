package com.waze.i;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ag implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24416c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f24415b = new ag(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f24414a = new ag(0);

    private ag(int i2) {
        this.f24416c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f24416c != 0 ? o.a(i2) != null : ah.a(i2) != null;
    }
}
