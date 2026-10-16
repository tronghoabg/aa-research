package kotlinx.b.c;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51024a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f51025b = h.o.c.n();

    public static final kotlinx.b.b a(h.l.c cVar) {
        h.g.b.x.f(cVar, "<this>");
        return (kotlinx.b.b) f51025b.get(cVar);
    }

    public static final void b(String str) {
        h.g.b.x.f(str, "serialName");
        for (kotlinx.b.b bVar : f51025b.values()) {
            if (h.g.b.x.n(str, bVar.getDescriptor().d())) {
                StringBuilder sb = new StringBuilder("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ");
                sb.append(str);
                sb.append(" there already exists ");
                Class<?> cls = bVar.getClass();
                int i2 = h.g.b.ar.f48106a;
                sb.append(new h.g.b.m(cls).c());
                sb.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(h.n.o.c(sb.toString()));
            }
        }
    }
}
