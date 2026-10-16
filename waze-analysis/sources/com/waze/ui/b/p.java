package com.waze.ui.b;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f42083a;

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f42084b;

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f42085c;

    /* renamed from: d, reason: collision with root package name */
    private final MutableState f42086d;

    public p(o oVar, boolean z, boolean z2, h.g.a.a aVar) {
        h.g.b.x.f(oVar, "initialValue");
        h.g.b.x.f(aVar, "onToggleClicked");
        this.f42083a = aVar;
        this.f42084b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(oVar, null, 2, null);
        this.f42085c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.f42086d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
    }

    private final void i(boolean z) {
        this.f42085c.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o a() {
        return (o) this.f42084b.getValue();
    }

    public final void b() {
        i(false);
    }

    public final void c() {
        i(true);
    }

    public final void d(boolean z) {
        this.f42086d.setValue(Boolean.valueOf(z));
    }

    public final void e(o oVar) {
        h.g.b.x.f(oVar, "<set-?>");
        this.f42084b.setValue(oVar);
    }

    public final void f() {
        o oVarA = a();
        o oVar = o.f42079a;
        if (oVarA == oVar) {
            oVar = o.f42080b;
        }
        e(oVar);
        this.f42083a.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.f42086d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        return ((Boolean) this.f42085c.getValue()).booleanValue();
    }
}
