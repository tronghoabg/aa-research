package Af;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;
import x.C4423p;
import x.C4425r;

/* loaded from: classes5.dex */
public final class i implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1306a;

    /* renamed from: b, reason: collision with root package name */
    public int f1307b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1308c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1309d;

    public i(Object obj, Map map) {
        this.f1306a = 2;
        this.f1308c = obj;
        this.f1309d = map;
    }

    public void a() {
        Object objInvoke;
        int i5 = this.f1307b;
        j jVar = (j) this.f1309d;
        if (i5 == -2) {
            objInvoke = ((tf.a) jVar.f1311b).invoke();
        } else {
            tf.l lVar = (tf.l) jVar.f1312c;
            Object obj = this.f1308c;
            AbstractC3340k.b(obj);
            objInvoke = lVar.invoke(obj);
        }
        this.f1308c = objInvoke;
        this.f1307b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        x xVar;
        Iterator it;
        switch (this.f1306a) {
            case 0:
                if (this.f1307b < 0) {
                    a();
                }
                return this.f1307b == 1;
            case 1:
                break;
            case 2:
                return this.f1307b < ((Map) this.f1309d).size();
            default:
                return ((l) this.f1308c).hasNext();
        }
        while (true) {
            int i5 = this.f1307b;
            xVar = (x) this.f1309d;
            int i10 = xVar.f1336b;
            it = (Iterator) this.f1308c;
            if (i5 < i10 && it.hasNext()) {
                it.next();
                this.f1307b++;
            }
        }
        return this.f1307b < xVar.f1337c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        x xVar;
        Iterator it;
        switch (this.f1306a) {
            case 0:
                if (this.f1307b < 0) {
                    a();
                }
                if (this.f1307b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f1308c;
                AbstractC3340k.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f1307b = -1;
                return obj;
            case 1:
                break;
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f1308c;
                this.f1307b++;
                Object obj3 = ((Map) this.f1309d).get(obj2);
                if (obj3 != null) {
                    this.f1308c = ((T.a) obj3).f11128b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            default:
                return ((l) this.f1308c).next();
        }
        while (true) {
            int i5 = this.f1307b;
            xVar = (x) this.f1309d;
            int i10 = xVar.f1336b;
            it = (Iterator) this.f1308c;
            if (i5 < i10 && it.hasNext()) {
                it.next();
                this.f1307b++;
            }
        }
        int i11 = this.f1307b;
        if (i11 >= xVar.f1337c) {
            throw new NoSuchElementException();
        }
        this.f1307b = i11 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1306a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i5 = this.f1307b;
                if (i5 != -1) {
                    ((C4425r) this.f1309d).k(i5);
                    this.f1307b = -1;
                    return;
                }
                return;
        }
    }

    public i(x xVar) {
        this.f1306a = 1;
        this.f1309d = xVar;
        this.f1308c = xVar.f1335a.iterator();
    }

    public i(j jVar) {
        this.f1306a = 0;
        this.f1309d = jVar;
        this.f1307b = -2;
    }

    public i(C4425r c4425r) {
        this.f1306a = 3;
        this.f1309d = c4425r;
        this.f1307b = -1;
        this.f1308c = S3.f.x(new C4423p(c4425r, this, null));
    }
}
