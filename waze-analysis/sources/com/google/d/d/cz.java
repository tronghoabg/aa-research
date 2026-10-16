package com.google.d.d;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cz<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f7523a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f7524b = cy.f7521a;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f7525c;

    /* renamed from: d, reason: collision with root package name */
    private Deque f7526d;

    cz(Iterator it) {
        this.f7525c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f7524b;
            com.google.d.b.an.B(it2);
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f7525c;
                if (it3 != null && it3.hasNext()) {
                    it = this.f7525c;
                    break;
                }
                Deque deque = this.f7526d;
                if (deque == null || deque.isEmpty()) {
                    break;
                }
                this.f7525c = (Iterator) this.f7526d.removeFirst();
            }
            it = null;
            this.f7525c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f7524b = it4;
            if (it4 instanceof cz) {
                cz czVar = (cz) it4;
                this.f7524b = czVar.f7524b;
                if (this.f7526d == null) {
                    this.f7526d = new ArrayDeque();
                }
                this.f7526d.addFirst(this.f7525c);
                if (czVar.f7526d != null) {
                    while (!czVar.f7526d.isEmpty()) {
                        this.f7526d.addFirst((Iterator) czVar.f7526d.removeLast());
                    }
                }
                this.f7525c = czVar.f7525c;
            }
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f7524b;
        this.f7523a = it;
        return (T) it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f7523a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f7523a = null;
    }
}
