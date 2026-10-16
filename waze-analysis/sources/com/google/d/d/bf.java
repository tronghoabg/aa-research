package com.google.d.d;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class bf<E> extends bg<E> {

    /* renamed from: a, reason: collision with root package name */
    Object[] f7446a;

    /* renamed from: b, reason: collision with root package name */
    int f7447b;

    /* renamed from: c, reason: collision with root package name */
    boolean f7448c;

    bf(int i2) {
        fo.ah(i2, "initialCapacity");
        this.f7446a = new Object[i2];
        this.f7447b = 0;
    }

    private final void f(int i2) {
        int length = this.f7446a.length;
        int iE = e(length, this.f7447b + i2);
        if (iE > length || this.f7448c) {
            this.f7446a = Arrays.copyOf(this.f7446a, iE);
            this.f7448c = false;
        }
    }

    public final void a(Object obj) {
        com.google.d.b.an.B(obj);
        f(1);
        Object[] objArr = this.f7446a;
        int i2 = this.f7447b;
        this.f7447b = i2 + 1;
        objArr[i2] = obj;
    }

    @Override // com.google.d.d.bg
    public /* bridge */ /* synthetic */ void b(Object obj) {
        throw null;
    }

    public final void c(Object... objArr) {
        int length = objArr.length;
        fo.s(objArr, length);
        f(length);
        System.arraycopy(objArr, 0, this.f7446a, this.f7447b, length);
        this.f7447b += length;
    }

    @Override // com.google.d.d.bg
    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof bh) {
                this.f7447b = ((bh) collection).d(this.f7446a, this.f7447b);
                return;
            }
        }
        super.d(iterable);
    }
}
