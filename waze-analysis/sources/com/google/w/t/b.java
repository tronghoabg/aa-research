package com.google.w.t;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f13370e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f13369d = new b(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f13368c = new b(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f13367b = new b(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f13366a = new b(0);

    private b(int i2) {
        this.f13370e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f13370e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? e.b(i2) != null : d.b(i2) != null : a.b(i2) != null : c.b(i2) != null;
    }
}
