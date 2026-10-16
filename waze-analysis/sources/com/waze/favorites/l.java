package com.waze.favorites;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class l implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f23808a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23809b;

    public /* synthetic */ l(o oVar, int i2) {
        this.f23809b = i2;
        this.f23808a = oVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f23809b;
        if (i2 == 0) {
            return o.getHome$lambda$0(this.f23808a);
        }
        if (i2 == 1) {
            return o.getFavorites$lambda$0(this.f23808a);
        }
        o oVar = this.f23808a;
        return i2 != 2 ? o.isHomeWorkSet$lambda$0(oVar) : o.getWork$lambda$0(oVar);
    }
}
