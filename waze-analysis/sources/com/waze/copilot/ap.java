package com.waze.copilot;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ap implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22898c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f22897b = new ap(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f22896a = new ap(0);

    private ap(int i2) {
        this.f22898c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f22898c != 0 ? aj.a(i2) != null : aq.a(i2) != null;
    }
}
