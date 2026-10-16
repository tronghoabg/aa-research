package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* loaded from: classes.dex */
public final class yfk extends ygr {
    private final transient EnumSet a;
    private transient int b;

    public yfk(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static ygr h(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new yfk(enumSet) : new ymp((Enum) yrm.Y(enumSet.iterator())) : yly.a;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof yfk) {
            collection = ((yfk) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return yrm.X(this.a.iterator());
    }

    @Override // defpackage.ygr, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yfk) {
            obj = ((yfk) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ygr, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.ygr
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return new yfj(this.a);
    }
}
