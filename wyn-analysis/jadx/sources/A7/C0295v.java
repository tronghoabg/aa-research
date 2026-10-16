package A7;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: A7.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0295v implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1080a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1081b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1080a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((ArrayDeque) this.f1081b).size() > 0) {
                }
                break;
        }
        return ((Iterator) this.f1081b).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1080a) {
            case 0:
                return (String) ((Iterator) this.f1081b).next();
            case 1:
                return ((Map.Entry) ((Iterator) this.f1081b).next()).getKey();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f1081b;
                try {
                    c9.i iVar = (c9.i) arrayDeque.pop();
                    AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(iVar.f19808a, iVar.f19809b);
                    for (c9.g gVarA = iVar.f19811d; !gVarA.isEmpty(); gVarA = gVarA.a()) {
                        arrayDeque.push((c9.i) gVarA);
                    }
                    return simpleEntry;
                } catch (EmptyStackException unused) {
                    throw new NoSuchElementException();
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1080a) {
            case 0:
                throw new UnsupportedOperationException("Remove not supported");
            case 1:
                ((Iterator) this.f1081b).remove();
                return;
            default:
                throw new UnsupportedOperationException("remove called on immutable collection");
        }
    }

    public C0295v(c9.g gVar, Object obj, Comparator comparator) {
        this.f1080a = 2;
        this.f1081b = new ArrayDeque();
        while (!gVar.isEmpty()) {
            int iCompare = obj != null ? comparator.compare(gVar.getKey(), obj) : 1;
            if (iCompare < 0) {
                gVar = gVar.b();
            } else if (iCompare == 0) {
                ((ArrayDeque) this.f1081b).push((c9.i) gVar);
                return;
            } else {
                ((ArrayDeque) this.f1081b).push((c9.i) gVar);
                gVar = gVar.a();
            }
        }
    }

    public C0295v(Iterator it) {
        this.f1080a = 1;
        this.f1081b = it;
    }
}
