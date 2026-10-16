package mf;

import ff.AbstractC2651f;
import ff.C2648c;
import ff.m;
import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: mf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3560b extends AbstractC2651f implements InterfaceC3559a, RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f40739a;

    public C3560b(Enum[] entries) {
        AbstractC3340k.e(entries, "entries");
        this.f40739a = entries;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        AbstractC3340k.e(element, "element");
        return ((Enum) m.x0(element.ordinal(), this.f40739a)) == element;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        C2648c c2648c = AbstractC2651f.Companion;
        Enum[] enumArr = this.f40739a;
        int length = enumArr.length;
        c2648c.getClass();
        C2648c.b(i5, length);
        return enumArr[i5];
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        return this.f40739a.length;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        AbstractC3340k.e(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) m.x0(iOrdinal, this.f40739a)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        AbstractC3340k.e(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) m.x0(iOrdinal, this.f40739a)) == element) {
            return iOrdinal;
        }
        return -1;
    }
}
