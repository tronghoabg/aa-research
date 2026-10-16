package com.google.h.c.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f11051c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f11050b = new l(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f11049a = new l(0);

    private l(int i2) {
        this.f11051c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f11051c != 0 ? f.a(i2) != null : m.a(i2) != null;
    }
}
