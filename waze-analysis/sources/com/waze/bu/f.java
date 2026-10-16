package com.waze.bu;

import android.content.Context;
import com.waze.shared_infra.r.n;
import com.waze.sharedui.h.k;
import com.waze.sharedui.h.l;
import h.g.b.x;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.n.c f17486a;

    /* renamed from: b, reason: collision with root package name */
    private final n f17487b;

    /* renamed from: c, reason: collision with root package name */
    private final e f17488c;

    public f(Context context, af afVar, ch chVar, com.waze.shared_infra.i.e eVar) {
        x.f(context, "context");
        x.f(afVar, "scope");
        x.f(chVar, "profile");
        x.f(eVar, "logger");
        this.f17486a = new com.waze.shared_infra.n.c(afVar, k.f39055a);
        n nVar = new n(context);
        this.f17487b = nVar;
        e eVar2 = new e(eVar, this);
        this.f17488c = eVar2;
        aj.z(afVar, null, null, new c(chVar, eVar, this, null), 3);
        nVar.c(new WeakReference(eVar2));
        nVar.b();
    }

    @Override // com.waze.sharedui.h.l
    public final com.waze.shared_infra.s.f b() {
        return this.f17486a.b();
    }
}
