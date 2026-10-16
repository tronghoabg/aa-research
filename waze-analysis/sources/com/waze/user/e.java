package com.waze.user;

import android.content.Context;
import com.waze.shared_infra.r.n;
import com.waze.shared_infra.r.s;
import com.waze.shared_infra.r.u;
import com.waze.shared_infra.r.v;
import com.waze.shared_infra.r.y;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f44816a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f44817b;

    /* renamed from: c, reason: collision with root package name */
    private final n f44818c;

    /* renamed from: d, reason: collision with root package name */
    private final d f44819d;

    public e(Context context, k kVar, af afVar) {
        x.f(context, "context");
        x.f(kVar, "userProfileFlow");
        x.f(afVar, "coroutineScope");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("UserStateImpl");
        x.e(eVarD, "create(...)");
        this.f44816a = eVarD;
        this.f44817b = ck.b(v.f37998a);
        n nVar = new n(context);
        this.f44818c = nVar;
        d dVar = new d(this);
        this.f44819d = dVar;
        nVar.c(new WeakReference(dVar));
        nVar.b();
        aj.z(afVar, null, null, new c(kVar, this, null), 3);
    }

    @Override // com.waze.shared_infra.r.y
    public final /* synthetic */ ch a() {
        return this.f44817b;
    }

    @Override // com.waze.shared_infra.r.y
    public final void b() {
        bn bnVar;
        Object objD;
        this.f44816a.a("UpdateLoggedIn");
        do {
            bnVar = this.f44817b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, s.f37995a));
    }

    @Override // com.waze.shared_infra.r.y
    public final void c(u uVar) {
        bn bnVar;
        Object objD;
        x.f(uVar, "error");
        Objects.toString(uVar);
        this.f44816a.b("UpdateLoginError ".concat(uVar.toString()));
        do {
            bnVar = this.f44817b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, uVar));
    }

    public final bn e() {
        return this.f44817b;
    }
}
