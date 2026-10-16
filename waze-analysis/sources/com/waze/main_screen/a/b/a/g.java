package com.waze.main_screen.a.b.a;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.main_screen.a.b.i;
import com.waze.navigate.ej;
import com.waze.navigate.en;
import com.waze.search.h.bx;
import com.waze.ui.j.j;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final bx f25581a;

    /* renamed from: b, reason: collision with root package name */
    private final j f25582b;

    /* renamed from: c, reason: collision with root package name */
    private final en f25583c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.a.b.j f25584d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f25585e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f25586f;

    public g(bx bxVar, j jVar, en enVar, com.waze.main_screen.a.b.j jVar2) {
        x.f(bxVar, "searchEmptyStateScreenStateHolder");
        x.f(jVar, "hamburgerButtonStateHolder");
        x.f(enVar, "navigateStateProvider");
        x.f(jVar2, "aapPreDriveStatsSender");
        this.f25581a = bxVar;
        this.f25582b = jVar;
        this.f25583c = enVar;
        this.f25584d = jVar2;
        bn bnVarB = ck.b(new i(enVar.ag().d() instanceof ej));
        this.f25585e = bnVarB;
        k kVarL = ai.L(bnVarB, new f(this, null));
        af viewModelScope = ViewModelKt.getViewModelScope(this);
        int i2 = bz.f51630a;
        this.f25586f = ai.V(kVarL, viewModelScope, by.c(), bnVarB.d());
        addCloseable((AutoCloseable) bxVar);
        addCloseable((AutoCloseable) jVar);
    }

    public final bx b() {
        return this.f25581a;
    }

    public final j c() {
        return this.f25582b;
    }

    public final ch e() {
        return this.f25586f;
    }

    public final void f() {
        this.f25584d.a();
    }
}
