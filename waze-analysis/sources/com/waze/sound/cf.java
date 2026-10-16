package com.waze.sound;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cf implements com.waze.shared_infra.m.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39649a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f39650b;

    /* renamed from: c, reason: collision with root package name */
    private final AudioManager f39651c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f39652d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39653e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f39654f;

    /* renamed from: g, reason: collision with root package name */
    private final ce f39655g;

    /* renamed from: h, reason: collision with root package name */
    private final cd f39656h;

    public cf(Context context, com.waze.shared_infra.i.b bVar, h.c.j jVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f39649a = context;
        this.f39650b = bVar;
        Object systemService = ContextCompat.getSystemService(context, AudioManager.class);
        if (systemService == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f39651c = (AudioManager) systemService;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(jVar.plus(kotlinx.coroutines.aj.Q()));
        this.f39652d = afVarE;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.f39653e = bnVarB;
        this.f39654f = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f39655g = new ce(this);
        this.f39656h = new cd(this);
        kotlinx.coroutines.aj.z(afVarE, null, null, new kd(this, (h.c.e) null, 1), 3);
        j();
    }

    public static final /* synthetic */ Boolean f(cf cfVar) {
        Object objA;
        try {
            objA = Boolean.valueOf(cfVar.f39651c.isStreamMute(3));
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        com.waze.shared_infra.i.b bVar = cfVar.f39650b;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            bVar.a(thC, null);
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        return (Boolean) objA;
    }

    public static final /* synthetic */ Integer g(cf cfVar) {
        Object objA;
        try {
            objA = Integer.valueOf(cfVar.f39651c.getStreamVolume(3));
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        com.waze.shared_infra.i.b bVar = cfVar.f39650b;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            bVar.a(thC, null);
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        return (Integer) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        kotlinx.coroutines.aj.z(this.f39652d, null, null, new aw(this, (h.c.e) null, 2), 3);
    }

    @Override // com.waze.shared_infra.m.a
    public final kotlinx.coroutines.b.ch a() {
        return this.f39654f;
    }
}
