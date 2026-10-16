package com.google.w.a.b;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13103c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f13102b = new h(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f13101a = new h(0);

    private h(int i2) {
        this.f13103c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f13103c != 0 ? g.a(i2) != null : i.a(i2) != null;
    }
}
