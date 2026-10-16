package com.waze.ui.e;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    private CompletableDeferred f42250e;

    /* renamed from: a, reason: collision with root package name */
    private final MutatorMutex f42246a = new MutatorMutex();

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f42247b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(x.f42252a, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f42248c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ac((byte[]) null), null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    private final MutableIntState f42249d = SnapshotIntStateKt.mutableIntStateOf(1);

    /* renamed from: f, reason: collision with root package name */
    private final MutableState f42251f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public final int a() {
        return this.f42249d.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x b() {
        return (x) this.f42247b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ac c() {
        return (ac) this.f42248c.getValue();
    }

    public final Object d(h.c.e eVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.f42246a, null, new s(this, null), eVar, 1, null);
        return objMutate$default == h.c.a.a.f48038a ? objMutate$default : h.ab.f48028a;
    }

    public final Object e(h.c.e eVar) {
        Object objMutate;
        return (w.a(b()) && (objMutate = this.f42246a.mutate(MutatePriority.UserInput, new t(this, null, 1, null), eVar)) == h.c.a.a.f48038a) ? objMutate : h.ab.f48028a;
    }

    public final Object f(h.c.e eVar) {
        Object objMutate;
        return (b() == x.f42258g && (objMutate = this.f42246a.mutate(MutatePriority.UserInput, new t(this, null, 0), eVar)) == h.c.a.a.f48038a) ? objMutate : h.ab.f48028a;
    }

    public final CompletableDeferred g() {
        return this.f42250e;
    }

    public final void i(CompletableDeferred completableDeferred) {
        this.f42250e = completableDeferred;
    }

    public final void j(x xVar) {
        h.g.b.x.f(xVar, "<set-?>");
        this.f42247b.setValue(xVar);
    }

    public final void k(int i2) {
        this.f42249d.setIntValue(i2);
    }

    public final void l(ac acVar) {
        h.g.b.x.f(acVar, "<set-?>");
        this.f42248c.setValue(acVar);
    }

    public final void m(y yVar) {
        this.f42251f.setValue(yVar);
    }

    public final Object n(int i2, h.c.e eVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.f42246a, null, new u(this, i2, null), eVar, 1, null);
        return objMutate$default == h.c.a.a.f48038a ? objMutate$default : h.ab.f48028a;
    }
}
