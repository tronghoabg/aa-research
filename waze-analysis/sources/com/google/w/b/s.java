package com.google.w.b;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13144c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f13143b = new s(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f13142a = new s(0);

    private s(int i2) {
        this.f13144c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f13144c != 0 ? c.a(i2) != null : t.b(i2) != null;
    }
}
