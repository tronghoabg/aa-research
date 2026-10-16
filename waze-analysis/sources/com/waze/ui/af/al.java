package com.waze.ui.af;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f41839a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f41840b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41841c;

    public al(h.g.a.p pVar, List list, int i2) {
        this.f41841c = i2;
        this.f41839a = pVar;
        this.f41840b = list;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f41841c != 0) {
            int iIntValue = ((Number) obj).intValue();
            return this.f41839a.invoke(Integer.valueOf(iIntValue), this.f41840b.get(iIntValue));
        }
        int iIntValue2 = ((Number) obj).intValue();
        return this.f41839a.invoke(Integer.valueOf(iIntValue2), this.f41840b.get(iIntValue2));
    }
}
