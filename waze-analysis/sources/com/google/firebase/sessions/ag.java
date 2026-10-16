package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10793a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.i.c f10794b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10795c;

    /* renamed from: d, reason: collision with root package name */
    private final h.c.j f10796d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f10797e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f10798f;

    static {
        int i2 = z.f11003b;
        int i3 = v.f10996a;
        f10794b = PreferenceDataStoreDelegateKt.preferencesDataStore$default(v.a(), new ReplaceFileCorruptionHandler(new x(0)), null, null, 12, null);
    }

    public ag(Context context, h.c.j jVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(jVar, "backgroundDispatcher");
        this.f10795c = context;
        this.f10796d = jVar;
        this.f10797e = new AtomicReference();
        this.f10798f = new ae(kotlinx.coroutines.b.ai.o(z.a(context).getData(), new ab(null)));
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.e(jVar), null, null, new ar(this, (h.c.e) null, 1), 3);
    }

    @Override // com.google.firebase.sessions.w
    public final String a() {
        o oVar = (o) this.f10797e.get();
        if (oVar != null) {
            return oVar.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.w
    public final void b(String str) {
        h.g.b.x.f(str, "sessionId");
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.e(this.f10796d), null, null, new at(this, str, (h.c.e) null, 1), 3);
    }
}
