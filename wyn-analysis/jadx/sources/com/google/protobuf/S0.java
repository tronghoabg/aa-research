package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class S0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27621a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f27622b;

    public /* synthetic */ S0() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27621a) {
        }
        return this.f27622b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f27621a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f27622b.next();
                if (!(entry.getValue() instanceof LazyField)) {
                    return entry;
                }
                R0 r02 = new R0();
                r02.f27620a = entry;
                return r02;
            default:
                return (String) this.f27622b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f27621a) {
            case 0:
                this.f27622b.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public S0(Iterator it) {
        this.f27622b = it;
    }
}
