package com.waze.sound.e;

import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.waze.sound.bp;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39853a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39854b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f39855c;

    public j(com.waze.main_screen.r.a.c cVar) {
        x.f(cVar, "notificationMessageStateHolder");
        this.f39855c = cVar.a();
        this.f39853a = SnapshotIntStateKt.mutableIntStateOf(0);
        this.f39854b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    private final void n(boolean z) {
        this.f39854b.setValue(Boolean.valueOf(z));
    }

    public final m a() {
        return (m) this.f39853a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch b() {
        return this.f39855c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void c() {
        this.f39854b.e(false);
    }

    public final void d(bp bpVar) {
        x.f(bpVar, "guidanceMode");
        ((m) this.f39853a).e(bpVar);
        c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void e() {
        this.f39854b.e(true);
        ((m) this.f39853a).d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    public final h.g.a.a f() {
        return this.f39853a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    public final h.g.a.a g() {
        return this.f39854b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    public final h.g.a.a h() {
        return this.f39855c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch i() {
        return this.f39855c;
    }

    public final void j() {
        if (m()) {
            n(false);
            l(0);
        }
    }

    public final void k() {
        if (m()) {
            return;
        }
        n(true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    public final void l(int i2) {
        this.f39853a.setIntValue(i2);
    }

    public final boolean m() {
        return ((Boolean) ((State) this.f39854b).getValue()).booleanValue();
    }

    public j(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        x.f(aVar, "onRecenterClicked");
        x.f(aVar2, "onCloseClicked");
        x.f(aVar3, "onBack");
        this.f39855c = aVar;
        this.f39854b = aVar2;
        this.f39853a = aVar3;
    }

    public j(m mVar, boolean z) {
        x.f(mVar, "voiceGuidanceStateHolder");
        this.f39853a = mVar;
        bn bnVarB = ck.b(Boolean.valueOf(z));
        this.f39854b = bnVarB;
        this.f39855c = ai.U(bnVarB);
    }
}
