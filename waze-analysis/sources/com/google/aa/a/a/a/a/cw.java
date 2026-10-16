package com.google.aa.a.a.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cw implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f3757e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f3756d = new cw(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f3755c = new cw(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f3754b = new cw(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f3753a = new cw(0);

    private cw(int i2) {
        this.f3757e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f3757e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? df.a(i2) != null : db.a(i2) != null : cl.a(i2) != null : cx.a(i2) != null;
    }
}
