package com.waze.reports_v2.a.a.a;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.waze.ui.w.b.ad;
import com.waze.ui.w.b.ae;
import com.waze.ui.w.b.af;
import com.waze.ui.w.b.ag;
import com.waze.ui.w.b.ah;
import com.waze.ui.w.b.ai;
import com.waze.ui.w.b.aj;
import com.waze.ui.w.b.al;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ch f33985a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33986b;

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f33987c;

    /* renamed from: d, reason: collision with root package name */
    private final MutableState f33988d;

    /* renamed from: e, reason: collision with root package name */
    private final c f33989e;

    public b(ch chVar, c cVar, a aVar, boolean z) {
        x.f(chVar, "activationState");
        x.f(cVar, "events");
        this.f33985a = chVar;
        this.f33989e = cVar;
        this.f33986b = z;
        this.f33987c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.f33988d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
    }

    private final void n(a aVar) {
        this.f33988d.setValue(aVar);
    }

    private final void o(boolean z) {
        this.f33987c.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a a() {
        return (a) this.f33988d.getValue();
    }

    public final ch b() {
        return this.f33985a;
    }

    public final void c() {
        n(null);
        this.f33989e.f33990a.d();
    }

    public final void d() {
        n(null);
    }

    public final void e() {
        this.f33989e.f33990a.g(ad.f43579a);
    }

    public final void f() {
        this.f33989e.f33990a.g(ae.f43580a);
    }

    public final void g() {
        this.f33989e.f33990a.g(ag.f43582a);
    }

    public final void h(boolean z) {
        o(z);
        this.f33989e.f33990a.g(new ah(z));
    }

    public final void i(boolean z) {
        this.f33989e.f33990a.g(new al(z));
    }

    public final void j(boolean z, boolean z2) {
        if (a() == null) {
            n(new a(z, z2));
            c cVar = this.f33989e;
            cVar.f33990a.g(af.f43581a);
        }
    }

    public final void k(boolean z) {
        o(z);
        c cVar = this.f33989e;
        if (z) {
            cVar.f33990a.g(aj.f43585a);
        } else {
            cVar.f33990a.g(ai.f43584a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        return ((Boolean) this.f33987c.getValue()).booleanValue();
    }

    public final boolean m() {
        return this.f33986b;
    }
}
