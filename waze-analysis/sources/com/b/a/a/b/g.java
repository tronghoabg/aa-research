package com.b.a.a.b;

import android.os.AsyncTask;
import com.b.b.a.aa;
import com.b.b.a.o;
import com.b.b.a.q;
import com.b.b.a.s;
import com.b.b.a.u;
import com.b.b.d.y;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private final com.b.b.a.d f2559a;

    /* renamed from: b, reason: collision with root package name */
    private final h f2560b;

    /* renamed from: c, reason: collision with root package name */
    private final o f2561c;

    /* renamed from: d, reason: collision with root package name */
    private final com.b.b.c.a.d f2562d;

    /* synthetic */ g(h hVar, com.b.a.a.a.b bVar, o oVar) {
        this.f2560b = hVar;
        this.f2561c = oVar;
        this.f2562d = bVar.d();
        com.b.b.a.c cVar = new com.b.b.a.c();
        cVar.f(hVar.f2566d.getPackageName());
        cVar.d();
        cVar.h();
        cVar.g(bVar.b());
        HashMap map = new HashMap();
        map.put("redirect_uri", bVar.a());
        map.put("show_auth_view", String.valueOf(bVar.c()));
        map.put("scopes", "app-remote-control");
        cVar.c(new String[]{"appid"});
        cVar.b();
        cVar.e(map);
        this.f2559a = cVar.a();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        h hVar = this.f2560b;
        s sVarD = hVar.f2563a.a().d(30L, TimeUnit.SECONDS);
        return sVarD.c() ? hVar.f2564b.d(y.class).d(1L, TimeUnit.HOURS) : u.a(sVarD.b());
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        s sVar = (s) obj;
        boolean zC = sVar.c();
        o oVar = this.f2561c;
        if (zC) {
            oVar.a(this.f2560b.f2564b);
        } else {
            oVar.b(sVar.b());
        }
        this.f2560b.f2565c = null;
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        h hVar = this.f2560b;
        hVar.f2563a = new f(hVar.f2568f, hVar.f2566d);
        hVar.f2564b = new q(new aa(this.f2559a, this.f2562d, hVar.f2563a), new aa());
    }
}
