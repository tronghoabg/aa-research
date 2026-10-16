package org.a.b.a.a;

import android.support.v4.app.ar;
import android.support.v4.app.az;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import org.a.b.b.d;
import org.a.d.k.b;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a extends az implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final b f56352a;

    public a(b bVar) {
        this.f56352a = bVar;
    }

    @Override // android.support.v4.app.az
    public final ar a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        x.f(classLoader, "classLoader");
        x.f(str, "className");
        Class<?> cls = Class.forName(str);
        x.e(cls, "forName(...)");
        c cVarY = o.y(cls);
        b bVar = this.f56352a;
        ar arVar = bVar != null ? (ar) bVar.b(cVarY, null, null) : (ar) d.e().h(cVarY);
        if (arVar != null) {
            return arVar;
        }
        ar arVarA = super.a(classLoader, str);
        x.e(arVarA, "instantiate(...)");
        return arVarA;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return d.e();
    }
}
