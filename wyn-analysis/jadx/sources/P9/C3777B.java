package p9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m9.F;
import m9.G;

/* renamed from: p9.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3777B {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f43315g;

    /* renamed from: a, reason: collision with root package name */
    public final v9.g f43316a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43319d;

    /* renamed from: e, reason: collision with root package name */
    public G f43320e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f43317b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f43318c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f43321f = new HashSet();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f43315g = threadPoolExecutor;
    }

    public C3777B(v9.g gVar) {
        this.f43316a = gVar;
    }

    public final t9.m a(s9.h hVar) {
        s9.o oVar = (s9.o) this.f43317b.get(hVar);
        return (this.f43321f.contains(hVar) || oVar == null) ? t9.m.f45963c : oVar.equals(s9.o.f45389b) ? t9.m.a(false) : new t9.m(oVar, null);
    }

    public final t9.m b(s9.h hVar) throws G {
        s9.o oVar = (s9.o) this.f43317b.get(hVar);
        if (this.f43321f.contains(hVar) || oVar == null) {
            return t9.m.a(true);
        }
        if (oVar.equals(s9.o.f45389b)) {
            throw new G("Can't update a document that doesn't exist.", F.INVALID_ARGUMENT);
        }
        return new t9.m(oVar, null);
    }
}
