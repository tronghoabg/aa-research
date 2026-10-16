package com.waze.navigate;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bs implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31143b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31144c;

    public /* synthetic */ bs(Object obj, int i2, int i3) {
        this.f31144c = i3;
        this.f31143b = obj;
        this.f31142a = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f31144c;
        if (i2 == 0) {
            bt.resumeNavigation$lambda$0((bt) this.f31143b, this.f31142a);
            return null;
        }
        if (i2 == 1) {
            return bt.getProduct$lambda$0((bt) this.f31143b, this.f31142a);
        }
        if (i2 == 2) {
            return ds.getMetersToCrossSegment$lambda$0((ds) this.f31143b, this.f31142a);
        }
        int i3 = this.f31142a;
        if (i2 == 3) {
            return ds.getMetersElapsedSinceSegment$lambda$0((ds) this.f31143b, i3);
        }
        fh.removeParked$lambda$0((fh) this.f31143b, i3);
        return null;
    }
}
