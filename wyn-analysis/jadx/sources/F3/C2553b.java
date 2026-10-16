package f3;

import Ef.H;
import Ef.S;
import Jf.n;
import Lf.e;
import Wf.AbstractC1258p;
import android.content.Context;
import android.os.Build;
import h3.C2773a;
import h3.d;
import h3.g;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import p8.p;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2553b {

    /* renamed from: a, reason: collision with root package name */
    public final g f34803a;

    public C2553b(g gVar) {
        this.f34803a = gVar;
    }

    public static final C2553b a(Context context) {
        d dVar;
        AbstractC3340k.e(context, "context");
        int i5 = Build.VERSION.SDK_INT;
        c3.a aVar = c3.a.f19583a;
        if ((i5 >= 30 ? aVar.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) AbstractC1258p.C());
            AbstractC3340k.d(systemService, "context.getSystemService…opicsManager::class.java)");
            dVar = new d(AbstractC1258p.e(systemService), 1);
        } else {
            if ((i5 >= 30 ? aVar.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) AbstractC1258p.C());
                AbstractC3340k.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                dVar = new d(AbstractC1258p.e(systemService2), 0);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            return new C2553b(dVar);
        }
        return null;
    }

    @NotNull
    public p b(@NotNull C2773a request) {
        AbstractC3340k.e(request, "request");
        e eVar = S.f3698a;
        return AbstractC3230e0.g(H.h(H.c(n.f6132a), null, new C2552a(this, request, null), 3));
    }
}
