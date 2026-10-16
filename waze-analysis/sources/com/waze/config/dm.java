package com.waze.config;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class dm implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn f22628a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22629b;

    public /* synthetic */ dm(dn dnVar, int i2) {
        this.f22629b = i2;
        this.f22628a = dnVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f22629b;
        if (i2 == 0) {
            return dn.getWebUrlWhiteList$lambda$0(this.f22628a);
        }
        dn dnVar = this.f22628a;
        return i2 != 1 ? dn.getAndroidAutoAvailableReportCategories$lambda$0(dnVar) : dn.getAvailableReportCategories$lambda$0(dnVar);
    }
}
