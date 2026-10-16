package com.waze.ui.w;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f43782a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f43783b;

    public s(h.g.a.p pVar, List list) {
        this.f43782a = pVar;
        this.f43783b = list;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.f43782a.invoke(Integer.valueOf(iIntValue), this.f43783b.get(iIntValue));
    }
}
