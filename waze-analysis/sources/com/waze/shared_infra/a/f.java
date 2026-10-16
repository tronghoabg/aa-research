package com.waze.shared_infra.a;

import androidx.autofill.HintConstants;
import h.ab;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f37768a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37769b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f37770c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37771d;

    /* renamed from: e, reason: collision with root package name */
    private af f37772e;

    public f(List list, kotlinx.coroutines.b.k kVar, com.waze.shared_infra.i.e eVar) {
        x.f("PostUidLogin", HintConstants.AUTOFILL_HINT_NAME);
        x.f(list, "daemons");
        x.f(kVar, "activeFlow");
        x.f(eVar, "logger");
        this.f37768a = "PostUidLogin";
        this.f37769b = list;
        this.f37770c = kVar;
        this.f37771d = eVar;
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        Object objD = ai.d(ai.J(ai.K(ai.y(this.f37770c), new d(this, null)), new e(this, null)), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f37768a;
    }

    public final af e() {
        return this.f37772e;
    }

    public final void f(af afVar) {
        this.f37772e = afVar;
    }
}
