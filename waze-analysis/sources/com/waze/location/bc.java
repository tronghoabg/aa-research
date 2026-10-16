package com.waze.location;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bc implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bd f25337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25338b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25339c;

    public /* synthetic */ bc(bd bdVar, int i2, int i3) {
        this.f25339c = i3;
        this.f25337a = bdVar;
        this.f25338b = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f25339c;
        int i3 = this.f25338b;
        bd bdVar = this.f25337a;
        if (i2 != 0) {
            bd.SetCompass$lambda$0(bdVar, i3);
            return null;
        }
        bd.setInnerCarCompass$lambda$0(bdVar, i3);
        return null;
    }
}
