package com.google.w.k;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13265c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f13264b = new r(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f13263a = new r(0);

    private r(int i2) {
        this.f13265c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f13265c != 0 ? q.a(i2) != null : s.a(i2) != null;
    }
}
