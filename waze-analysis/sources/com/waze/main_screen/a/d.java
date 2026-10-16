package com.waze.main_screen.a;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.ac;
import com.waze.p;
import com.waze.shared_infra.i.e;
import h.g.b.am;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final p f25603a;

    /* renamed from: b, reason: collision with root package name */
    private final ac f25604b;

    /* renamed from: c, reason: collision with root package name */
    private final e f25605c;

    public d(p pVar, ac acVar, e eVar) {
        x.f(pVar, "appLifecycleStatsSender");
        x.f(acVar, "backgroundStateProvider");
        x.f(eVar, "logger");
        this.f25603a = pVar;
        this.f25604b = acVar;
        this.f25605c = eVar;
        eVar.e("Init " + System.identityHashCode(this));
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new c(this, new am(), null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        this.f25605c.e("onCleared " + System.identityHashCode(this));
    }
}
