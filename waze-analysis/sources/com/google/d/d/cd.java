package com.google.d.d;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cd extends cs {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f7487a;

    /* synthetic */ cd(cf cfVar) {
        Objects.requireNonNull(cfVar);
        this.f7487a = cfVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.d.d.cs
    final /* bridge */ /* synthetic */ Object a(int i2) {
        return this.f7487a.n(i2);
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof el) {
            el elVar = (el) obj;
            if (elVar.a() > 0 && this.f7487a.a(elVar.b()) == elVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.d.d.ci, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7487a.hashCode();
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7487a.l().size();
    }

    @Override // com.google.d.d.cs, com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return new ce(this.f7487a);
    }
}
