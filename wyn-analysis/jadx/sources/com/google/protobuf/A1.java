package com.google.protobuf;

import A7.C0295v;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p9.C3779D;

/* loaded from: classes4.dex */
public final class A1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27513a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27514b;

    /* renamed from: c, reason: collision with root package name */
    public Iterable f27515c;

    public A1(m9.Y y10, C0295v c0295v) {
        this.f27515c = y10;
        this.f27514b = c0295v;
    }

    public r a() {
        r rVar;
        r rVar2 = (r) this.f27515c;
        if (rVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = (ArrayDeque) this.f27514b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                rVar = null;
                break;
            }
            ByteString byteString = ((C1) arrayDeque.pop()).f27533c;
            while (byteString instanceof C1) {
                C1 c12 = (C1) byteString;
                arrayDeque.push(c12);
                byteString = c12.f27532b;
            }
            rVar = (r) byteString;
        } while (rVar.isEmpty());
        this.f27515c = rVar;
        return rVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27513a) {
            case 0:
                return ((r) this.f27515c) != null;
            default:
                return ((Iterator) ((C0295v) this.f27514b).f1081b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f27513a) {
            case 0:
                return a();
            default:
                s9.k kVar = (s9.k) ((C0295v) this.f27514b).next();
                m9.Y y10 = (m9.Y) this.f27515c;
                C3779D c3779d = y10.f40459b;
                return new m9.X(y10.f40460c, kVar.f45380a, kVar, c3779d.f43333e, c3779d.f43334f.f19805a.a(kVar.f45380a));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f27513a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public A1(ByteString byteString) {
        if (byteString instanceof C1) {
            C1 c12 = (C1) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(c12.f27535e);
            this.f27514b = arrayDeque;
            arrayDeque.push(c12);
            ByteString byteString2 = c12.f27532b;
            while (byteString2 instanceof C1) {
                C1 c13 = (C1) byteString2;
                ((ArrayDeque) this.f27514b).push(c13);
                byteString2 = c13.f27532b;
            }
            this.f27515c = (r) byteString2;
            return;
        }
        this.f27514b = null;
        this.f27515c = (r) byteString;
    }
}
