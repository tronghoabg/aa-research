package com.waze.ui.g;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class v implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f42370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f42371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42372c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42373d;

    public /* synthetic */ v(h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f42373d = i3;
        this.f42370a = aVar;
        this.f42371b = aVar2;
        this.f42372c = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42373d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f42372c;
            h.g.a.a aVar = this.f42371b;
            return w.c(this.f42370a, aVar, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f42372c;
        h.g.a.a aVar2 = this.f42371b;
        return w.d(this.f42370a, aVar2, i3, (Composer) obj);
    }
}
