package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4763a;

    /* renamed from: b, reason: collision with root package name */
    private volatile as f4764b;

    au(Looper looper, Object obj, String str) {
        this.f4763a = new com.google.android.gms.common.util.a.a(looper);
        av.k(str);
        this.f4764b = new as(obj, str);
    }

    public static /* synthetic */ void b(au auVar, at atVar) {
        as asVar = auVar.f4764b;
        if (asVar != null) {
            atVar.a(asVar.f4761a);
        }
    }

    public final as a() {
        return this.f4764b;
    }

    public final void c() {
        this.f4764b = null;
    }

    public final void d(at atVar) {
        this.f4763a.execute(new android.support.v4.app.ac(this, atVar, 7));
    }
}
