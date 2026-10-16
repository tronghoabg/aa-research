package com.waze.search;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class am implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ an f35513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35514b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35515c;

    public /* synthetic */ am(an anVar, String str, int i2) {
        this.f35515c = i2;
        this.f35513a = anVar;
        this.f35514b = str;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f35515c;
        String str = this.f35514b;
        an anVar = this.f35513a;
        return i2 != 0 ? an.getCategoryProducts$lambda$0(anVar, str) : an.techCodesManagerHandle$lambda$0(anVar, str);
    }
}
