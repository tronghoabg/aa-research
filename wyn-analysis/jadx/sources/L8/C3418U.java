package l8;

import java.util.NoSuchElementException;

/* renamed from: l8.U, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3418U extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40070a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40071b;

    public C3418U(Object obj) {
        this.f40070a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f40071b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f40071b) {
            throw new NoSuchElementException();
        }
        this.f40071b = true;
        return this.f40070a;
    }
}
