package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qlc {
    public final qlf a;
    public boolean b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public final Map g;
    public final List h;
    private long i;
    private long j;
    private final spk k;

    public qlc(qlc qlcVar) {
        this.a = qlcVar.a;
        this.k = qlcVar.k;
        this.c = qlcVar.c;
        this.d = qlcVar.d;
        this.e = qlcVar.e;
        this.i = qlcVar.i;
        this.j = qlcVar.j;
        this.h = new ArrayList(qlcVar.h);
        this.g = new HashMap(qlcVar.g.size());
        for (Map.Entry entry : qlcVar.g.entrySet()) {
            qle qleVarD = d((Class) entry.getKey());
            ((qle) entry.getValue()).b(qleVarD);
            this.g.put((Class) entry.getKey(), qleVarD);
        }
    }

    private static qle d(Class cls) {
        try {
            return (qle) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            }
            if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            if (e instanceof ReflectiveOperationException) {
                throw new IllegalArgumentException("Linkage exception", e);
            }
            throw new RuntimeException(e);
        }
    }

    @ResultIgnorabilityUnspecified
    public final qle a(Class cls) {
        Map map = this.g;
        qle qleVar = (qle) map.get(cls);
        if (qleVar != null) {
            return qleVar;
        }
        qle qleVarD = d(cls);
        map.put(cls, qleVarD);
        return qleVarD;
    }

    public final qle b(Class cls) {
        return (qle) this.g.get(cls);
    }

    public final void c(qle qleVar) {
        spu.aw(qleVar);
        Class<?> cls = qleVar.getClass();
        if (cls.getSuperclass() != qle.class) {
            throw new IllegalArgumentException();
        }
        qleVar.b(a(cls));
    }

    public qlc(qlf qlfVar, spk spkVar) {
        this.a = qlfVar;
        this.k = spkVar;
        this.i = 1800000L;
        this.j = 3024000000L;
        this.g = new HashMap();
        this.h = new ArrayList();
    }
}
