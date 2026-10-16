package com.airbnb.lottie.b;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class w implements State {

    /* renamed from: a, reason: collision with root package name */
    private final CompletableDeferred f2081a = bo.j();

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f2082b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f2083c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    private final State f2084d;

    /* renamed from: e, reason: collision with root package name */
    private final State f2085e;

    public w() {
        SnapshotStateKt.derivedStateOf(new v(this, 0));
        this.f2084d = SnapshotStateKt.derivedStateOf(new v(this, 2));
        SnapshotStateKt.derivedStateOf(new v(this, 3));
        this.f2085e = SnapshotStateKt.derivedStateOf(new v(this, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.airbnb.lottie.h getValue() {
        return (com.airbnb.lottie.h) this.f2082b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable b() {
        return (Throwable) this.f2083c.getValue();
    }

    public final synchronized void c(com.airbnb.lottie.h hVar) {
        h.g.b.x.f(hVar, "composition");
        if (e()) {
            return;
        }
        this.f2082b.setValue(hVar);
        this.f2081a.a(hVar);
    }

    public final synchronized void d(Throwable th) {
        h.g.b.x.f(th, "error");
        if (e()) {
            return;
        }
        this.f2083c.setValue(th);
        this.f2081a.b(th);
    }

    public final boolean e() {
        return ((Boolean) this.f2084d.getValue()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.f2085e.getValue()).booleanValue();
    }
}
