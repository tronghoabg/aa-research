package com.waze.bw.c.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cn implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f18042a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f18043b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18044c;

    public cn(h.g.a.p pVar, List list, int i2) {
        this.f18044c = i2;
        this.f18042a = pVar;
        this.f18043b = list;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f18044c;
        if (i2 == 0) {
            int iIntValue = ((Number) obj).intValue();
            return this.f18042a.invoke(Integer.valueOf(iIntValue), this.f18043b.get(iIntValue));
        }
        if (i2 != 1) {
            int iIntValue2 = ((Number) obj).intValue();
            return this.f18042a.invoke(Integer.valueOf(iIntValue2), this.f18043b.get(iIntValue2));
        }
        int iIntValue3 = ((Number) obj).intValue();
        return this.f18042a.invoke(Integer.valueOf(iIntValue3), this.f18043b.get(iIntValue3));
    }
}
