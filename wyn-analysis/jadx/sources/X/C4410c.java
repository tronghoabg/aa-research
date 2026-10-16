package x;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4410c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f47496a;

    /* renamed from: b, reason: collision with root package name */
    public int f47497b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47498c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4412e f47499d;

    public C4410c(C4412e c4412e) {
        this.f47499d = c4412e;
        this.f47496a = c4412e.f47563c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f47498c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i5 = this.f47497b;
        C4412e c4412e = this.f47499d;
        return AbstractC3340k.a(key, c4412e.g(i5)) && AbstractC3340k.a(entry.getValue(), c4412e.k(this.f47497b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f47498c) {
            return this.f47499d.g(this.f47497b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f47498c) {
            return this.f47499d.k(this.f47497b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47497b < this.f47496a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f47498c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i5 = this.f47497b;
        C4412e c4412e = this.f47499d;
        Object objG = c4412e.g(i5);
        Object objK = c4412e.k(this.f47497b);
        return (objG == null ? 0 : objG.hashCode()) ^ (objK != null ? objK.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f47497b++;
        this.f47498c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f47498c) {
            throw new IllegalStateException();
        }
        this.f47499d.i(this.f47497b);
        this.f47497b--;
        this.f47496a--;
        this.f47498c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f47498c) {
            return this.f47499d.j(this.f47497b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
