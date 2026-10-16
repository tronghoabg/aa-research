package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements com.waze.main_screen.bottom_bars.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f27239a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f27240b;

    c(h.g.a.a aVar, h.g.a.a aVar2) {
        this.f27239a = aVar;
        this.f27240b = aVar2;
    }

    @Override // com.waze.main_screen.bottom_bars.b
    public final void a(int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.f27239a.invoke();
        } else {
            if (i3 != 2) {
                return;
            }
            this.f27240b.invoke();
        }
    }
}
