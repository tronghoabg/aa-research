package h.d;

import h.a.g;
import h.g.b.x;
import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends g implements RandomAccess, Serializable, List, a {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f48064a;

    public c(Enum[] enumArr) {
        x.f(enumArr, "entries");
        this.f48064a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new d(this.f48064a);
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        x.f(r3, "element");
        return ((Enum) h.a.c.O(this.f48064a, r3.ordinal())) == r3;
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        Enum[] enumArr = this.f48064a;
        h.a.c.a(i2, enumArr.length);
        return enumArr[i2];
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        return this.f48064a.length;
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        x.f(r3, "element");
        Enum[] enumArr = this.f48064a;
        int iOrdinal = r3.ordinal();
        if (((Enum) h.a.c.O(enumArr, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        x.f(r2, "element");
        return indexOf(r2);
    }
}
