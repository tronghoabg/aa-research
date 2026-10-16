package com.waze.main_screen.u.b;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.waze.main_screen.u.o;
import com.waze.ui.u.p;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final o f27688a;

    /* renamed from: b, reason: collision with root package name */
    private final c f27689b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f27690c;

    /* renamed from: d, reason: collision with root package name */
    private final MutableState f27691d;

    public b(o oVar, c cVar) {
        x.f(oVar, "predictionCardStateHolder");
        x.f(cVar, "predictionCardUIActions");
        this.f27688a = oVar;
        this.f27689b = cVar;
        this.f27690c = oVar.a();
        this.f27691d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    @Override // com.waze.main_screen.u.b.a
    public final ch a() {
        return this.f27690c;
    }

    @Override // com.waze.main_screen.u.b.a
    public final void b(p pVar) {
        x.f(pVar, "predictionCardEvent");
        this.f27688a.b(pVar);
    }

    @Override // com.waze.main_screen.u.b.a
    public final void c() {
        this.f27689b.a();
    }

    @Override // com.waze.main_screen.u.b.a
    public final void d(boolean z) {
        this.f27691d.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.main_screen.u.b.a
    public final boolean e() {
        return ((Boolean) this.f27691d.getValue()).booleanValue();
    }
}
