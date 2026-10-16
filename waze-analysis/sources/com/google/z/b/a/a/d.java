package com.google.z.b.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d implements ei {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f13496f;

    /* renamed from: e, reason: collision with root package name */
    static final ei f13495e = new d(4);

    /* renamed from: d, reason: collision with root package name */
    static final ei f13494d = new d(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f13493c = new d(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f13492b = new d(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f13491a = new d(0);

    private d(int i2) {
        this.f13496f = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f13496f;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? aa.a(i2) != null : j.a(i2) != null : i.a(i2) != null : b.a(i2) != null : e.a(i2) != null;
    }
}
