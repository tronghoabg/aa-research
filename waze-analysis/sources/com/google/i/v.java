package com.google.i;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f11071c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f11070b = new v(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f11069a = new v(0);

    private v(int i2) {
        this.f11071c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f11071c != 0 ? o.a(i2) != null : w.a(i2) != null;
    }
}
