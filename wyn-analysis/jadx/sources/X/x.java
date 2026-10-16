package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class x implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final s f15769a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f15770b;

    /* renamed from: c, reason: collision with root package name */
    public int f15771c;

    /* renamed from: d, reason: collision with root package name */
    public Map.Entry f15772d;

    /* renamed from: e, reason: collision with root package name */
    public Map.Entry f15773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15774f;

    public x(s sVar, Iterator it, int i5) {
        this.f15774f = i5;
        this.f15769a = sVar;
        this.f15770b = it;
        this.f15771c = sVar.a().f15736d;
        a();
    }

    public final void a() {
        this.f15772d = this.f15773e;
        Iterator it = this.f15770b;
        this.f15773e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15773e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15774f) {
            case 0:
                a();
                if (this.f15772d != null) {
                    return new w(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f15773e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f15773e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        s sVar = this.f15769a;
        if (sVar.a().f15736d != this.f15771c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f15772d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        sVar.remove(entry.getKey());
        this.f15772d = null;
        this.f15771c = sVar.a().f15736d;
    }
}
