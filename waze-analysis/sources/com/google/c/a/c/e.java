package com.google.c.a.c;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f7179c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f7178b = new e(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f7177a = new e(0);

    private e(int i2) {
        this.f7179c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f7179c != 0 ? a.a(i2) != null : f.a(i2) != null;
    }
}
