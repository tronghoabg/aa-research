package com.waze.q;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.R;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.al.a.a f33480a;

    /* renamed from: b, reason: collision with root package name */
    private final List f33481b;

    /* renamed from: c, reason: collision with root package name */
    private final j f33482c;

    /* renamed from: d, reason: collision with root package name */
    private final bm f33483d;

    /* renamed from: e, reason: collision with root package name */
    private final bq f33484e;

    public l(com.waze.shared_infra.o.a aVar, com.waze.al.a.a aVar2) {
        x.f(aVar, "stringProvider");
        x.f(aVar2, "consentBumpRepository");
        this.f33480a = aVar2;
        this.f33481b = h.a.i.i(Integer.valueOf(R.string.CONSENT_BUMP_MOBILE_BODY_HTML), Integer.valueOf(R.string.CONSENT_BUMP_MOBILE_ACCEPT));
        this.f33482c = new j(aVar.c(R.string.CONSENT_BUMP_MOBILE_BODY_HTML, new Object[0]), aVar.c(R.string.CONSENT_BUMP_MOBILE_ACCEPT, new Object[0]));
        bm bmVarE = bu.e(0, 0, null, 7);
        this.f33483d = bmVarE;
        this.f33484e = ai.S(bmVarE);
    }

    private final void h(com.waze.calendar.b bVar) {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new k(this, bVar, null), 3);
    }

    public final j a() {
        return this.f33482c;
    }

    public final bq c() {
        return this.f33484e;
    }

    public final void d() {
        this.f33480a.b(this.f33481b);
    }

    public final void e() {
        h(g.f33472a);
    }

    public final void f() {
        h(h.f33473a);
    }

    public final void g(String str) {
        x.f(str, "url");
        h(new i(str));
    }
}
