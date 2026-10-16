package com.waze.main_screen.ag.a;

import com.waze.main_screen.g.p;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f25810a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f25811b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f25812c;

    b(h.g.a.a aVar, h.g.a.a aVar2, l lVar) {
        this.f25810a = aVar;
        this.f25811b = aVar2;
        this.f25812c = lVar;
    }

    @Override // com.waze.main_screen.g.p
    public final void a() {
        this.f25810a.invoke();
    }

    @Override // com.waze.main_screen.g.p
    public final void b() {
        this.f25811b.invoke();
    }

    @Override // com.waze.main_screen.g.p
    public final void c(float f2) {
        this.f25812c.invoke(Float.valueOf(f2));
    }
}
