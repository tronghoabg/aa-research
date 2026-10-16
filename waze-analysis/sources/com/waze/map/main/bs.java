package com.waze.map.main;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bs implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bt f29412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29415d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f29416e;

    public /* synthetic */ bs(bt btVar, int i2, int i3, int i4, int i5) {
        this.f29416e = i5;
        this.f29412a = btVar;
        this.f29413b = i2;
        this.f29414c = i3;
        this.f29415d = i4;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f29416e;
        if (i2 == 0) {
            int i3 = this.f29415d;
            int i4 = this.f29414c;
            return bt.fetchWazerPopupInfo$lambda$0(this.f29412a, this.f29413b, i4, i3);
        }
        int i5 = this.f29415d;
        if (i2 != 1) {
            int i6 = this.f29414c;
            return bt.fetchDetailsPopupInfo$lambda$0(this.f29412a, this.f29413b, i6, i5);
        }
        int i7 = this.f29414c;
        return bt.fetchParkingSuggestionPopupInfo$lambda$0(this.f29412a, this.f29413b, i7, i5);
    }
}
