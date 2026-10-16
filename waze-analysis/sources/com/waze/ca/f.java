package com.waze.ca;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18733c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f18732b = new f(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f18731a = new f(0);

    private f(int i2) {
        this.f18733c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f18733c != 0 ? a.b(i2) != null : g.a(i2) != null;
    }
}
