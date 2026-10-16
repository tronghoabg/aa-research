package com.waze.car_lib.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.car_lib.f.jg;
import com.waze.car_lib.f.jh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20864a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f20865b;

    public a(com.waze.shared_infra.o.a aVar, jg jgVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(jgVar, "coordinator");
        this.f20864a = jgVar;
        this.f20865b = new MutableLiveData(new com.waze.car_lib.p.p("Username", aVar.c(R.string.AAOS_USER_NAME_PASSWORD_LOGIN_TITLE, new Object[0]), 1, 0, (String) null, (String) null, (String) null, (com.waze.car_lib.p.co) null, 504));
    }

    public final LiveData a() {
        return (LiveData) this.f20865b;
    }

    public final void b(String str) {
        h.g.b.x.f(str, "userName");
        h.g.b.x.f(str, "userName");
        ((com.waze.shared_infra.coordinators.s) this.f20864a).H(new jh(str));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    public final v c(String str) {
        h.g.b.x.f(str, "clientVersion");
        return new v(this.f20864a, (com.waze.config.d) this.f20865b, str);
    }

    public a(com.waze.shared_infra.o.a aVar, com.waze.config.d dVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dVar, "urlConfig");
        this.f20864a = aVar;
        this.f20865b = dVar;
    }
}
