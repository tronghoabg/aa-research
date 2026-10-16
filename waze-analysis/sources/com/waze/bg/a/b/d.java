package com.waze.bg.a.b;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d implements ei {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f16341d;

    /* renamed from: c, reason: collision with root package name */
    static final ei f16340c = new d(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f16339b = new d(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f16338a = new d(0);

    private d(int i2) {
        this.f16341d = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f16341d;
        return i3 != 0 ? i3 != 1 ? t.a(i2) != null : a.a(i2) != null : e.a(i2) != null;
    }
}
