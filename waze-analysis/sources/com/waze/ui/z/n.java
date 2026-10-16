package com.waze.ui.z;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f43981a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f43982b;

    public n(h.g.a.p pVar, List list) {
        this.f43981a = pVar;
        this.f43982b = list;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.f43981a.invoke(Integer.valueOf(iIntValue), this.f43982b.get(iIntValue));
    }
}
