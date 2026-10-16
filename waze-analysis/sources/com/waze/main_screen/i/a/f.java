package com.waze.main_screen.i.a;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.h.a.a f26458a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f26459b;

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f26460c;

    public f(com.waze.main_screen.h.a.a aVar) {
        x.f(aVar, "floatingNotificationStateHolder");
        this.f26458a = aVar;
        this.f26459b = aVar.a();
        this.f26460c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    @Override // com.waze.main_screen.i.a.e
    public final ch a() {
        return this.f26459b;
    }

    @Override // com.waze.main_screen.i.a.e
    public final void b() {
        this.f26458a.b();
    }

    @Override // com.waze.main_screen.i.a.e
    public final void c(boolean z) {
        this.f26460c.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.main_screen.i.a.e
    public final boolean d() {
        return ((Boolean) this.f26460c.getValue()).booleanValue();
    }
}
