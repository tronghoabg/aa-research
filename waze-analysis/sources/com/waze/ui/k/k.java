package com.waze.ui.k;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class k implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f42440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42442c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42443d;

    public /* synthetic */ k(Object obj, h.g.a.l lVar, int i2, int i3) {
        this.f42443d = i3;
        this.f42442c = obj;
        this.f42440a = lVar;
        this.f42441b = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42443d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f42441b;
            h.g.a.l lVar = this.f42440a;
            return q.e((h) this.f42442c, lVar, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f42441b;
        h.g.a.l lVar2 = this.f42440a;
        return q.d((String) this.f42442c, lVar2, i3, (Composer) obj);
    }
}
