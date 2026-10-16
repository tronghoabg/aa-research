package org.a.d.e;

import com.waze.places.o;
import h.a.i;
import h.g.b.x;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final org.a.d.c.a f56388a;

    public b(org.a.d.c.a aVar) {
        x.f(aVar, "beanDefinition");
        this.f56388a = aVar;
    }

    public abstract Object a(com.waze.shared_infra.n.c cVar);

    public final org.a.d.c.a b() {
        return this.f56388a;
    }

    public final Object c(com.waze.shared_infra.n.c cVar) throws org.a.d.d.d, IOException {
        x.f(cVar, "context");
        o oVarQ = cVar.q();
        StringBuilder sb = new StringBuilder("| (+) '");
        org.a.d.c.a aVar = this.f56388a;
        sb.append(aVar);
        sb.append("'");
        oVarQ.c(sb.toString());
        try {
            org.a.d.h.a aVarO = cVar.o();
            if (aVarO == null) {
                aVarO = new org.a.d.h.a(null, 3);
            }
            return aVar.b().invoke(cVar.p(), aVarO);
        } catch (Exception e2) {
            x.f(e2, "e");
            StackTraceElement[] stackTrace = e2.getStackTrace();
            x.e(stackTrace, "getStackTrace(...)");
            StackTraceElement[] stackTraceElementArr = stackTrace;
            int i2 = 0;
            while (i2 < stackTraceElementArr.length) {
                String className = stackTraceElementArr[i2].getClassName();
                x.e(className, "getClassName(...)");
                if (h.n.o.F(className, "sun.reflect", false)) {
                    break;
                }
                i2++;
            }
            String str = e2 + "\n\t" + i.aM(i2 != 0 ? i2 != 1 ? h.a.c.i(h.a.c.u(stackTraceElementArr, 0, i2)) : i.d(stackTraceElementArr[0]) : i.h(), "\n\t", null, null, 0, null, 62);
            o oVarQ2 = cVar.q();
            org.a.d.c.a aVar2 = this.f56388a;
            oVarQ2.d("* Instance creation error : could not create instance for '" + aVar2 + "': " + str);
            throw new org.a.d.d.d("Could not create instance for '" + aVar2 + "'", e2);
        }
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return x.n(this.f56388a, bVar != null ? bVar.f56388a : null);
    }

    public final int hashCode() {
        return this.f56388a.hashCode();
    }
}
