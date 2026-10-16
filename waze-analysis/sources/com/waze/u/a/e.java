package com.waze.u.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f41620e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f41619d = new e(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f41618c = new e(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f41617b = new e(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f41616a = new e(0);

    private e(int i2) {
        this.f41620e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f41620e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? t.b(i2) != null : q.a(i2) != null : d.a(i2) != null : f.a(i2) != null;
    }
}
