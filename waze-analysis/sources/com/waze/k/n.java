package com.waze.k;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25014c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f25013b = new n(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f25012a = new n(0);

    private n(int i2) {
        this.f25014c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f25014c != 0 ? f.a(i2) != null : o.a(i2) != null;
    }
}
