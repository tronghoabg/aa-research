package com.waze.ui.m;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ct implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f42905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f42906b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42907c;

    public /* synthetic */ ct(long j2, float f2, int i2) {
        this.f42907c = i2;
        this.f42905a = j2;
        this.f42906b = f2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f42907c;
        if (i2 == 0) {
            float f2 = this.f42906b;
            return a.a.r(this.f42905a, f2, (DrawScope) obj);
        }
        if (i2 != 1) {
            float f3 = this.f42906b;
            return a.a.r(this.f42905a, f3, (DrawScope) obj);
        }
        float f4 = this.f42906b;
        long j2 = this.f42905a;
        int i3 = com.waze.search.v2.cu.f36302a;
        return a.a.r(j2, f4, (DrawScope) obj);
    }
}
