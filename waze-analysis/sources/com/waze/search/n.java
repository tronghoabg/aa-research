package com.waze.search;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class n implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35991a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f35992b;

    public /* synthetic */ n(int i2, int i3) {
        this.f35992b = i3;
        this.f35991a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f35992b != 0) {
            ((Integer) obj2).intValue();
            return ai.m(this.f35991a, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        return ai.n(this.f35991a, (Composer) obj);
    }
}
