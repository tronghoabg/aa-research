package Af;

import ef.C2515C;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3462a;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class l extends m implements Iterator, InterfaceC3103c, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public int f1313a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1314b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3103c f1315c;

    @Override // Af.m
    public final void c(Object obj, AbstractC3462a abstractC3462a) {
        this.f1314b = obj;
        this.f1313a = 3;
        this.f1315c = abstractC3462a;
        kf.a aVar = kf.a.f39711a;
    }

    public final RuntimeException d() {
        int i5 = this.f1313a;
        if (i5 == 4) {
            return new NoSuchElementException();
        }
        if (i5 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f1313a);
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return C3109i.f38759a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5;
        while (true) {
            i5 = this.f1313a;
            if (i5 != 0) {
                break;
            }
            this.f1313a = 5;
            InterfaceC3103c interfaceC3103c = this.f1315c;
            AbstractC3340k.b(interfaceC3103c);
            this.f1315c = null;
            interfaceC3103c.resumeWith(C2515C.f34653a);
        }
        if (i5 == 1) {
            AbstractC3340k.b(null);
            throw null;
        }
        if (i5 == 2 || i5 == 3) {
            return true;
        }
        if (i5 == 4) {
            return false;
        }
        throw d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f1313a;
        if (i5 == 0 || i5 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i5 == 2) {
            this.f1313a = 1;
            AbstractC3340k.b(null);
            throw null;
        }
        if (i5 != 3) {
            throw d();
        }
        this.f1313a = 0;
        Object obj = this.f1314b;
        this.f1314b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        Fe.e.U(obj);
        this.f1313a = 4;
    }
}
