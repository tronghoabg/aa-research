package com.google.android.c.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f3864e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f3863d = new c(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f3862c = new c(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f3861b = new c(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f3860a = new c(0);

    private c(int i2) {
        this.f3864e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f3864e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? h.a(i2) != null : e.a(i2) != null : b.a(i2) != null : d.a(i2) != null;
    }
}
