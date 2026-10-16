package com.waze.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class p extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public static final p f43179a = new p();

    p() {
        super(1, r.class, TypedValues.CycleType.S_WAVE_OFFSET, "offset(I)I", 1);
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        int i2 = r.f43259a;
        return Integer.valueOf(iIntValue + iIntValue);
    }
}
