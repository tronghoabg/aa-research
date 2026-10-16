package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.Linked;
import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class LinkedDeque<E extends Linked<E>> extends AbstractCollection<E> implements Deque<E> {
    E first;
    E last;

    /* compiled from: WazeSource */
    abstract class AbstractLinkedIterator implements Iterator<E> {
        E cursor;

        AbstractLinkedIterator(LinkedDeque linkedDeque, E e2) {
            Objects.requireNonNull(linkedDeque);
            this.cursor = e2;
        }

        abstract E computeNext();

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.cursor != null;
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E e2 = this.cursor;
            this.cursor = (E) computeNext();
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    LinkedDeque() {
    }

    @Override // java.util.Deque
    public void addFirst(E e2) {
        if (!offerFirst((LinkedDeque<E>) e2)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.Deque
    public void addLast(E e2) {
        if (!offerLast((LinkedDeque<E>) e2)) {
            throw new IllegalArgumentException();
        }
    }

    void checkNotEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.fasterxml.jackson.databind.util.internal.Linked] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        E e2 = this.first;
        while (e2 != null) {
            ?? next = e2.getNext();
            e2.setPrevious(null);
            e2.setNext(null);
            e2 = next;
        }
        this.last = null;
        this.first = null;
    }

    boolean contains(Linked<?> linked) {
        return (linked.getPrevious() == null && linked.getNext() == null && linked != this.first) ? false : true;
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return new LinkedDeque<E>.AbstractLinkedIterator(this, this.last) { // from class: com.fasterxml.jackson.databind.util.internal.LinkedDeque.2
            {
                Objects.requireNonNull(this);
            }

            @Override // com.fasterxml.jackson.databind.util.internal.LinkedDeque.AbstractLinkedIterator
            E computeNext() {
                return (E) this.cursor.getPrevious();
            }
        };
    }

    @Override // java.util.Deque, java.util.Queue
    public E element() {
        return (E) getFirst();
    }

    @Override // java.util.Deque
    public E getFirst() {
        checkNotEmpty();
        return (E) peekFirst();
    }

    @Override // java.util.Deque
    public E getLast() {
        checkNotEmpty();
        return (E) peekLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public Iterator<E> iterator() {
        return new LinkedDeque<E>.AbstractLinkedIterator(this, this.first) { // from class: com.fasterxml.jackson.databind.util.internal.LinkedDeque.1
            {
                Objects.requireNonNull(this);
            }

            @Override // com.fasterxml.jackson.databind.util.internal.LinkedDeque.AbstractLinkedIterator
            E computeNext() {
                return (E) this.cursor.getNext();
            }
        };
    }

    void linkFirst(E e2) {
        E e3 = this.first;
        this.first = e2;
        if (e3 == null) {
            this.last = e2;
        } else {
            e3.setPrevious(e2);
            e2.setNext(e3);
        }
    }

    void linkLast(E e2) {
        E e3 = this.last;
        this.last = e2;
        if (e3 == null) {
            this.first = e2;
        } else {
            e3.setNext(e2);
            e2.setPrevious(e3);
        }
    }

    public void moveToBack(E e2) {
        if (e2 != this.last) {
            unlink(e2);
            linkLast(e2);
        }
    }

    public void moveToFront(E e2) {
        if (e2 != this.first) {
            unlink(e2);
            linkFirst(e2);
        }
    }

    @Override // java.util.Deque
    public boolean offerFirst(E e2) {
        if (contains((Linked<?>) e2)) {
            return false;
        }
        linkFirst(e2);
        return true;
    }

    @Override // java.util.Deque
    public boolean offerLast(E e2) {
        if (contains((Linked<?>) e2)) {
            return false;
        }
        linkLast(e2);
        return true;
    }

    @Override // java.util.Deque, java.util.Queue
    public E peek() {
        return (E) peekFirst();
    }

    @Override // java.util.Deque, java.util.Queue
    public E poll() {
        return (E) pollFirst();
    }

    @Override // java.util.Deque
    public E pollFirst() {
        if (isEmpty()) {
            return null;
        }
        return (E) unlinkFirst();
    }

    @Override // java.util.Deque
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return (E) unlinkLast();
    }

    @Override // java.util.Deque
    public E pop() {
        return (E) removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean remove(Object obj) {
        return (obj instanceof Linked) && remove((LinkedDeque<E>) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Deque
    public E removeFirst() {
        checkNotEmpty();
        return (E) pollFirst();
    }

    @Override // java.util.Deque
    public boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque
    public E removeLast() {
        checkNotEmpty();
        return (E) pollLast();
    }

    @Override // java.util.Deque
    public boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public int size() {
        int i2 = 0;
        for (Linked next = this.first; next != null; next = next.getNext()) {
            i2++;
        }
        return i2;
    }

    void unlink(E e2) {
        E e3 = (E) e2.getPrevious();
        E e4 = (E) e2.getNext();
        if (e3 == null) {
            this.first = e4;
        } else {
            e3.setNext(e4);
            e2.setPrevious(null);
        }
        if (e4 == null) {
            this.last = e3;
        } else {
            e4.setPrevious(e3);
            e2.setNext(null);
        }
    }

    E unlinkFirst() {
        E e2 = this.first;
        E e3 = (E) e2.getNext();
        e2.setNext(null);
        this.first = e3;
        if (e3 == null) {
            this.last = null;
            return e2;
        }
        e3.setPrevious(null);
        return e2;
    }

    E unlinkLast() {
        E e2 = this.last;
        E e3 = (E) e2.getPrevious();
        e2.setPrevious(null);
        this.last = e3;
        if (e3 == null) {
            this.first = null;
            return e2;
        }
        e3.setNext(null);
        return e2;
    }

    @Override // java.util.Deque
    public E peekFirst() {
        return this.first;
    }

    @Override // java.util.Deque
    public E peekLast() {
        return this.last;
    }

    @Override // java.util.Deque
    public void push(E e2) {
        addFirst((LinkedDeque<E>) e2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(E e2) {
        return offerLast((LinkedDeque<E>) e2);
    }

    @Override // java.util.Deque, java.util.Queue
    public boolean offer(E e2) {
        return offerLast((LinkedDeque<E>) e2);
    }

    boolean remove(E e2) {
        if (!contains((Linked<?>) e2)) {
            return false;
        }
        unlink(e2);
        return true;
    }

    @Override // java.util.Deque, java.util.Queue
    public E remove() {
        return (E) removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean contains(Object obj) {
        return (obj instanceof Linked) && contains((Linked<?>) obj);
    }
}
