package com.waze.bl.c;

import com.waze.bl.b.c.i;
import com.waze.bl.b.c.n;
import com.waze.bl.c.c.c;
import com.waze.bl.c.c.k;
import com.waze.bl.c.c.p;
import com.waze.shared_infra.i.e;
import com.waze.t.b.ai;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements ai {

    /* renamed from: a, reason: collision with root package name */
    private final e f16997a;

    /* renamed from: b, reason: collision with root package name */
    private final c f16998b;

    /* renamed from: c, reason: collision with root package name */
    private final i f16999c;

    /* renamed from: d, reason: collision with root package name */
    private final k f17000d;

    /* renamed from: e, reason: collision with root package name */
    private final p f17001e;

    public a(e eVar, c cVar, i iVar, k kVar, p pVar) {
        x.f(eVar, "logger");
        x.f(cVar, "config");
        x.f(iVar, "getClosureCandidatesUseCase");
        x.f(kVar, "sendAlertReportUseCase");
        x.f(pVar, "sendMapIssueReportUseCase");
        this.f16997a = eVar;
        this.f16998b = cVar;
        this.f16999c = iVar;
        this.f17000d = kVar;
        this.f17001e = pVar;
    }

    @Override // com.waze.t.b.ai
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b a() {
        return new n(this.f16997a, this.f16998b, this.f16999c, this.f17000d, this.f17001e);
    }

    public a() {
        throw null;
    }
}
