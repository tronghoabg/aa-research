package com.waze.t.c;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final l f40864a;

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f40865b;

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f40866c;

    public k(Context context, l lVar) {
        x.f(context, "context");
        x.f(lVar, "stateHolder");
        this.f40864a = lVar;
        this.f40865b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(n.l(context)), null, 2, null);
        this.f40866c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private final void h(boolean z) {
        this.f40865b.setValue(Boolean.valueOf(z));
    }

    public final l a() {
        return this.f40864a;
    }

    public final void b() {
        this.f40864a.a();
        h(false);
    }

    public final void c() {
        this.f40864a.b();
        h(true);
    }

    public final void d(boolean z) {
        this.f40866c.setValue(Boolean.valueOf(z));
    }

    public final void e(Context context) {
        x.f(context, "context");
        h(n.l(context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        return ((Boolean) this.f40865b.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.f40866c.getValue()).booleanValue();
    }
}
