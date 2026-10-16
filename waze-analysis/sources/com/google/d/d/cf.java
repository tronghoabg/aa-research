package com.google.d.d;

import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class cf extends bh implements Collection, em {
    private static final long serialVersionUID = 912559;

    /* renamed from: a, reason: collision with root package name */
    private transient bn f7489a;

    /* renamed from: b, reason: collision with root package name */
    private transient ci f7490b;

    cf() {
    }

    public static cf k(Iterable iterable) {
        if (iterable instanceof cf) {
            cf cfVar = (cf) iterable;
            cfVar.i();
            return cfVar;
        }
        cc ccVar = new cc(iterable instanceof em ? ((em) iterable).b().size() : 11);
        ccVar.c(iterable);
        return ccVar.a();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.d.d.em
    public /* bridge */ /* synthetic */ Set b() {
        throw null;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Override // com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        fu fuVarListIterator = c().listIterator();
        while (fuVarListIterator.hasNext()) {
            el elVar = (el) fuVarListIterator.next();
            Arrays.fill(objArr, i2, elVar.a() + i2, elVar.b());
            i2 += elVar.a();
        }
        return i2;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof em) {
            em emVar = (em) obj;
            if (size() != emVar.size() || c().size() != emVar.c().size()) {
                return false;
            }
            for (el elVar : emVar.c()) {
                if (a(elVar.b()) != elVar.a()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.d.d.bh
    public final bn g() {
        bn bnVar = this.f7489a;
        if (bnVar != null) {
            return bnVar;
        }
        bn bnVarG = super.g();
        this.f7489a = bnVarG;
        return bnVarG;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return new cb(this, c().listIterator());
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return fo.b(c());
    }

    public abstract ci l();

    @Override // com.google.d.d.em
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ci c() {
        ci cdVar = this.f7490b;
        if (cdVar == null) {
            cdVar = isEmpty() ? fb.f7608a : new cd(this);
            this.f7490b = cdVar;
        }
        return cdVar;
    }

    abstract el n(int i2);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return c().toString();
    }

    @Override // com.google.d.d.bh
    abstract Object writeReplace();
}
