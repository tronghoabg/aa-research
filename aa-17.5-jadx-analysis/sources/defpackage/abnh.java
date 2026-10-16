package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class abnh {
    final abow a;
    public final Object b;
    public final abow c;
    public final abnu d;

    public abnh(abow abowVar, Object obj, abow abowVar2, abnu abnuVar) {
        if (abowVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (abnuVar.c == abqd.MESSAGE && abowVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = abowVar;
        this.b = obj;
        this.c = abowVar2;
        this.d = abnuVar;
    }

    public final int a() {
        return this.d.b;
    }

    public final abqd b() {
        return this.d.c;
    }

    public final Object c(Object obj) {
        abnu abnuVar = this.d;
        if (!abnuVar.d) {
            return d(obj);
        }
        if (abnuVar.a() != abqe.h) {
            return obj;
        }
        abpf abpfVar = new abpf(abpf.a, 0, true);
        List list = (List) obj;
        abpfVar.e(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abpfVar.add(d(it.next()));
        }
        abpfVar.b();
        return abpfVar;
    }

    public final Object d(Object obj) {
        abnu abnuVar = this.d;
        if (abnuVar.a() != abqe.h) {
            return obj;
        }
        return abnuVar.a.a(((Integer) obj).intValue());
    }

    public final Object e(Object obj) {
        return this.d.a() == abqe.h ? Integer.valueOf(((abnz) obj).a()) : obj;
    }

    public final boolean f() {
        return this.d.d;
    }

    public abnh() {
        throw null;
    }
}
