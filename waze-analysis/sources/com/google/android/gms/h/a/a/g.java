package com.google.android.gms.h.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f5488c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f5487b = new g(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f5486a = new g(0);

    private g(int i2) {
        this.f5488c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f5488c != 0 ? d.a(i2) != null : h.a(i2) != null;
    }
}
