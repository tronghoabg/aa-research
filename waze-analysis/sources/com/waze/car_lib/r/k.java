package com.waze.car_lib.r;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.R;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.al.a.a f21668a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21669b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f21670c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.bq f21671d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.p.dg f21672e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f21673f;

    public k(com.waze.al.a.a aVar, com.waze.shared_infra.o.a aVar2) {
        h.g.b.x.f(aVar, "consentBumpRepository");
        h.g.b.x.f(aVar2, "stringProvider");
        this.f21668a = aVar;
        this.f21669b = h.a.i.i(Integer.valueOf(R.string.CONSENT_BUMP_AA_BODY), Integer.valueOf(R.string.CONSENT_BUMP_AA_ACCEPT), Integer.valueOf(R.string.CONSENT_BUMP_AA_MORE));
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 0, null, 7);
        this.f21670c = bmVarE;
        this.f21671d = kotlinx.coroutines.b.ai.S(bmVarE);
        this.f21672e = new com.waze.car_lib.p.dg(null, aVar2.c(R.string.CONSENT_BUMP_AA_BODY, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, new com.waze.car_lib.p.dc(aVar2.c(R.string.CONSENT_BUMP_AA_ACCEPT, new Object[0]), true), new com.waze.car_lib.p.dc(aVar2.c(R.string.CONSENT_BUMP_AA_MORE, new Object[0]), false));
        this.f21673f = aVar.a();
    }

    public final com.waze.car_lib.p.dg a() {
        return this.f21672e;
    }

    public final kotlinx.coroutines.b.bq c() {
        return this.f21671d;
    }

    public final kotlinx.coroutines.b.ch d() {
        return this.f21673f;
    }

    public final void e() {
        this.f21668a.b(this.f21669b);
    }

    public final void f() {
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new j(this, (h.c.e) null, 0), 3);
    }
}
