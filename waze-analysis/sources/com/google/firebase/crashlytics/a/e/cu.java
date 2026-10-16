package com.google.firebase.crashlytics.a.e;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class cu {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9544a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f9545b = Charset.forName("UTF-8");

    public abstract int a();

    public abstract be b();

    protected abstract bf c();

    public abstract bi d();

    public abstract ct e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public final cu n(String str) {
        bf bfVarC = c();
        bfVarC.c(str);
        if (e() != null) {
            bm bmVar = new bm(e());
            bmVar.c(str);
            bfVarC.m(bmVar.a());
        }
        return bfVarC.a();
    }

    public final cu o(be beVar) {
        if (beVar == null) {
            return this;
        }
        bf bfVarC = c();
        bfVarC.b(beVar);
        return bfVarC.a();
    }

    public final cu p(List list) {
        if (e() == null) {
            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
        }
        bf bfVarC = c();
        bm bmVar = new bm(e());
        bmVar.g(list);
        bfVarC.m(bmVar.a());
        return bfVarC.a();
    }

    public final cu q(String str) {
        bf bfVarC = c();
        bfVarC.f(str);
        return bfVarC.a();
    }

    public final cu r(String str) {
        bf bfVarC = c();
        bfVarC.g(str);
        return bfVarC.a();
    }

    public final cu s(bi biVar) {
        bf bfVarC = c();
        bfVarC.m(null);
        bfVarC.j(biVar);
        return bfVarC.a();
    }

    public final cu t(long j2, boolean z, String str) {
        bf bfVarC = c();
        if (e() != null) {
            bm bmVar = new bm(e());
            bmVar.f(Long.valueOf(j2));
            bmVar.d(z);
            if (str != null) {
                cr crVar = new cr();
                crVar.b(str);
                bmVar.m(crVar.a());
            }
            bfVarC.m(bmVar.a());
        }
        return bfVarC.a();
    }
}
