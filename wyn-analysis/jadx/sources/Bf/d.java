package Bf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class d implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1681a;

    /* renamed from: b, reason: collision with root package name */
    public int f1682b;

    /* renamed from: c, reason: collision with root package name */
    public int f1683c;

    /* renamed from: d, reason: collision with root package name */
    public int f1684d;

    /* renamed from: e, reason: collision with root package name */
    public int f1685e;

    public d(String string) {
        AbstractC3340k.e(string, "string");
        this.f1681a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5;
        int i10;
        int i11 = this.f1682b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f1685e < 0) {
            this.f1682b = 2;
            return false;
        }
        String str = this.f1681a;
        int length = str.length();
        int length2 = str.length();
        for (int i12 = this.f1683c; i12 < length2; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i5 = (cCharAt == '\r' && (i10 = i12 + 1) < str.length() && str.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f1682b = 1;
                this.f1685e = i5;
                this.f1684d = length;
                return true;
            }
        }
        i5 = -1;
        this.f1682b = 1;
        this.f1685e = i5;
        this.f1684d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1682b = 0;
        int i5 = this.f1684d;
        int i10 = this.f1683c;
        this.f1683c = this.f1685e + i5;
        return this.f1681a.subSequence(i10, i5).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
