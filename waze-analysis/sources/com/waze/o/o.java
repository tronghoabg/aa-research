package com.waze.o;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f32910e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f32909d = new o(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f32908c = new o(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f32907b = new o(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f32906a = new o(0);

    private o(int i2) {
        this.f32910e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f32910e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? bn.a(i2) != null : ah.a(i2) != null : g.a(i2) != null : p.a(i2) != null;
    }
}
