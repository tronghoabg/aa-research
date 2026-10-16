package com.waze.realtime;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class d implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f33513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33514b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33515c;

    public /* synthetic */ d(h hVar, int i2, int i3) {
        this.f33515c = i3;
        this.f33513a = hVar;
        this.f33514b = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f33515c;
        int i3 = this.f33514b;
        h hVar = this.f33513a;
        if (i2 != 0) {
            h.onWazerPopupClosed$lambda$0(hVar, i3);
            return null;
        }
        h.onWazerPopupShown$lambda$0(hVar, i3);
        return null;
    }
}
