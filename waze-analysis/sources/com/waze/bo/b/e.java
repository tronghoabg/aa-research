package com.waze.bo.b;

import com.waze.settings.eb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final b f17186a;

    /* renamed from: b, reason: collision with root package name */
    private final eb f17187b;

    public e(b bVar, eb ebVar) {
        x.f(bVar, "context");
        x.f(ebVar, "settingsStatsSender");
        this.f17186a = bVar;
        this.f17187b = ebVar;
    }

    @Override // com.waze.bo.b.d
    public final void a() {
        this.f17187b.g(this.f17186a);
    }

    @Override // com.waze.bo.b.d
    public final void b(a aVar, a aVar2) {
        x.f(aVar, "avoidTollsChangedTo");
        x.f(aVar2, "avoidFerriesChangedTo");
        this.f17187b.e(aVar, aVar2, this.f17186a);
    }

    @Override // com.waze.bo.b.d
    public final void c(boolean z, boolean z2) {
        this.f17187b.f(z, z2, this.f17186a);
    }
}
