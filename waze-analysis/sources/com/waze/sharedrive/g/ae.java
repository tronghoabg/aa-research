package com.waze.sharedrive.g;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f38612a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f38613b;

    public ae(h.g.a.p pVar, List list) {
        this.f38612a = pVar;
        this.f38613b = list;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.f38612a.invoke(Integer.valueOf(iIntValue), this.f38613b.get(iIntValue));
    }
}
