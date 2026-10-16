package com.google.w.c.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13183c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f13182b = new f(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f13181a = new f(0);

    private f(int i2) {
        this.f13183c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f13183c != 0 ? c.a(i2) != null : g.b(i2) != null;
    }
}
