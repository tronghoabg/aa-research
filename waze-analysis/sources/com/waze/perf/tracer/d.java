package com.waze.perf.tracer;

import androidx.autofill.HintConstants;
import com.waze.shared_infra.q.m;
import com.waze.shared_infra.q.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f33069a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33070b;

    /* renamed from: c, reason: collision with root package name */
    private final n f33071c;

    /* renamed from: d, reason: collision with root package name */
    private final StringBuilder f33072d;

    public d(e eVar, String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f33069a = eVar;
        this.f33070b = str;
        this.f33071c = m.a(false);
        this.f33072d = new StringBuilder();
    }

    @Override // com.waze.perf.tracer.f
    public final void a(String str, String str2) {
        x.f(str, "key");
        x.f(str2, "value");
        this.f33072d.append(", [A] " + str + "=" + str2);
    }

    @Override // com.waze.perf.tracer.f
    public final void b(String str, long j2) {
        x.f(str, "key");
        this.f33072d.append(", [M] " + str + "=" + j2);
    }

    @Override // com.waze.perf.tracer.f
    public final void c() {
        this.f33071c.c();
    }

    @Override // com.waze.perf.tracer.f
    public final void d() {
        e eVar = this.f33069a;
        long jA = this.f33071c.a();
        eVar.b().a("trace " + this.f33070b + ", durationMs=" + jA + ((Object) this.f33072d));
    }
}
