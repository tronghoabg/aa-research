package t5;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import kd.RunnableC3307c;
import ne.C3618a;
import q5.C3868c;
import r5.C3924a;

/* renamed from: t5.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4123r {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C4115j f45798e;

    /* renamed from: a, reason: collision with root package name */
    public final C5.a f45799a;

    /* renamed from: b, reason: collision with root package name */
    public final C5.a f45800b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.c f45801c;

    /* renamed from: d, reason: collision with root package name */
    public final z5.f f45802d;

    public C4123r(C5.a aVar, C5.a aVar2, y5.c cVar, z5.f fVar, z5.h hVar) {
        this.f45799a = aVar;
        this.f45800b = aVar2;
        this.f45801c = cVar;
        this.f45802d = fVar;
        hVar.getClass();
        hVar.f48399a.execute(new RunnableC3307c(hVar, 29));
    }

    public static C4123r a() {
        C4115j c4115j = f45798e;
        if (c4115j != null) {
            return (C4123r) c4115j.f45784f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f45798e == null) {
            synchronized (C4123r.class) {
                try {
                    if (f45798e == null) {
                        G4.c cVar = new G4.c();
                        context.getClass();
                        cVar.f4226a = context;
                        f45798e = cVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C4121p c(C3924a c3924a) {
        Set setSingleton;
        byte[] bytes;
        if (c3924a instanceof InterfaceC4116k) {
            c3924a.getClass();
            setSingleton = DesugarCollections.unmodifiableSet(C3924a.f44361d);
        } else {
            setSingleton = Collections.singleton(new C3868c("proto"));
        }
        C3618a c3618aA = C4114i.a();
        c3924a.getClass();
        c3618aA.f41020a = "cct";
        String str = c3924a.f44364a;
        String str2 = c3924a.f44365b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = N0.a.h("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c3618aA.f41021b = bytes;
        return new C4121p(setSingleton, c3618aA.c(), this);
    }
}
