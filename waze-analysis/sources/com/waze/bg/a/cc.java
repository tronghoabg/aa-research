package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class cc implements com.google.v.ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f16511c;

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f16510b = new cc(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f16509a = new cc(0);

    private cc(int i2) {
        this.f16511c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f16511c != 0 ? cb.a(i2) != null : cd.b(i2) != null;
    }
}
