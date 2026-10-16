package com.google.firebase.appcheck.playintegrity.a;

import com.google.android.gms.f.w;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.s;
import com.google.android.play.core.a.f;
import com.google.android.play.core.a.p;
import com.google.android.play.core.a.r;
import com.google.android.play.core.a.t;
import com.google.firebase.appcheck.a.g;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements com.google.firebase.appcheck.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f8902a;

    /* renamed from: b, reason: collision with root package name */
    private final f f8903b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.appcheck.a.f f8904c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f8905d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f8906e;

    /* renamed from: f, reason: collision with root package name */
    private final g f8907f;

    public e(com.google.firebase.e eVar, Executor executor, Executor executor2) {
        String strD = eVar.d().d();
        f fVarD = t.d(eVar.a());
        com.google.firebase.appcheck.a.f fVar = new com.google.firebase.appcheck.a.f(eVar);
        g gVar = new g();
        this.f8902a = strD;
        this.f8903b = fVarD;
        this.f8904c = fVar;
        this.f8905d = executor;
        this.f8906e = executor2;
        this.f8907f = gVar;
    }

    public static /* synthetic */ com.google.android.gms.o.t b(e eVar, a aVar) {
        p pVar = new p();
        pVar.b(Long.parseLong(eVar.f8902a));
        pVar.c(aVar.b());
        return eVar.f8903b.a(pVar.a());
    }

    public static /* synthetic */ com.google.android.gms.o.t c(final e eVar, r rVar) {
        final a aVar = new a(rVar.a(), null);
        return ag.a(eVar.f8906e, new Callable() { // from class: com.google.firebase.appcheck.playintegrity.a.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                e eVar2 = this.f8897a;
                return eVar2.f8904c.b(aVar.c().getBytes("UTF-8"), 3, eVar2.f8907f);
            }
        });
    }

    @Override // com.google.firebase.appcheck.a
    public final com.google.android.gms.o.t a() {
        com.google.android.gms.o.t tVarA = ag.a(this.f8906e, new c(this, 0));
        s sVar = new s() { // from class: com.google.firebase.appcheck.playintegrity.a.d
            @Override // com.google.android.gms.o.s
            public final com.google.android.gms.o.t a(Object obj) {
                return e.b(this.f8901a, (a) obj);
            }
        };
        Executor executor = this.f8905d;
        int i2 = 2;
        return tVarA.e(executor, sVar).e(executor, new com.google.firebase.appcheck.a.c(this, i2)).e(executor, new w(i2));
    }
}
