package com.waze.location;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ac implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae f25245a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25246b;

    public /* synthetic */ ac(ae aeVar, int i2) {
        this.f25246b = i2;
        this.f25245a = aeVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f25246b;
        ae aeVar = this.f25245a;
        return i2 != 0 ? ae.hasGPSReception$lambda$0(aeVar) : ae.getSavedLocation$lambda$0(aeVar);
    }
}
