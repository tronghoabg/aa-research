package com.waze.ui.m;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cp implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f42887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42888b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42889c;

    public /* synthetic */ cp(ad adVar, MutableState mutableState, int i2) {
        this.f42889c = i2;
        this.f42888b = adVar;
        this.f42887a = mutableState;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42889c != 0) {
            int iIntValue = ((Integer) obj2).intValue();
            ?? r0 = this.f42887a;
            return dc.N((ad) this.f42888b, r0, (Composer) obj, iIntValue);
        }
        int iIntValue2 = ((Integer) obj2).intValue();
        ?? r02 = this.f42888b;
        return dc.i(this.f42887a, r02, (Composer) obj, iIntValue2);
    }

    public /* synthetic */ cp(h.g.a.a aVar, h.g.a.a aVar2, int i2) {
        this.f42889c = i2;
        this.f42887a = aVar;
        this.f42888b = aVar2;
    }
}
