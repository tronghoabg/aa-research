package com.google.firebase.sessions.b;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.datastore.core.DataStore;
import com.airbnb.lottie.b.v;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.d f10875a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.sessions.b f10876b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f10877c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f10878d;

    /* renamed from: e, reason: collision with root package name */
    private final g f10879e;

    public e(h.c.j jVar, com.google.firebase.installations.d dVar, com.google.firebase.sessions.b bVar, g gVar, DataStore dataStore) {
        x.f(jVar, "backgroundDispatcher");
        x.f(dVar, "firebaseInstallationsApi");
        x.f(bVar, "appInfo");
        x.f(gVar, "configsFetcher");
        x.f(dataStore, "dataStore");
        this.f10875a = dVar;
        this.f10876b = bVar;
        this.f10879e = gVar;
        this.f10877c = h.g.a(new v(dataStore, 5));
        this.f10878d = kotlinx.coroutines.h.i.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o f() {
        return (o) this.f10877c.getValue();
    }

    private static final String g(String str) {
        return new h.n.l(DomExceptionUtils.SEPARATOR).b(str, "");
    }

    @Override // com.google.firebase.sessions.b.p
    public final Boolean a() {
        return f().b();
    }

    @Override // com.google.firebase.sessions.b.p
    public final Double b() {
        return f().c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:(1:(5:13|58|14|51|52)(2:18|19))(6:20|60|21|22|41|(3:43|44|45)(4:46|47|(3:50|51|52)|57))|55|56)(1:25))(2:26|(3:32|(0)|57)(2:30|31))|62|34|(3:36|37|38)(3:39|(2:41|(0)(0))|57)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014c, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014d, code lost:
    
        r13 = r15;
        r15 = r14;
        r14 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #2 {all -> 0x014c, blocks: (B:41:0x009d, B:43:0x00ab, B:47:0x00b7, B:34:0x007a, B:36:0x0084, B:39:0x008f), top: B:62:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.b.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.c.e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.b.e.c(h.c.e):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.b.p
    public final h.o.a d() {
        Integer numD = f().d();
        if (numD == null) {
            return null;
        }
        h.o.c cVar = h.o.a.f48264a;
        return h.o.a.z(h.o.c.i(numD.intValue(), h.o.d.f48273d));
    }
}
