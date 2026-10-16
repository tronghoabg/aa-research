package com.waze.ui.m;

import androidx.compose.material.ModalBottomSheetState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cv implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f42915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.af f42916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f42917c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42918d;

    public /* synthetic */ cv(h.g.a.l lVar, kotlinx.coroutines.af afVar, ModalBottomSheetState modalBottomSheetState, int i2) {
        this.f42918d = i2;
        this.f42915a = lVar;
        this.f42916b = afVar;
        this.f42917c = modalBottomSheetState;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f42918d;
        h.g.a.l lVar = this.f42915a;
        if (i2 != 0) {
            lVar.invoke(ak.f42788a);
            kotlinx.coroutines.aj.z(this.f42916b, null, null, new da(this.f42917c, (h.c.e) null, 2, (char[]) null), 3);
            return h.ab.f48028a;
        }
        lVar.invoke(aj.f42787a);
        kotlinx.coroutines.aj.z(this.f42916b, null, null, new da(this.f42917c, (h.c.e) null, 1, (byte[]) null), 3);
        return h.ab.f48028a;
    }
}
