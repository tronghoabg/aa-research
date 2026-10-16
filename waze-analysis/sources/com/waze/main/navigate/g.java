package com.waze.main.navigate;

import androidx.lifecycle.ViewModel;
import com.waze.sharedrive.e.aj;
import com.waze.sharedrive.e.ak;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.l.b.j f25508a;

    public g(com.waze.main_screen.l.b.e eVar) {
        x.f(eVar, "stateHolderFactory");
        this.f25508a = eVar.a(new aj(1), new ak(1));
        addCloseable(new f(this, 0));
    }

    static final void a(g gVar) {
        gVar.f25508a.b();
    }
}
