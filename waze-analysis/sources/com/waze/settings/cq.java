package com.waze.settings;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cq implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr f36983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36984b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36985c;

    public /* synthetic */ cq(cr crVar, int i2, int i3) {
        this.f36985c = i3;
        this.f36983a = crVar;
        this.f36984b = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f36985c;
        int i3 = this.f36984b;
        cr crVar = this.f36983a;
        if (i2 != 0) {
            cr.setPreferredStation$lambda$0(crVar, i3);
            return null;
        }
        cr.setPreferredType$lambda$0(crVar, i3);
        return null;
    }
}
