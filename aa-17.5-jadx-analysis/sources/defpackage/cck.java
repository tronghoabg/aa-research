package defpackage;

import j$.util.Set;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cck<E> extends afax<E> implements Set<E>, java.util.Set, Collection, afgc {
    public static final cck a;
    public final Object b;
    public final Object c;
    public final cbu d;

    static {
        ccn ccnVar = ccn.a;
        a = new cck(ccnVar, ccnVar, cbu.a);
    }

    public cck(Object obj, Object obj2, cbu cbuVar) {
        this.b = obj;
        this.c = obj2;
        this.d = cbuVar;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.afax, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new ccl(this.b, this.d);
    }
}
